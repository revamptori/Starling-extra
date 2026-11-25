# Class Catalog — Minecraft 1.8.9 (complete)

All 2,507 classes in the client jar, decompiled to `analysis/src/`, named with
MCP-919 mappings (`analysis/mappings.json`). Machine-readable copy:
`analysis/class_catalog.json` (obf, mcp, super, interfaces).

Format: `obf` = class file name in the jar; `MCP` = recovered name; `super` =
superclass obf/MCP. Inner classes appear as `Outer$N`.

## Package index

| Package | Classes |
|---|---|
| `net/minecraft/block` | 251 |
| `net/minecraft/world/gen/structure` | 119 |
| `net/minecraft/client/gui` | 118 |
| `net/minecraft/util` | 114 |
| `net/minecraft/item` | 96 |
| `net/minecraft/network/play/server` | 87 |
| `net/minecraft/client/particle` | 83 |
| `net/minecraft/client/renderer` | 80 |
| `net/minecraft/client/renderer/entity` | 72 |
| `net/minecraft/command` | 67 |
| `net/minecraft/entity/ai` | 65 |
| `net/minecraft/client/model` | 52 |
| `net/minecraft/entity/monster` | 52 |
| `net/minecraft/network` | 45 |
| `net/minecraft/world` | 42 |
| `net/minecraft/world/gen/feature` | 42 |
| `net/minecraft/inventory` | 41 |
| `net/minecraft/client/resources` | 38 |
| `net/minecraft/entity/passive` | 37 |
| `net/minecraft/world/biome` | 37 |
| `net/minecraft/entity` | 36 |
| `net/minecraft/tileentity` | 36 |
| `net/minecraft/client/renderer/block/model` | 34 |
| `net/minecraft/client/audio` | 31 |
| `net/minecraft/network/play/client` | 31 |
| `net/minecraft/client/stream` | 30 |
| `net/minecraft/command/server` | 30 |
| `net/minecraft/enchantment` | 27 |
| `net/minecraft/server/management` | 27 |
| `net/minecraft/nbt` | 26 |
| `net/minecraft/client/renderer/entity/layers` | 25 |
| `net/minecraft/realms` | 25 |
| `net/minecraft/world/gen/layer` | 25 |
| `net/minecraft/world/storage` | 24 |
| `net/minecraft/client/renderer/texture` | 23 |
| `net/minecraft/entity/item` | 23 |
| `net/minecraft/item/crafting` | 23 |
| `net/minecraft/client` | 22 |
| `net/minecraft/world/gen` | 22 |
| `net/minecraft/client/network` | 21 |
| `net/minecraft/client/renderer/chunk` | 20 |
| `net/minecraft/init` | 20 |
| `net/minecraft/client/renderer/tileentity` | 19 |
| `net/minecraft/client/gui/inventory` | 18 |
| `net/minecraft/client/resources/data` | 17 |
| `net/minecraft/crash` | 15 |
| `net/minecraft/stats` | 15 |
| `net/minecraft/client/multiplayer` | 14 |
| `net/minecraft/scoreboard` | 14 |
| `net/minecraft/client/resources/model` | 13 |
| `net/minecraft/creativetab` | 13 |
| `net/minecraft/world/chunk/storage` | 12 |
| `net/minecraft/block/state` | 10 |
| `net/minecraft/client/gui/achievement` | 10 |
| `net/minecraft/entity/projectile` | 10 |
| `net/minecraft/client/gui/spectator` | 9 |
| `net/minecraft/client/main` | 9 |
| `net/minecraft/client/shader` | 9 |
| `net/minecraft/dispenser` | 9 |
| `net/minecraft/entity/player` | 9 |
| `net/minecraft/world/chunk` | 9 |
| `net/minecraft/entity/ai/attributes` | 8 |
| `net/minecraft/pathfinding` | 8 |
| `net/minecraft/block/material` | 7 |
| `net/minecraft/client/gui/stream` | 7 |
| `net/minecraft/client/renderer/block/statemap` | 7 |
| `net/minecraft/client/renderer/vertex` | 7 |
| `net/minecraft/potion` | 7 |
| `net/minecraft/server/network` | 7 |
| `net/minecraft/village` | 7 |
| `net/minecraft/block/properties` | 6 |
| `net/minecraft/block/state/pattern` | 6 |
| `net/minecraft/entity/boss` | 6 |
| `net/minecraft/server/integrated` | 6 |
| `net/minecraft/client/gui/spectator/categories` | 5 |
| `net/minecraft/client/settings` | 5 |
| `net/minecraft/profiler` | 5 |
| `net/minecraft/client/renderer/culling` | 4 |
| `net/minecraft/client/util` | 4 |
| `net/minecraft/event` | 4 |
| `net/minecraft/network/login/server` | 4 |
| `net/minecraft/server` | 4 |
| `net/minecraft/client/entity` | 3 |
| `net/minecraft/world/border` | 3 |
| `net/minecraft/world/pathfinder` | 3 |
| `net/minecraft/client/player/inventory` | 2 |
| `net/minecraft/entity/effect` | 2 |
| `net/minecraft/network/login` | 2 |
| `net/minecraft/network/login/client` | 2 |
| `net/minecraft/network/play` | 2 |
| `net/minecraft/network/status` | 2 |
| `net/minecraft/network/status/client` | 2 |
| `net/minecraft/network/status/server` | 2 |
| `net/minecraft/world/demo` | 2 |
| `net/minecraft/network/handshake` | 1 |
| `net/minecraft/network/handshake/client` | 1 |
| `net/minecraft/network/rcon` | 1 |

**Total: 2507 classes.**


## `net/minecraft/block` (251)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `afh` | `Block` | `java/lang/Object` |
| `afh$1` | `Block$1` | `net/minecraft/block/Block$SoundType` |
| `afh$2` | `Block$2` | `net/minecraft/block/Block$SoundType` |
| `afh$3` | `Block$3` | `net/minecraft/block/Block$SoundType` |
| `afh$4` | `Block$4` | `net/minecraft/block/Block$SoundType` |
| `afh$a` | `Block$EnumOffsetType` | `java/lang/Enum` |
| `afh$b` | `Block$SoundType` | `java/lang/Object` |
| `aey` | `BlockAir` | `net/minecraft/block/Block` |
| `aez` | `BlockAnvil` | `net/minecraft/block/BlockFalling` |
| `aez$a` | `BlockAnvil$Anvil` | `java/lang/Object` |
| `afa` | `BlockBanner` | `net/minecraft/block/BlockContainer` |
| `afa$1` | `BlockBanner$1` | `java/lang/Object` |
| `afa$b` | `BlockBanner$BlockBannerHanging` | `net/minecraft/block/BlockBanner` |
| `afa$a` | `BlockBanner$BlockBannerStanding` | `net/minecraft/block/BlockBanner` |
| `afb` | `BlockBarrier` | `net/minecraft/block/Block` |
| `afd` | `BlockBasePressurePlate` | `net/minecraft/block/Block` |
| `aff` | `BlockBeacon` | `net/minecraft/block/BlockContainer` |
| `aff$1` | `BlockBeacon$1` | `java/lang/Object` |
| `aff$1$1` | `BlockBeacon$1$1` | `java/lang/Object` |
| `afg` | `BlockBed` | `net/minecraft/block/BlockDirectional` |
| `afg$a` | `BlockBed$EnumPartType` | `java/lang/Enum` |
| `afk` | `BlockBookshelf` | `net/minecraft/block/Block` |
| `ahj` | `BlockBreakable` | `net/minecraft/block/Block` |
| `afl` | `BlockBrewingStand` | `net/minecraft/block/BlockContainer` |
| `afm` | `BlockBush` | `net/minecraft/block/Block` |
| `afn` | `BlockButton` | `net/minecraft/block/Block` |
| `afn$1` | `BlockButton$1` | `java/lang/Object` |
| `aka` | `BlockButtonStone` | `net/minecraft/block/BlockButton` |
| `akq` | `BlockButtonWood` | `net/minecraft/block/BlockButton` |
| `afo` | `BlockCactus` | `net/minecraft/block/Block` |
| `afp` | `BlockCake` | `net/minecraft/block/Block` |
| `aks` | `BlockCarpet` | `net/minecraft/block/Block` |
| `afq` | `BlockCarrot` | `net/minecraft/block/BlockCrops` |
| `afr` | `BlockCauldron` | `net/minecraft/block/Block` |
| `afs` | `BlockChest` | `net/minecraft/block/BlockContainer` |
| `aft` | `BlockClay` | `net/minecraft/block/Block` |
| `afu` | `BlockCocoa` | `net/minecraft/block/BlockDirectional` |
| `afu$1` | `BlockCocoa$1` | `java/lang/Object` |
| `afv` | `BlockColored` | `net/minecraft/block/Block` |
| `afw` | `BlockCommandBlock` | `net/minecraft/block/BlockContainer` |
| `air` | `BlockCompressedPowered` | `net/minecraft/block/Block` |
| `afc` | `BlockContainer` | `net/minecraft/block/Block` |
| `afz` | `BlockCrops` | `net/minecraft/block/BlockBush` |
| `aga` | `BlockDaylightDetector` | `net/minecraft/block/BlockContainer` |
| `agb` | `BlockDeadBush` | `net/minecraft/block/BlockBush` |
| `age` | `BlockDirectional` | `net/minecraft/block/Block` |
| `agf` | `BlockDirt` | `net/minecraft/block/Block` |
| `agf$a` | `BlockDirt$DirtType` | `java/lang/Enum` |
| `agg` | `BlockDispenser` | `net/minecraft/block/BlockContainer` |
| `agh` | `BlockDoor` | `net/minecraft/block/Block` |
| `agh$a` | `BlockDoor$EnumDoorHalf` | `java/lang/Enum` |
| `agh$b` | `BlockDoor$EnumHingePosition` | `java/lang/Enum` |
| `agi` | `BlockDoublePlant` | `net/minecraft/block/BlockBush` |
| `agi$a` | `BlockDoublePlant$EnumBlockHalf` | `java/lang/Enum` |
| `agi$b` | `BlockDoublePlant$EnumPlantType` | `java/lang/Enum` |
| `agz` | `BlockDoubleStoneSlab` | `net/minecraft/block/BlockStoneSlab` |
| `agy` | `BlockDoubleStoneSlabNew` | `net/minecraft/block/BlockStoneSlabNew` |
| `aha` | `BlockDoubleWoodSlab` | `net/minecraft/block/BlockWoodSlab` |
| `agj` | `BlockDragonEgg` | `net/minecraft/block/Block` |
| `agk` | `BlockDropper` | `net/minecraft/block/BlockDispenser` |
| `agl` | `BlockDynamicLiquid` | `net/minecraft/block/BlockLiquid` |
| `agm` | `BlockEnchantmentTable` | `net/minecraft/block/BlockContainer` |
| `agn` | `BlockEndPortal` | `net/minecraft/block/BlockContainer` |
| `ago` | `BlockEndPortalFrame` | `net/minecraft/block/Block` |
| `agp` | `BlockEnderChest` | `net/minecraft/block/BlockContainer` |
| `ade` | `BlockEventData` | `java/lang/Object` |
| `agr` | `BlockFalling` | `net/minecraft/block/Block` |
| `ags` | `BlockFarmland` | `net/minecraft/block/Block` |
| `ags$1` | `BlockFarmland$1` | `java/lang/Object` |
| `agt` | `BlockFence` | `net/minecraft/block/Block` |
| `agu` | `BlockFenceGate` | `net/minecraft/block/BlockDirectional` |
| `agv` | `BlockFire` | `net/minecraft/block/Block` |
| `agw` | `BlockFlower` | `net/minecraft/block/BlockBush` |
| `agw$1` | `BlockFlower$1` | `java/lang/Object` |
| `agw$b` | `BlockFlower$EnumFlowerColor` | `java/lang/Enum` |
| `agw$a` | `BlockFlower$EnumFlowerType` | `java/lang/Enum` |
| `agw$a$1` | `BlockFlower$EnumFlowerType$1` | `java/lang/Object` |
| `agx` | `BlockFlowerPot` | `net/minecraft/block/BlockContainer` |
| `agx$1` | `BlockFlowerPot$1` | `java/lang/Object` |
| `agx$a` | `BlockFlowerPot$EnumFlowerType` | `java/lang/Enum` |
| `ahb` | `BlockFurnace` | `net/minecraft/block/BlockContainer` |
| `ahb$1` | `BlockFurnace$1` | `java/lang/Object` |
| `ahc` | `BlockGlass` | `net/minecraft/block/BlockBreakable` |
| `ahd` | `BlockGlowstone` | `net/minecraft/block/Block` |
| `ahe` | `BlockGrass` | `net/minecraft/block/Block` |
| `ahf` | `BlockGravel` | `net/minecraft/block/BlockFalling` |
| `ahi` | `BlockHalfStoneSlab` | `net/minecraft/block/BlockStoneSlab` |
| `ahg` | `BlockHalfStoneSlabNew` | `net/minecraft/block/BlockStoneSlabNew` |
| `ahk` | `BlockHalfWoodSlab` | `net/minecraft/block/BlockWoodSlab` |
| `ahl` | `BlockHardenedClay` | `net/minecraft/block/Block` |
| `ahm` | `BlockHay` | `net/minecraft/block/BlockRotatedPillar` |
| `ahn` | `BlockHopper` | `net/minecraft/block/BlockContainer` |
| `ahn$1` | `BlockHopper$1` | `java/lang/Object` |
| `aho` | `BlockHugeMushroom` | `net/minecraft/block/Block` |
| `aho$1` | `BlockHugeMushroom$1` | `java/lang/Object` |
| `aho$a` | `BlockHugeMushroom$EnumType` | `java/lang/Enum` |
| `ahp` | `BlockIce` | `net/minecraft/block/BlockBreakable` |
| `ahq` | `BlockJukebox` | `net/minecraft/block/BlockContainer` |
| `ahq$a` | `BlockJukebox$TileEntityJukebox` | `net/minecraft/tileentity/TileEntity` |
| `ahr` | `BlockLadder` | `net/minecraft/block/Block` |
| `ahr$1` | `BlockLadder$1` | `java/lang/Object` |
| `ahs` | `BlockLeaves` | `net/minecraft/block/BlockLeavesBase` |
| `akg` | `BlockLeavesBase` | `net/minecraft/block/Block` |
| `ahu` | `BlockLever` | `net/minecraft/block/Block` |
| `ahu$1` | `BlockLever$1` | `java/lang/Object` |
| `ahu$a` | `BlockLever$EnumOrientation` | `java/lang/Enum` |
| `akn` | `BlockLilyPad` | `net/minecraft/block/BlockBush` |
| `ahv` | `BlockLiquid` | `net/minecraft/block/Block` |
| `ahw` | `BlockLog` | `net/minecraft/block/BlockRotatedPillar` |
| `ahw$1` | `BlockLog$1` | `java/lang/Object` |
| `ahw$a` | `BlockLog$EnumAxis` | `java/lang/Enum` |
| `ahx` | `BlockMelon` | `net/minecraft/block/Block` |
| `ahy` | `BlockMobSpawner` | `net/minecraft/block/BlockContainer` |
| `aia` | `BlockMushroom` | `net/minecraft/block/BlockBush` |
| `aib` | `BlockMycelium` | `net/minecraft/block/Block` |
| `aic` | `BlockNetherBrick` | `net/minecraft/block/Block` |
| `aid` | `BlockNetherWart` | `net/minecraft/block/BlockBush` |
| `aie` | `BlockNetherrack` | `net/minecraft/block/Block` |
| `aif` | `BlockNewLeaf` | `net/minecraft/block/BlockLeaves` |
| `aif$1` | `BlockNewLeaf$1` | `java/lang/Object` |
| `aig` | `BlockNewLog` | `net/minecraft/block/BlockLog` |
| `aig$1` | `BlockNewLog$1` | `java/lang/Object` |
| `aig$2` | `BlockNewLog$2` | `java/lang/Object` |
| `aii` | `BlockNote` | `net/minecraft/block/BlockContainer` |
| `aij` | `BlockObsidian` | `net/minecraft/block/Block` |
| `aik` | `BlockOldLeaf` | `net/minecraft/block/BlockLeaves` |
| `aik$1` | `BlockOldLeaf$1` | `java/lang/Object` |
| `ail` | `BlockOldLog` | `net/minecraft/block/BlockLog` |
| `ail$1` | `BlockOldLog$1` | `java/lang/Object` |
| `ail$2` | `BlockOldLog$2` | `java/lang/Object` |
| `aim` | `BlockOre` | `net/minecraft/block/Block` |
| `ain` | `BlockPackedIce` | `net/minecraft/block/Block` |
| `akd` | `BlockPane` | `net/minecraft/block/Block` |
| `als` | `BlockPistonBase` | `net/minecraft/block/Block` |
| `als$1` | `BlockPistonBase$1` | `java/lang/Object` |
| `alt` | `BlockPistonExtension` | `net/minecraft/block/Block` |
| `alt$1` | `BlockPistonExtension$1` | `java/lang/Object` |
| `alt$a` | `BlockPistonExtension$EnumPistonType` | `java/lang/Enum` |
| `alv` | `BlockPistonMoving` | `net/minecraft/block/BlockContainer` |
| `aio` | `BlockPlanks` | `net/minecraft/block/Block` |
| `aio$a` | `BlockPlanks$EnumType` | `java/lang/Enum` |
| `aip` | `BlockPortal` | `net/minecraft/block/BlockBreakable` |
| `aip$a` | `BlockPortal$Size` | `java/lang/Object` |
| `aiq` | `BlockPotato` | `net/minecraft/block/BlockCrops` |
| `ait` | `BlockPressurePlate` | `net/minecraft/block/BlockBasePressurePlate` |
| `ait$1` | `BlockPressurePlate$1` | `java/lang/Object` |
| `ait$a` | `BlockPressurePlate$Sensitivity` | `java/lang/Enum` |
| `akp` | `BlockPressurePlateWeighted` | `net/minecraft/block/BlockBasePressurePlate` |
| `aiu` | `BlockPrismarine` | `net/minecraft/block/Block` |
| `aiu$a` | `BlockPrismarine$EnumType` | `java/lang/Enum` |
| `aiv` | `BlockPumpkin` | `net/minecraft/block/BlockDirectional` |
| `aiv$1` | `BlockPumpkin$1` | `java/lang/Object` |
| `aiw` | `BlockQuartz` | `net/minecraft/block/Block` |
| `aiw$1` | `BlockQuartz$1` | `java/lang/Object` |
| `aiw$a` | `BlockQuartz$EnumType` | `java/lang/Enum` |
| `aix` | `BlockRail` | `net/minecraft/block/BlockRailBase` |
| `afe` | `BlockRailBase` | `net/minecraft/block/Block` |
| `afe$1` | `BlockRailBase$1` | `java/lang/Object` |
| `afe$b` | `BlockRailBase$EnumRailDirection` | `java/lang/Enum` |
| `afe$a` | `BlockRailBase$Rail` | `java/lang/Object` |
| `agc` | `BlockRailDetector` | `net/minecraft/block/BlockRailBase` |
| `agc$1` | `BlockRailDetector$1` | `java/lang/Object` |
| `ais` | `BlockRailPowered` | `net/minecraft/block/BlockRailBase` |
| `ais$1` | `BlockRailPowered$1` | `java/lang/Object` |
| `ais$2` | `BlockRailPowered$2` | `java/lang/Object` |
| `aiy` | `BlockRedFlower` | `net/minecraft/block/BlockFlower` |
| `aiz` | `BlockRedSandstone` | `net/minecraft/block/Block` |
| `aiz$a` | `BlockRedSandstone$EnumType` | `java/lang/Enum` |
| `afx` | `BlockRedstoneComparator` | `net/minecraft/block/BlockRedstoneDiode` |
| `afx$1` | `BlockRedstoneComparator$1` | `java/lang/Object` |
| `afx$a` | `BlockRedstoneComparator$Mode` | `java/lang/Enum` |
| `agd` | `BlockRedstoneDiode` | `net/minecraft/block/BlockDirectional` |
| `ajc` | `BlockRedstoneLight` | `net/minecraft/block/Block` |
| `aja` | `BlockRedstoneOre` | `net/minecraft/block/Block` |
| `ajf` | `BlockRedstoneRepeater` | `net/minecraft/block/BlockRedstoneDiode` |
| `ajd` | `BlockRedstoneTorch` | `net/minecraft/block/BlockTorch` |
| `ajd$a` | `BlockRedstoneTorch$Toggle` | `java/lang/Object` |
| `ajb` | `BlockRedstoneWire` | `net/minecraft/block/Block` |
| `ajb$a` | `BlockRedstoneWire$EnumAttachPosition` | `java/lang/Enum` |
| `aje` | `BlockReed` | `net/minecraft/block/Block` |
| `ajg` | `BlockRotatedPillar` | `net/minecraft/block/Block` |
| `ajh` | `BlockSand` | `net/minecraft/block/BlockFalling` |
| `ajh$a` | `BlockSand$EnumType` | `java/lang/Enum` |
| `aji` | `BlockSandStone` | `net/minecraft/block/Block` |
| `aji$a` | `BlockSandStone$EnumType` | `java/lang/Enum` |
| `ajj` | `BlockSapling` | `net/minecraft/block/BlockBush` |
| `ajj$1` | `BlockSapling$1` | `java/lang/Object` |
| `ajk` | `BlockSeaLantern` | `net/minecraft/block/Block` |
| `ajl` | `BlockSign` | `net/minecraft/block/BlockContainer` |
| `ahz` | `BlockSilverfish` | `net/minecraft/block/Block` |
| `ahz$1` | `BlockSilverfish$1` | `java/lang/Object` |
| `ahz$a` | `BlockSilverfish$EnumType` | `java/lang/Enum` |
| `ahz$a$1` | `BlockSilverfish$EnumType$1` | `net/minecraft/block/BlockSilverfish$EnumType` |
| `ahz$a$2` | `BlockSilverfish$EnumType$2` | `net/minecraft/block/BlockSilverfish$EnumType` |
| `ahz$a$3` | `BlockSilverfish$EnumType$3` | `net/minecraft/block/BlockSilverfish$EnumType` |
| `ahz$a$4` | `BlockSilverfish$EnumType$4` | `net/minecraft/block/BlockSilverfish$EnumType` |
| `ahz$a$5` | `BlockSilverfish$EnumType$5` | `net/minecraft/block/BlockSilverfish$EnumType` |
| `ahz$a$6` | `BlockSilverfish$EnumType$6` | `net/minecraft/block/BlockSilverfish$EnumType` |
| `ajm` | `BlockSkull` | `net/minecraft/block/BlockContainer` |
| `ajm$1` | `BlockSkull$1` | `java/lang/Object` |
| `ajm$2` | `BlockSkull$2` | `java/lang/Object` |
| `ahh` | `BlockSlab` | `net/minecraft/block/Block` |
| `ahh$a` | `BlockSlab$EnumBlockHalf` | `java/lang/Enum` |
| `ajn` | `BlockSlime` | `net/minecraft/block/BlockBreakable` |
| `ajp` | `BlockSnow` | `net/minecraft/block/Block` |
| `ajo` | `BlockSnowBlock` | `net/minecraft/block/Block` |
| `ajq` | `BlockSoulSand` | `net/minecraft/block/Block` |
| `cl` | `BlockSourceImpl` | `java/lang/Object` |
| `ajr` | `BlockSponge` | `net/minecraft/block/Block` |
| `ajs` | `BlockStainedGlass` | `net/minecraft/block/BlockBreakable` |
| `ajt` | `BlockStainedGlassPane` | `net/minecraft/block/BlockPane` |
| `aju` | `BlockStairs` | `net/minecraft/block/Block` |
| `aju$a` | `BlockStairs$EnumHalf` | `java/lang/Enum` |
| `aju$b` | `BlockStairs$EnumShape` | `java/lang/Enum` |
| `ajv` | `BlockStandingSign` | `net/minecraft/block/BlockSign` |
| `ajw` | `BlockStaticLiquid` | `net/minecraft/block/BlockLiquid` |
| `ajx` | `BlockStem` | `net/minecraft/block/BlockBush` |
| `ajx$1` | `BlockStem$1` | `java/lang/Object` |
| `ajy` | `BlockStone` | `net/minecraft/block/Block` |
| `ajy$a` | `BlockStone$EnumType` | `java/lang/Enum` |
| `ajz` | `BlockStoneBrick` | `net/minecraft/block/Block` |
| `ajz$a` | `BlockStoneBrick$EnumType` | `java/lang/Enum` |
| `akb` | `BlockStoneSlab` | `net/minecraft/block/BlockSlab` |
| `akb$a` | `BlockStoneSlab$EnumType` | `java/lang/Enum` |
| `aih` | `BlockStoneSlabNew` | `net/minecraft/block/BlockSlab` |
| `aih$a` | `BlockStoneSlabNew$EnumType` | `java/lang/Enum` |
| `ake` | `BlockTNT` | `net/minecraft/block/Block` |
| `akc` | `BlockTallGrass` | `net/minecraft/block/BlockBush` |
| `akc$a` | `BlockTallGrass$EnumType` | `java/lang/Enum` |
| `akf` | `BlockTorch` | `net/minecraft/block/Block` |
| `akf$1` | `BlockTorch$1` | `java/lang/Object` |
| `akf$2` | `BlockTorch$2` | `java/lang/Object` |
| `akh` | `BlockTrapDoor` | `net/minecraft/block/Block` |
| `akh$1` | `BlockTrapDoor$1` | `java/lang/Object` |
| `akh$a` | `BlockTrapDoor$DoorHalf` | `java/lang/Enum` |
| `aki` | `BlockTripWire` | `net/minecraft/block/Block` |
| `akj` | `BlockTripWireHook` | `net/minecraft/block/Block` |
| `akj$1` | `BlockTripWireHook$1` | `java/lang/Object` |
| `akk` | `BlockVine` | `net/minecraft/block/Block` |
| `akk$1` | `BlockVine$1` | `java/lang/Object` |
| `akl` | `BlockWall` | `net/minecraft/block/Block` |
| `akl$a` | `BlockWall$EnumType` | `java/lang/Enum` |
| `akm` | `BlockWallSign` | `net/minecraft/block/BlockSign` |
| `akm$1` | `BlockWallSign$1` | `java/lang/Object` |
| `ako` | `BlockWeb` | `net/minecraft/block/Block` |
| `akr` | `BlockWoodSlab` | `net/minecraft/block/BlockSlab` |
| `afy` | `BlockWorkbench` | `net/minecraft/block/Block` |
| `afy$a` | `BlockWorkbench$InterfaceCraftingTable` | `java/lang/Object` |
| `akt` | `BlockYellowFlower` | `net/minecraft/block/BlockFlower` |
| `afj` | `IGrowable` | `java/lang/Object` |
| `agq` | `ITileEntityProvider` | `java/lang/Object` |

