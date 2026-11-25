/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class bca
extends bcn {
    public bca() {
        this(0.0f, false);
    }

    public bca(float f, boolean bl) {
        super(f, 0.0f, 64, 32);
        if (!bl) {
            this.h = new bct(this, 40, 16);
            this.h.a(-1.0f, -2.0f, -1.0f, 2, 12, 2, f);
            this.h.a(-5.0f, 2.0f, 0.0f);
            this.i = new bct(this, 40, 16);
            this.i.i = true;
            this.i.a(-1.0f, -2.0f, -1.0f, 2, 12, 2, f);
            this.i.a(5.0f, 2.0f, 0.0f);
            this.j = new bct(this, 0, 16);
            this.j.a(-1.0f, 0.0f, -1.0f, 2, 12, 2, f);
            this.j.a(-2.0f, 12.0f, 0.0f);
            this.k = new bct(this, 0, 16);
            this.k.i = true;
            this.k.a(-1.0f, 0.0f, -1.0f, 2, 12, 2, f);
            this.k.a(2.0f, 12.0f, 0.0f);
        }
    }

    @Override
    public void a(pr pr2, float f, float f2, float f3) {
        this.o = ((wa)pr2).cm() == 1;
        super.a(pr2, f, f2, f3);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, pk pk2) {
        super.a(f, f2, f3, f4, f5, f6, pk2);
    }
}
