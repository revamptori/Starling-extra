/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static class wb.e
extends rd {
    private wb a;
    private float b;
    private int c;

    public wb.e(wb wb2) {
        this.a = wb2;
        this.a(2);
    }

    @Override
    public boolean a() {
        return this.a.u() == null && (this.a.C || this.a.V() || this.a.ab());
    }

    @Override
    public void e() {
        if (--this.c <= 0) {
            this.c = 40 + this.a.bc().nextInt(60);
            this.b = this.a.bc().nextInt(360);
        }
        ((wb.d)this.a.q()).a(this.b, false);
    }
}