## `net/minecraft/world/gen/structure` (119)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `aqn` | `ComponentScatteredFeaturePieces` | `java/lang/Object` |
| `aqn$1` | `ComponentScatteredFeaturePieces$1` | `java/lang/Object` |
| `aqn$a` | `ComponentScatteredFeaturePieces$DesertPyramid` | `net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature` |
| `aqn$c` | `ComponentScatteredFeaturePieces$Feature` | `net/minecraft/world/gen/structure/StructureComponent` |
| `aqn$b` | `ComponentScatteredFeaturePieces$JunglePyramid` | `net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature` |
| `aqn$b$a` | `ComponentScatteredFeaturePieces$JunglePyramid$Stones` | `net/minecraft/world/gen/structure/StructureComponent$BlockSelector` |
| `aqn$d` | `ComponentScatteredFeaturePieces$SwampHut` | `net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature` |
| `aqf` | `MapGenMineshaft` | `net/minecraft/world/gen/structure/MapGenStructure` |
| `aqi` | `MapGenNetherBridge` | `net/minecraft/world/gen/structure/MapGenStructure` |
| `aqi$a` | `MapGenNetherBridge$Start` | `net/minecraft/world/gen/structure/StructureStart` |
| `aqm` | `MapGenScatteredFeature` | `net/minecraft/world/gen/structure/MapGenStructure` |
| `aqm$a` | `MapGenScatteredFeature$Start` | `net/minecraft/world/gen/structure/StructureStart` |
| `aqo` | `MapGenStronghold` | `net/minecraft/world/gen/structure/MapGenStructure` |
| `aqo$a` | `MapGenStronghold$Start` | `net/minecraft/world/gen/structure/StructureStart` |
| `aqq` | `MapGenStructure` | `net/minecraft/world/gen/MapGenBase` |
| `aqq$1` | `MapGenStructure$1` | `java/lang/Object` |
| `aqq$2` | `MapGenStructure$2` | `java/lang/Object` |
| `aqq$3` | `MapGenStructure$3` | `java/lang/Object` |
| `aqs` | `MapGenStructureData` | `net/minecraft/world/WorldSavedData` |
| `aqr` | `MapGenStructureIO` | `java/lang/Object` |
| `aqv` | `MapGenVillage` | `net/minecraft/world/gen/structure/MapGenStructure` |
| `aqv$a` | `MapGenVillage$Start` | `net/minecraft/world/gen/structure/StructureStart` |
| `aqe` | `StructureBoundingBox` | `java/lang/Object` |
| `aqe$1` | `StructureBoundingBox$1` | `java/lang/Object` |
| `aqt` | `StructureComponent` | `java/lang/Object` |
| `aqt$1` | `StructureComponent$1` | `java/lang/Object` |
| `aqt$a` | `StructureComponent$BlockSelector` | `java/lang/Object` |
| `aqg` | `StructureMineshaftPieces` | `java/lang/Object` |
| `aqg$1` | `StructureMineshaftPieces$1` | `java/lang/Object` |
| `aqg$a` | `StructureMineshaftPieces$Corridor` | `net/minecraft/world/gen/structure/StructureComponent` |
| `aqg$b` | `StructureMineshaftPieces$Cross` | `net/minecraft/world/gen/structure/StructureComponent` |
| `aqg$c` | `StructureMineshaftPieces$Room` | `net/minecraft/world/gen/structure/StructureComponent` |
| `aqg$d` | `StructureMineshaftPieces$Stairs` | `net/minecraft/world/gen/structure/StructureComponent` |
| `aqh` | `StructureMineshaftStart` | `net/minecraft/world/gen/structure/StructureStart` |
| `aqj` | `StructureNetherBridgePieces` | `java/lang/Object` |
| `aqj$1` | `StructureNetherBridgePieces$1` | `java/lang/Object` |
| `aqj$h` | `StructureNetherBridgePieces$Corridor` | `net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece` |
| `aqj$j` | `StructureNetherBridgePieces$Corridor2` | `net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece` |
| `aqj$d` | `StructureNetherBridgePieces$Corridor3` | `net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece` |
| `aqj$e` | `StructureNetherBridgePieces$Corridor4` | `net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece` |
| `aqj$i` | `StructureNetherBridgePieces$Corridor5` | `net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece` |
| `aqj$o` | `StructureNetherBridgePieces$Crossing` | `net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece` |
| `aqj$g` | `StructureNetherBridgePieces$Crossing2` | `net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece` |
| `aqj$a` | `StructureNetherBridgePieces$Crossing3` | `net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece` |
| `aqj$b` | `StructureNetherBridgePieces$End` | `net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece` |
| `aqj$f` | `StructureNetherBridgePieces$Entrance` | `net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece` |
| `aqj$k` | `StructureNetherBridgePieces$NetherStalkRoom` | `net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece` |
| `aqj$m` | `StructureNetherBridgePieces$Piece` | `net/minecraft/world/gen/structure/StructureComponent` |
| `aqj$n` | `StructureNetherBridgePieces$PieceWeight` | `java/lang/Object` |
| `aqj$p` | `StructureNetherBridgePieces$Stairs` | `net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece` |
| `aqj$q` | `StructureNetherBridgePieces$Start` | `net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing3` |
| `aqj$c` | `StructureNetherBridgePieces$Straight` | `net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece` |
| `aqj$l` | `StructureNetherBridgePieces$Throne` | `net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece` |
| `aqk` | `StructureOceanMonument` | `net/minecraft/world/gen/structure/MapGenStructure` |
| `aqk$a` | `StructureOceanMonument$StartMonument` | `net/minecraft/world/gen/structure/StructureStart` |
| `aql` | `StructureOceanMonumentPieces` | `java/lang/Object` |
| `aql$1` | `StructureOceanMonumentPieces$1` | `java/lang/Object` |
| `aql$k` | `StructureOceanMonumentPieces$DoubleXRoom` | `net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece` |
| `aql$l` | `StructureOceanMonumentPieces$DoubleXYRoom` | `net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece` |
| `aql$m` | `StructureOceanMonumentPieces$DoubleYRoom` | `net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece` |
| `aql$n` | `StructureOceanMonumentPieces$DoubleYZRoom` | `net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece` |
| `aql$o` | `StructureOceanMonumentPieces$DoubleZRoom` | `net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece` |
| `aql$p` | `StructureOceanMonumentPieces$EntryRoom` | `net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece` |
| `aql$f` | `StructureOceanMonumentPieces$FitSimpleRoomHelper` | `java/lang/Object` |
| `aql$g` | `StructureOceanMonumentPieces$FitSimpleRoomTopHelper` | `java/lang/Object` |
| `aql$h` | `StructureOceanMonumentPieces$MonumentBuilding` | `net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece` |
| `aql$j` | `StructureOceanMonumentPieces$MonumentCoreRoom` | `net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece` |
| `aql$i` | `StructureOceanMonumentPieces$MonumentRoomFitHelper` | `java/lang/Object` |
| `aql$q` | `StructureOceanMonumentPieces$Penthouse` | `net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece` |
| `aql$r` | `StructureOceanMonumentPieces$Piece` | `net/minecraft/world/gen/structure/StructureComponent` |
| `aql$v` | `StructureOceanMonumentPieces$RoomDefinition` | `java/lang/Object` |
| `aql$s` | `StructureOceanMonumentPieces$SimpleRoom` | `net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece` |
| `aql$t` | `StructureOceanMonumentPieces$SimpleTopRoom` | `net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece` |
| `aql$u` | `StructureOceanMonumentPieces$WingRoom` | `net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece` |
| `aql$a` | `StructureOceanMonumentPieces$XDoubleRoomFitHelper` | `java/lang/Object` |
| `aql$b` | `StructureOceanMonumentPieces$XYDoubleRoomFitHelper` | `java/lang/Object` |
| `aql$c` | `StructureOceanMonumentPieces$YDoubleRoomFitHelper` | `java/lang/Object` |
| `aql$d` | `StructureOceanMonumentPieces$YZDoubleRoomFitHelper` | `java/lang/Object` |
| `aql$e` | `StructureOceanMonumentPieces$ZDoubleRoomFitHelper` | `java/lang/Object` |
| `aqu` | `StructureStart` | `java/lang/Object` |
| `aqp` | `StructureStrongholdPieces` | `java/lang/Object` |
| `aqp$1` | `StructureStrongholdPieces$1` | `net/minecraft/world/gen/structure/StructureStrongholdPieces$PieceWeight` |
| `aqp$2` | `StructureStrongholdPieces$2` | `net/minecraft/world/gen/structure/StructureStrongholdPieces$PieceWeight` |
| `aqp$3` | `StructureStrongholdPieces$3` | `java/lang/Object` |
| `aqp$a` | `StructureStrongholdPieces$ChestCorridor` | `net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold` |
| `aqp$b` | `StructureStrongholdPieces$Corridor` | `net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold` |
| `aqp$c` | `StructureStrongholdPieces$Crossing` | `net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold` |
| `aqp$d` | `StructureStrongholdPieces$LeftTurn` | `net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold` |
| `aqp$e` | `StructureStrongholdPieces$Library` | `net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold` |
| `aqp$f` | `StructureStrongholdPieces$PieceWeight` | `java/lang/Object` |
| `aqp$g` | `StructureStrongholdPieces$PortalRoom` | `net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold` |
| `aqp$h` | `StructureStrongholdPieces$Prison` | `net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold` |
| `aqp$i` | `StructureStrongholdPieces$RightTurn` | `net/minecraft/world/gen/structure/StructureStrongholdPieces$LeftTurn` |
| `aqp$j` | `StructureStrongholdPieces$RoomCrossing` | `net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold` |
| `aqp$l` | `StructureStrongholdPieces$Stairs` | `net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold` |
| `aqp$m` | `StructureStrongholdPieces$Stairs2` | `net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs` |
| `aqp$o` | `StructureStrongholdPieces$StairsStraight` | `net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold` |
| `aqp$k` | `StructureStrongholdPieces$Stones` | `net/minecraft/world/gen/structure/StructureComponent$BlockSelector` |
| `aqp$n` | `StructureStrongholdPieces$Straight` | `net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold` |
| `aqp$p` | `StructureStrongholdPieces$Stronghold` | `net/minecraft/world/gen/structure/StructureComponent` |
| `aqp$p$a` | `StructureStrongholdPieces$Stronghold$Door` | `java/lang/Enum` |
| `aqw` | `StructureVillagePieces` | `java/lang/Object` |
| `aqw$1` | `StructureVillagePieces$1` | `java/lang/Object` |
| `aqw$i` | `StructureVillagePieces$Church` | `net/minecraft/world/gen/structure/StructureVillagePieces$Village` |
| `aqw$b` | `StructureVillagePieces$Field1` | `net/minecraft/world/gen/structure/StructureVillagePieces$Village` |
| `aqw$c` | `StructureVillagePieces$Field2` | `net/minecraft/world/gen/structure/StructureVillagePieces$Village` |
| `aqw$f` | `StructureVillagePieces$Hall` | `net/minecraft/world/gen/structure/StructureVillagePieces$Village` |
| `aqw$a` | `StructureVillagePieces$House1` | `net/minecraft/world/gen/structure/StructureVillagePieces$Village` |
| `aqw$j` | `StructureVillagePieces$House2` | `net/minecraft/world/gen/structure/StructureVillagePieces$Village` |
| `aqw$m` | `StructureVillagePieces$House3` | `net/minecraft/world/gen/structure/StructureVillagePieces$Village` |
| `aqw$g` | `StructureVillagePieces$House4Garden` | `net/minecraft/world/gen/structure/StructureVillagePieces$Village` |
| `aqw$l` | `StructureVillagePieces$Path` | `net/minecraft/world/gen/structure/StructureVillagePieces$Road` |
| `aqw$e` | `StructureVillagePieces$PieceWeight` | `java/lang/Object` |
| `aqw$o` | `StructureVillagePieces$Road` | `net/minecraft/world/gen/structure/StructureVillagePieces$Village` |
| `aqw$k` | `StructureVillagePieces$Start` | `net/minecraft/world/gen/structure/StructureVillagePieces$Well` |
| `aqw$d` | `StructureVillagePieces$Torch` | `net/minecraft/world/gen/structure/StructureVillagePieces$Village` |
| `aqw$n` | `StructureVillagePieces$Village` | `net/minecraft/world/gen/structure/StructureComponent` |
| `aqw$p` | `StructureVillagePieces$Well` | `net/minecraft/world/gen/structure/StructureVillagePieces$Village` |
| `aqw$h` | `StructureVillagePieces$WoodHut` | `net/minecraft/world/gen/structure/StructureVillagePieces$Village` |

## `net/minecraft/client/gui` (118)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `ava` | `ChatLine` | `java/lang/Object` |
| `avn` | `FontRenderer` | `java/lang/Object` |
| `avp` | `Gui` | `java/lang/Object` |
| `avs` | `GuiButton` | `net/minecraft/client/gui/Gui` |
| `avz` | `GuiButtonLanguage` | `net/minecraft/client/gui/GuiButton` |
| `awp` | `GuiButtonRealmsProxy` | `net/minecraft/client/gui/GuiButton` |
| `awv` | `GuiChat` | `net/minecraft/client/gui/GuiScreen` |
| `awq` | `GuiClickableScrolledSelectionListProxy` | `net/minecraft/client/gui/GuiSlot` |
| `ayq` | `GuiCommandBlock` | `net/minecraft/client/gui/GuiScreen` |
| `aww` | `GuiConfirmOpenLink` | `net/minecraft/client/gui/GuiYesNo` |
| `ayj` | `GuiControls` | `net/minecraft/client/gui/GuiScreen` |
| `axa` | `GuiCreateFlatWorld` | `net/minecraft/client/gui/GuiScreen` |
| `axa$a` | `GuiCreateFlatWorld$Details` | `net/minecraft/client/gui/GuiSlot` |
| `axb` | `GuiCreateWorld` | `net/minecraft/client/gui/GuiScreen` |
| `axx` | `GuiCustomizeSkin` | `net/minecraft/client/gui/GuiScreen` |
| `axx$1` | `GuiCustomizeSkin$1` | `java/lang/Object` |
| `axx$a` | `GuiCustomizeSkin$ButtonPart` | `net/minecraft/client/gui/GuiButton` |
| `axd` | `GuiCustomizeWorldScreen` | `net/minecraft/client/gui/GuiScreen` |
| `axd$1` | `GuiCustomizeWorldScreen$1` | `java/lang/Object` |
| `axh` | `GuiDisconnected` | `net/minecraft/client/gui/GuiScreen` |
| `axs` | `GuiDownloadTerrain` | `net/minecraft/client/gui/GuiScreen` |
| `ayy` | `GuiEnchantment` | `net/minecraft/client/gui/inventory/GuiContainer` |
| `axj` | `GuiErrorScreen` | `net/minecraft/client/gui/GuiScreen` |
| `axq` | `GuiFlatPresets` | `net/minecraft/client/gui/GuiScreen` |
| `axq$a` | `GuiFlatPresets$LayerItem` | `java/lang/Object` |
| `axq$b` | `GuiFlatPresets$ListSlot` | `net/minecraft/client/gui/GuiSlot` |
| `axe` | `GuiGameOver` | `net/minecraft/client/gui/GuiScreen` |
| `aza` | `GuiHopper` | `net/minecraft/client/gui/inventory/GuiContainer` |
| `avo` | `GuiIngame` | `net/minecraft/client/gui/Gui` |
| `avo$1` | `GuiIngame$1` | `java/lang/Object` |
| `axp` | `GuiIngameMenu` | `net/minecraft/client/gui/GuiScreen` |
| `ayi` | `GuiKeyBindingList` | `net/minecraft/client/gui/GuiListExtended` |
| `ayi$1` | `GuiKeyBindingList$1` | `java/lang/Object` |
| `ayi$a` | `GuiKeyBindingList$CategoryEntry` | `java/lang/Object` |
| `ayi$b` | `GuiKeyBindingList$KeyEntry` | `java/lang/Object` |
| `avy` | `GuiLabel` | `net/minecraft/client/gui/Gui` |
| `axl` | `GuiLanguage` | `net/minecraft/client/gui/GuiScreen` |
| `axl$a` | `GuiLanguage$List` | `net/minecraft/client/gui/GuiSlot` |
| `awb` | `GuiListButton` | `net/minecraft/client/gui/GuiButton` |
| `awd` | `GuiListExtended` | `net/minecraft/client/gui/GuiSlot` |
| `awd$a` | `GuiListExtended$IGuiListEntry` | `java/lang/Object` |
| `awc` | `GuiLockIconButton` | `net/minecraft/client/gui/GuiButton` |
| `awc$a` | `GuiLockIconButton$Icon` | `java/lang/Enum` |
| `aya` | `GuiMainMenu` | `net/minecraft/client/gui/GuiScreen` |
| `axo` | `GuiMemoryErrorScreen` | `net/minecraft/client/gui/GuiScreen` |
| `azd` | `GuiMerchant` | `net/minecraft/client/gui/inventory/GuiContainer` |
| `azd$a` | `GuiMerchant$MerchantButton` | `net/minecraft/client/gui/GuiButton` |
| `azh` | `GuiMultiplayer` | `net/minecraft/client/gui/GuiScreen` |
| `avt` | `GuiNewChat` | `net/minecraft/client/gui/Gui` |
| `awe` | `GuiOptionButton` | `net/minecraft/client/gui/GuiButton` |
| `awj` | `GuiOptionSlider` | `net/minecraft/client/gui/GuiButton` |
| `axn` | `GuiOptions` | `net/minecraft/client/gui/GuiScreen` |
| `axn$1` | `GuiOptions$1` | `net/minecraft/client/gui/GuiButton` |
| `awf` | `GuiOptionsRowList` | `net/minecraft/client/gui/GuiListExtended` |
| `awf$a` | `GuiOptionsRowList$Row` | `java/lang/Object` |
| `avv` | `GuiOverlayDebug` | `net/minecraft/client/gui/Gui` |
| `avv$1` | `GuiOverlayDebug$1` | `java/lang/Object` |
| `awg` | `GuiPageButtonList` | `net/minecraft/client/gui/GuiListExtended` |
| `awg$c` | `GuiPageButtonList$EditBoxEntry` | `net/minecraft/client/gui/GuiPageButtonList$GuiListEntry` |
| `awg$a` | `GuiPageButtonList$GuiButtonEntry` | `net/minecraft/client/gui/GuiPageButtonList$GuiListEntry` |
| `awg$d` | `GuiPageButtonList$GuiEntry` | `java/lang/Object` |
| `awg$e` | `GuiPageButtonList$GuiLabelEntry` | `net/minecraft/client/gui/GuiPageButtonList$GuiListEntry` |
| `awg$f` | `GuiPageButtonList$GuiListEntry` | `java/lang/Object` |
| `awg$b` | `GuiPageButtonList$GuiResponder` | `java/lang/Object` |
| `awg$g` | `GuiPageButtonList$GuiSlideEntry` | `net/minecraft/client/gui/GuiPageButtonList$GuiListEntry` |
| `awh` | `GuiPlayerTabOverlay` | `net/minecraft/client/gui/Gui` |
| `awh$1` | `GuiPlayerTabOverlay$1` | `java/lang/Object` |
| `awh$a` | `GuiPlayerTabOverlay$PlayerComparator` | `java/lang/Object` |
| `axt` | `GuiRenameWorld` | `net/minecraft/client/gui/GuiScreen` |
| `aym` | `GuiRepair` | `net/minecraft/client/gui/inventory/GuiContainer` |
| `azt` | `GuiResourcePackAvailable` | `net/minecraft/client/gui/GuiResourcePackList` |
| `azu` | `GuiResourcePackList` | `net/minecraft/client/gui/GuiListExtended` |
| `azv` | `GuiResourcePackSelected` | `net/minecraft/client/gui/GuiResourcePackList` |
| `axu` | `GuiScreen` | `net/minecraft/client/gui/Gui` |
| `axi` | `GuiScreenAddServer` | `net/minecraft/client/gui/GuiScreen` |
| `axi$1` | `GuiScreenAddServer$1` | `java/lang/Object` |
| `ayo` | `GuiScreenBook` | `net/minecraft/client/gui/GuiScreen` |
| `ayo$a` | `GuiScreenBook$NextPageButton` | `net/minecraft/client/gui/GuiButton` |
| `axc` | `GuiScreenCustomizePresets` | `net/minecraft/client/gui/GuiScreen` |
| `axc$a` | `GuiScreenCustomizePresets$Info` | `java/lang/Object` |
| `axc$b` | `GuiScreenCustomizePresets$ListPreset` | `net/minecraft/client/gui/GuiSlot` |
| `axf` | `GuiScreenDemo` | `net/minecraft/client/gui/GuiScreen` |
| `axz` | `GuiScreenOptionsSounds` | `net/minecraft/client/gui/GuiScreen` |
| `axz$a` | `GuiScreenOptionsSounds$Button` | `net/minecraft/client/gui/GuiButton` |
| `awr` | `GuiScreenRealmsProxy` | `net/minecraft/client/gui/GuiScreen` |
| `azo` | `GuiScreenResourcePacks` | `net/minecraft/client/gui/GuiScreen` |
| `axg` | `GuiScreenServerList` | `net/minecraft/client/gui/GuiScreen` |
| `axr` | `GuiScreenWorking` | `net/minecraft/client/gui/GuiScreen` |
| `axv` | `GuiSelectWorld` | `net/minecraft/client/gui/GuiScreen` |
| `axv$a` | `GuiSelectWorld$List` | `net/minecraft/client/gui/GuiSlot` |
| `axw` | `GuiShareToLan` | `net/minecraft/client/gui/GuiScreen` |
| `awt` | `GuiSimpleScrolledSelectionListProxy` | `net/minecraft/client/gui/GuiSlot` |
| `axk` | `GuiSleepMP` | `net/minecraft/client/gui/GuiChat` |
| `avx` | `GuiSlider` | `net/minecraft/client/gui/GuiButton` |
| `avx$a` | `GuiSlider$FormatHelper` | `java/lang/Object` |
| `awi` | `GuiSlot` | `java/lang/Object` |
| `aws` | `GuiSlotRealmsProxy` | `net/minecraft/client/gui/GuiSlot` |
| `axy` | `GuiSnooper` | `net/minecraft/client/gui/GuiScreen` |
| `axy$a` | `GuiSnooper$List` | `net/minecraft/client/gui/GuiSlot` |
| `awm` | `GuiSpectator` | `net/minecraft/client/gui/Gui` |
| `awk` | `GuiStreamIndicator` | `java/lang/Object` |
| `avw` | `GuiTextField` | `net/minecraft/client/gui/Gui` |
| `avu` | `GuiUtilRenderComponents` | `java/lang/Object` |
| `ayb` | `GuiVideoSettings` | `net/minecraft/client/gui/GuiScreen` |
| `ayc` | `GuiWinGame` | `net/minecraft/client/gui/GuiScreen` |
| `awy` | `GuiYesNo` | `net/minecraft/client/gui/GuiScreen` |
| `awx` | `GuiYesNoCallback` | `java/lang/Object` |
| `ayg` | `IProgressMeter` | `java/lang/Object` |
| `avq` | `MapItemRenderer` | `java/lang/Object` |
| `avq$1` | `MapItemRenderer$1` | `java/lang/Object` |
| `avq$a` | `MapItemRenderer$Instance` | `java/lang/Object` |
| `avr` | `ScaledResolution` | `java/lang/Object` |
| `awu` | `ScreenChatOptions` | `net/minecraft/client/gui/GuiScreen` |
| `azj` | `ServerListEntryLanDetected` | `java/lang/Object` |
| `azi` | `ServerListEntryLanScan` | `java/lang/Object` |
| `azk` | `ServerListEntryNormal` | `java/lang/Object` |
| `azk$1` | `ServerListEntryNormal$1` | `java/lang/Object` |
| `azl` | `ServerSelectionList` | `net/minecraft/client/gui/GuiListExtended` |

## `net/minecraft/util` (114)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `aug` | `AxisAlignedBB` | `java/lang/Object` |
| `cj` | `BlockPos` | `net/minecraft/util/Vec3i` |
| `cj$1` | `BlockPos$1` | `java/lang/Object` |
| `cj$1$1` | `BlockPos$1$1` | `com/google/common/collect/AbstractIterator` |
| `cj$2` | `BlockPos$2` | `java/lang/Object` |
| `cj$2$1` | `BlockPos$2$1` | `com/google/common/collect/AbstractIterator` |
| `cj$a` | `BlockPos$MutableBlockPos` | `net/minecraft/util/BlockPos` |
| `cm` | `Cartesian` | `java/lang/Object` |
| `cm$1` | `Cartesian$1` | `java/lang/Object` |
| `cm$a` | `Cartesian$GetList` | `java/lang/Object` |
| `cm$b` | `Cartesian$Product` | `java/lang/Object` |
| `cm$b$a` | `Cartesian$Product$ProductIterator` | `com/google/common/collect/UnmodifiableIterator` |
| `f` | `ChatAllowedCharacters` | `java/lang/Object` |
| `ev` | `ChatComponentProcessor` | `java/lang/Object` |
| `ex` | `ChatComponentScore` | `net/minecraft/util/ChatComponentStyle` |
| `ey` | `ChatComponentSelector` | `net/minecraft/util/ChatComponentStyle` |
| `es` | `ChatComponentStyle` | `java/lang/Object` |
| `es$1` | `ChatComponentStyle$1` | `java/lang/Object` |
| `es$2` | `ChatComponentStyle$2` | `java/lang/Object` |
| `fa` | `ChatComponentText` | `net/minecraft/util/ChatComponentStyle` |
| `fb` | `ChatComponentTranslation` | `net/minecraft/util/ChatComponentStyle` |
| `fc` | `ChatComponentTranslationFormatException` | `java/lang/IllegalArgumentException` |
| `ez` | `ChatStyle` | `java/lang/Object` |
| `ez$1` | `ChatStyle$1` | `net/minecraft/util/ChatStyle` |
| `ez$a` | `ChatStyle$Serializer` | `java/lang/Object` |
| `ne` | `ClassInheritanceMultiMap` | `java/util/AbstractSet` |
| `ne$1` | `ClassInheritanceMultiMap$1` | `java/lang/Object` |
| `ou` | `CombatEntry` | `java/lang/Object` |
| `ov` | `CombatTracker` | `java/lang/Object` |
| `ng` | `CryptManager` | `java/lang/Object` |
| `ow` | `DamageSource` | `java/lang/Object` |
| `ayx` | `EnchantmentNameParts` | `java/lang/Object` |
| `ox` | `EntityDamageSource` | `net/minecraft/util/DamageSource` |
| `oy` | `EntityDamageSourceIndirect` | `net/minecraft/util/EntityDamageSource` |
| `po` | `EntitySelectors` | `java/lang/Object` |
| `po$1` | `EntitySelectors$1` | `java/lang/Object` |
| `po$2` | `EntitySelectors$2` | `java/lang/Object` |
| `po$3` | `EntitySelectors$3` | `java/lang/Object` |
| `po$4` | `EntitySelectors$4` | `java/lang/Object` |
| `po$a` | `EntitySelectors$ArmoredMob` | `java/lang/Object` |
| `a` | `EnumChatFormatting` | `java/lang/Enum` |
| `cq` | `EnumFacing` | `java/lang/Enum` |
| `cq$1` | `EnumFacing$1` | `java/lang/Object` |
| `cq$a` | `EnumFacing$Axis` | `java/lang/Enum` |
| `cq$b` | `EnumFacing$AxisDirection` | `java/lang/Enum` |
| `cq$c` | `EnumFacing$Plane` | `java/lang/Enum` |
| `cy` | `EnumParticleTypes` | `java/lang/Enum` |
| `nr` | `EnumTypeAdapterFactory` | `java/lang/Object` |
| `nr$1` | `EnumTypeAdapterFactory$1` | `com/google/gson/TypeAdapter` |
| `adf` | `EnumWorldBlockLayer` | `java/lang/Enum` |
| `xg` | `FoodStats` | `java/lang/Object` |
| `nh` | `FrameTimer` | `java/lang/Object` |
| `nj` | `HttpUtil` | `java/lang/Object` |
| `nj$1` | `HttpUtil$1` | `java/lang/Object` |
| `eu` | `IChatComponent` | `java/lang/Object` |
| `eu$a` | `IChatComponent$Serializer` | `java/lang/Object` |
| `mz` | `IJsonSerializable` | `java/lang/Object` |
| `cs` | `IObjectIntIterable` | `java/lang/Object` |
| `nu` | `IProgressUpdate` | `java/lang/Object` |
| `db` | `IRegistry` | `java/lang/Object` |
| `nw` | `IStringSerializable` | `java/lang/Object` |
| `od` | `IThreadListener` | `java/lang/Object` |
| `km` | `ITickable` | `java/lang/Object` |
| `nm` | `IntHashMap` | `java/lang/Object` |
| `nm$a` | `IntHashMap$Entry` | `java/lang/Object` |
| `nl` | `IntegerCache` | `java/lang/Object` |
| `nc` | `JsonSerializableSet` | `com/google/common/collect/ForwardingSet` |
| `ni` | `JsonUtils` | `java/lang/Object` |
| `no` | `LazyLoadBase` | `java/lang/Object` |
| `kg` | `LoggingPrintStream` | `java/io/PrintStream` |
| `nq` | `LongHashMap` | `java/lang/Object` |
| `nq$a` | `LongHashMap$Entry` | `java/lang/Object` |
| `cw` | `MapPopulator` | `java/lang/Object` |
| `ns` | `MathHelper` | `java/lang/Object` |
| `bqq` | `Matrix4f` | `org/lwjgl/util/vector/Matrix4f` |
| `en` | `MessageDeserializer` | `io/netty/handler/codec/ByteToMessageDecoder` |
| `eq` | `MessageDeserializer2` | `io/netty/handler/codec/ByteToMessageDecoder` |
| `eo` | `MessageSerializer` | `io/netty/handler/codec/MessageToByteEncoder` |
| `er` | `MessageSerializer2` | `io/netty/handler/codec/MessageToByteEncoder` |
| `avk` | `MinecraftError` | `java/lang/Error` |
| `nv` | `MouseFilter` | `java/lang/Object` |
| `avf` | `MouseHelper` | `java/lang/Object` |
| `beu` | `MovementInput` | `java/lang/Object` |
| `bev` | `MovementInputFromOptions` | `net/minecraft/util/MovementInput` |
| `auh` | `MovingObjectPosition` | `java/lang/Object` |
| `auh$a` | `MovingObjectPosition$MovingObjectType` | `java/lang/Enum` |
| `ct` | `ObjectIntIdentityMap` | `java/lang/Object` |
| `cp` | `RegistryDefaulted` | `net/minecraft/util/RegistrySimple` |
| `cx` | `RegistryNamespaced` | `net/minecraft/util/RegistrySimple` |
| `co` | `RegistryNamespacedDefaultedByKey` | `net/minecraft/util/RegistryNamespaced` |
| `dd` | `RegistrySimple` | `java/lang/Object` |
| `e` | `ReportedException` | `java/lang/RuntimeException` |
| `jy` | `ResourceLocation` | `java/lang/Object` |
| `dc` | `Rotations` | `java/lang/Object` |
| `avj` | `ScreenShotHelper` | `java/lang/Object` |
| `avm` | `Session` | `java/lang/Object` |
| `avm$a` | `Session$Type` | `java/lang/Enum` |
| `di` | `StatCollector` | `java/lang/Object` |
| `dj` | `StringTranslate` | `java/lang/Object` |
| `nx` | `StringUtils` | `java/lang/Object` |
| `np` | `ThreadSafeBoundList` | `java/lang/Object` |
| `avl` | `Timer` | `java/lang/Object` |
| `nz` | `Tuple` | `java/lang/Object` |
| `my` | `TupleIntJsonSerializable` | `java/lang/Object` |
| `g` | `Util` | `java/lang/Object` |
| `g$a` | `Util$EnumOS` | `java/lang/Enum` |
| `aui` | `Vec3` | `java/lang/Object` |
| `df` | `Vec3i` | `java/lang/Object` |
| `atf` | `Vec4b` | `java/lang/Object` |
| `bqr` | `Vector3d` | `java/lang/Object` |
| `oa` | `WeightedRandom` | `java/lang/Object` |
| `oa$a` | `WeightedRandom$Item` | `java/lang/Object` |
| `ob` | `WeightedRandomChestContent` | `net/minecraft/util/WeightedRandom$Item` |
| `us` | `WeightedRandomFishable` | `net/minecraft/util/WeightedRandom$Item` |

