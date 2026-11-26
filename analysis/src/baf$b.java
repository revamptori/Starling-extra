/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static class baf.b
implements bah {
    private final int a;
    private final boolean b;

    public baf.b(int n, boolean bl) {
        this.a = n;
        this.b = bl;
    }

    @Override
    public void a(baf baf2) {
        baf2.j += this.a;
    }

    @Override
    public eu A_() {
        if (this.a < 0) {
            return new fa("Previous Page");
        }
        return new fa("Next Page");
    }

    @Override
    public void a(float f, int n) {
        ave.A().P().a(awm.a);
        if (this.a < 0) {
            avp.a(0, 0, 144.0f, 0.0f, 16, 16, 256.0f, 256.0f);
        } else {
            avp.a(0, 0, 160.0f, 0.0f, 16, 16, 256.0f, 256.0f);
        }
    }

    @Override
    public boolean B_() {
        return this.b;
    }
}
