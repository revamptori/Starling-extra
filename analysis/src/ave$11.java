/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 */
class ave.11
extends Thread {
    ave.11(String string) {
        super(string);
    }

    public void run() {
        while (ave.this.B) {
            try {
                Thread.sleep((long)Integer.MAX_VALUE);
            }
            catch (InterruptedException interruptedException) {}
        }
    }
}
