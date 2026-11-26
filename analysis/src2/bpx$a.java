/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  paulscode.sound.SoundSystem
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.Source
 */
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.Source;

class bpx.a
extends SoundSystem {
    private bpx.a() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean playing(String string) {
        Object object = SoundSystemConfig.THREAD_SYNC;
        synchronized (object) {
            if (this.soundLibrary == null) {
                return false;
            }
            Source source = (Source)this.soundLibrary.getSources().get((Object)string);
            if (source == null) {
                return false;
            }
            return source.playing() || source.paused() || source.preLoad;
        }
    }
}