## `net/minecraft/item` (96)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `aba` | `EnumAction` | `java/lang/Enum` |
| `zd` | `EnumDyeColor` | `java/lang/Enum` |
| `aaj` | `EnumRarity` | `java/lang/Enum` |
| `zw` | `Item` | `java/lang/Object` |
| `zw$1` | `Item$1` | `java/lang/Object` |
| `zw$10` | `Item$10` | `java/lang/Object` |
| `zw$11` | `Item$11` | `java/lang/Object` |
| `zw$12` | `Item$12` | `java/lang/Object` |
| `zw$13` | `Item$13` | `java/lang/Object` |
| `zw$14` | `Item$14` | `java/lang/Object` |
| `zw$15` | `Item$15` | `java/lang/Object` |
| `zw$16` | `Item$16` | `java/lang/Object` |
| `zw$17` | `Item$17` | `java/lang/Object` |
| `zw$2` | `Item$2` | `java/lang/Object` |
| `zw$3` | `Item$3` | `java/lang/Object` |
| `zw$4` | `Item$4` | `java/lang/Object` |
| `zw$5` | `Item$5` | `java/lang/Object` |
| `zw$6` | `Item$6` | `java/lang/Object` |
| `zw$7` | `Item$7` | `java/lang/Object` |
| `zw$8` | `Item$8` | `java/lang/Object` |
| `zw$9` | `Item$9` | `java/lang/Object` |
| `zw$a` | `Item$ToolMaterial` | `java/lang/Enum` |
| `yi` | `ItemAnvilBlock` | `net/minecraft/item/ItemMultiTexture` |
| `zt` | `ItemAppleGold` | `net/minecraft/item/ItemFood` |
| `yj` | `ItemArmor` | `net/minecraft/item/Item` |
| `yj$1` | `ItemArmor$1` | `net/minecraft/dispenser/BehaviorDefaultDispenseItem` |
| `yj$a` | `ItemArmor$ArmorMaterial` | `java/lang/Enum` |
| `yk` | `ItemArmorStand` | `net/minecraft/item/Item` |
| `yl` | `ItemAxe` | `net/minecraft/item/ItemTool` |
| `ym` | `ItemBanner` | `net/minecraft/item/ItemBlock` |
| `yn` | `ItemBed` | `net/minecraft/item/Item` |
| `yo` | `ItemBlock` | `net/minecraft/item/Item` |
| `yq` | `ItemBoat` | `net/minecraft/item/Item` |
| `yr` | `ItemBook` | `net/minecraft/item/Item` |
| `yt` | `ItemBow` | `net/minecraft/item/Item` |
| `yv` | `ItemBucket` | `net/minecraft/item/Item` |
| `aac` | `ItemBucketMilk` | `net/minecraft/item/Item` |
| `yw` | `ItemCarrotOnAStick` | `net/minecraft/item/Item` |
| `zf` | `ItemCloth` | `net/minecraft/item/ItemBlock` |
| `yx` | `ItemCoal` | `net/minecraft/item/Item` |
| `aaz` | `ItemColored` | `net/minecraft/item/ItemBlock` |
| `zb` | `ItemDoor` | `net/minecraft/item/Item` |
| `zc` | `ItemDoublePlant` | `net/minecraft/item/ItemMultiTexture` |
| `ze` | `ItemDye` | `net/minecraft/item/Item` |
| `abd` | `ItemEditableBook` | `net/minecraft/item/Item` |
| `zg` | `ItemEgg` | `net/minecraft/item/Item` |
| `zh` | `ItemEmptyMap` | `net/minecraft/item/ItemMapBase` |
| `zi` | `ItemEnchantedBook` | `net/minecraft/item/Item` |
| `zj` | `ItemEnderEye` | `net/minecraft/item/Item` |
| `zk` | `ItemEnderPearl` | `net/minecraft/item/Item` |
| `zl` | `ItemExpBottle` | `net/minecraft/item/Item` |
| `zm` | `ItemFireball` | `net/minecraft/item/Item` |
| `zo` | `ItemFirework` | `net/minecraft/item/Item` |
| `zn` | `ItemFireworkCharge` | `net/minecraft/item/Item` |
| `zp` | `ItemFishFood` | `net/minecraft/item/ItemFood` |
| `zp$a` | `ItemFishFood$FishType` | `java/lang/Enum` |
| `zq` | `ItemFishingRod` | `net/minecraft/item/Item` |
| `zr` | `ItemFlintAndSteel` | `net/minecraft/item/Item` |
| `zs` | `ItemFood` | `net/minecraft/item/Item` |
| `ys` | `ItemGlassBottle` | `net/minecraft/item/Item` |
| `zu` | `ItemHangingEntity` | `net/minecraft/item/Item` |
| `zv` | `ItemHoe` | `net/minecraft/item/Item` |
| `zv$1` | `ItemHoe$1` | `java/lang/Object` |
| `zz` | `ItemLead` | `net/minecraft/item/Item` |
| `aaa` | `ItemLeaves` | `net/minecraft/item/ItemBlock` |
| `abb` | `ItemLilyPad` | `net/minecraft/item/ItemColored` |
| `aab` | `ItemMap` | `net/minecraft/item/ItemMapBase` |
| `yy` | `ItemMapBase` | `net/minecraft/item/Item` |
| `aad` | `ItemMinecart` | `net/minecraft/item/Item` |
| `aad$1` | `ItemMinecart$1` | `net/minecraft/dispenser/BehaviorDefaultDispenseItem` |
| `aax` | `ItemMonsterPlacer` | `net/minecraft/item/Item` |
| `aae` | `ItemMultiTexture` | `net/minecraft/item/ItemBlock` |
| `aae$1` | `ItemMultiTexture$1` | `java/lang/Object` |
| `aaf` | `ItemNameTag` | `net/minecraft/item/Item` |
| `aag` | `ItemPickaxe` | `net/minecraft/item/ItemTool` |
| `aah` | `ItemPiston` | `net/minecraft/item/ItemBlock` |
| `aai` | `ItemPotion` | `net/minecraft/item/Item` |
| `aak` | `ItemRecord` | `net/minecraft/item/Item` |
| `aal` | `ItemRedstone` | `net/minecraft/item/Item` |
| `yp` | `ItemReed` | `net/minecraft/item/Item` |
| `aam` | `ItemSaddle` | `net/minecraft/item/Item` |
| `aan` | `ItemSeedFood` | `net/minecraft/item/ItemFood` |
| `aao` | `ItemSeeds` | `net/minecraft/item/Item` |
| `aap` | `ItemShears` | `net/minecraft/item/Item` |
| `aar` | `ItemSign` | `net/minecraft/item/Item` |
| `aas` | `ItemSimpleFoiled` | `net/minecraft/item/Item` |
| `aat` | `ItemSkull` | `net/minecraft/item/Item` |
| `aau` | `ItemSlab` | `net/minecraft/item/ItemBlock` |
| `aav` | `ItemSnow` | `net/minecraft/item/ItemBlock` |
| `aaw` | `ItemSnowball` | `net/minecraft/item/Item` |
| `yu` | `ItemSoup` | `net/minecraft/item/ItemFood` |
| `aaq` | `ItemSpade` | `net/minecraft/item/ItemTool` |
| `zx` | `ItemStack` | `java/lang/Object` |
| `aay` | `ItemSword` | `net/minecraft/item/Item` |
| `za` | `ItemTool` | `net/minecraft/item/Item` |
| `abc` | `ItemWritableBook` | `net/minecraft/item/Item` |

## `net/minecraft/network/play/server` (87)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `gn` | `S00PacketKeepAlive` | `java/lang/Object` |
| `gt` | `S01PacketJoinGame` | `java/lang/Object` |
| `fy` | `S02PacketChat` | `java/lang/Object` |
| `hu` | `S03PacketTimeUpdate` | `java/lang/Object` |
| `hn` | `S04PacketEntityEquipment` | `java/lang/Object` |
| `ht` | `S05PacketSpawnPosition` | `java/lang/Object` |
| `hp` | `S06PacketUpdateHealth` | `java/lang/Object` |
| `he` | `S07PacketRespawn` | `java/lang/Object` |
| `fi` | `S08PacketPlayerPosLook` | `java/lang/Object` |
| `fi$a` | `S08PacketPlayerPosLook$EnumFlags` | `java/lang/Enum` |
| `hi` | `S09PacketHeldItemChange` | `java/lang/Object` |
| `ha` | `S0APacketUseBed` | `java/lang/Object` |
| `fq` | `S0BPacketAnimation` | `java/lang/Object` |
| `fp` | `S0CPacketSpawnPlayer` | `java/lang/Object` |
| `hy` | `S0DPacketCollectItem` | `java/lang/Object` |
| `fk` | `S0EPacketSpawnObject` | `java/lang/Object` |
| `fn` | `S0FPacketSpawnMob` | `java/lang/Object` |
| `fo` | `S10PacketSpawnPainting` | `java/lang/Object` |
| `fl` | `S11PacketSpawnExperienceOrb` | `java/lang/Object` |
| `hm` | `S12PacketEntityVelocity` | `java/lang/Object` |
| `hb` | `S13PacketDestroyEntities` | `java/lang/Object` |
| `gv` | `S14PacketEntity` | `java/lang/Object` |
| `gv$a` | `S14PacketEntity$S15PacketEntityRelMove` | `net/minecraft/network/play/server/S14PacketEntity` |
| `gv$c` | `S14PacketEntity$S16PacketEntityLook` | `net/minecraft/network/play/server/S14PacketEntity` |
| `gv$b` | `S14PacketEntity$S17PacketEntityLookMove` | `net/minecraft/network/play/server/S14PacketEntity` |
| `hz` | `S18PacketEntityTeleport` | `java/lang/Object` |
| `hf` | `S19PacketEntityHeadLook` | `java/lang/Object` |
| `gi` | `S19PacketEntityStatus` | `java/lang/Object` |
| `hl` | `S1BPacketEntityAttach` | `java/lang/Object` |
| `hk` | `S1CPacketEntityMetadata` | `java/lang/Object` |
| `ib` | `S1DPacketEntityEffect` | `java/lang/Object` |
| `hc` | `S1EPacketRemoveEntityEffect` | `java/lang/Object` |
| `ho` | `S1FPacketSetExperience` | `java/lang/Object` |
| `ia` | `S20PacketEntityProperties` | `java/lang/Object` |
| `ia$a` | `S20PacketEntityProperties$Snapshot` | `java/lang/Object` |
| `go` | `S21PacketChunkData` | `java/lang/Object` |
| `go$a` | `S21PacketChunkData$Extracted` | `java/lang/Object` |
| `fz` | `S22PacketMultiBlockChange` | `java/lang/Object` |
| `fz$a` | `S22PacketMultiBlockChange$BlockUpdateData` | `java/lang/Object` |
| `fv` | `S23PacketBlockChange` | `java/lang/Object` |
| `fu` | `S24PacketBlockAction` | `java/lang/Object` |
| `fs` | `S25PacketBlockBreakAnim` | `java/lang/Object` |
| `gp` | `S26PacketMapChunkBulk` | `java/lang/Object` |
| `gk` | `S27PacketExplosion` | `java/lang/Object` |
| `gq` | `S28PacketEffect` | `java/lang/Object` |
| `gs` | `S29PacketSoundEffect` | `java/lang/Object` |
| `gr` | `S2APacketParticles` | `java/lang/Object` |
| `gm` | `S2BPacketChangeGameState` | `java/lang/Object` |
| `fm` | `S2CPacketSpawnGlobalEntity` | `java/lang/Object` |
| `gc` | `S2DPacketOpenWindow` | `java/lang/Object` |
| `gb` | `S2EPacketCloseWindow` | `java/lang/Object` |
| `gf` | `S2FPacketSetSlot` | `java/lang/Object` |
| `gd` | `S30PacketWindowItems` | `java/lang/Object` |
| `ge` | `S31PacketWindowProperty` | `java/lang/Object` |
| `ga` | `S32PacketConfirmTransaction` | `java/lang/Object` |
| `hw` | `S33PacketUpdateSign` | `java/lang/Object` |
| `gu` | `S34PacketMaps` | `java/lang/Object` |
| `ft` | `S35PacketUpdateTileEntity` | `java/lang/Object` |
| `gw` | `S36PacketSignEditorOpen` | `java/lang/Object` |
| `fr` | `S37PacketStatistics` | `java/lang/Object` |
| `gz` | `S38PacketPlayerListItem` | `java/lang/Object` |
| `gz$1` | `S38PacketPlayerListItem$1` | `java/lang/Object` |
| `gz$a` | `S38PacketPlayerListItem$Action` | `java/lang/Enum` |
| `gz$b` | `S38PacketPlayerListItem$AddPlayerData` | `java/lang/Object` |
| `gx` | `S39PacketPlayerAbilities` | `java/lang/Object` |
| `fx` | `S3APacketTabComplete` | `java/lang/Object` |
| `hq` | `S3BPacketScoreboardObjective` | `java/lang/Object` |
| `hs` | `S3CPacketUpdateScore` | `java/lang/Object` |
| `hs$a` | `S3CPacketUpdateScore$Action` | `java/lang/Enum` |
| `hj` | `S3DPacketDisplayScoreboard` | `java/lang/Object` |
| `hr` | `S3EPacketTeams` | `java/lang/Object` |
| `gg` | `S3FPacketCustomPayload` | `java/lang/Object` |
| `gh` | `S40PacketDisconnect` | `java/lang/Object` |
| `fw` | `S41PacketServerDifficulty` | `java/lang/Object` |
| `gy` | `S42PacketCombatEvent` | `java/lang/Object` |
| `gy$1` | `S42PacketCombatEvent$1` | `java/lang/Object` |
| `gy$a` | `S42PacketCombatEvent$Event` | `java/lang/Enum` |
| `hh` | `S43PacketCamera` | `java/lang/Object` |
| `hg` | `S44PacketWorldBorder` | `java/lang/Object` |
| `hg$1` | `S44PacketWorldBorder$1` | `java/lang/Object` |
| `hg$a` | `S44PacketWorldBorder$Action` | `java/lang/Enum` |
| `hv` | `S45PacketTitle` | `java/lang/Object` |
| `hv$a` | `S45PacketTitle$Type` | `java/lang/Enum` |
| `gl` | `S46PacketSetCompressionLevel` | `java/lang/Object` |
| `hx` | `S47PacketPlayerListHeaderFooter` | `java/lang/Object` |
| `hd` | `S48PacketResourcePackSend` | `java/lang/Object` |
| `gj` | `S49PacketUpdateEntityNBT` | `java/lang/Object` |

## `net/minecraft/client/particle` (83)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bdj` | `Barrier` | `net/minecraft/client/particle/EntityFX` |
| `bdj$a` | `Barrier$Factory` | `java/lang/Object` |
| `bec` | `EffectRenderer` | `java/lang/Object` |
| `bec$1` | `EffectRenderer$1` | `java/lang/Object` |
| `bec$2` | `EffectRenderer$2` | `java/lang/Object` |
| `bec$3` | `EffectRenderer$3` | `java/lang/Object` |
| `bec$4` | `EffectRenderer$4` | `java/lang/Object` |
| `bem` | `EntityAuraFX` | `net/minecraft/client/particle/EntityFX` |
| `bem$b` | `EntityAuraFX$Factory` | `java/lang/Object` |
| `bem$a` | `EntityAuraFX$HappyVillagerFactory` | `java/lang/Object` |
| `ben` | `EntityBlockDustFX` | `net/minecraft/client/particle/EntityDiggingFX` |
| `ben$a` | `EntityBlockDustFX$Factory` | `java/lang/Object` |
| `bdk` | `EntityBreakingFX` | `net/minecraft/client/particle/EntityFX` |
| `bdk$a` | `EntityBreakingFX$Factory` | `java/lang/Object` |
| `bdk$b` | `EntityBreakingFX$SlimeFactory` | `java/lang/Object` |
| `bdk$c` | `EntityBreakingFX$SnowballFactory` | `java/lang/Object` |
| `bdl` | `EntityBubbleFX` | `net/minecraft/client/particle/EntityFX` |
| `bdl$a` | `EntityBubbleFX$Factory` | `java/lang/Object` |
| `bee` | `EntityCloudFX` | `net/minecraft/client/particle/EntityFX` |
| `bee$a` | `EntityCloudFX$Factory` | `java/lang/Object` |
| `bdm` | `EntityCrit2FX` | `net/minecraft/client/particle/EntityFX` |
| `bdm$b` | `EntityCrit2FX$Factory` | `java/lang/Object` |
| `bdm$a` | `EntityCrit2FX$MagicFactory` | `java/lang/Object` |
| `bdx` | `EntityCritFX` | `net/minecraft/client/particle/EntitySmokeFX` |
| `bdx$a` | `EntityCritFX$Factory` | `java/lang/Object` |
| `beo` | `EntityDiggingFX` | `net/minecraft/client/particle/EntityFX` |
| `beo$a` | `EntityDiggingFX$Factory` | `java/lang/Object` |
| `bdn` | `EntityDropParticleFX` | `net/minecraft/client/particle/EntityFX` |
| `bdn$a` | `EntityDropParticleFX$LavaFactory` | `java/lang/Object` |
| `bdn$b` | `EntityDropParticleFX$WaterFactory` | `java/lang/Object` |
| `bdo` | `EntityEnchantmentTableParticleFX` | `net/minecraft/client/particle/EntityFX` |
| `bdo$a` | `EntityEnchantmentTableParticleFX$EnchantmentTable` | `java/lang/Object` |
| `bdp` | `EntityExplodeFX` | `net/minecraft/client/particle/EntityFX` |
| `bdp$a` | `EntityExplodeFX$Factory` | `java/lang/Object` |
| `beb` | `EntityFX` | `net/minecraft/entity/Entity` |
| `bdq` | `EntityFirework` | `java/lang/Object` |
| `bdq$d` | `EntityFirework$Factory` | `java/lang/Object` |
| `bdq$a` | `EntityFirework$OverlayFX` | `net/minecraft/client/particle/EntityFX` |
| `bdq$b` | `EntityFirework$SparkFX` | `net/minecraft/client/particle/EntityFX` |
| `bdq$c` | `EntityFirework$StarterFX` | `net/minecraft/client/particle/EntityFX` |
| `beq` | `EntityFishWakeFX` | `net/minecraft/client/particle/EntityFX` |
| `beq$a` | `EntityFishWakeFX$Factory` | `java/lang/Object` |
| `bdr` | `EntityFlameFX` | `net/minecraft/client/particle/EntityFX` |
| `bdr$a` | `EntityFlameFX$Factory` | `java/lang/Object` |
| `bds` | `EntityFootStepFX` | `net/minecraft/client/particle/EntityFX` |
| `bds$a` | `EntityFootStepFX$Factory` | `java/lang/Object` |
| `bdt` | `EntityHeartFX` | `net/minecraft/client/particle/EntityFX` |
| `bdt$a` | `EntityHeartFX$AngryVillagerFactory` | `java/lang/Object` |
| `bdt$b` | `EntityHeartFX$Factory` | `java/lang/Object` |
| `bdv` | `EntityHugeExplodeFX` | `net/minecraft/client/particle/EntityFX` |
| `bdv$a` | `EntityHugeExplodeFX$Factory` | `java/lang/Object` |
| `bdu` | `EntityLargeExplodeFX` | `net/minecraft/client/particle/EntityFX` |
| `bdu$a` | `EntityLargeExplodeFX$Factory` | `java/lang/Object` |
| `bdy` | `EntityLavaFX` | `net/minecraft/client/particle/EntityFX` |
| `bdy$a` | `EntityLavaFX$Factory` | `java/lang/Object` |
| `bea` | `EntityNoteFX` | `net/minecraft/client/particle/EntityFX` |
| `bea$a` | `EntityNoteFX$Factory` | `java/lang/Object` |
| `bep` | `EntityParticleEmitter` | `net/minecraft/client/particle/EntityFX` |
| `bdw` | `EntityPickupFX` | `net/minecraft/client/particle/EntityFX` |
| `bef` | `EntityPortalFX` | `net/minecraft/client/particle/EntityFX` |
| `bef$a` | `EntityPortalFX$Factory` | `java/lang/Object` |
| `ber` | `EntityRainFX` | `net/minecraft/client/particle/EntityFX` |
| `ber$a` | `EntityRainFX$Factory` | `java/lang/Object` |
| `beg` | `EntityReddustFX` | `net/minecraft/client/particle/EntityFX` |
| `beg$a` | `EntityReddustFX$Factory` | `java/lang/Object` |
| `beh` | `EntitySmokeFX` | `net/minecraft/client/particle/EntityFX` |
| `beh$1` | `EntitySmokeFX$1` | `java/lang/Object` |
| `beh$a` | `EntitySmokeFX$Factory` | `java/lang/Object` |
| `bei` | `EntitySnowShovelFX` | `net/minecraft/client/particle/EntityFX` |
| `bei$a` | `EntitySnowShovelFX$Factory` | `java/lang/Object` |
| `bej` | `EntitySpellParticleFX` | `net/minecraft/client/particle/EntityFX` |
| `bej$a` | `EntitySpellParticleFX$AmbientMobFactory` | `java/lang/Object` |
| `bej$d` | `EntitySpellParticleFX$Factory` | `java/lang/Object` |
| `bej$b` | `EntitySpellParticleFX$InstantFactory` | `java/lang/Object` |
| `bej$c` | `EntitySpellParticleFX$MobFactory` | `java/lang/Object` |
| `bej$e` | `EntitySpellParticleFX$WitchFactory` | `java/lang/Object` |
| `bek` | `EntitySplashFX` | `net/minecraft/client/particle/EntityRainFX` |
| `bek$a` | `EntitySplashFX$Factory` | `java/lang/Object` |
| `bel` | `EntitySuspendFX` | `net/minecraft/client/particle/EntityFX` |
| `bel$a` | `EntitySuspendFX$Factory` | `java/lang/Object` |
| `bed` | `IParticleFactory` | `java/lang/Object` |
| `bdz` | `MobAppearance` | `net/minecraft/client/particle/EntityFX` |
| `bdz$a` | `MobAppearance$Factory` | `java/lang/Object` |

