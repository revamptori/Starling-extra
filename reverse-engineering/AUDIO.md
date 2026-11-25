# Audio — Minecraft 1.8.9

**Verified** from decompiled bytecode (`bpx`/SoundManager, `bpz`/SoundHandler,
`bpg`/SoundCategory, `bpv`/MusicTicker, `bpy`/SoundEventAccessorComposite,
`bqa`/SoundRegistry, `bpi`/SoundListSerializer).

## 1. Architecture

```
SoundHandler (bpz)                 — registry of SoundEvents (sounds.json)
  └── SoundEventAccessorComposite (bpy) — event name → SoundList (bph)
        └── SoundList entries: category, replace, subtitle, SoundEntry
              (name, stream flag, volume/pitch min..max)
SoundManager (bpx)                 — playback engine (paulscode/JavaSound or LWJGL OpenAL)
  ├── sndSystem (bpx$a SoundSystemStarterThread — wraps com.paulscode.sound.SoundSystem)
  ├── playingSounds / invPlayingSounds / playingSoundPoolEntries (maps ISound → source)
  ├── categorySounds (Multimap<SoundCategory, ISound>)
  ├── tickableSounds (ITickableSound list — minecarts, guardian…)
  ├── delayedSounds (ISound → start time)
  └── playingSoundsStopTime (source → auto-stop ticks)
MusicTicker (bpv)                  — background music scheduler (1.8: vanilla music)
PositionedSoundRecord (bpf)        — factory for static sounds (music, records)
MovingSound (bpb)/bpa/...          — updating sounds (attach to entities)
```

## 2. sounds.json format (1.8)

Per event ("minecraft:mob.zombie.say" style key):
```json
{ "<event>": {
    "category": "hostile",              // bpg names below
    "subtitle": "subtitles.…",          // 1.8 supports keys; en_US has none (1.9 feature)
    "replace": false,                   // replace the composed event list
    "sounds": [ "mob/zombie/say1",      // plain name → <domain>:sounds/<name>.ogg
                { "name": "…", "stream": true,
                  "volume": 1.0, "pitch": [0.8, 1.2], "weight": 4 } ] } }
```
Parsed by `bpi`/SoundListSerializer → `bph`/SoundList.

**Categories** (verified `bpg`): `master(0), music(1), record(2), weather(3),
block(4), hostile(5), neutral(6), player(7), ambient(8)` — S29PacketSound's
category byte must map through `bpg` lookup-by-int (`bpg.k` map).

## 3. Playback behavior (`SoundManager`, verified method list)

- `playSound(ISound)` (529 B): skip if !loaded/quiet; pick pool entry (random via
  `weight`); pitch = `getNormalizedPitch` (sound-entry pitch × ISound pitch,
  clamped 0.5–2.0 — verify clamp constants in `bpx.a(ISound, SoundPoolEntry)` when
  porting); volume = `getNormalizedVolume` (sound × category × master);
  3D: source position from `ISound.getSoundLocation()`... (1.8 spatial: `xPosF/yPosF/zPosF`
  in `PositionedSound`); rolloff/attenuation handled by paulscode (verify `Library` params).
- `updateAllSounds()` (525 B, called every frame): listener position/orientation,
  tickable sound updates, delayed starts, source auto-stop bookkeeping.
- `setListener(EntityPlayer, float)` (264 B): listener at eye position, orientation from
  yaw/pitch (behind = −look), velocity for doppler? (1.8 sets listener velocity from
  player motion — verify body when porting).
- `playDelayedSound(ISound, int)` — queued (e.g. note blocks? music).
- Pause semantics: `pauseAllSounds`/`resumeAllSounds` — categories MUSIC/RECORD pause
  (verify per-category rules in `bpx.e/f` when porting).

## 4. Music ticker (`bpv`)

- Background music: "minecraft:music.menu", "music.game", biome-specific
  `music.game.creative/nether/end` selection; delay = random 12000–24000 ticks
  (verify `bpv` timing constants); stops on GUI open (menu music on title screen).
- Jukebox/records: `PositionedSoundRecord`-based with `record` category (S2B
  "record playing" — verify S2C? no — 1.8 records via `MusicTicker`-independent
  `SoundHandler`-played `records.*` events).

## 5. Network sounds

- **S29PacketSound**: event id (VarInt → SoundCategory + event index via
  `SoundHandler`), x/y/z (i32 = pos×8), volume f32, pitch u8 (pitch × 63.5+...—
  see `PACKET_REFERENCE.md` §8; the exact byte scaling is
  `pitch = byte / 63.5?` — **verify in `hb` handler when porting**; flagged in
  `UNRESOLVED_QUESTIONS.md` Q-15).
- **S2E**? no — block sounds are `S23`/`S22` side effects + `playStepSound`-family
  client-side; explosion `S27` plays "random.explode" with per-particle sound suffixes.

## 6. Rust/Android mapping

- Replace paulscode with `cpal`/OpenSL ES/AAudio (via `rodio` or direct oboe binding):
  2D/3D sources, pitch (rate resampling), per-category gain (master/music/…).
- Keep the event-registry model: sounds.json → event → weighted variant selection.
- Use HRTF-free stereo panning (1.8's OpenAL default: linear distance model,
  `AL_INVERSE_DISTANCE_CLAMPED`? — verify Library defaults when porting).

## 7. Asset note

Sound `.ogg` files are NOT in the client jar (verified `SOURCE_INVENTORY.md` §5) —
they load via the asset-index (`DefaultResourcePack` chain, verified in
`RESOURCE_SYSTEM.md` §2). No audio data is redistributed with the clean-room port;
users supply their own game assets.
