/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
class bho.3
implements Runnable {
    final /* synthetic */ adf a;
    final /* synthetic */ bfd b;
    final /* synthetic */ bht c;
    final /* synthetic */ bhq d;

    bho.3(adf adf2, bfd bfd2, bht bht2, bhq bhq2) {
        this.a = adf2;
        this.b = bfd2;
        this.c = bht2;
        this.d = bhq2;
    }

    public void run() {
        bho.this.a(this.a, this.b, this.c, this.d);
    }
}