## `net/minecraft/client/renderer` (80)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `auz` | `ActiveRenderInfo` | `java/lang/Object` |
| `bge` | `BlockFluidRenderer` | `java/lang/Object` |
| `bgf` | `BlockModelRenderer` | `java/lang/Object` |
| `bgf$1` | `BlockModelRenderer$1` | `java/lang/Object` |
| `bgf$b` | `BlockModelRenderer$AmbientOcclusionFace` | `java/lang/Object` |
| `bgf$a` | `BlockModelRenderer$EnumNeighborInfo` | `java/lang/Enum` |
| `bgf$d` | `BlockModelRenderer$Orientation` | `java/lang/Enum` |
| `bgf$c` | `BlockModelRenderer$VertexTranslations` | `java/lang/Enum` |
| `bgc` | `BlockModelShapes` | `java/lang/Object` |
| `bgc$1` | `BlockModelShapes$1` | `net/minecraft/client/renderer/block/statemap/StateMapperBase` |
| `bgc$2` | `BlockModelShapes$2` | `net/minecraft/client/renderer/block/statemap/StateMapperBase` |
| `bgc$3` | `BlockModelShapes$3` | `net/minecraft/client/renderer/block/statemap/StateMapperBase` |
| `bgc$4` | `BlockModelShapes$4` | `net/minecraft/client/renderer/block/statemap/StateMapperBase` |
| `bgc$5` | `BlockModelShapes$5` | `net/minecraft/client/renderer/block/statemap/StateMapperBase` |
| `bgc$6` | `BlockModelShapes$6` | `net/minecraft/client/renderer/block/statemap/StateMapperBase` |
| `bgc$7` | `BlockModelShapes$7` | `net/minecraft/client/renderer/block/statemap/StateMapperBase` |
| `bgc$8` | `BlockModelShapes$8` | `java/lang/Object` |
| `bgd` | `BlockRendererDispatcher` | `java/lang/Object` |
| `bgb` | `ChestRenderer` | `java/lang/Object` |
| `bfh` | `ChunkRenderContainer` | `java/lang/Object` |
| `kw` | `DestroyBlockProgress` | `java/lang/Object` |
| `bfk` | `EntityRenderer` | `java/lang/Object` |
| `bfk$1` | `EntityRenderer$1` | `java/lang/Object` |
| `bfk$2` | `EntityRenderer$2` | `java/lang/Object` |
| `bfk$3` | `EntityRenderer$3` | `java/lang/Object` |
| `bfk$4` | `EntityRenderer$4` | `java/lang/Object` |
| `bfj` | `EnumFaceDirection` | `java/lang/Enum` |
| `bfj$1` | `EnumFaceDirection$1` | `java/lang/Object` |
| `bfj$a` | `EnumFaceDirection$Constants` | `java/lang/Object` |
| `bfj$b` | `EnumFaceDirection$VertexInformation` | `java/lang/Object` |
| `avd` | `GLAllocation` | `java/lang/Object` |
| `bfl` | `GlStateManager` | `java/lang/Object` |
| `bfl$1` | `GlStateManager$1` | `java/lang/Object` |
| `bfl$a` | `GlStateManager$AlphaState` | `java/lang/Object` |
| `bfl$b` | `GlStateManager$BlendState` | `java/lang/Object` |
| `bfl$c` | `GlStateManager$BooleanState` | `java/lang/Object` |
| `bfl$d` | `GlStateManager$ClearState` | `java/lang/Object` |
| `bfl$e` | `GlStateManager$Color` | `java/lang/Object` |
| `bfl$f` | `GlStateManager$ColorLogicState` | `java/lang/Object` |
| `bfl$g` | `GlStateManager$ColorMask` | `java/lang/Object` |
| `bfl$h` | `GlStateManager$ColorMaterialState` | `java/lang/Object` |
| `bfl$i` | `GlStateManager$CullState` | `java/lang/Object` |
| `bfl$j` | `GlStateManager$DepthState` | `java/lang/Object` |
| `bfl$k` | `GlStateManager$FogState` | `java/lang/Object` |
| `bfl$l` | `GlStateManager$PolygonOffsetState` | `java/lang/Object` |
| `bfl$m` | `GlStateManager$StencilFunc` | `java/lang/Object` |
| `bfl$n` | `GlStateManager$StencilState` | `java/lang/Object` |
| `bfl$o` | `GlStateManager$TexGen` | `java/lang/Enum` |
| `bfl$p` | `GlStateManager$TexGenCoord` | `java/lang/Object` |
| `bfl$q` | `GlStateManager$TexGenState` | `java/lang/Object` |
| `bfl$r` | `GlStateManager$TextureState` | `java/lang/Object` |
| `bfm` | `IImageBuffer` | `java/lang/Object` |
| `bfs` | `ImageBufferDownload` | `java/lang/Object` |
| `ayw` | `InventoryEffectRenderer` | `net/minecraft/client/gui/inventory/GuiContainer` |
| `bfp` | `ItemMeshDefinition` | `java/lang/Object` |
| `bfo` | `ItemModelMesher` | `java/lang/Object` |
| `bfn` | `ItemRenderer` | `java/lang/Object` |
| `bfn$1` | `ItemRenderer$1` | `java/lang/Object` |
| `bqs` | `OpenGlHelper` | `java/lang/Object` |
| `bff` | `RegionRenderCache` | `net/minecraft/world/ChunkCache` |
| `bfg` | `RegionRenderCacheBuilder` | `java/lang/Object` |
| `bfr` | `RenderGlobal` | `java/lang/Object` |
| `bfr$1` | `RenderGlobal$1` | `java/lang/Object` |
| `bfr$2` | `RenderGlobal$2` | `java/lang/Object` |
| `bfr$a` | `RenderGlobal$ContainerLocalRenderInformation` | `java/lang/Object` |
| `avc` | `RenderHelper` | `java/lang/Object` |
| `bft` | `RenderList` | `net/minecraft/client/renderer/ChunkRenderContainer` |
| `bmg` | `StitcherException` | `java/lang/RuntimeException` |
| `bfx` | `Tessellator` | `java/lang/Object` |
| `bma` | `ThreadDownloadImageData` | `net/minecraft/client/renderer/texture/SimpleTexture` |
| `bma$1` | `ThreadDownloadImageData$1` | `java/lang/Thread` |
| `bfy` | `VboRenderList` | `net/minecraft/client/renderer/ChunkRenderContainer` |
| `bfz` | `VertexBufferUploader` | `net/minecraft/client/renderer/WorldVertexBufferUploader` |
| `bga` | `ViewFrustum` | `java/lang/Object` |
| `bfd` | `WorldRenderer` | `java/lang/Object` |
| `bfd$1` | `WorldRenderer$1` | `java/lang/Object` |
| `bfd$2` | `WorldRenderer$2` | `java/lang/Object` |
| `bfd$a` | `WorldRenderer$State` | `java/lang/Object` |
| `bfe` | `WorldVertexBufferUploader` | `java/lang/Object` |
| `bfe$1` | `WorldVertexBufferUploader$1` | `java/lang/Object` |

## `net/minecraft/client/renderer/entity` (72)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `big` | `ArmorStandRenderer` | `net/minecraft/client/renderer/entity/RendererLivingEntity` |
| `big$1` | `ArmorStandRenderer$1` | `net/minecraft/client/renderer/entity/layers/LayerBipedArmor` |
| `biv` | `Render` | `java/lang/Object` |
| `bih` | `RenderArrow` | `net/minecraft/client/renderer/entity/Render` |
| `bii` | `RenderBat` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bje` | `RenderBiped` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bij` | `RenderBlaze` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bik` | `RenderBoat` | `net/minecraft/client/renderer/entity/Render` |
| `bil` | `RenderCaveSpider` | `net/minecraft/client/renderer/entity/RenderSpider` |
| `bim` | `RenderChicken` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bin` | `RenderCow` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bio` | `RenderCreeper` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bir` | `RenderDragon` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bis` | `RenderEnderman` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bit` | `RenderEndermite` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bip` | `RenderEntity` | `net/minecraft/client/renderer/entity/Render` |
| `bjf` | `RenderEntityItem` | `net/minecraft/client/renderer/entity/Render` |
| `bix` | `RenderFallingBlock` | `net/minecraft/client/renderer/entity/Render` |
| `biy` | `RenderFireball` | `net/minecraft/client/renderer/entity/Render` |
| `biz` | `RenderFish` | `net/minecraft/client/renderer/entity/Render` |
| `bja` | `RenderGhast` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bjb` | `RenderGiantZombie` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bjb$1` | `RenderGiantZombie$1` | `net/minecraft/client/renderer/entity/layers/LayerBipedArmor` |
| `bjc` | `RenderGuardian` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bjd` | `RenderHorse` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bkg` | `RenderIronGolem` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bjh` | `RenderItem` | `java/lang/Object` |
| `bjh$1` | `RenderItem$1` | `java/lang/Object` |
| `bjh$2` | `RenderItem$2` | `java/lang/Object` |
| `bjh$3` | `RenderItem$3` | `java/lang/Object` |
| `bjh$4` | `RenderItem$4` | `java/lang/Object` |
| `bjh$5` | `RenderItem$5` | `java/lang/Object` |
| `bjh$6` | `RenderItem$6` | `java/lang/Object` |
| `bjh$7` | `RenderItem$7` | `java/lang/Object` |
| `bjh$8` | `RenderItem$8` | `java/lang/Object` |
| `bjh$9` | `RenderItem$9` | `java/lang/Object` |
| `bjj` | `RenderLeashKnot` | `net/minecraft/client/renderer/entity/Render` |
| `bjk` | `RenderLightningBolt` | `net/minecraft/client/renderer/entity/Render` |
| `bjo` | `RenderLiving` | `net/minecraft/client/renderer/entity/RendererLivingEntity` |
| `bji` | `RenderMagmaCube` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `biu` | `RenderManager` | `java/lang/Object` |
| `bjm` | `RenderMinecart` | `net/minecraft/client/renderer/entity/Render` |
| `bjn` | `RenderMinecartMobSpawner` | `net/minecraft/client/renderer/entity/RenderMinecart` |
| `bjp` | `RenderMooshroom` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bjq` | `RenderOcelot` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bjr` | `RenderPainting` | `net/minecraft/client/renderer/entity/Render` |
| `bjs` | `RenderPig` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bjt` | `RenderPigZombie` | `net/minecraft/client/renderer/entity/RenderBiped` |
| `bjt$1` | `RenderPigZombie$1` | `net/minecraft/client/renderer/entity/layers/LayerBipedArmor` |
| `bln` | `RenderPlayer` | `net/minecraft/client/renderer/entity/RendererLivingEntity` |
| `bkd` | `RenderPotion` | `net/minecraft/client/renderer/entity/RenderSnowball` |
| `bju` | `RenderRabbit` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bjv` | `RenderSheep` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bjw` | `RenderSilverfish` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bjx` | `RenderSkeleton` | `net/minecraft/client/renderer/entity/RenderBiped` |
| `bjx$1` | `RenderSkeleton$1` | `net/minecraft/client/renderer/entity/layers/LayerBipedArmor` |
| `bjy` | `RenderSlime` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bjz` | `RenderSnowMan` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bkc` | `RenderSnowball` | `net/minecraft/client/renderer/entity/Render` |
| `bka` | `RenderSpider` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bkb` | `RenderSquid` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bkf` | `RenderTNTPrimed` | `net/minecraft/client/renderer/entity/Render` |
| `bke` | `RenderTntMinecart` | `net/minecraft/client/renderer/entity/RenderMinecart` |
| `bkh` | `RenderVillager` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bki` | `RenderWitch` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bkj` | `RenderWither` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `bkl` | `RenderWolf` | `net/minecraft/client/renderer/entity/RenderLiving` |
| `biw` | `RenderXPOrb` | `net/minecraft/client/renderer/entity/Render` |
| `bkm` | `RenderZombie` | `net/minecraft/client/renderer/entity/RenderBiped` |
| `bkm$1` | `RenderZombie$1` | `net/minecraft/client/renderer/entity/layers/LayerBipedArmor` |
| `bjl` | `RendererLivingEntity` | `net/minecraft/client/renderer/entity/Render` |
| `bjl$1` | `RendererLivingEntity$1` | `java/lang/Object` |

## `net/minecraft/command` (67)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `i` | `CommandBase` | `java/lang/Object` |
| `i$a` | `CommandBase$CoordinateArg` | `java/lang/Object` |
| `s` | `CommandBlockData` | `net/minecraft/command/CommandBase` |
| `t` | `CommandClearInventory` | `net/minecraft/command/CommandBase` |
| `u` | `CommandClone` | `net/minecraft/command/CommandBase` |
| `u$a` | `CommandClone$StaticCloneData` | `java/lang/Object` |
| `v` | `CommandCompare` | `net/minecraft/command/CommandBase` |
| `x` | `CommandDebug` | `net/minecraft/command/CommandBase` |
| `y` | `CommandDefaultGameMode` | `net/minecraft/command/CommandGameMode` |
| `ag` | `CommandDifficulty` | `net/minecraft/command/CommandBase` |
| `z` | `CommandEffect` | `net/minecraft/command/CommandBase` |
| `ab` | `CommandEnchant` | `net/minecraft/command/CommandBase` |
| `ac` | `CommandEntityData` | `net/minecraft/command/CommandBase` |
| `bz` | `CommandException` | `java/lang/Exception` |
| `ad` | `CommandExecuteAt` | `net/minecraft/command/CommandBase` |
| `ad$1` | `CommandExecuteAt$1` | `java/lang/Object` |
| `af` | `CommandFill` | `net/minecraft/command/CommandBase` |
| `ah` | `CommandGameMode` | `net/minecraft/command/CommandBase` |
| `ai` | `CommandGameRule` | `net/minecraft/command/CommandBase` |
| `aj` | `CommandGive` | `net/minecraft/command/CommandBase` |
| `j` | `CommandHandler` | `java/lang/Object` |
| `ak` | `CommandHelp` | `net/minecraft/command/CommandBase` |
| `am` | `CommandKill` | `net/minecraft/command/CommandBase` |
| `ce` | `CommandNotFoundException` | `net/minecraft/command/CommandException` |
| `au` | `CommandParticle` | `net/minecraft/command/CommandBase` |
| `av` | `CommandPlaySound` | `net/minecraft/command/CommandBase` |
| `ax` | `CommandReplaceItem` | `net/minecraft/command/CommandBase` |
| `n` | `CommandResultStats` | `java/lang/Object` |
| `n$1` | `CommandResultStats$1` | `java/lang/Object` |
| `n$a` | `CommandResultStats$Type` | `java/lang/Enum` |
| `al` | `CommandServerKick` | `net/minecraft/command/CommandBase` |
| `bg` | `CommandSetPlayerTimeout` | `net/minecraft/command/CommandBase` |
| `bh` | `CommandSetSpawnpoint` | `net/minecraft/command/CommandBase` |
| `bi` | `CommandShowSeed` | `net/minecraft/command/CommandBase` |
| `bj` | `CommandSpreadPlayers` | `net/minecraft/command/CommandBase` |
| `bj$a` | `CommandSpreadPlayers$Position` | `java/lang/Object` |
| `bk` | `CommandStats` | `net/minecraft/command/CommandBase` |
| `br` | `CommandTime` | `net/minecraft/command/CommandBase` |
| `bs` | `CommandTitle` | `net/minecraft/command/CommandBase` |
| `bt` | `CommandToggleDownfall` | `net/minecraft/command/CommandBase` |
| `bu` | `CommandTrigger` | `net/minecraft/command/CommandBase` |
| `bv` | `CommandWeather` | `net/minecraft/command/CommandBase` |
| `bx` | `CommandWorldBorder` | `net/minecraft/command/CommandBase` |
| `ae` | `CommandXP` | `net/minecraft/command/CommandBase` |
| `ca` | `EntityNotFoundException` | `net/minecraft/command/CommandException` |
| `h` | `IAdminCommand` | `java/lang/Object` |
| `k` | `ICommand` | `java/lang/Object` |
| `l` | `ICommandManager` | `java/lang/Object` |
| `m` | `ICommandSender` | `java/lang/Object` |
| `cb` | `NumberInvalidException` | `net/minecraft/command/CommandException` |
| `cd` | `PlayerNotFoundException` | `net/minecraft/command/CommandException` |
| `o` | `PlayerSelector` | `java/lang/Object` |
| `o$1` | `PlayerSelector$1` | `java/lang/Object` |
| `o$10` | `PlayerSelector$10` | `java/lang/Object` |
| `o$11` | `PlayerSelector$11` | `java/lang/Object` |
| `o$12` | `PlayerSelector$12` | `java/lang/Object` |
| `o$2` | `PlayerSelector$2` | `java/lang/Object` |
| `o$3` | `PlayerSelector$3` | `java/lang/Object` |
| `o$4` | `PlayerSelector$4` | `java/lang/Object` |
| `o$5` | `PlayerSelector$5` | `java/lang/Object` |
| `o$6` | `PlayerSelector$6` | `java/lang/Object` |
| `o$7` | `PlayerSelector$7` | `java/lang/Object` |
| `o$8` | `PlayerSelector$8` | `java/lang/Object` |
| `o$9` | `PlayerSelector$9` | `java/lang/Object` |
| `bd` | `ServerCommandManager` | `net/minecraft/command/CommandHandler` |
| `cc` | `SyntaxErrorException` | `net/minecraft/command/CommandException` |
| `cf` | `WrongUsageException` | `net/minecraft/command/SyntaxErrorException` |

## `net/minecraft/entity/ai` (65)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `sa` | `EntityAIArrowAttack` | `net/minecraft/entity/ai/EntityAIBase` |
| `rl` | `EntityAIAttackOnCollide` | `net/minecraft/entity/ai/EntityAIBase` |
| `qs` | `EntityAIAvoidEntity` | `net/minecraft/entity/ai/EntityAIBase` |
| `qs$1` | `EntityAIAvoidEntity$1` | `java/lang/Object` |
| `rd` | `EntityAIBase` | `java/lang/Object` |
| `qt` | `EntityAIBeg` | `net/minecraft/entity/ai/EntityAIBase` |
| `qu` | `EntityAIBreakDoor` | `net/minecraft/entity/ai/EntityAIDoorInteract` |
| `qw` | `EntityAIControlledByPlayer` | `net/minecraft/entity/ai/EntityAIBase` |
| `sf` | `EntityAICreeperSwell` | `net/minecraft/entity/ai/EntityAIBase` |
| `sl` | `EntityAIDefendVillage` | `net/minecraft/entity/ai/EntityAITarget` |
| `qx` | `EntityAIDoorInteract` | `net/minecraft/entity/ai/EntityAIBase` |
| `qy` | `EntityAIEatGrass` | `net/minecraft/entity/ai/EntityAIBase` |
| `sn` | `EntityAIFindEntityNearest` | `net/minecraft/entity/ai/EntityAIBase` |
| `sn$1` | `EntityAIFindEntityNearest$1` | `java/lang/Object` |
| `so` | `EntityAIFindEntityNearestPlayer` | `net/minecraft/entity/ai/EntityAIBase` |
| `so$1` | `EntityAIFindEntityNearestPlayer$1` | `java/lang/Object` |
| `qz` | `EntityAIFleeSun` | `net/minecraft/entity/ai/EntityAIBase` |
| `sg` | `EntityAIFollowGolem` | `net/minecraft/entity/ai/EntityAIBase` |
| `rb` | `EntityAIFollowOwner` | `net/minecraft/entity/ai/EntityAIBase` |
| `rc` | `EntityAIFollowParent` | `net/minecraft/entity/ai/EntityAIBase` |
| `rf` | `EntityAIHarvestFarmland` | `net/minecraft/entity/ai/EntityAIMoveToBlock` |
| `sm` | `EntityAIHurtByTarget` | `net/minecraft/entity/ai/EntityAITarget` |
| `rh` | `EntityAILeapAtTarget` | `net/minecraft/entity/ai/EntityAIBase` |
| `rj` | `EntityAILookAtTradePlayer` | `net/minecraft/entity/ai/EntityAIWatchClosest` |
| `rt` | `EntityAILookAtVillager` | `net/minecraft/entity/ai/EntityAIBase` |
| `ry` | `EntityAILookIdle` | `net/minecraft/entity/ai/EntityAIBase` |
| `qv` | `EntityAIMate` | `net/minecraft/entity/ai/EntityAIBase` |
| `rm` | `EntityAIMoveIndoors` | `net/minecraft/entity/ai/EntityAIBase` |
| `rn` | `EntityAIMoveThroughVillage` | `net/minecraft/entity/ai/EntityAIBase` |
| `ro` | `EntityAIMoveToBlock` | `net/minecraft/entity/ai/EntityAIBase` |
| `rp` | `EntityAIMoveTowardsRestriction` | `net/minecraft/entity/ai/EntityAIBase` |
| `rq` | `EntityAIMoveTowardsTarget` | `net/minecraft/entity/ai/EntityAIBase` |
| `sp` | `EntityAINearestAttackableTarget` | `net/minecraft/entity/ai/EntityAITarget` |
| `sp$1` | `EntityAINearestAttackableTarget$1` | `java/lang/Object` |
| `sp$a` | `EntityAINearestAttackableTarget$Sorter` | `java/lang/Object` |
| `rr` | `EntityAIOcelotAttack` | `net/minecraft/entity/ai/EntityAIBase` |
| `rs` | `EntityAIOcelotSit` | `net/minecraft/entity/ai/EntityAIMoveToBlock` |
| `ru` | `EntityAIOpenDoor` | `net/minecraft/entity/ai/EntityAIDoorInteract` |
| `sr` | `EntityAIOwnerHurtByTarget` | `net/minecraft/entity/ai/EntityAITarget` |
| `ss` | `EntityAIOwnerHurtTarget` | `net/minecraft/entity/ai/EntityAITarget` |
| `rv` | `EntityAIPanic` | `net/minecraft/entity/ai/EntityAIBase` |
| `rw` | `EntityAIPlay` | `net/minecraft/entity/ai/EntityAIBase` |
| `sb` | `EntityAIRestrictOpenDoor` | `net/minecraft/entity/ai/EntityAIBase` |
| `sc` | `EntityAIRestrictSun` | `net/minecraft/entity/ai/EntityAIBase` |
| `sd` | `EntityAIRunAroundLikeCrazy` | `net/minecraft/entity/ai/EntityAIBase` |
| `se` | `EntityAISit` | `net/minecraft/entity/ai/EntityAIBase` |
| `ra` | `EntityAISwimming` | `net/minecraft/entity/ai/EntityAIBase` |
| `st` | `EntityAITarget` | `net/minecraft/entity/ai/EntityAIBase` |
| `sq` | `EntityAITargetNonTamed` | `net/minecraft/entity/ai/EntityAINearestAttackableTarget` |
| `re` | `EntityAITasks` | `java/lang/Object` |
| `re$a` | `EntityAITasks$EntityAITaskEntry` | `java/lang/Object` |
| `sh` | `EntityAITempt` | `net/minecraft/entity/ai/EntityAIBase` |
| `si` | `EntityAITradePlayer` | `net/minecraft/entity/ai/EntityAIBase` |
| `sj` | `EntityAIVillagerInteract` | `net/minecraft/entity/ai/EntityAIWatchClosest2` |
| `rk` | `EntityAIVillagerMate` | `net/minecraft/entity/ai/EntityAIBase` |
| `rz` | `EntityAIWander` | `net/minecraft/entity/ai/EntityAIBase` |
| `ri` | `EntityAIWatchClosest` | `net/minecraft/entity/ai/EntityAIBase` |
| `rg` | `EntityAIWatchClosest2` | `net/minecraft/entity/ai/EntityAIWatchClosest` |
| `qo` | `EntityJumpHelper` | `java/lang/Object` |
| `qp` | `EntityLookHelper` | `java/lang/Object` |
| `vh` | `EntityMinecartMobSpawner` | `net/minecraft/entity/item/EntityMinecart` |
| `vh$1` | `EntityMinecartMobSpawner$1` | `net/minecraft/tileentity/MobSpawnerBaseLogic` |
| `qq` | `EntityMoveHelper` | `java/lang/Object` |
| `ta` | `EntitySenses` | `java/lang/Object` |
| `tc` | `RandomPositionGenerator` | `java/lang/Object` |

## `net/minecraft/client/model` (52)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bat` | `ModelArmorStand` | `net/minecraft/client/model/ModelArmorStandArmor` |
| `bas` | `ModelArmorStandArmor` | `net/minecraft/client/model/ModelBiped` |
| `bau` | `ModelBanner` | `net/minecraft/client/model/ModelBase` |
| `bbo` | `ModelBase` | `java/lang/Object` |
| `bav` | `ModelBat` | `net/minecraft/client/model/ModelBase` |
| `bbj` | `ModelBiped` | `net/minecraft/client/model/ModelBase` |
| `baw` | `ModelBlaze` | `net/minecraft/client/model/ModelBase` |
| `bax` | `ModelBoat` | `net/minecraft/client/model/ModelBase` |
| `bay` | `ModelBook` | `net/minecraft/client/model/ModelBase` |
| `bcr` | `ModelBox` | `java/lang/Object` |
| `baz` | `ModelChest` | `net/minecraft/client/model/ModelBase` |
| `bba` | `ModelChicken` | `net/minecraft/client/model/ModelBase` |
| `bbb` | `ModelCow` | `net/minecraft/client/model/ModelQuadruped` |
| `bbc` | `ModelCreeper` | `net/minecraft/client/model/ModelBase` |
| `bco` | `ModelDragon` | `net/minecraft/client/model/ModelBase` |
| `bcp` | `ModelEnderCrystal` | `net/minecraft/client/model/ModelBase` |
| `bbe` | `ModelEnderMite` | `net/minecraft/client/model/ModelBase` |
| `bbd` | `ModelEnderman` | `net/minecraft/client/model/ModelBiped` |
| `bbf` | `ModelGhast` | `net/minecraft/client/model/ModelBase` |
| `bbg` | `ModelGuardian` | `net/minecraft/client/model/ModelBase` |
| `bbh` | `ModelHorse` | `net/minecraft/client/model/ModelBase` |
| `bbi` | `ModelHumanoidHead` | `net/minecraft/client/model/ModelSkeletonHead` |
| `bch` | `ModelIronGolem` | `net/minecraft/client/model/ModelBase` |
| `bbk` | `ModelLargeChest` | `net/minecraft/client/model/ModelChest` |
| `bbm` | `ModelLeashKnot` | `net/minecraft/client/model/ModelBase` |
| `bbl` | `ModelMagmaCube` | `net/minecraft/client/model/ModelBase` |
| `bbn` | `ModelMinecart` | `net/minecraft/client/model/ModelBase` |
| `bbp` | `ModelOcelot` | `net/minecraft/client/model/ModelBase` |
| `bbq` | `ModelPig` | `net/minecraft/client/model/ModelQuadruped` |
| `bbr` | `ModelPlayer` | `net/minecraft/client/model/ModelBiped` |
| `bbt` | `ModelQuadruped` | `net/minecraft/client/model/ModelBase` |
| `bbu` | `ModelRabbit` | `net/minecraft/client/model/ModelBase` |
| `bct` | `ModelRenderer` | `java/lang/Object` |
| `bbv` | `ModelSheep1` | `net/minecraft/client/model/ModelQuadruped` |
| `bbw` | `ModelSheep2` | `net/minecraft/client/model/ModelQuadruped` |
| `bbx` | `ModelSign` | `net/minecraft/client/model/ModelBase` |
| `bby` | `ModelSilverfish` | `net/minecraft/client/model/ModelBase` |
| `bca` | `ModelSkeleton` | `net/minecraft/client/model/ModelZombie` |
| `bbz` | `ModelSkeletonHead` | `net/minecraft/client/model/ModelBase` |
| `bcc` | `ModelSlime` | `net/minecraft/client/model/ModelBase` |
| `bcd` | `ModelSnowMan` | `net/minecraft/client/model/ModelBase` |
| `bce` | `ModelSpider` | `net/minecraft/client/model/ModelBase` |
| `bcf` | `ModelSquid` | `net/minecraft/client/model/ModelBase` |
| `bci` | `ModelVillager` | `net/minecraft/client/model/ModelBase` |
| `bck` | `ModelWitch` | `net/minecraft/client/model/ModelVillager` |
| `bcl` | `ModelWither` | `net/minecraft/client/model/ModelBase` |
| `bcm` | `ModelWolf` | `net/minecraft/client/model/ModelBase` |
| `bcn` | `ModelZombie` | `net/minecraft/client/model/ModelBiped` |
| `bcj` | `ModelZombieVillager` | `net/minecraft/client/model/ModelBiped` |
| `bcg` | `PositionTextureVertex` | `java/lang/Object` |
| `bcu` | `TextureOffset` | `java/lang/Object` |
| `bbs` | `TexturedQuad` | `java/lang/Object` |

