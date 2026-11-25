/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  paulscode.sound.SoundSystemLogger
 */
import paulscode.sound.SoundSystemLogger;

class bpx.1
extends SoundSystemLogger {
    bpx.1() {
    }

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
}
