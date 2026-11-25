/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.SoundSystemLogger
 */
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemLogger;

class bpx.1
implements Runnable {
    bpx.1() {
    }

    public void run() {
        SoundSystemConfig.setLogger((SoundSystemLogger)new SoundSystemLogger(){

            public void message(String string, int n) {
                if (!string.isEmpty()) {
                    b.info(string);
                }
            }

            public void importantMessage(String string, int n) {
                if (!string.isEmpty()) {
                    b.warn(string);
                }
            }

            public void errorMessage(String string, String string2, int n) {
                if (!string2.isEmpty()) {
                    b.error("Error in class '" + string + "'");
                    b.error(string2);
                }
            }
        });
        bpx.this.e = new bpx.a(bpx.this, null);
        bpx.this.f = true;
        bpx.this.e.setMasterVolume(bpx.this.d.a(bpg.a));
        b.info(a, "Sound engine started");
    }
}
