/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
static class tx.a
extends rd {
    private tx a;

    public tx.a(tx tx2) {
        this.a = tx2;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void e() {
        int n2 = this.a.bh();
        if (n2 > 100) {
            this.a.b(0.0f, 0.0f, 0.0f);
        } else if (this.a.bc().nextInt(50) == 0 || !this.a.Y || !this.a.n()) {
            float f = this.a.bc().nextFloat() * (float)Math.PI * 2.0f;
            \u2603 = ns.b(f) * 0.2f;
            \u2603 = -0.1f + this.a.bc().nextFloat() * 0.2f;
            \u2603 = ns.a(f) * 0.2f;
            this.a.b(\u2603, \u2603, \u2603);
        }
    }
}