## `net/minecraft/entity/monster` (52)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `vl` | `EntityBlaze` | `net/minecraft/entity/monster/EntityMob` |
| `vl$a` | `EntityBlaze$AIFireballAttack` | `net/minecraft/entity/ai/EntityAIBase` |
| `vm` | `EntityCaveSpider` | `net/minecraft/entity/monster/EntitySpider` |
| `vn` | `EntityCreeper` | `net/minecraft/entity/monster/EntityMob` |
| `vo` | `EntityEnderman` | `net/minecraft/entity/monster/EntityMob` |
| `vo$1` | `EntityEnderman$1` | `java/lang/Object` |
| `vo$b` | `EntityEnderman$AIFindPlayer` | `net/minecraft/entity/ai/EntityAINearestAttackableTarget` |
| `vo$a` | `EntityEnderman$AIPlaceBlock` | `net/minecraft/entity/ai/EntityAIBase` |
| `vo$c` | `EntityEnderman$AITakeBlock` | `net/minecraft/entity/ai/EntityAIBase` |
| `vp` | `EntityEndermite` | `net/minecraft/entity/monster/EntityMob` |
| `vr` | `EntityGhast` | `net/minecraft/entity/EntityFlying` |
| `vr$c` | `EntityGhast$AIFireballAttack` | `net/minecraft/entity/ai/EntityAIBase` |
| `vr$a` | `EntityGhast$AILookAround` | `net/minecraft/entity/ai/EntityAIBase` |
| `vr$d` | `EntityGhast$AIRandomFly` | `net/minecraft/entity/ai/EntityAIBase` |
| `vr$b` | `EntityGhast$GhastMoveHelper` | `net/minecraft/entity/ai/EntityMoveHelper` |
| `vs` | `EntityGiantZombie` | `net/minecraft/entity/monster/EntityMob` |
| `tq` | `EntityGolem` | `net/minecraft/entity/EntityCreature` |
| `vt` | `EntityGuardian` | `net/minecraft/entity/monster/EntityMob` |
| `vt$1` | `EntityGuardian$1` | `java/lang/Object` |
| `vt$a` | `EntityGuardian$AIGuardianAttack` | `net/minecraft/entity/ai/EntityAIBase` |
| `vt$c` | `EntityGuardian$GuardianMoveHelper` | `net/minecraft/entity/ai/EntityMoveHelper` |
| `vt$b` | `EntityGuardian$GuardianTargetSelector` | `java/lang/Object` |
| `ty` | `EntityIronGolem` | `net/minecraft/entity/monster/EntityGolem` |
| `ty$a` | `EntityIronGolem$AINearestAttackableTargetNonCreeper` | `net/minecraft/entity/ai/EntityAINearestAttackableTarget` |
| `ty$a$1` | `EntityIronGolem$AINearestAttackableTargetNonCreeper$1` | `java/lang/Object` |
| `vu` | `EntityMagmaCube` | `net/minecraft/entity/monster/EntitySlime` |
| `vv` | `EntityMob` | `net/minecraft/entity/EntityCreature` |
| `vw` | `EntityPigZombie` | `net/minecraft/entity/monster/EntityZombie` |
| `vw$b` | `EntityPigZombie$AIHurtByAggressor` | `net/minecraft/entity/ai/EntityAIHurtByTarget` |
| `vw$a` | `EntityPigZombie$AITargetAggressor` | `net/minecraft/entity/ai/EntityAINearestAttackableTarget` |
| `vz` | `EntitySilverfish` | `net/minecraft/entity/monster/EntityMob` |
| `vz$a` | `EntitySilverfish$AIHideInStone` | `net/minecraft/entity/ai/EntityAIWander` |
| `vz$b` | `EntitySilverfish$AISummonSilverfish` | `net/minecraft/entity/ai/EntityAIBase` |
| `wa` | `EntitySkeleton` | `net/minecraft/entity/monster/EntityMob` |
| `wb` | `EntitySlime` | `net/minecraft/entity/EntityLiving` |
| `wb$a` | `EntitySlime$AISlimeAttack` | `net/minecraft/entity/ai/EntityAIBase` |
| `wb$e` | `EntitySlime$AISlimeFaceRandom` | `net/minecraft/entity/ai/EntityAIBase` |
| `wb$b` | `EntitySlime$AISlimeFloat` | `net/minecraft/entity/ai/EntityAIBase` |
| `wb$c` | `EntitySlime$AISlimeHop` | `net/minecraft/entity/ai/EntityAIBase` |
| `wb$d` | `EntitySlime$SlimeMoveHelper` | `net/minecraft/entity/ai/EntityMoveHelper` |
| `tw` | `EntitySnowman` | `net/minecraft/entity/monster/EntityGolem` |
| `wc` | `EntitySpider` | `net/minecraft/entity/monster/EntityMob` |
| `wc$a` | `EntitySpider$AISpiderAttack` | `net/minecraft/entity/ai/EntityAIAttackOnCollide` |
| `wc$c` | `EntitySpider$AISpiderTarget` | `net/minecraft/entity/ai/EntityAINearestAttackableTarget` |
| `wc$b` | `EntitySpider$GroupData` | `java/lang/Object` |
| `wd` | `EntityWitch` | `net/minecraft/entity/monster/EntityMob` |
| `we` | `EntityZombie` | `net/minecraft/entity/monster/EntityMob` |
| `we$1` | `EntityZombie$1` | `java/lang/Object` |
| `we$a` | `EntityZombie$GroupData` | `java/lang/Object` |
| `vq` | `IMob` | `java/lang/Object` |
| `vq$1` | `IMob$1` | `java/lang/Object` |
| `vq$2` | `IMob$2` | `java/lang/Object` |

## `net/minecraft/network` (45)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `el` | `EnumConnectionState` | `java/lang/Enum` |
| `el$1` | `EnumConnectionState$1` | `net/minecraft/network/EnumConnectionState` |
| `el$2` | `EnumConnectionState$2` | `net/minecraft/network/EnumConnectionState` |
| `el$3` | `EnumConnectionState$3` | `net/minecraft/network/EnumConnectionState` |
| `el$4` | `EnumConnectionState$4` | `net/minecraft/network/EnumConnectionState` |
| `fg` | `EnumPacketDirection` | `java/lang/Enum` |
| `ep` | `INetHandler` | `java/lang/Object` |
| `lm` | `NetHandlerPlayServer` | `java/lang/Object` |
| `lm$1` | `NetHandlerPlayServer$1` | `java/lang/Object` |
| `lm$2` | `NetHandlerPlayServer$2` | `java/lang/Object` |
| `lm$3` | `NetHandlerPlayServer$3` | `java/lang/Object` |
| `lm$4` | `NetHandlerPlayServer$4` | `java/lang/Object` |
| `ei` | `NettyCompressionDecoder` | `io/netty/handler/codec/ByteToMessageDecoder` |
| `ej` | `NettyCompressionEncoder` | `io/netty/handler/codec/MessageToByteEncoder` |
| `eg` | `NettyEncryptingDecoder` | `io/netty/handler/codec/MessageToMessageDecoder` |
| `eh` | `NettyEncryptingEncoder` | `io/netty/handler/codec/MessageToByteEncoder` |
| `ef` | `NettyEncryptionTranslator` | `java/lang/Object` |
| `ek` | `NetworkManager` | `io/netty/channel/SimpleChannelInboundHandler` |
| `ek$1` | `NetworkManager$1` | `net/minecraft/util/LazyLoadBase` |
| `ek$2` | `NetworkManager$2` | `net/minecraft/util/LazyLoadBase` |
| `ek$3` | `NetworkManager$3` | `net/minecraft/util/LazyLoadBase` |
| `ek$4` | `NetworkManager$4` | `java/lang/Object` |
| `ek$5` | `NetworkManager$5` | `io/netty/channel/ChannelInitializer` |
| `ek$6` | `NetworkManager$6` | `io/netty/channel/ChannelInitializer` |
| `ek$a` | `NetworkManager$InboundHandlerTuplePacketListener` | `java/lang/Object` |
| `ll` | `NetworkSystem` | `java/lang/Object` |
| `ll$1` | `NetworkSystem$1` | `net/minecraft/util/LazyLoadBase` |
| `ll$2` | `NetworkSystem$2` | `net/minecraft/util/LazyLoadBase` |
| `ll$3` | `NetworkSystem$3` | `net/minecraft/util/LazyLoadBase` |
| `ll$4` | `NetworkSystem$4` | `io/netty/channel/ChannelInitializer` |
| `ll$5` | `NetworkSystem$5` | `io/netty/channel/ChannelInitializer` |
| `ll$6` | `NetworkSystem$6` | `java/lang/Object` |
| `ll$7` | `NetworkSystem$7` | `java/lang/Object` |
| `ff` | `Packet` | `java/lang/Object` |
| `em` | `PacketBuffer` | `io/netty/buffer/ByteBuf` |
| `fh` | `PacketThreadUtil` | `java/lang/Object` |
| `fh$1` | `PacketThreadUtil$1` | `java/lang/Object` |
| `lj` | `PingResponseHandler` | `io/netty/channel/ChannelInboundHandlerAdapter` |
| `js` | `ServerStatusResponse` | `java/lang/Object` |
| `js$c` | `ServerStatusResponse$MinecraftProtocolVersionIdentifier` | `java/lang/Object` |
| `js$c$a` | `ServerStatusResponse$MinecraftProtocolVersionIdentifier$Serializer` | `java/lang/Object` |
| `js$a` | `ServerStatusResponse$PlayerCountData` | `java/lang/Object` |
| `js$a$a` | `ServerStatusResponse$PlayerCountData$Serializer` | `java/lang/Object` |
| `js$b` | `ServerStatusResponse$Serializer` | `java/lang/Object` |
| `ki` | `ThreadQuickExitException` | `java/lang/RuntimeException` |

## `net/minecraft/world` (42)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `adv` | `ChunkCache` | `java/lang/Object` |
| `adg` | `ChunkCoordIntPair` | `java/lang/Object` |
| `adj` | `ColorizerFoliage` | `java/lang/Object` |
| `adl` | `ColorizerGrass` | `java/lang/Object` |
| `ok` | `DifficultyInstance` | `java/lang/Object` |
| `oj` | `EnumDifficulty` | `java/lang/Enum` |
| `ads` | `EnumSkyBlock` | `java/lang/Enum` |
| `adi` | `Explosion` | `java/lang/Object` |
| `adk` | `GameRules` | `java/lang/Object` |
| `adk$a` | `GameRules$Value` | `java/lang/Object` |
| `adk$b` | `GameRules$ValueType` | `java/lang/Enum` |
| `adq` | `IBlockAccess` | `java/lang/Object` |
| `ol` | `IInteractionObject` | `java/lang/Object` |
| `oo` | `ILockableContainer` | `java/lang/Object` |
| `ado` | `IWorldAccess` | `java/lang/Object` |
| `op` | `IWorldNameable` | `java/lang/Object` |
| `on` | `LockCode` | `java/lang/Object` |
| `adn` | `MinecraftException` | `java/lang/Exception` |
| `adw` | `NextTickListEntry` | `java/lang/Object` |
| `adt` | `SpawnerAnimals` | `java/lang/Object` |
| `adu` | `Teleporter` | `java/lang/Object` |
| `adu$a` | `Teleporter$PortalPosition` | `net/minecraft/util/BlockPos` |
| `adm` | `World` | `java/lang/Object` |
| `adm$1` | `World$1` | `java/lang/Object` |
| `adm$2` | `World$2` | `java/lang/Object` |
| `adm$3` | `World$3` | `java/lang/Object` |
| `adm$4` | `World$4` | `java/lang/Object` |
| `lb` | `WorldManager` | `java/lang/Object` |
| `anm` | `WorldProvider` | `java/lang/Object` |
| `anp` | `WorldProviderEnd` | `net/minecraft/world/WorldProvider` |
| `ann` | `WorldProviderHell` | `net/minecraft/world/WorldProvider` |
| `ann$1` | `WorldProviderHell$1` | `net/minecraft/world/border/WorldBorder` |
| `ano` | `WorldProviderSurface` | `net/minecraft/world/WorldProvider` |
| `ate` | `WorldSavedData` | `java/lang/Object` |
| `le` | `WorldServer` | `net/minecraft/world/World` |
| `le$1` | `WorldServer$1` | `java/lang/Object` |
| `le$a` | `WorldServer$ServerBlockEventList` | `java/util/ArrayList` |
| `kz` | `WorldServerMulti` | `net/minecraft/world/WorldServer` |
| `kz$1` | `WorldServerMulti$1` | `java/lang/Object` |
| `adp` | `WorldSettings` | `java/lang/Object` |
| `adp$a` | `WorldSettings$GameType` | `java/lang/Enum` |
| `adr` | `WorldType` | `java/lang/Object` |

## `net/minecraft/world/gen/feature` (42)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `aoh` | `WorldGenAbstractTree` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `aoz` | `WorldGenBigMushroom` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `aoi` | `WorldGenBigTree` | `net/minecraft/world/gen/feature/WorldGenAbstractTree` |
| `aoi$a` | `WorldGenBigTree$FoliageCoordinates` | `net/minecraft/util/BlockPos` |
| `aok` | `WorldGenBlockBlob` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `aon` | `WorldGenCactus` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `apn` | `WorldGenCanopyTree` | `net/minecraft/world/gen/feature/WorldGenAbstractTree` |
| `aop` | `WorldGenClay` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `aoq` | `WorldGenDeadBush` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `aor` | `WorldGenDesertWells` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `aos` | `WorldGenDoublePlant` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `api` | `WorldGenDungeons` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `aow` | `WorldGenFire` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `aou` | `WorldGenFlowers` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `aoj` | `WorldGenForest` | `net/minecraft/world/gen/feature/WorldGenAbstractTree` |
| `apd` | `WorldGenGlowStone1` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `aox` | `WorldGenGlowStone2` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `aoy` | `WorldGenHellLava` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `apg` | `WorldGenHugeTrees` | `net/minecraft/world/gen/feature/WorldGenAbstractTree` |
| `apa` | `WorldGenIcePath` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `apb` | `WorldGenIceSpike` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `apc` | `WorldGenLakes` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `apr` | `WorldGenLiquids` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `ape` | `WorldGenMegaJungle` | `net/minecraft/world/gen/feature/WorldGenHugeTrees` |
| `apf` | `WorldGenMegaPineTree` | `net/minecraft/world/gen/feature/WorldGenHugeTrees` |
| `aph` | `WorldGenMelon` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `apj` | `WorldGenMinable` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `apl` | `WorldGenPumpkin` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `apm` | `WorldGenReed` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `apo` | `WorldGenSand` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `app` | `WorldGenSavannaTree` | `net/minecraft/world/gen/feature/WorldGenAbstractTree` |
| `aov` | `WorldGenShrub` | `net/minecraft/world/gen/feature/WorldGenTrees` |
| `apq` | `WorldGenSpikes` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `apt` | `WorldGenSwamp` | `net/minecraft/world/gen/feature/WorldGenAbstractTree` |
| `apk` | `WorldGenTaiga1` | `net/minecraft/world/gen/feature/WorldGenAbstractTree` |
| `aps` | `WorldGenTaiga2` | `net/minecraft/world/gen/feature/WorldGenAbstractTree` |
| `apu` | `WorldGenTallGrass` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `apv` | `WorldGenTrees` | `net/minecraft/world/gen/feature/WorldGenAbstractTree` |
| `apw` | `WorldGenVines` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `apx` | `WorldGenWaterlily` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `aot` | `WorldGenerator` | `java/lang/Object` |
| `aol` | `WorldGeneratorBonusChest` | `net/minecraft/world/gen/feature/WorldGenerator` |

## `net/minecraft/inventory` (41)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `xj` | `AnimalChest` | `net/minecraft/inventory/InventoryBasic` |
| `xi` | `Container` | `java/lang/Object` |
| `xl` | `ContainerBeacon` | `net/minecraft/inventory/Container` |
| `xl$a` | `ContainerBeacon$BeaconSlot` | `net/minecraft/inventory/Slot` |
| `xm` | `ContainerBrewingStand` | `net/minecraft/inventory/Container` |
| `xm$a` | `ContainerBrewingStand$Ingredient` | `net/minecraft/inventory/Slot` |
| `xm$b` | `ContainerBrewingStand$Potion` | `net/minecraft/inventory/Slot` |
| `xo` | `ContainerChest` | `net/minecraft/inventory/Container` |
| `xr` | `ContainerDispenser` | `net/minecraft/inventory/Container` |
| `xs` | `ContainerEnchantment` | `net/minecraft/inventory/Container` |
| `xs$1` | `ContainerEnchantment$1` | `net/minecraft/inventory/InventoryBasic` |
| `xs$2` | `ContainerEnchantment$2` | `net/minecraft/inventory/Slot` |
| `xs$3` | `ContainerEnchantment$3` | `net/minecraft/inventory/Slot` |
| `xu` | `ContainerFurnace` | `net/minecraft/inventory/Container` |
| `xw` | `ContainerHopper` | `net/minecraft/inventory/Container` |
| `xx` | `ContainerHorseInventory` | `net/minecraft/inventory/Container` |
| `xx$1` | `ContainerHorseInventory$1` | `net/minecraft/inventory/Slot` |
| `xx$2` | `ContainerHorseInventory$2` | `net/minecraft/inventory/Slot` |
| `yb` | `ContainerMerchant` | `net/minecraft/inventory/Container` |
| `xy` | `ContainerPlayer` | `net/minecraft/inventory/Container` |
| `xy$1` | `ContainerPlayer$1` | `net/minecraft/inventory/Slot` |
| `xk` | `ContainerRepair` | `net/minecraft/inventory/Container` |
| `xk$1` | `ContainerRepair$1` | `net/minecraft/inventory/InventoryBasic` |
| `xk$2` | `ContainerRepair$2` | `net/minecraft/inventory/Slot` |
| `xq` | `ContainerWorkbench` | `net/minecraft/inventory/Container` |
| `xn` | `ICrafting` | `java/lang/Object` |
| `oh` | `IInvBasic` | `java/lang/Object` |
| `og` | `IInventory` | `java/lang/Object` |
| `ot` | `ISidedInventory` | `java/lang/Object` |
| `oq` | `InventoryBasic` | `java/lang/Object` |
| `ye` | `InventoryCraftResult` | `java/lang/Object` |
| `xp` | `InventoryCrafting` | `java/lang/Object` |
| `yd` | `InventoryEnderChest` | `net/minecraft/inventory/InventoryBasic` |
| `oi` | `InventoryHelper` | `java/lang/Object` |
| `of` | `InventoryLargeChest` | `java/lang/Object` |
| `ya` | `InventoryMerchant` | `java/lang/Object` |
| `yg` | `Slot` | `java/lang/Object` |
| `yf` | `SlotCrafting` | `net/minecraft/inventory/Slot` |
| `xt` | `SlotFurnaceFuel` | `net/minecraft/inventory/Slot` |
| `xv` | `SlotFurnaceOutput` | `net/minecraft/inventory/Slot` |
| `yc` | `SlotMerchantResult` | `net/minecraft/inventory/Slot` |

## `net/minecraft/client/resources` (38)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bmx` | `AbstractResourcePack` | `java/lang/Object` |
| `bmz` | `DefaultPlayerSkin` | `java/lang/Object` |
| `bna` | `DefaultResourcePack` | `java/lang/Object` |
| `bnb` | `FallbackResourceManager` | `java/lang/Object` |
| `bnb$a` | `FallbackResourceManager$InputStreamLeakedResourceLogger` | `java/io/InputStream` |
| `bnc` | `FileResourcePack` | `net/minecraft/client/resources/AbstractResourcePack` |
| `bnd` | `FolderResourcePack` | `net/minecraft/client/resources/AbstractResourcePack` |
| `bne` | `FoliageColorReloadListener` | `java/lang/Object` |
| `bnf` | `GrassColorReloadListener` | `java/lang/Object` |
| `bnq` | `I18n` | `java/lang/Object` |
| `bng` | `IReloadableResourceManager` | `java/lang/Object` |
| `bnh` | `IResource` | `java/lang/Object` |
| `bni` | `IResourceManager` | `java/lang/Object` |
| `bnj` | `IResourceManagerReloadListener` | `java/lang/Object` |
| `bnk` | `IResourcePack` | `java/lang/Object` |
| `bnr` | `Language` | `java/lang/Object` |
| `bns` | `LanguageManager` | `java/lang/Object` |
| `bnt` | `Locale` | `java/lang/Object` |
| `bmy` | `ResourceIndex` | `java/lang/Object` |
| `bnl` | `ResourcePackFileNotFoundException` | `java/io/FileNotFoundException` |
| `azp` | `ResourcePackListEntry` | `java/lang/Object` |
| `azp$1` | `ResourcePackListEntry$1` | `java/lang/Object` |
| `azq` | `ResourcePackListEntryDefault` | `net/minecraft/client/resources/ResourcePackListEntry` |
| `azr` | `ResourcePackListEntryFound` | `net/minecraft/client/resources/ResourcePackListEntry` |
| `bnm` | `ResourcePackRepository` | `java/lang/Object` |
| `bnm$1` | `ResourcePackRepository$1` | `java/lang/Object` |
| `bnm$2` | `ResourcePackRepository$2` | `java/lang/Object` |
| `bnm$3` | `ResourcePackRepository$3` | `java/lang/Object` |
| `bnm$a` | `ResourcePackRepository$Entry` | `java/lang/Object` |
| `bnn` | `SimpleReloadableResourceManager` | `java/lang/Object` |
| `bnn$1` | `SimpleReloadableResourceManager$1` | `java/lang/Object` |
| `bno` | `SimpleResource` | `java/lang/Object` |
| `bnp` | `SkinManager` | `java/lang/Object` |
| `bnp$1` | `SkinManager$1` | `com/google/common/cache/CacheLoader` |
| `bnp$2` | `SkinManager$2` | `java/lang/Object` |
| `bnp$3` | `SkinManager$3` | `java/lang/Object` |
| `bnp$3$1` | `SkinManager$3$1` | `java/lang/Object` |
| `bnp$a` | `SkinManager$SkinAvailableCallback` | `java/lang/Object` |

## `net/minecraft/entity/passive` (37)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `tj` | `EntityAmbientCreature` | `net/minecraft/entity/EntityLiving` |
| `tm` | `EntityAnimal` | `net/minecraft/entity/EntityAgeable` |
| `tk` | `EntityBat` | `net/minecraft/entity/passive/EntityAmbientCreature` |
| `tn` | `EntityChicken` | `net/minecraft/entity/passive/EntityAnimal` |
| `to` | `EntityCow` | `net/minecraft/entity/passive/EntityAnimal` |
| `tp` | `EntityHorse` | `net/minecraft/entity/passive/EntityAnimal` |
| `tp$1` | `EntityHorse$1` | `java/lang/Object` |
| `tp$a` | `EntityHorse$GroupData` | `java/lang/Object` |
| `tr` | `EntityMooshroom` | `net/minecraft/entity/passive/EntityCow` |
| `ts` | `EntityOcelot` | `net/minecraft/entity/passive/EntityTameable` |
| `tt` | `EntityPig` | `net/minecraft/entity/passive/EntityAnimal` |
| `tu` | `EntityRabbit` | `net/minecraft/entity/passive/EntityAnimal` |
| `tu$c` | `EntityRabbit$AIAvoidEntity` | `net/minecraft/entity/ai/EntityAIAvoidEntity` |
| `tu$a` | `EntityRabbit$AIEvilAttack` | `net/minecraft/entity/ai/EntityAIAttackOnCollide` |
| `tu$g` | `EntityRabbit$AIPanic` | `net/minecraft/entity/ai/EntityAIPanic` |
| `tu$h` | `EntityRabbit$AIRaidFarm` | `net/minecraft/entity/ai/EntityAIMoveToBlock` |
| `tu$b` | `EntityRabbit$EnumMoveType` | `java/lang/Enum` |
| `tu$e` | `EntityRabbit$RabbitJumpHelper` | `net/minecraft/entity/ai/EntityJumpHelper` |
| `tu$f` | `EntityRabbit$RabbitMoveHelper` | `net/minecraft/entity/ai/EntityMoveHelper` |
| `tu$d` | `EntityRabbit$RabbitTypeData` | `java/lang/Object` |
| `tv` | `EntitySheep` | `net/minecraft/entity/passive/EntityAnimal` |
| `tv$1` | `EntitySheep$1` | `net/minecraft/inventory/Container` |
| `tx` | `EntitySquid` | `net/minecraft/entity/passive/EntityWaterMob` |
| `tx$a` | `EntitySquid$AIMoveRandom` | `net/minecraft/entity/ai/EntityAIBase` |
| `qa` | `EntityTameable` | `net/minecraft/entity/passive/EntityAnimal` |
| `wi` | `EntityVillager` | `net/minecraft/entity/EntityAgeable` |
| `wi$a` | `EntityVillager$EmeraldForItems` | `java/lang/Object` |
| `wi$f` | `EntityVillager$ITradeList` | `java/lang/Object` |
| `wi$d` | `EntityVillager$ItemAndEmeraldToItem` | `java/lang/Object` |
| `wi$b` | `EntityVillager$ListEnchantedBookForEmeralds` | `java/lang/Object` |
| `wi$c` | `EntityVillager$ListEnchantedItemForEmeralds` | `java/lang/Object` |
| `wi$e` | `EntityVillager$ListItemForEmeralds` | `java/lang/Object` |
| `wi$g` | `EntityVillager$PriceInfo` | `net/minecraft/util/Tuple` |
| `tz` | `EntityWaterMob` | `net/minecraft/entity/EntityLiving` |
| `ua` | `EntityWolf` | `net/minecraft/entity/passive/EntityTameable` |
| `ua$1` | `EntityWolf$1` | `java/lang/Object` |
| `pi` | `IAnimals` | `java/lang/Object` |

## `net/minecraft/world/biome` (37)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `adz` | `BiomeCache` | `java/lang/Object` |
| `adz$a` | `BiomeCache$Block` | `java/lang/Object` |
| `aea` | `BiomeColorHelper` | `java/lang/Object` |
| `aea$1` | `BiomeColorHelper$1` | `java/lang/Object` |
| `aea$2` | `BiomeColorHelper$2` | `java/lang/Object` |
| `aea$3` | `BiomeColorHelper$3` | `java/lang/Object` |
| `aea$a` | `BiomeColorHelper$ColorResolver` | `java/lang/Object` |
| `aeb` | `BiomeDecorator` | `java/lang/Object` |
| `aew` | `BiomeEndDecorator` | `net/minecraft/world/biome/BiomeDecorator` |
| `ady` | `BiomeGenBase` | `java/lang/Object` |
| `ady$1` | `BiomeGenBase$1` | `java/lang/Object` |
| `ady$a` | `BiomeGenBase$Height` | `java/lang/Object` |
| `ady$c` | `BiomeGenBase$SpawnListEntry` | `net/minecraft/util/WeightedRandom$Item` |
| `ady$b` | `BiomeGenBase$TempCategory` | `java/lang/Enum` |
| `adx` | `BiomeGenBeach` | `net/minecraft/world/biome/BiomeGenBase` |
| `aed` | `BiomeGenDesert` | `net/minecraft/world/biome/BiomeGenBase` |
| `aev` | `BiomeGenEnd` | `net/minecraft/world/biome/BiomeGenBase` |
| `aeg` | `BiomeGenForest` | `net/minecraft/world/biome/BiomeGenBase` |
| `aeg$2` | `BiomeGenForest$1` | `net/minecraft/world/biome/BiomeGenMutated` |
| `aeg$1` | `BiomeGenForest$2` | `net/minecraft/world/biome/BiomeGenMutated` |
| `aeh` | `BiomeGenHell` | `net/minecraft/world/biome/BiomeGenBase` |
| `aee` | `BiomeGenHills` | `net/minecraft/world/biome/BiomeGenBase` |
| `aej` | `BiomeGenJungle` | `net/minecraft/world/biome/BiomeGenBase` |
| `aek` | `BiomeGenMesa` | `net/minecraft/world/biome/BiomeGenBase` |
| `ael` | `BiomeGenMushroomIsland` | `net/minecraft/world/biome/BiomeGenBase` |
| `aem` | `BiomeGenMutated` | `net/minecraft/world/biome/BiomeGenBase` |
| `aen` | `BiomeGenOcean` | `net/minecraft/world/biome/BiomeGenBase` |
| `aeo` | `BiomeGenPlains` | `net/minecraft/world/biome/BiomeGenBase` |
| `aeq` | `BiomeGenRiver` | `net/minecraft/world/biome/BiomeGenBase` |
| `aer` | `BiomeGenSavanna` | `net/minecraft/world/biome/BiomeGenBase` |
| `aer$a` | `BiomeGenSavanna$Mutated` | `net/minecraft/world/biome/BiomeGenMutated` |
| `aei` | `BiomeGenSnow` | `net/minecraft/world/biome/BiomeGenBase` |
| `aes` | `BiomeGenStoneBeach` | `net/minecraft/world/biome/BiomeGenBase` |
| `aet` | `BiomeGenSwamp` | `net/minecraft/world/biome/BiomeGenBase` |
| `aeu` | `BiomeGenTaiga` | `net/minecraft/world/biome/BiomeGenBase` |
| `aec` | `WorldChunkManager` | `java/lang/Object` |
| `aef` | `WorldChunkManagerHell` | `net/minecraft/world/biome/WorldChunkManager` |

## `net/minecraft/entity` (36)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `pz` | `DataWatcher` | `java/lang/Object` |
| `pz$a` | `DataWatcher$WatchableObject` | `java/lang/Object` |
| `pk` | `Entity` | `java/lang/Object` |
| `pk$1` | `Entity$1` | `java/lang/Object` |
| `pk$2` | `Entity$2` | `java/lang/Object` |
| `pk$3` | `Entity$3` | `java/lang/Object` |
| `pk$4` | `Entity$4` | `java/lang/Object` |
| `ph` | `EntityAgeable` | `net/minecraft/entity/EntityCreature` |
| `qm` | `EntityBodyHelper` | `java/lang/Object` |
| `py` | `EntityCreature` | `net/minecraft/entity/EntityLiving` |
| `pq` | `EntityFlying` | `net/minecraft/entity/EntityLiving` |
| `un` | `EntityHanging` | `net/minecraft/entity/Entity` |
| `up` | `EntityLeashKnot` | `net/minecraft/entity/EntityHanging` |
| `pm` | `EntityList` | `java/lang/Object` |
| `pm$a` | `EntityList$EntityEggInfo` | `java/lang/Object` |
| `ps` | `EntityLiving` | `net/minecraft/entity/EntityLivingBase` |
| `ps$a` | `EntityLiving$SpawnPlacementType` | `java/lang/Enum` |
| `pr` | `EntityLivingBase` | `net/minecraft/entity/Entity` |
| `pr$1` | `EntityLivingBase$1` | `java/lang/Object` |
| `vc` | `EntityMinecartCommandBlock` | `net/minecraft/entity/item/EntityMinecart` |
| `vc$1` | `EntityMinecartCommandBlock$1` | `net/minecraft/command/server/CommandBlockLogic` |
| `pv` | `EntitySpawnPlacementRegistry` | `java/lang/Object` |
| `la` | `EntityTracker` | `java/lang/Object` |
| `la$1` | `EntityTracker$1` | `java/lang/Object` |
| `lh` | `EntityTrackerEntry` | `java/lang/Object` |
| `pw` | `EnumCreatureAttribute` | `java/lang/Enum` |
| `pt` | `EnumCreatureType` | `java/lang/Enum` |
| `pu` | `IEntityLivingData` | `java/lang/Object` |
| `ud` | `IEntityMultiPart` | `java/lang/Object` |
| `px` | `IEntityOwnable` | `java/lang/Object` |
| `acy` | `IMerchant` | `java/lang/Object` |
| `wh` | `INpc` | `java/lang/Object` |
| `wv` | `IProjectile` | `java/lang/Object` |
| `vx` | `IRangedAttackMob` | `java/lang/Object` |
| `wg` | `NpcMerchant` | `java/lang/Object` |
| `vy` | `SharedMonsterAttributes` | `java/lang/Object` |

## `net/minecraft/tileentity` (36)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `ali` | `IHopper` | `java/lang/Object` |
| `add` | `MobSpawnerBaseLogic` | `java/lang/Object` |
| `add$a` | `MobSpawnerBaseLogic$WeightedRandomMinecart` | `net/minecraft/util/WeightedRandom$Item` |
| `akw` | `TileEntity` | `java/lang/Object` |
| `akw$1` | `TileEntity$1` | `java/lang/Object` |
| `akw$2` | `TileEntity$2` | `java/lang/Object` |
| `akw$3` | `TileEntity$3` | `java/lang/Object` |
| `aku` | `TileEntityBanner` | `net/minecraft/tileentity/TileEntity` |
| `aku$a` | `TileEntityBanner$EnumBannerPattern` | `java/lang/Enum` |
| `akv` | `TileEntityBeacon` | `net/minecraft/tileentity/TileEntityLockable` |
| `akv$a` | `TileEntityBeacon$BeamSegment` | `java/lang/Object` |
| `akx` | `TileEntityBrewingStand` | `net/minecraft/tileentity/TileEntityLockable` |
| `aky` | `TileEntityChest` | `net/minecraft/tileentity/TileEntityLockable` |
| `aky$1` | `TileEntityChest$1` | `java/lang/Object` |
| `akz` | `TileEntityCommandBlock` | `net/minecraft/tileentity/TileEntity` |
| `akz$1` | `TileEntityCommandBlock$1` | `net/minecraft/command/server/CommandBlockLogic` |
| `ala` | `TileEntityComparator` | `net/minecraft/tileentity/TileEntity` |
| `alb` | `TileEntityDaylightDetector` | `net/minecraft/tileentity/TileEntity` |
| `alc` | `TileEntityDispenser` | `net/minecraft/tileentity/TileEntityLockable` |
| `ald` | `TileEntityDropper` | `net/minecraft/tileentity/TileEntityDispenser` |
| `ale` | `TileEntityEnchantmentTable` | `net/minecraft/tileentity/TileEntity` |
| `alp` | `TileEntityEndPortal` | `net/minecraft/tileentity/TileEntity` |
| `alf` | `TileEntityEnderChest` | `net/minecraft/tileentity/TileEntity` |
| `alg` | `TileEntityFlowerPot` | `net/minecraft/tileentity/TileEntity` |
| `alh` | `TileEntityFurnace` | `net/minecraft/tileentity/TileEntityLockable` |
| `alj` | `TileEntityHopper` | `net/minecraft/tileentity/TileEntityLockable` |
| `alk` | `TileEntityLockable` | `net/minecraft/tileentity/TileEntity` |
| `all` | `TileEntityMobSpawner` | `net/minecraft/tileentity/TileEntity` |
| `all$1` | `TileEntityMobSpawner$1` | `net/minecraft/tileentity/MobSpawnerBaseLogic` |
| `alm` | `TileEntityNote` | `net/minecraft/tileentity/TileEntity` |
| `alu` | `TileEntityPiston` | `net/minecraft/tileentity/TileEntity` |
| `alu$1` | `TileEntityPiston$1` | `java/lang/Object` |
| `aln` | `TileEntitySign` | `net/minecraft/tileentity/TileEntity` |
| `aln$1` | `TileEntitySign$1` | `java/lang/Object` |
| `aln$2` | `TileEntitySign$2` | `java/lang/Object` |
| `alo` | `TileEntitySkull` | `net/minecraft/tileentity/TileEntity` |

## `net/minecraft/client/renderer/block/model` (34)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bgg` | `BakedQuad` | `java/lang/Object` |
| `bgk` | `BlockFaceUV` | `java/lang/Object` |
| `bgk$a` | `BlockFaceUV$Deserializer` | `java/lang/Object` |
| `bgh` | `BlockPart` | `java/lang/Object` |
| `bgh$1` | `BlockPart$1` | `java/lang/Object` |
| `bgh$a` | `BlockPart$Deserializer` | `java/lang/Object` |
| `bgi` | `BlockPartFace` | `java/lang/Object` |
| `bgi$a` | `BlockPartFace$Deserializer` | `java/lang/Object` |
| `bgj` | `BlockPartRotation` | `java/lang/Object` |
| `bgn` | `BreakingFour` | `net/minecraft/client/renderer/block/model/BakedQuad` |
| `bgn$1` | `BreakingFour$1` | `java/lang/Object` |
| `bgo` | `FaceBakery` | `java/lang/Object` |
| `bgo$1` | `FaceBakery$1` | `java/lang/Object` |
| `bgr` | `ItemCameraTransforms` | `java/lang/Object` |
| `bgr$1` | `ItemCameraTransforms$1` | `java/lang/Object` |
| `bgr$a` | `ItemCameraTransforms$Deserializer` | `java/lang/Object` |
| `bgr$b` | `ItemCameraTransforms$TransformType` | `java/lang/Enum` |
| `bgp` | `ItemModelGenerator` | `java/lang/Object` |
| `bgp$1` | `ItemModelGenerator$1` | `java/lang/Object` |
| `bgp$a` | `ItemModelGenerator$Span` | `java/lang/Object` |
| `bgp$b` | `ItemModelGenerator$SpanFacing` | `java/lang/Enum` |
| `bgq` | `ItemTransformVec3f` | `java/lang/Object` |
| `bgq$a` | `ItemTransformVec3f$Deserializer` | `java/lang/Object` |
| `bgl` | `ModelBlock` | `java/lang/Object` |
| `bgl$1` | `ModelBlock$1` | `java/lang/Object` |
| `bgl$a` | `ModelBlock$Bookkeep` | `java/lang/Object` |
| `bgl$b` | `ModelBlock$Deserializer` | `java/lang/Object` |
| `bgl$c` | `ModelBlock$LoopException` | `java/lang/RuntimeException` |
| `bgm` | `ModelBlockDefinition` | `java/lang/Object` |
| `bgm$a` | `ModelBlockDefinition$Deserializer` | `java/lang/Object` |
| `bgm$b` | `ModelBlockDefinition$MissingVariantException` | `java/lang/RuntimeException` |
| `bgm$c` | `ModelBlockDefinition$Variant` | `java/lang/Object` |
| `bgm$c$a` | `ModelBlockDefinition$Variant$Deserializer` | `java/lang/Object` |
| `bgm$d` | `ModelBlockDefinition$Variants` | `java/lang/Object` |

## `net/minecraft/client/audio` (31)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bpc` | `GuardianSound` | `net/minecraft/client/audio/MovingSound` |
| `bpj` | `ISound` | `java/lang/Object` |
| `bpj$a` | `ISound$AttenuationType` | `java/lang/Enum` |
| `bqb` | `ISoundEventAccessor` | `java/lang/Object` |
| `bpk` | `ITickableSound` | `java/lang/Object` |
| `bpb` | `MovingSound` | `net/minecraft/client/audio/PositionedSound` |
| `bpd` | `MovingSoundMinecart` | `net/minecraft/client/audio/MovingSound` |
| `bpe` | `MovingSoundMinecartRiding` | `net/minecraft/client/audio/MovingSound` |
| `bpv` | `MusicTicker` | `java/lang/Object` |
| `bpv$a` | `MusicTicker$MusicType` | `java/lang/Enum` |
| `bpa` | `PositionedSound` | `java/lang/Object` |
| `bpf` | `PositionedSoundRecord` | `net/minecraft/client/audio/PositionedSound` |
| `bpg` | `SoundCategory` | `java/lang/Enum` |
| `bqc` | `SoundEventAccessor` | `java/lang/Object` |
| `bpy` | `SoundEventAccessorComposite` | `java/lang/Object` |
| `bpz` | `SoundHandler` | `java/lang/Object` |
| `bpz$1` | `SoundHandler$1` | `java/lang/Object` |
| `bpz$2` | `SoundHandler$2` | `java/lang/Object` |
| `bpz$3` | `SoundHandler$3` | `java/lang/Object` |
| `bph` | `SoundList` | `java/lang/Object` |
| `bph$a` | `SoundList$SoundEntry` | `java/lang/Object` |
| `bph$a$a` | `SoundList$SoundEntry$Type` | `java/lang/Enum` |
| `bpi` | `SoundListSerializer` | `java/lang/Object` |
| `bpx` | `SoundManager` | `java/lang/Object` |
| `bpx$1` | `SoundManager$1` | `java/lang/Object` |
| `bpx$1$1` | `SoundManager$1$1` | `paulscode/sound/SoundSystemLogger` |
| `bpx$2` | `SoundManager$2` | `java/net/URLStreamHandler` |
| `bpx$2$1` | `SoundManager$2$1` | `java/net/URLConnection` |
| `bpx$a` | `SoundManager$SoundSystemStarterThread` | `paulscode/sound/SoundSystem` |
| `bpw` | `SoundPoolEntry` | `java/lang/Object` |
| `bqa` | `SoundRegistry` | `net/minecraft/util/RegistrySimple` |

## `net/minecraft/network/play/client` (31)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `io` | `C00PacketKeepAlive` | `java/lang/Object` |
| `ie` | `C01PacketChatMessage` | `java/lang/Object` |
| `in` | `C02PacketUseEntity` | `java/lang/Object` |
| `in$a` | `C02PacketUseEntity$Action` | `java/lang/Enum` |
| `ip` | `C03PacketPlayer` | `java/lang/Object` |
| `ip$a` | `C03PacketPlayer$C04PacketPlayerPosition` | `net/minecraft/network/play/client/C03PacketPlayer` |
| `ip$c` | `C03PacketPlayer$C05PacketPlayerLook` | `net/minecraft/network/play/client/C03PacketPlayer` |
| `ip$b` | `C03PacketPlayer$C06PacketPlayerPosLook` | `net/minecraft/network/play/client/C03PacketPlayer` |
| `ir` | `C07PacketPlayerDigging` | `java/lang/Object` |
| `ir$a` | `C07PacketPlayerDigging$Action` | `java/lang/Enum` |
| `ja` | `C08PacketPlayerBlockPlacement` | `java/lang/Object` |
| `iv` | `C09PacketHeldItemChange` | `java/lang/Object` |
| `iy` | `C0APacketAnimation` | `java/lang/Object` |
| `is` | `C0BPacketEntityAction` | `java/lang/Object` |
| `is$a` | `C0BPacketEntityAction$Action` | `java/lang/Enum` |
| `it` | `C0CPacketInput` | `java/lang/Object` |
| `il` | `C0DPacketCloseWindow` | `java/lang/Object` |
| `ik` | `C0EPacketClickWindow` | `java/lang/Object` |
| `ii` | `C0FPacketConfirmTransaction` | `java/lang/Object` |
| `iw` | `C10PacketCreativeInventoryAction` | `java/lang/Object` |
| `ij` | `C11PacketEnchantItem` | `java/lang/Object` |
| `ix` | `C12PacketUpdateSign` | `java/lang/Object` |
| `iq` | `C13PacketPlayerAbilities` | `java/lang/Object` |
| `id` | `C14PacketTabComplete` | `java/lang/Object` |
| `ih` | `C15PacketClientSettings` | `java/lang/Object` |
| `ig` | `C16PacketClientStatus` | `java/lang/Object` |
| `ig$a` | `C16PacketClientStatus$EnumState` | `java/lang/Enum` |
| `im` | `C17PacketCustomPayload` | `java/lang/Object` |
| `iz` | `C18PacketSpectate` | `java/lang/Object` |
| `iu` | `C19PacketResourcePackStatus` | `java/lang/Object` |
| `iu$a` | `C19PacketResourcePackStatus$Action` | `java/lang/Enum` |

## `net/minecraft/client/stream` (30)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bqj` | `BroadcastController` | `java/lang/Object` |
| `bqj$1` | `BroadcastController$1` | `java/lang/Object` |
| `bqj$2` | `BroadcastController$2` | `java/lang/Object` |
| `bqj$3` | `BroadcastController$3` | `java/lang/Object` |
| `bqj$b` | `BroadcastController$BroadcastListener` | `java/lang/Object` |
| `bqj$a` | `BroadcastController$BroadcastState` | `java/lang/Enum` |
| `bqk` | `ChatController` | `java/lang/Object` |
| `bqk$1` | `ChatController$1` | `java/lang/Object` |
| `bqk$2` | `ChatController$2` | `java/lang/Object` |
| `bqk$b` | `ChatController$ChatChannelListener` | `java/lang/Object` |
| `bqk$e` | `ChatController$ChatListener` | `java/lang/Object` |
| `bqk$c` | `ChatController$ChatState` | `java/lang/Enum` |
| `bqk$a` | `ChatController$EnumChannelState` | `java/lang/Enum` |
| `bqk$d` | `ChatController$EnumEmoticonMode` | `java/lang/Enum` |
| `bqm` | `IStream` | `java/lang/Object` |
| `bqm$a` | `IStream$AuthFailureReason` | `java/lang/Enum` |
| `bql` | `IngestServerTester` | `java/lang/Object` |
| `bql$1` | `IngestServerTester$1` | `java/lang/Object` |
| `bql$2` | `IngestServerTester$2` | `java/lang/Object` |
| `bql$3` | `IngestServerTester$3` | `java/lang/Object` |
| `bql$a` | `IngestServerTester$IngestTestListener` | `java/lang/Object` |
| `bql$b` | `IngestServerTester$IngestTestState` | `java/lang/Enum` |
| `bqh` | `Metadata` | `java/lang/Object` |
| `bqe` | `MetadataAchievement` | `net/minecraft/client/stream/Metadata` |
| `bqf` | `MetadataCombat` | `net/minecraft/client/stream/Metadata` |
| `bqg` | `MetadataPlayerDeath` | `net/minecraft/client/stream/Metadata` |
| `bqo` | `NullStream` | `java/lang/Object` |
| `bqn` | `TwitchStream` | `java/lang/Object` |
| `bqn$1` | `TwitchStream$1` | `java/lang/Thread` |
| `bqn$1$1` | `TwitchStream$1$1` | `java/lang/Thread` |

## `net/minecraft/command/server` (30)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `p` | `CommandAchievement` | `net/minecraft/command/CommandBase` |
| `p$1` | `CommandAchievement$1` | `java/lang/Object` |
| `q` | `CommandBanIp` | `net/minecraft/command/CommandBase` |
| `r` | `CommandBanPlayer` | `net/minecraft/command/CommandBase` |
| `adc` | `CommandBlockLogic` | `java/lang/Object` |
| `adc$1` | `CommandBlockLogic$1` | `java/lang/Object` |
| `adc$2` | `CommandBlockLogic$2` | `java/lang/Object` |
| `bb` | `CommandBroadcast` | `net/minecraft/command/CommandBase` |
| `w` | `CommandDeOp` | `net/minecraft/command/CommandBase` |
| `aa` | `CommandEmote` | `net/minecraft/command/CommandBase` |
| `an` | `CommandListBans` | `net/minecraft/command/CommandBase` |
| `ao` | `CommandListPlayers` | `net/minecraft/command/CommandBase` |
| `ap` | `CommandMessage` | `net/minecraft/command/CommandBase` |
| `aq` | `CommandMessageRaw` | `net/minecraft/command/CommandBase` |
| `ar` | `CommandOp` | `net/minecraft/command/CommandBase` |
| `as` | `CommandPardonIp` | `net/minecraft/command/CommandBase` |
| `at` | `CommandPardonPlayer` | `net/minecraft/command/CommandBase` |
| `aw` | `CommandPublishLocalServer` | `net/minecraft/command/CommandBase` |
| `ay` | `CommandSaveAll` | `net/minecraft/command/CommandBase` |
| `az` | `CommandSaveOff` | `net/minecraft/command/CommandBase` |
| `ba` | `CommandSaveOn` | `net/minecraft/command/CommandBase` |
| `bc` | `CommandScoreboard` | `net/minecraft/command/CommandBase` |
| `be` | `CommandSetBlock` | `net/minecraft/command/CommandBase` |
| `bf` | `CommandSetDefaultSpawnpoint` | `net/minecraft/command/CommandBase` |
| `bl` | `CommandStop` | `net/minecraft/command/CommandBase` |
| `bm` | `CommandSummon` | `net/minecraft/command/CommandBase` |
| `bn` | `CommandTeleport` | `net/minecraft/command/CommandBase` |
| `bq` | `CommandTestFor` | `net/minecraft/command/CommandBase` |
| `bp` | `CommandTestForBlock` | `net/minecraft/command/CommandBase` |
| `bw` | `CommandWhitelist` | `net/minecraft/command/CommandBase` |

## `net/minecraft/enchantment` (27)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `aci` | `Enchantment` | `java/lang/Object` |
| `acb` | `EnchantmentArrowDamage` | `net/minecraft/enchantment/Enchantment` |
| `acc` | `EnchantmentArrowFire` | `net/minecraft/enchantment/Enchantment` |
| `acd` | `EnchantmentArrowInfinite` | `net/minecraft/enchantment/Enchantment` |
| `ace` | `EnchantmentArrowKnockback` | `net/minecraft/enchantment/Enchantment` |
| `acf` | `EnchantmentDamage` | `net/minecraft/enchantment/Enchantment` |
| `acl` | `EnchantmentData` | `net/minecraft/util/WeightedRandom$Item` |
| `ach` | `EnchantmentDigging` | `net/minecraft/enchantment/Enchantment` |
| `acg` | `EnchantmentDurability` | `net/minecraft/enchantment/Enchantment` |
| `acm` | `EnchantmentFireAspect` | `net/minecraft/enchantment/Enchantment` |
| `acn` | `EnchantmentFishingSpeed` | `net/minecraft/enchantment/Enchantment` |
| `ack` | `EnchantmentHelper` | `java/lang/Object` |
| `ack$1` | `EnchantmentHelper$1` | `java/lang/Object` |
| `ack$a` | `EnchantmentHelper$DamageIterator` | `java/lang/Object` |
| `ack$b` | `EnchantmentHelper$HurtIterator` | `java/lang/Object` |
| `ack$c` | `EnchantmentHelper$IModifier` | `java/lang/Object` |
| `ack$e` | `EnchantmentHelper$ModifierDamage` | `java/lang/Object` |
| `ack$d` | `EnchantmentHelper$ModifierLiving` | `java/lang/Object` |
| `aco` | `EnchantmentKnockback` | `net/minecraft/enchantment/Enchantment` |
| `acp` | `EnchantmentLootBonus` | `net/minecraft/enchantment/Enchantment` |
| `acq` | `EnchantmentOxygen` | `net/minecraft/enchantment/Enchantment` |
| `acr` | `EnchantmentProtection` | `net/minecraft/enchantment/Enchantment` |
| `acs` | `EnchantmentThorns` | `net/minecraft/enchantment/Enchantment` |
| `act` | `EnchantmentUntouching` | `net/minecraft/enchantment/Enchantment` |
| `acu` | `EnchantmentWaterWalker` | `net/minecraft/enchantment/Enchantment` |
| `acv` | `EnchantmentWaterWorker` | `net/minecraft/enchantment/Enchantment` |
| `acj` | `EnumEnchantmentType` | `java/lang/Enum` |

## `net/minecraft/server/management` (27)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `ls` | `BanEntry` | `net/minecraft/server/management/UserListEntry` |
| `lu` | `BanList` | `net/minecraft/server/management/UserList` |
| `lv` | `IPBanEntry` | `net/minecraft/server/management/BanEntry` |
| `lg` | `ItemInWorldManager` | `java/lang/Object` |
| `nk` | `LowerStringMap` | `java/lang/Object` |
| `lc` | `PlayerManager` | `java/lang/Object` |
| `lc$a` | `PlayerManager$PlayerInstance` | `java/lang/Object` |
| `lt` | `PlayerProfileCache` | `java/lang/Object` |
| `lt$1` | `PlayerProfileCache$1` | `java/lang/Object` |
| `lt$2` | `PlayerProfileCache$2` | `java/lang/Object` |
| `lt$a` | `PlayerProfileCache$ProfileEntry` | `java/lang/Object` |
| `lt$b` | `PlayerProfileCache$Serializer` | `java/lang/Object` |
| `lw` | `PreYggdrasilConverter` | `java/lang/Object` |
| `lw$1` | `PreYggdrasilConverter$1` | `java/lang/Object` |
| `lw$5` | `PreYggdrasilConverter$5` | `java/lang/Object` |
| `lx` | `ServerConfigurationManager` | `java/lang/Object` |
| `lx$1` | `ServerConfigurationManager$1` | `java/lang/Object` |
| `mb` | `UserList` | `java/lang/Object` |
| `mb$1` | `UserList$1` | `java/lang/Object` |
| `mb$a` | `UserList$Serializer` | `java/lang/Object` |
| `mc` | `UserListBans` | `net/minecraft/server/management/UserList` |
| `md` | `UserListBansEntry` | `net/minecraft/server/management/BanEntry` |
| `ma` | `UserListEntry` | `java/lang/Object` |
| `ly` | `UserListOps` | `net/minecraft/server/management/UserList` |
| `lz` | `UserListOpsEntry` | `net/minecraft/server/management/UserListEntry` |
| `me` | `UserListWhitelist` | `net/minecraft/server/management/UserList` |
| `mf` | `UserListWhitelistEntry` | `net/minecraft/server/management/UserListEntry` |

## `net/minecraft/nbt` (26)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `dx` | `CompressedStreamTools` | `java/lang/Object` |
| `ed` | `JsonToNBT` | `java/lang/Object` |
| `ed$a` | `JsonToNBT$Any` | `java/lang/Object` |
| `ed$b` | `JsonToNBT$Compound` | `net/minecraft/nbt/JsonToNBT$Any` |
| `ed$c` | `JsonToNBT$List` | `net/minecraft/nbt/JsonToNBT$Any` |
| `ed$d` | `JsonToNBT$Primitive` | `net/minecraft/nbt/JsonToNBT$Any` |
| `eb` | `NBTBase` | `java/lang/Object` |
| `eb$a` | `NBTBase$NBTPrimitive` | `net/minecraft/nbt/NBTBase` |
| `ec` | `NBTException` | `java/lang/Exception` |
| `dw` | `NBTSizeTracker` | `java/lang/Object` |
| `dw$1` | `NBTSizeTracker$1` | `net/minecraft/nbt/NBTSizeTracker` |
| `dm` | `NBTTagByte` | `net/minecraft/nbt/NBTBase$NBTPrimitive` |
| `dl` | `NBTTagByteArray` | `net/minecraft/nbt/NBTBase` |
| `dn` | `NBTTagCompound` | `net/minecraft/nbt/NBTBase` |
| `dn$1` | `NBTTagCompound$1` | `java/lang/Object` |
| `dn$2` | `NBTTagCompound$2` | `java/lang/Object` |
| `dp` | `NBTTagDouble` | `net/minecraft/nbt/NBTBase$NBTPrimitive` |
| `dq` | `NBTTagEnd` | `net/minecraft/nbt/NBTBase` |
| `dr` | `NBTTagFloat` | `net/minecraft/nbt/NBTBase$NBTPrimitive` |
| `dt` | `NBTTagInt` | `net/minecraft/nbt/NBTBase$NBTPrimitive` |
| `ds` | `NBTTagIntArray` | `net/minecraft/nbt/NBTBase` |
| `du` | `NBTTagList` | `net/minecraft/nbt/NBTBase` |
| `dv` | `NBTTagLong` | `net/minecraft/nbt/NBTBase$NBTPrimitive` |
| `dz` | `NBTTagShort` | `net/minecraft/nbt/NBTBase$NBTPrimitive` |
| `ea` | `NBTTagString` | `net/minecraft/nbt/NBTBase` |
| `dy` | `NBTUtil` | `java/lang/Object` |

## `net/minecraft/client/renderer/entity/layers` (25)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bkn` | `LayerArmorBase` | `java/lang/Object` |
| `bkn$1` | `LayerArmorBase$1` | `java/lang/Object` |
| `bko` | `LayerArrow` | `java/lang/Object` |
| `bkx` | `LayerBipedArmor` | `net/minecraft/client/renderer/entity/layers/LayerArmorBase` |
| `bkp` | `LayerCape` | `java/lang/Object` |
| `bkr` | `LayerCreeperCharge` | `java/lang/Object` |
| `bks` | `LayerCustomHead` | `java/lang/Object` |
| `bkt` | `LayerDeadmau5Head` | `java/lang/Object` |
| `bku` | `LayerEnderDragonDeath` | `java/lang/Object` |
| `bkv` | `LayerEnderDragonEyes` | `java/lang/Object` |
| `bkw` | `LayerEndermanEyes` | `java/lang/Object` |
| `bkq` | `LayerHeldBlock` | `java/lang/Object` |
| `bky` | `LayerHeldItem` | `java/lang/Object` |
| `bli` | `LayerHeldItemWitch` | `java/lang/Object` |
| `blh` | `LayerIronGolemFlower` | `java/lang/Object` |
| `bkz` | `LayerMooshroomMushroom` | `java/lang/Object` |
| `blb` | `LayerRenderer` | `java/lang/Object` |
| `bla` | `LayerSaddle` | `java/lang/Object` |
| `blc` | `LayerSheepWool` | `java/lang/Object` |
| `bld` | `LayerSlimeGel` | `java/lang/Object` |
| `ble` | `LayerSnowmanHead` | `java/lang/Object` |
| `blf` | `LayerSpiderEyes` | `java/lang/Object` |
| `blg` | `LayerVillagerArmor` | `net/minecraft/client/renderer/entity/layers/LayerBipedArmor` |
| `blj` | `LayerWitherAura` | `java/lang/Object` |
| `blk` | `LayerWolfCollar` | `java/lang/Object` |

## `net/minecraft/realms` (25)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `net/minecraft/realms/DisconnectedRealmsScreen` | `DisconnectedRealmsScreen` | `net/minecraft/realms/RealmsScreen` |
| `net/minecraft/realms/Realms` | `Realms` | `java/lang/Object` |
| `net/minecraft/realms/RealmsAnvilLevelStorageSource` | `RealmsAnvilLevelStorageSource` | `java/lang/Object` |
| `net/minecraft/realms/RealmsBridge` | `RealmsBridge` | `net/minecraft/realms/RealmsScreen` |
| `net/minecraft/realms/RealmsBufferBuilder` | `RealmsBufferBuilder` | `java/lang/Object` |
| `net/minecraft/realms/RealmsButton` | `RealmsButton` | `java/lang/Object` |
| `net/minecraft/realms/RealmsClickableScrolledSelectionList` | `RealmsClickableScrolledSelectionList` | `java/lang/Object` |
| `net/minecraft/realms/RealmsConnect` | `RealmsConnect` | `java/lang/Object` |
| `net/minecraft/realms/RealmsConnect$1` | `RealmsConnect$1` | `java/lang/Thread` |
| `net/minecraft/realms/RealmsDefaultVertexFormat` | `RealmsDefaultVertexFormat` | `java/lang/Object` |
| `net/minecraft/realms/RealmsEditBox` | `RealmsEditBox` | `java/lang/Object` |
| `net/minecraft/realms/RealmsLevelSummary` | `RealmsLevelSummary` | `java/lang/Object` |
| `net/minecraft/realms/RealmsMth` | `RealmsMth` | `java/lang/Object` |
| `net/minecraft/realms/RealmsScreen` | `RealmsScreen` | `java/lang/Object` |
| `net/minecraft/realms/RealmsScrolledSelectionList` | `RealmsScrolledSelectionList` | `java/lang/Object` |
| `net/minecraft/realms/RealmsServerAddress` | `RealmsServerAddress` | `java/lang/Object` |
| `net/minecraft/realms/RealmsServerPing` | `RealmsServerPing` | `java/lang/Object` |
| `net/minecraft/realms/RealmsServerStatusPinger` | `RealmsServerStatusPinger` | `java/lang/Object` |
| `net/minecraft/realms/RealmsServerStatusPinger$1` | `RealmsServerStatusPinger$1` | `java/lang/Object` |
| `net/minecraft/realms/RealmsSharedConstants` | `RealmsSharedConstants` | `java/lang/Object` |
| `net/minecraft/realms/RealmsSimpleScrolledSelectionList` | `RealmsSimpleScrolledSelectionList` | `java/lang/Object` |
| `net/minecraft/realms/RealmsSliderButton` | `RealmsSliderButton` | `net/minecraft/realms/RealmsButton` |
| `net/minecraft/realms/RealmsVertexFormat` | `RealmsVertexFormat` | `java/lang/Object` |
| `net/minecraft/realms/RealmsVertexFormatElement` | `RealmsVertexFormatElement` | `java/lang/Object` |
| `net/minecraft/realms/Tezzelator` | `Tezzelator` | `java/lang/Object` |

## `net/minecraft/world/gen/layer` (25)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `ase` | `GenLayer` | `java/lang/Object` |
| `ase$1` | `GenLayer$1` | `java/lang/Object` |
| `ase$2` | `GenLayer$2` | `java/lang/Object` |
| `ars` | `GenLayerAddIsland` | `net/minecraft/world/gen/layer/GenLayer` |
| `art` | `GenLayerAddMushroomIsland` | `net/minecraft/world/gen/layer/GenLayer` |
| `aru` | `GenLayerAddSnow` | `net/minecraft/world/gen/layer/GenLayer` |
| `arw` | `GenLayerBiome` | `net/minecraft/world/gen/layer/GenLayer` |
| `arv` | `GenLayerBiomeEdge` | `net/minecraft/world/gen/layer/GenLayer` |
| `arq` | `GenLayerDeepOcean` | `net/minecraft/world/gen/layer/GenLayer` |
| `arr` | `GenLayerEdge` | `net/minecraft/world/gen/layer/GenLayer` |
| `arr$1` | `GenLayerEdge$1` | `java/lang/Object` |
| `arr$a` | `GenLayerEdge$Mode` | `java/lang/Enum` |
| `asa` | `GenLayerFuzzyZoom` | `net/minecraft/world/gen/layer/GenLayerZoom` |
| `asg` | `GenLayerHills` | `net/minecraft/world/gen/layer/GenLayer` |
| `asd` | `GenLayerIsland` | `net/minecraft/world/gen/layer/GenLayer` |
| `asf` | `GenLayerRareBiome` | `net/minecraft/world/gen/layer/GenLayer` |
| `ash` | `GenLayerRemoveTooMuchOcean` | `net/minecraft/world/gen/layer/GenLayer` |
| `asj` | `GenLayerRiver` | `net/minecraft/world/gen/layer/GenLayer` |
| `asi` | `GenLayerRiverInit` | `net/minecraft/world/gen/layer/GenLayer` |
| `ask` | `GenLayerRiverMix` | `net/minecraft/world/gen/layer/GenLayer` |
| `asl` | `GenLayerShore` | `net/minecraft/world/gen/layer/GenLayer` |
| `asm` | `GenLayerSmooth` | `net/minecraft/world/gen/layer/GenLayer` |
| `asq` | `GenLayerVoronoiZoom` | `net/minecraft/world/gen/layer/GenLayer` |
| `asr` | `GenLayerZoom` | `net/minecraft/world/gen/layer/GenLayer` |
| `asc` | `IntCache` | `java/lang/Object` |

## `net/minecraft/world/storage` (24)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `atl` | `DerivedWorldInfo` | `net/minecraft/world/storage/WorldInfo` |
| `aty` | `IPlayerFileData` | `java/lang/Object` |
| `atr` | `ISaveFormat` | `java/lang/Object` |
| `atp` | `ISaveHandler` | `java/lang/Object` |
| `aud` | `IThreadedFileIO` | `java/lang/Object` |
| `atg` | `MapData` | `net/minecraft/world/WorldSavedData` |
| `atg$a` | `MapData$MapInfo` | `java/lang/Object` |
| `aua` | `MapStorage` | `java/lang/Object` |
| `atz` | `SaveDataMemoryStorage` | `net/minecraft/world/storage/MapStorage` |
| `ats` | `SaveFormatComparator` | `java/lang/Object` |
| `atn` | `SaveFormatOld` | `java/lang/Object` |
| `atm` | `SaveHandler` | `java/lang/Object` |
| `atx` | `SaveHandlerMP` | `java/lang/Object` |
| `auc` | `ThreadedFileIOBase` | `java/lang/Object` |
| `ato` | `WorldInfo` | `java/lang/Object` |
| `ato$1` | `WorldInfo$1` | `java/lang/Object` |
| `ato$2` | `WorldInfo$2` | `java/lang/Object` |
| `ato$3` | `WorldInfo$3` | `java/lang/Object` |
| `ato$4` | `WorldInfo$4` | `java/lang/Object` |
| `ato$5` | `WorldInfo$5` | `java/lang/Object` |
| `ato$6` | `WorldInfo$6` | `java/lang/Object` |
| `ato$7` | `WorldInfo$7` | `java/lang/Object` |
| `ato$8` | `WorldInfo$8` | `java/lang/Object` |
| `ato$9` | `WorldInfo$9` | `java/lang/Object` |

## `net/minecraft/client/renderer/texture` (23)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bly` | `AbstractTexture` | `java/lang/Object` |
| `blz` | `DynamicTexture` | `net/minecraft/client/renderer/texture/AbstractTexture` |
| `bmb` | `IIconCreator` | `java/lang/Object` |
| `bmk` | `ITextureObject` | `java/lang/Object` |
| `bmm` | `ITickable` | `java/lang/Object` |
| `bmn` | `ITickableTextureObject` | `java/lang/Object` |
| `bmc` | `LayeredColorMaskTexture` | `net/minecraft/client/renderer/texture/AbstractTexture` |
| `bmd` | `LayeredTexture` | `net/minecraft/client/renderer/texture/AbstractTexture` |
| `bme` | `SimpleTexture` | `net/minecraft/client/renderer/texture/AbstractTexture` |
| `bmf` | `Stitcher` | `java/lang/Object` |
| `bmf$a` | `Stitcher$Holder` | `java/lang/Object` |
| `bmf$b` | `Stitcher$Slot` | `java/lang/Object` |
| `bmi` | `TextureAtlasSprite` | `java/lang/Object` |
| `bmi$1` | `TextureAtlasSprite$1` | `java/lang/Object` |
| `bmo` | `TextureClock` | `net/minecraft/client/renderer/texture/TextureAtlasSprite` |
| `bmp` | `TextureCompass` | `net/minecraft/client/renderer/texture/TextureAtlasSprite` |
| `bmj` | `TextureManager` | `java/lang/Object` |
| `bmj$1` | `TextureManager$1` | `java/lang/Object` |
| `bmh` | `TextureMap` | `net/minecraft/client/renderer/texture/AbstractTexture` |
| `bmh$1` | `TextureMap$1` | `java/lang/Object` |
| `bmh$2` | `TextureMap$2` | `java/lang/Object` |
| `bmh$3` | `TextureMap$3` | `java/lang/Object` |
| `bml` | `TextureUtil` | `java/lang/Object` |

## `net/minecraft/entity/item` (23)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `um` | `EntityArmorStand` | `net/minecraft/entity/EntityLivingBase` |
| `ux` | `EntityBoat` | `net/minecraft/entity/Entity` |
| `uf` | `EntityEnderCrystal` | `net/minecraft/entity/Entity` |
| `wr` | `EntityEnderEye` | `net/minecraft/entity/Entity` |
| `xa` | `EntityEnderPearl` | `net/minecraft/entity/projectile/EntityThrowable` |
| `xb` | `EntityExpBottle` | `net/minecraft/entity/projectile/EntityThrowable` |
| `uy` | `EntityFallingBlock` | `net/minecraft/entity/Entity` |
| `wt` | `EntityFireworkRocket` | `net/minecraft/entity/Entity` |
| `uz` | `EntityItem` | `net/minecraft/entity/Entity` |
| `uo` | `EntityItemFrame` | `net/minecraft/entity/EntityHanging` |
| `va` | `EntityMinecart` | `net/minecraft/entity/Entity` |
| `va$1` | `EntityMinecart$1` | `java/lang/Object` |
| `va$a` | `EntityMinecart$EnumMinecartType` | `java/lang/Enum` |
| `vb` | `EntityMinecartChest` | `net/minecraft/entity/item/EntityMinecartContainer` |
| `vd` | `EntityMinecartContainer` | `net/minecraft/entity/item/EntityMinecart` |
| `vg` | `EntityMinecartEmpty` | `net/minecraft/entity/item/EntityMinecart` |
| `ve` | `EntityMinecartFurnace` | `net/minecraft/entity/item/EntityMinecart` |
| `vf` | `EntityMinecartHopper` | `net/minecraft/entity/item/EntityMinecartContainer` |
| `vi` | `EntityMinecartTNT` | `net/minecraft/entity/item/EntityMinecart` |
| `uq` | `EntityPainting` | `net/minecraft/entity/EntityHanging` |
| `uq$a` | `EntityPainting$EnumArt` | `java/lang/Enum` |
| `vj` | `EntityTNTPrimed` | `net/minecraft/entity/Entity` |
| `pp` | `EntityXPOrb` | `net/minecraft/entity/Entity` |

## `net/minecraft/item/crafting` (23)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `abt` | `CraftingManager` | `java/lang/Object` |
| `abt$1` | `CraftingManager$1` | `java/lang/Object` |
| `abo` | `FurnaceRecipes` | `java/lang/Object` |
| `abs` | `IRecipe` | `java/lang/Object` |
| `abk` | `RecipeBookCloning` | `java/lang/Object` |
| `abm` | `RecipeFireworks` | `java/lang/Object` |
| `abu` | `RecipeRepairItem` | `java/lang/Object` |
| `abi` | `RecipesArmor` | `java/lang/Object` |
| `abh` | `RecipesArmorDyes` | `java/lang/Object` |
| `abj` | `RecipesBanners` | `java/lang/Object` |
| `abj$1` | `RecipesBanners$1` | `java/lang/Object` |
| `abj$a` | `RecipesBanners$RecipeAddPattern` | `java/lang/Object` |
| `abj$b` | `RecipesBanners$RecipeDuplicatePattern` | `java/lang/Object` |
| `abx` | `RecipesCrafting` | `java/lang/Object` |
| `abl` | `RecipesDyes` | `java/lang/Object` |
| `abn` | `RecipesFood` | `java/lang/Object` |
| `abr` | `RecipesIngots` | `java/lang/Object` |
| `abp` | `RecipesMapCloning` | `java/lang/Object` |
| `abq` | `RecipesMapExtending` | `net/minecraft/item/crafting/ShapedRecipes` |
| `aby` | `RecipesTools` | `java/lang/Object` |
| `abz` | `RecipesWeapons` | `java/lang/Object` |
| `abv` | `ShapedRecipes` | `java/lang/Object` |
| `abw` | `ShapelessRecipes` | `java/lang/Object` |

## `net/minecraft/client` (22)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `atq` | `AnvilConverterException` | `java/lang/Exception` |
| `net/minecraft/client/ClientBrandRetriever` | `ClientBrandRetriever` | `java/lang/Object` |
| `avi` | `LoadingScreenRenderer` | `java/lang/Object` |
| `ave` | `Minecraft` | `java/lang/Object` |
| `ave$1` | `Minecraft$1` | `java/lang/Object` |
| `ave$10` | `Minecraft$10` | `java/lang/Object` |
| `ave$11` | `Minecraft$11` | `java/lang/Thread` |
| `ave$12` | `Minecraft$12` | `java/lang/Object` |
| `ave$13` | `Minecraft$13` | `java/lang/Object` |
| `ave$14` | `Minecraft$14` | `java/lang/Object` |
| `ave$15` | `Minecraft$15` | `java/lang/Object` |
| `ave$16` | `Minecraft$16` | `java/lang/Object` |
| `ave$17` | `Minecraft$17` | `java/lang/Object` |
| `ave$18` | `Minecraft$18` | `java/lang/Object` |
| `ave$2` | `Minecraft$2` | `java/lang/Object` |
| `ave$3` | `Minecraft$3` | `java/lang/Object` |
| `ave$4` | `Minecraft$4` | `java/lang/Object` |
| `ave$5` | `Minecraft$5` | `java/lang/Object` |
| `ave$6` | `Minecraft$6` | `java/lang/Object` |
| `ave$7` | `Minecraft$7` | `java/lang/Object` |
| `ave$8` | `Minecraft$8` | `java/lang/Object` |
| `ave$9` | `Minecraft$9` | `java/lang/Object` |

## `net/minecraft/world/gen` (22)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `anu` | `ChunkProviderDebug` | `java/lang/Object` |
| `aob` | `ChunkProviderEnd` | `java/lang/Object` |
| `anv` | `ChunkProviderFlat` | `java/lang/Object` |
| `aoa` | `ChunkProviderGenerate` | `java/lang/Object` |
| `anw` | `ChunkProviderHell` | `java/lang/Object` |
| `ld` | `ChunkProviderServer` | `java/lang/Object` |
| `ant` | `ChunkProviderSettings` | `java/lang/Object` |
| `ant$1` | `ChunkProviderSettings$1` | `java/lang/Object` |
| `ant$a` | `ChunkProviderSettings$Factory` | `java/lang/Object` |
| `ant$b` | `ChunkProviderSettings$Serializer` | `java/lang/Object` |
| `apz` | `FlatGeneratorInfo` | `java/lang/Object` |
| `aqa` | `FlatLayerInfo` | `java/lang/Object` |
| `aom` | `GeneratorBushFeature` | `net/minecraft/world/gen/feature/WorldGenerator` |
| `any` | `MapGenBase` | `java/lang/Object` |
| `anx` | `MapGenCaves` | `net/minecraft/world/gen/MapGenBase` |
| `anz` | `MapGenCavesHell` | `net/minecraft/world/gen/MapGenBase` |
| `anr` | `MapGenRavine` | `net/minecraft/world/gen/MapGenBase` |
| `arh` | `NoiseGenerator` | `java/lang/Object` |
| `arb` | `NoiseGeneratorImproved` | `net/minecraft/world/gen/NoiseGenerator` |
| `arc` | `NoiseGeneratorOctaves` | `net/minecraft/world/gen/NoiseGenerator` |
| `ard` | `NoiseGeneratorPerlin` | `net/minecraft/world/gen/NoiseGenerator` |
| `arg` | `NoiseGeneratorSimplex` | `java/lang/Object` |

## `net/minecraft/client/network` (21)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bpq` | `LanServerDetector` | `java/lang/Object` |
| `bpq$a` | `LanServerDetector$LanServer` | `java/lang/Object` |
| `bpq$c` | `LanServerDetector$LanServerList` | `java/lang/Object` |
| `bpq$b` | `LanServerDetector$ThreadLanServerFind` | `java/lang/Thread` |
| `lk` | `NetHandlerHandshakeMemory` | `java/lang/Object` |
| `bcx` | `NetHandlerLoginClient` | `java/lang/Object` |
| `bcx$1` | `NetHandlerLoginClient$1` | `java/lang/Object` |
| `bcy` | `NetHandlerPlayClient` | `java/lang/Object` |
| `bcy$1` | `NetHandlerPlayClient$1` | `java/lang/Object` |
| `bcy$2` | `NetHandlerPlayClient$2` | `java/lang/Object` |
| `bcy$3` | `NetHandlerPlayClient$3` | `java/lang/Object` |
| `bcy$3$1` | `NetHandlerPlayClient$3$1` | `java/lang/Object` |
| `bcy$3$1$1` | `NetHandlerPlayClient$3$1$1` | `java/lang/Object` |
| `bcy$4` | `NetHandlerPlayClient$4` | `java/lang/Object` |
| `bdc` | `NetworkPlayerInfo` | `java/lang/Object` |
| `bdc$1` | `NetworkPlayerInfo$1` | `java/lang/Object` |
| `bdc$2` | `NetworkPlayerInfo$2` | `java/lang/Object` |
| `bdg` | `OldServerPinger` | `java/lang/Object` |
| `bdg$1` | `OldServerPinger$1` | `java/lang/Object` |
| `bdg$2` | `OldServerPinger$2` | `io/netty/channel/ChannelInitializer` |
| `bdg$2$1` | `OldServerPinger$2$1` | `io/netty/channel/SimpleChannelInboundHandler` |

## `net/minecraft/client/renderer/chunk` (20)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bhn` | `ChunkCompileTaskGenerator` | `java/lang/Object` |
| `bhn$a` | `ChunkCompileTaskGenerator$Status` | `java/lang/Enum` |
| `bhn$b` | `ChunkCompileTaskGenerator$Type` | `java/lang/Enum` |
| `bho` | `ChunkRenderDispatcher` | `java/lang/Object` |
| `bho$1` | `ChunkRenderDispatcher$1` | `java/lang/Object` |
| `bho$2` | `ChunkRenderDispatcher$2` | `java/lang/Object` |
| `bho$3` | `ChunkRenderDispatcher$3` | `java/lang/Object` |
| `bhp` | `ChunkRenderWorker` | `java/lang/Object` |
| `bhp$1` | `ChunkRenderWorker$1` | `java/lang/Object` |
| `bhp$2` | `ChunkRenderWorker$2` | `java/lang/Object` |
| `bhq` | `CompiledChunk` | `java/lang/Object` |
| `bhq$1` | `CompiledChunk$1` | `net/minecraft/client/renderer/chunk/CompiledChunk` |
| `bhu` | `IRenderChunkFactory` | `java/lang/Object` |
| `bhr` | `ListChunkFactory` | `java/lang/Object` |
| `bhs` | `ListedRenderChunk` | `net/minecraft/client/renderer/chunk/RenderChunk` |
| `bht` | `RenderChunk` | `java/lang/Object` |
| `bhx` | `SetVisibility` | `java/lang/Object` |
| `bhv` | `VboChunkFactory` | `java/lang/Object` |
| `bhw` | `VisGraph` | `java/lang/Object` |
| `bhw$1` | `VisGraph$1` | `java/lang/Object` |

## `net/minecraft/init` (20)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `afi` | `Blocks` | `java/lang/Object` |
| `kb` | `Bootstrap` | `java/lang/Object` |
| `kb$1` | `Bootstrap$1` | `net/minecraft/dispenser/BehaviorProjectileDispense` |
| `kb$10` | `Bootstrap$10` | `net/minecraft/dispenser/BehaviorProjectileDispense` |
| `kb$11` | `Bootstrap$11` | `net/minecraft/dispenser/BehaviorProjectileDispense` |
| `kb$12` | `Bootstrap$12` | `java/lang/Object` |
| `kb$12$1` | `Bootstrap$12$1` | `net/minecraft/dispenser/BehaviorProjectileDispense` |
| `kb$13` | `Bootstrap$13` | `net/minecraft/dispenser/BehaviorDefaultDispenseItem` |
| `kb$14` | `Bootstrap$14` | `net/minecraft/dispenser/BehaviorDefaultDispenseItem` |
| `kb$15` | `Bootstrap$15` | `net/minecraft/dispenser/BehaviorDefaultDispenseItem` |
| `kb$16` | `Bootstrap$16` | `net/minecraft/dispenser/BehaviorDefaultDispenseItem` |
| `kb$2` | `Bootstrap$2` | `net/minecraft/dispenser/BehaviorDefaultDispenseItem` |
| `kb$3` | `Bootstrap$3` | `net/minecraft/dispenser/BehaviorDefaultDispenseItem` |
| `kb$4` | `Bootstrap$4` | `net/minecraft/dispenser/BehaviorDefaultDispenseItem` |
| `kb$5` | `Bootstrap$5` | `net/minecraft/dispenser/BehaviorDefaultDispenseItem` |
| `kb$6` | `Bootstrap$6` | `net/minecraft/dispenser/BehaviorDefaultDispenseItem` |
| `kb$7` | `Bootstrap$7` | `net/minecraft/dispenser/BehaviorDefaultDispenseItem` |
| `kb$8` | `Bootstrap$8` | `net/minecraft/dispenser/BehaviorDefaultDispenseItem` |
| `kb$9` | `Bootstrap$9` | `net/minecraft/dispenser/BehaviorProjectileDispense` |
| `zy` | `Items` | `java/lang/Object` |

## `net/minecraft/client/renderer/tileentity` (19)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `biq` | `RenderEnderCrystal` | `net/minecraft/client/renderer/entity/Render` |
| `bjg` | `RenderItemFrame` | `net/minecraft/client/renderer/entity/Render` |
| `bkk` | `RenderWitherSkull` | `net/minecraft/client/renderer/entity/Render` |
| `bha` | `TileEntityBannerRenderer` | `net/minecraft/client/renderer/tileentity/TileEntitySpecialRenderer` |
| `bha$1` | `TileEntityBannerRenderer$1` | `java/lang/Object` |
| `bha$a` | `TileEntityBannerRenderer$TimedBannerTexture` | `java/lang/Object` |
| `bhb` | `TileEntityBeaconRenderer` | `net/minecraft/client/renderer/tileentity/TileEntitySpecialRenderer` |
| `bhe` | `TileEntityChestRenderer` | `net/minecraft/client/renderer/tileentity/TileEntitySpecialRenderer` |
| `bhf` | `TileEntityEnchantmentTableRenderer` | `net/minecraft/client/renderer/tileentity/TileEntitySpecialRenderer` |
| `bhl` | `TileEntityEndPortalRenderer` | `net/minecraft/client/renderer/tileentity/TileEntitySpecialRenderer` |
| `bhg` | `TileEntityEnderChestRenderer` | `net/minecraft/client/renderer/tileentity/TileEntitySpecialRenderer` |
| `bfi` | `TileEntityItemStackRenderer` | `java/lang/Object` |
| `bhh` | `TileEntityMobSpawnerRenderer` | `net/minecraft/client/renderer/tileentity/TileEntitySpecialRenderer` |
| `bhi` | `TileEntityPistonRenderer` | `net/minecraft/client/renderer/tileentity/TileEntitySpecialRenderer` |
| `bhc` | `TileEntityRendererDispatcher` | `java/lang/Object` |
| `bhj` | `TileEntitySignRenderer` | `net/minecraft/client/renderer/tileentity/TileEntitySpecialRenderer` |
| `bhk` | `TileEntitySkullRenderer` | `net/minecraft/client/renderer/tileentity/TileEntitySpecialRenderer` |
| `bhk$1` | `TileEntitySkullRenderer$1` | `java/lang/Object` |
| `bhd` | `TileEntitySpecialRenderer` | `java/lang/Object` |

## `net/minecraft/client/gui/inventory` (18)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `ayt` | `CreativeCrafting` | `java/lang/Object` |
| `ayn` | `GuiBeacon` | `net/minecraft/client/gui/inventory/GuiContainer` |
| `ayn$d` | `GuiBeacon$Button` | `net/minecraft/client/gui/GuiButton` |
| `ayn$a` | `GuiBeacon$CancelButton` | `net/minecraft/client/gui/inventory/GuiBeacon$Button` |
| `ayn$b` | `GuiBeacon$ConfirmButton` | `net/minecraft/client/gui/inventory/GuiBeacon$Button` |
| `ayn$c` | `GuiBeacon$PowerButton` | `net/minecraft/client/gui/inventory/GuiBeacon$Button` |
| `ayp` | `GuiBrewingStand` | `net/minecraft/client/gui/inventory/GuiContainer` |
| `ayr` | `GuiChest` | `net/minecraft/client/gui/inventory/GuiContainer` |
| `ayl` | `GuiContainer` | `net/minecraft/client/gui/GuiScreen` |
| `ayu` | `GuiContainerCreative` | `net/minecraft/client/renderer/InventoryEffectRenderer` |
| `ayu$a` | `GuiContainerCreative$ContainerCreative` | `net/minecraft/inventory/Container` |
| `ayu$b` | `GuiContainerCreative$CreativeSlot` | `net/minecraft/inventory/Slot` |
| `ays` | `GuiCrafting` | `net/minecraft/client/gui/inventory/GuiContainer` |
| `ayv` | `GuiDispenser` | `net/minecraft/client/gui/inventory/GuiContainer` |
| `aze` | `GuiEditSign` | `net/minecraft/client/gui/GuiScreen` |
| `ayz` | `GuiFurnace` | `net/minecraft/client/gui/inventory/GuiContainer` |
| `azc` | `GuiInventory` | `net/minecraft/client/renderer/InventoryEffectRenderer` |
| `azb` | `GuiScreenHorseInventory` | `net/minecraft/client/gui/inventory/GuiContainer` |

## `net/minecraft/client/resources/data` (17)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bnz` | `AnimationFrame` | `java/lang/Object` |
| `boa` | `AnimationMetadataSection` | `java/lang/Object` |
| `bob` | `AnimationMetadataSectionSerializer` | `net/minecraft/client/resources/data/BaseMetadataSectionSerializer` |
| `bnv` | `BaseMetadataSectionSerializer` | `java/lang/Object` |
| `bod` | `FontMetadataSection` | `java/lang/Object` |
| `boe` | `FontMetadataSectionSerializer` | `net/minecraft/client/resources/data/BaseMetadataSectionSerializer` |
| `bnw` | `IMetadataSection` | `java/lang/Object` |
| `bnx` | `IMetadataSectionSerializer` | `java/lang/Object` |
| `bny` | `IMetadataSerializer` | `java/lang/Object` |
| `bny$1` | `IMetadataSerializer$1` | `java/lang/Object` |
| `bny$a` | `IMetadataSerializer$Registration` | `java/lang/Object` |
| `bog` | `LanguageMetadataSection` | `java/lang/Object` |
| `boh` | `LanguageMetadataSectionSerializer` | `net/minecraft/client/resources/data/BaseMetadataSectionSerializer` |
| `boj` | `PackMetadataSection` | `java/lang/Object` |
| `bok` | `PackMetadataSectionSerializer` | `net/minecraft/client/resources/data/BaseMetadataSectionSerializer` |
| `bon` | `TextureMetadataSection` | `java/lang/Object` |
| `boo` | `TextureMetadataSectionSerializer` | `net/minecraft/client/resources/data/BaseMetadataSectionSerializer` |

## `net/minecraft/crash` (15)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `b` | `CrashReport` | `java/lang/Object` |
| `b$1` | `CrashReport$1` | `java/lang/Object` |
| `b$2` | `CrashReport$2` | `java/lang/Object` |
| `b$3` | `CrashReport$3` | `java/lang/Object` |
| `b$4` | `CrashReport$4` | `java/lang/Object` |
| `b$5` | `CrashReport$5` | `java/lang/Object` |
| `b$6` | `CrashReport$6` | `java/lang/Object` |
| `b$7` | `CrashReport$7` | `java/lang/Object` |
| `c` | `CrashReportCategory` | `java/lang/Object` |
| `c$1` | `CrashReportCategory$1` | `java/lang/Object` |
| `c$2` | `CrashReportCategory$2` | `java/lang/Object` |
| `c$3` | `CrashReportCategory$3` | `java/lang/Object` |
| `c$6` | `CrashReportCategory$6` | `java/lang/Object` |
| `c$7` | `CrashReportCategory$7` | `java/lang/Object` |
| `c$a` | `CrashReportCategory$Entry` | `java/lang/Object` |

## `net/minecraft/stats` (15)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `mq` | `Achievement` | `net/minecraft/stats/StatBase` |
| `mr` | `AchievementList` | `java/lang/Object` |
| `ms` | `IStatStringFormat` | `java/lang/Object` |
| `mx` | `IStatType` | `java/lang/Object` |
| `auv` | `ObjectiveStat` | `net/minecraft/scoreboard/ScoreDummyCriteria` |
| `mw` | `StatBase` | `java/lang/Object` |
| `mw$1` | `StatBase$1` | `java/lang/Object` |
| `mw$2` | `StatBase$2` | `java/lang/Object` |
| `mw$3` | `StatBase$3` | `java/lang/Object` |
| `mw$4` | `StatBase$4` | `java/lang/Object` |
| `mt` | `StatBasic` | `net/minecraft/stats/StatBase` |
| `mu` | `StatCrafting` | `net/minecraft/stats/StatBase` |
| `nb` | `StatFileWriter` | `java/lang/Object` |
| `na` | `StatList` | `java/lang/Object` |
| `mv` | `StatisticsFile` | `net/minecraft/stats/StatFileWriter` |

## `net/minecraft/client/multiplayer` (14)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bcz` | `ChunkProviderClient` | `java/lang/Object` |
| `awz` | `GuiConnecting` | `net/minecraft/client/gui/GuiScreen` |
| `awz$1` | `GuiConnecting$1` | `java/lang/Thread` |
| `bda` | `PlayerControllerMP` | `java/lang/Object` |
| `bdd` | `ServerAddress` | `java/lang/Object` |
| `bde` | `ServerData` | `java/lang/Object` |
| `bde$a` | `ServerData$ServerResourceMode` | `java/lang/Enum` |
| `bdf` | `ServerList` | `java/lang/Object` |
| `bpr` | `ThreadLanServerPing` | `java/lang/Thread` |
| `bdb` | `WorldClient` | `net/minecraft/world/World` |
| `bdb$1` | `WorldClient$1` | `java/lang/Object` |
| `bdb$2` | `WorldClient$2` | `java/lang/Object` |
| `bdb$3` | `WorldClient$3` | `java/lang/Object` |
| `bdb$4` | `WorldClient$4` | `java/lang/Object` |

## `net/minecraft/scoreboard` (14)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `aur` | `GoalColor` | `java/lang/Object` |
| `auu` | `IScoreObjectiveCriteria` | `java/lang/Object` |
| `auu$a` | `IScoreObjectiveCriteria$EnumRenderType` | `java/lang/Enum` |
| `aum` | `Score` | `java/lang/Object` |
| `aum$1` | `Score$1` | `java/lang/Object` |
| `aus` | `ScoreDummyCriteria` | `java/lang/Object` |
| `aut` | `ScoreHealthCriteria` | `net/minecraft/scoreboard/ScoreDummyCriteria` |
| `auk` | `ScoreObjective` | `java/lang/Object` |
| `aul` | `ScorePlayerTeam` | `net/minecraft/scoreboard/Team` |
| `auo` | `Scoreboard` | `java/lang/Object` |
| `aup` | `ScoreboardSaveData` | `net/minecraft/world/WorldSavedData` |
| `kk` | `ServerScoreboard` | `net/minecraft/scoreboard/Scoreboard` |
| `auq` | `Team` | `java/lang/Object` |
| `auq$a` | `Team$EnumVisible` | `java/lang/Enum` |

## `net/minecraft/client/resources/model` (13)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bos` | `BuiltInModel` | `java/lang/Object` |
| `boq` | `IBakedModel` | `java/lang/Object` |
| `bot` | `ModelBakery` | `java/lang/Object` |
| `bot$1` | `ModelBakery$1` | `java/lang/Object` |
| `bot$2` | `ModelBakery$2` | `java/lang/Object` |
| `bou` | `ModelManager` | `java/lang/Object` |
| `bov` | `ModelResourceLocation` | `net/minecraft/util/ResourceLocation` |
| `bor` | `ModelRotation` | `java/lang/Enum` |
| `bow` | `SimpleBakedModel` | `java/lang/Object` |
| `bow$a` | `SimpleBakedModel$Builder` | `java/lang/Object` |
| `box` | `WeightedBakedModel` | `java/lang/Object` |
| `box$a` | `WeightedBakedModel$Builder` | `java/lang/Object` |
| `box$b` | `WeightedBakedModel$MyWeighedRandomItem` | `net/minecraft/util/WeightedRandom$Item` |

## `net/minecraft/creativetab` (13)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `yz` | `CreativeTabs` | `java/lang/Object` |
| `yz$1` | `CreativeTabs$1` | `net/minecraft/creativetab/CreativeTabs` |
| `yz$10` | `CreativeTabs$10` | `net/minecraft/creativetab/CreativeTabs` |
| `yz$11` | `CreativeTabs$11` | `net/minecraft/creativetab/CreativeTabs` |
| `yz$12` | `CreativeTabs$12` | `net/minecraft/creativetab/CreativeTabs` |
| `yz$2` | `CreativeTabs$2` | `net/minecraft/creativetab/CreativeTabs` |
| `yz$3` | `CreativeTabs$3` | `net/minecraft/creativetab/CreativeTabs` |
| `yz$4` | `CreativeTabs$4` | `net/minecraft/creativetab/CreativeTabs` |
| `yz$5` | `CreativeTabs$5` | `net/minecraft/creativetab/CreativeTabs` |
| `yz$6` | `CreativeTabs$6` | `net/minecraft/creativetab/CreativeTabs` |
| `yz$7` | `CreativeTabs$7` | `net/minecraft/creativetab/CreativeTabs` |
| `yz$8` | `CreativeTabs$8` | `net/minecraft/creativetab/CreativeTabs` |
| `yz$9` | `CreativeTabs$9` | `net/minecraft/creativetab/CreativeTabs` |

## `net/minecraft/world/chunk/storage` (12)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `anj` | `AnvilChunkLoader` | `java/lang/Object` |
| `atk` | `AnvilSaveConverter` | `net/minecraft/world/storage/SaveFormatOld` |
| `atk$1` | `AnvilSaveConverter$1` | `java/lang/Object` |
| `atj` | `AnvilSaveHandler` | `net/minecraft/world/storage/SaveHandler` |
| `ang` | `ChunkLoader` | `java/lang/Object` |
| `ang$a` | `ChunkLoader$AnvilConverterData` | `java/lang/Object` |
| `amz` | `ExtendedBlockStorage` | `java/lang/Object` |
| `and` | `IChunkLoader` | `java/lang/Object` |
| `ana` | `NibbleArrayReader` | `java/lang/Object` |
| `anh` | `RegionFile` | `java/lang/Object` |
| `anh$a` | `RegionFile$ChunkBuffer` | `java/io/ByteArrayOutputStream` |
| `ani` | `RegionFileCache` | `java/lang/Object` |

## `net/minecraft/block/state` (10)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `alw` | `BlockPistonStructureHelper` | `java/lang/Object` |
| `ama` | `BlockState` | `java/lang/Object` |
| `ama$1` | `BlockState$1` | `java/lang/Object` |
| `ama$2` | `BlockState$2` | `java/lang/Object` |
| `ama$a` | `BlockState$StateImplementation` | `net/minecraft/block/state/BlockStateBase` |
| `aly` | `BlockStateBase` | `java/lang/Object` |
| `aly$1` | `BlockStateBase$1` | `java/lang/Object` |
| `amc` | `BlockWorldState` | `java/lang/Object` |
| `amc$1` | `BlockWorldState$1` | `java/lang/Object` |
| `alz` | `IBlockState` | `java/lang/Object` |

## `net/minecraft/client/gui/achievement` (10)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `ayd` | `GuiAchievement` | `net/minecraft/client/gui/Gui` |
| `aye` | `GuiAchievements` | `net/minecraft/client/gui/GuiScreen` |
| `ayf` | `GuiStats` | `net/minecraft/client/gui/GuiScreen` |
| `ayf$e` | `GuiStats$Stats` | `net/minecraft/client/gui/GuiSlot` |
| `ayf$a` | `GuiStats$StatsBlock` | `net/minecraft/client/gui/achievement/GuiStats$Stats` |
| `ayf$a$1` | `GuiStats$StatsBlock$1` | `java/lang/Object` |
| `ayf$b` | `GuiStats$StatsGeneral` | `net/minecraft/client/gui/GuiSlot` |
| `ayf$c` | `GuiStats$StatsItem` | `net/minecraft/client/gui/achievement/GuiStats$Stats` |
| `ayf$c$1` | `GuiStats$StatsItem$1` | `java/lang/Object` |
| `ayf$d` | `GuiStats$StatsMobsList` | `net/minecraft/client/gui/GuiSlot` |

## `net/minecraft/entity/projectile` (10)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `wq` | `EntityArrow` | `net/minecraft/entity/Entity` |
| `wz` | `EntityEgg` | `net/minecraft/entity/projectile/EntityThrowable` |
| `ws` | `EntityFireball` | `net/minecraft/entity/Entity` |
| `ur` | `EntityFishHook` | `net/minecraft/entity/Entity` |
| `wu` | `EntityLargeFireball` | `net/minecraft/entity/projectile/EntityFireball` |
| `xc` | `EntityPotion` | `net/minecraft/entity/projectile/EntityThrowable` |
| `ww` | `EntitySmallFireball` | `net/minecraft/entity/projectile/EntityFireball` |
| `wx` | `EntitySnowball` | `net/minecraft/entity/projectile/EntityThrowable` |
| `wy` | `EntityThrowable` | `net/minecraft/entity/Entity` |
| `xd` | `EntityWitherSkull` | `net/minecraft/entity/projectile/EntityFireball` |

## `net/minecraft/client/gui/spectator` (9)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bae` | `BaseSpectatorGroup` | `java/lang/Object` |
| `bah` | `ISpectatorMenuObject` | `java/lang/Object` |
| `bai` | `ISpectatorMenuRecipient` | `java/lang/Object` |
| `bag` | `ISpectatorMenuView` | `java/lang/Object` |
| `bad` | `PlayerMenuObject` | `java/lang/Object` |
| `baf` | `SpectatorMenu` | `java/lang/Object` |
| `baf$1` | `SpectatorMenu$1` | `java/lang/Object` |
| `baf$a` | `SpectatorMenu$EndSpectatorObject` | `java/lang/Object` |
| `baf$b` | `SpectatorMenu$MoveMenuObject` | `java/lang/Object` |

## `net/minecraft/client/main` (9)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bao` | `GameConfiguration` | `java/lang/Object` |
| `bao$a` | `GameConfiguration$DisplayInformation` | `java/lang/Object` |
| `bao$b` | `GameConfiguration$FolderInformation` | `java/lang/Object` |
| `bao$c` | `GameConfiguration$GameInformation` | `java/lang/Object` |
| `bao$d` | `GameConfiguration$ServerInformation` | `java/lang/Object` |
| `bao$e` | `GameConfiguration$UserInformation` | `java/lang/Object` |
| `net/minecraft/client/main/Main` | `Main` | `java/lang/Object` |
| `net/minecraft/client/main/Main$1` | `Main$1` | `java/net/Authenticator` |
| `net/minecraft/client/main/Main$2` | `Main$2` | `java/lang/Thread` |

## `net/minecraft/client/shader` (9)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bfw` | `Framebuffer` | `java/lang/Object` |
| `bls` | `Shader` | `java/lang/Object` |
| `blp` | `ShaderDefault` | `net/minecraft/client/shader/ShaderUniform` |
| `blr` | `ShaderGroup` | `java/lang/Object` |
| `blu` | `ShaderLinkHelper` | `java/lang/Object` |
| `blt` | `ShaderLoader` | `java/lang/Object` |
| `blt$a` | `ShaderLoader$ShaderType` | `java/lang/Enum` |
| `blq` | `ShaderManager` | `java/lang/Object` |
| `blv` | `ShaderUniform` | `java/lang/Object` |

## `net/minecraft/dispenser` (9)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `cn` | `BehaviorDefaultDispenseItem` | `java/lang/Object` |
| `ka` | `BehaviorProjectileDispense` | `net/minecraft/dispenser/BehaviorDefaultDispenseItem` |
| `cr` | `IBehaviorDispenseItem` | `java/lang/Object` |
| `cr$1` | `IBehaviorDispenseItem$1` | `java/lang/Object` |
| `ck` | `IBlockSource` | `java/lang/Object` |
| `cu` | `ILocatableSource` | `java/lang/Object` |
| `cv` | `ILocation` | `java/lang/Object` |
| `cz` | `IPosition` | `java/lang/Object` |
| `da` | `PositionImpl` | `java/lang/Object` |

## `net/minecraft/entity/player` (9)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `wn` | `EntityPlayer` | `net/minecraft/entity/EntityLivingBase` |
| `wn$1` | `EntityPlayer$1` | `java/lang/Object` |
| `wn$b` | `EntityPlayer$EnumChatVisibility` | `java/lang/Enum` |
| `wn$a` | `EntityPlayer$EnumStatus` | `java/lang/Enum` |
| `lf` | `EntityPlayerMP` | `net/minecraft/entity/player/EntityPlayer` |
| `wo` | `EnumPlayerModelParts` | `java/lang/Enum` |
| `wm` | `InventoryPlayer` | `java/lang/Object` |
| `wm$1` | `InventoryPlayer$1` | `java/lang/Object` |
| `wl` | `PlayerCapabilities` | `java/lang/Object` |

## `net/minecraft/world/chunk` (9)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `amy` | `Chunk` | `java/lang/Object` |
| `amy$1` | `Chunk$1` | `java/lang/Object` |
| `amy$2` | `Chunk$2` | `java/lang/Object` |
| `amy$3` | `Chunk$3` | `java/lang/Object` |
| `amy$a` | `Chunk$EnumCreateEntityType` | `java/lang/Enum` |
| `ans` | `ChunkPrimer` | `java/lang/Object` |
| `amx` | `EmptyChunk` | `net/minecraft/world/chunk/Chunk` |
| `amv` | `IChunkProvider` | `java/lang/Object` |
| `amw` | `NibbleArray` | `java/lang/Object` |

## `net/minecraft/entity/ai/attributes` (8)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `qd` | `AttributeModifier` | `java/lang/Object` |
| `qe` | `BaseAttribute` | `java/lang/Object` |
| `qf` | `BaseAttributeMap` | `java/lang/Object` |
| `qb` | `IAttribute` | `java/lang/Object` |
| `qc` | `IAttributeInstance` | `java/lang/Object` |
| `qh` | `ModifiableAttributeInstance` | `java/lang/Object` |
| `qj` | `RangedAttribute` | `net/minecraft/entity/ai/attributes/BaseAttribute` |
| `qi` | `ServersideAttributeMap` | `net/minecraft/entity/ai/attributes/BaseAttributeMap` |

## `net/minecraft/pathfinding` (8)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `asu` | `Path` | `java/lang/Object` |
| `asx` | `PathEntity` | `java/lang/Object` |
| `asy` | `PathFinder` | `java/lang/Object` |
| `sw` | `PathNavigate` | `java/lang/Object` |
| `sx` | `PathNavigateClimber` | `net/minecraft/pathfinding/PathNavigateGround` |
| `sv` | `PathNavigateGround` | `net/minecraft/pathfinding/PathNavigate` |
| `sy` | `PathNavigateSwimmer` | `net/minecraft/pathfinding/PathNavigate` |
| `asv` | `PathPoint` | `java/lang/Object` |

## `net/minecraft/block/material` (7)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `arn` | `MapColor` | `java/lang/Object` |
| `arm` | `Material` | `java/lang/Object` |
| `arm$1` | `Material$1` | `net/minecraft/block/material/Material` |
| `arl` | `MaterialLiquid` | `net/minecraft/block/material/Material` |
| `arj` | `MaterialLogic` | `net/minecraft/block/material/Material` |
| `aro` | `MaterialPortal` | `net/minecraft/block/material/Material` |
| `ark` | `MaterialTransparent` | `net/minecraft/block/material/Material` |

## `net/minecraft/client/gui/stream` (7)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `azy` | `GuiIngestServers` | `net/minecraft/client/gui/GuiScreen` |
| `azy$a` | `GuiIngestServers$ServerList` | `net/minecraft/client/gui/GuiSlot` |
| `azz` | `GuiStreamOptions` | `net/minecraft/client/gui/GuiScreen` |
| `baa` | `GuiStreamUnavailable` | `net/minecraft/client/gui/GuiScreen` |
| `baa$1` | `GuiStreamUnavailable$1` | `java/lang/Object` |
| `baa$a` | `GuiStreamUnavailable$Reason` | `java/lang/Enum` |
| `bab` | `GuiTwitchUserMode` | `net/minecraft/client/gui/GuiScreen` |

## `net/minecraft/client/renderer/block/statemap` (7)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bgv` | `BlockStateMapper` | `java/lang/Object` |
| `bgw` | `DefaultStateMapper` | `net/minecraft/client/renderer/block/statemap/StateMapperBase` |
| `bgy` | `IStateMapper` | `java/lang/Object` |
| `bgx` | `StateMap` | `net/minecraft/client/renderer/block/statemap/StateMapperBase` |
| `bgx$1` | `StateMap$1` | `java/lang/Object` |
| `bgx$a` | `StateMap$Builder` | `java/lang/Object` |
| `bgu` | `StateMapperBase` | `java/lang/Object` |

## `net/minecraft/client/renderer/vertex` (7)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bms` | `DefaultVertexFormats` | `java/lang/Object` |
| `bmt` | `VertexBuffer` | `java/lang/Object` |
| `bmu` | `VertexFormat` | `java/lang/Object` |
| `bmu$1` | `VertexFormat$1` | `java/lang/Object` |
| `bmv` | `VertexFormatElement` | `java/lang/Object` |
| `bmv$a` | `VertexFormatElement$EnumType` | `java/lang/Enum` |
| `bmv$b` | `VertexFormatElement$EnumUsage` | `java/lang/Enum` |

## `net/minecraft/potion` (7)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `pe` | `Potion` | `java/lang/Object` |
| `pa` | `PotionAbsorption` | `net/minecraft/potion/Potion` |
| `pb` | `PotionAttackDamage` | `net/minecraft/potion/Potion` |
| `pf` | `PotionEffect` | `java/lang/Object` |
| `pd` | `PotionHealth` | `net/minecraft/potion/Potion` |
| `pc` | `PotionHealthBoost` | `net/minecraft/potion/Potion` |
| `abe` | `PotionHelper` | `java/lang/Object` |

## `net/minecraft/server/network` (7)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `ln` | `NetHandlerHandshakeTCP` | `java/lang/Object` |
| `ln$1` | `NetHandlerHandshakeTCP$1` | `java/lang/Object` |
| `lo` | `NetHandlerLoginServer` | `java/lang/Object` |
| `lo$1` | `NetHandlerLoginServer$1` | `java/lang/Object` |
| `lo$2` | `NetHandlerLoginServer$2` | `java/lang/Thread` |
| `lo$a` | `NetHandlerLoginServer$LoginState` | `java/lang/Enum` |
| `lp` | `NetHandlerStatusServer` | `java/lang/Object` |

## `net/minecraft/village` (7)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `acz` | `MerchantRecipe` | `java/lang/Object` |
| `ada` | `MerchantRecipeList` | `java/util/ArrayList` |
| `tf` | `Village` | `java/lang/Object` |
| `tf$a` | `Village$VillageAggressor` | `java/lang/Object` |
| `th` | `VillageCollection` | `net/minecraft/world/WorldSavedData` |
| `te` | `VillageDoorInfo` | `java/lang/Object` |
| `tg` | `VillageSiege` | `java/lang/Object` |

## `net/minecraft/block/properties` (6)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `amo` | `IProperty` | `java/lang/Object` |
| `amk` | `PropertyBool` | `net/minecraft/block/properties/PropertyHelper` |
| `aml` | `PropertyDirection` | `net/minecraft/block/properties/PropertyEnum` |
| `amm` | `PropertyEnum` | `net/minecraft/block/properties/PropertyHelper` |
| `amj` | `PropertyHelper` | `java/lang/Object` |
| `amn` | `PropertyInteger` | `net/minecraft/block/properties/PropertyHelper` |

## `net/minecraft/block/state/pattern` (6)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `amg` | `BlockHelper` | `java/lang/Object` |
| `amd` | `BlockPattern` | `java/lang/Object` |
| `amd$a` | `BlockPattern$CacheLoader` | `com/google/common/cache/CacheLoader` |
| `amd$b` | `BlockPattern$PatternHelper` | `java/lang/Object` |
| `amh` | `BlockStateHelper` | `java/lang/Object` |
| `ame` | `FactoryBlockPattern` | `java/lang/Object` |

## `net/minecraft/entity/boss` (6)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bfc` | `BossStatus` | `java/lang/Object` |
| `ug` | `EntityDragon` | `net/minecraft/entity/EntityLiving` |
| `ue` | `EntityDragonPart` | `net/minecraft/entity/Entity` |
| `uk` | `EntityWither` | `net/minecraft/entity/monster/EntityMob` |
| `uk$1` | `EntityWither$1` | `java/lang/Object` |
| `uc` | `IBossDisplayData` | `java/lang/Object` |

## `net/minecraft/server/integrated` (6)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bpn` | `IntegratedPlayerList` | `net/minecraft/server/management/ServerConfigurationManager` |
| `bpo` | `IntegratedServer` | `net/minecraft/server/MinecraftServer` |
| `bpo$1` | `IntegratedServer$1` | `java/lang/Object` |
| `bpo$2` | `IntegratedServer$2` | `java/lang/Object` |
| `bpo$3` | `IntegratedServer$3` | `java/lang/Object` |
| `bpp` | `IntegratedServerCommandManager` | `net/minecraft/command/ServerCommandManager` |

## `net/minecraft/client/gui/spectator/categories` (5)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `baj` | `SpectatorDetails` | `java/lang/Object` |
| `bak` | `TeleportToPlayer` | `java/lang/Object` |
| `bak$1` | `TeleportToPlayer$1` | `java/lang/Object` |
| `bal` | `TeleportToTeam` | `java/lang/Object` |
| `bal$a` | `TeleportToTeam$TeamSelectionObject` | `java/lang/Object` |

## `net/minecraft/client/settings` (5)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `avh` | `GameSettings` | `java/lang/Object` |
| `avh$1` | `GameSettings$1` | `java/lang/Object` |
| `avh$2` | `GameSettings$2` | `java/lang/Object` |
| `avh$a` | `GameSettings$Options` | `java/lang/Enum` |
| `avb` | `KeyBinding` | `java/lang/Object` |

## `net/minecraft/profiler` (5)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `os` | `IPlayerUsage` | `java/lang/Object` |
| `or` | `PlayerUsageSnooper` | `java/lang/Object` |
| `or$1` | `PlayerUsageSnooper$1` | `java/util/TimerTask` |
| `nt` | `Profiler` | `java/lang/Object` |
| `nt$a` | `Profiler$Result` | `java/lang/Object` |

## `net/minecraft/client/renderer/culling` (4)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bid` | `ClippingHelper` | `java/lang/Object` |
| `bib` | `ClippingHelperImpl` | `net/minecraft/client/renderer/culling/ClippingHelper` |
| `bic` | `Frustum` | `java/lang/Object` |
| `bia` | `ICamera` | `java/lang/Object` |

## `net/minecraft/client/util` (4)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `blo` | `JsonBlendingMode` | `java/lang/Object` |
| `kc` | `JsonException` | `java/io/IOException` |
| `kc$1` | `JsonException$1` | `java/lang/Object` |
| `kc$a` | `JsonException$Entry` | `java/lang/Object` |

## `net/minecraft/event` (4)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `et` | `ClickEvent` | `java/lang/Object` |
| `et$a` | `ClickEvent$Action` | `java/lang/Enum` |
| `ew` | `HoverEvent` | `java/lang/Object` |
| `ew$a` | `HoverEvent$Action` | `java/lang/Enum` |

## `net/minecraft/network/login/server` (4)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `jj` | `S00PacketDisconnect` | `java/lang/Object` |
| `jh` | `S01PacketEncryptionRequest` | `java/lang/Object` |
| `jg` | `S02PacketLoginSuccess` | `java/lang/Object` |
| `ji` | `S03PacketEnableCompression` | `java/lang/Object` |

## `net/minecraft/server` (4)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `net/minecraft/server/MinecraftServer` | `MinecraftServer` | `java/lang/Object` |
| `net/minecraft/server/MinecraftServer$1` | `MinecraftServer$1` | `java/lang/Object` |
| `net/minecraft/server/MinecraftServer$3` | `MinecraftServer$3` | `java/lang/Object` |
| `net/minecraft/server/MinecraftServer$4` | `MinecraftServer$4` | `java/lang/Object` |

## `net/minecraft/client/entity` (3)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bet` | `AbstractClientPlayer` | `net/minecraft/entity/player/EntityPlayer` |
| `bex` | `EntityOtherPlayerMP` | `net/minecraft/client/entity/AbstractClientPlayer` |
| `bew` | `EntityPlayerSP` | `net/minecraft/client/entity/AbstractClientPlayer` |

## `net/minecraft/world/border` (3)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `amr` | `EnumBorderStatus` | `java/lang/Enum` |
| `amq` | `IBorderListener` | `java/lang/Object` |
| `ams` | `WorldBorder` | `java/lang/Object` |

## `net/minecraft/world/pathfinder` (3)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `asw` | `NodeProcessor` | `java/lang/Object` |
| `asz` | `SwimNodeProcessor` | `net/minecraft/world/pathfinder/NodeProcessor` |
| `ata` | `WalkNodeProcessor` | `net/minecraft/world/pathfinder/NodeProcessor` |

## `net/minecraft/client/player/inventory` (2)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `bez` | `ContainerLocalMenu` | `net/minecraft/inventory/InventoryBasic` |
| `bey` | `LocalBlockIntercommunication` | `java/lang/Object` |

## `net/minecraft/entity/effect` (2)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `uv` | `EntityLightningBolt` | `net/minecraft/entity/effect/EntityWeatherEffect` |
| `uu` | `EntityWeatherEffect` | `net/minecraft/entity/Entity` |

## `net/minecraft/network/login` (2)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `jf` | `INetHandlerLoginClient` | `java/lang/Object` |
| `jk` | `INetHandlerLoginServer` | `java/lang/Object` |

## `net/minecraft/network/login/client` (2)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `jl` | `C00PacketLoginStart` | `java/lang/Object` |
| `jm` | `C01PacketEncryptionResponse` | `java/lang/Object` |

## `net/minecraft/network/play` (2)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `fj` | `INetHandlerPlayClient` | `java/lang/Object` |
| `ic` | `INetHandlerPlayServer` | `java/lang/Object` |

## `net/minecraft/network/status` (2)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `jp` | `INetHandlerStatusClient` | `java/lang/Object` |
| `jt` | `INetHandlerStatusServer` | `java/lang/Object` |

## `net/minecraft/network/status/client` (2)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `jv` | `C00PacketServerQuery` | `java/lang/Object` |
| `ju` | `C01PacketPing` | `java/lang/Object` |

## `net/minecraft/network/status/server` (2)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `jr` | `S00PacketServerInfo` | `java/lang/Object` |
| `jq` | `S01PacketPong` | `java/lang/Object` |

## `net/minecraft/world/demo` (2)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `ky` | `DemoWorldManager` | `net/minecraft/server/management/ItemInWorldManager` |
| `kx` | `DemoWorldServer` | `net/minecraft/world/WorldServer` |

## `net/minecraft/network/handshake` (1)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `jd` | `INetHandlerHandshakeServer` | `java/lang/Object` |

## `net/minecraft/network/handshake/client` (1)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `jc` | `C00Handshake` | `java/lang/Object` |

## `net/minecraft/network/rcon` (1)

| obf | MCP name | super (obf/MCP) |
|---|---|---|
| `mj` | `RConConsoleSource` | `java/lang/Object` |
