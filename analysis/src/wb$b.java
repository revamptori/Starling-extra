/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static class wb.b
extends rd {
    private wb a;

    public wb.b(wb wb2) {
        this.a = wb2;
        this.a(5);
        ((sv)wb2.s()).d(true);
    }

    @Override
    public boolean a() {
        return this.a.V() || this.a.ab();
    }

    @Override
    public void e() {
        if (this.a.bc().nextFloat() < 0.8f) {
            this.a.r().a();
        }
        ((wb.d)this.a.q()).a(1.2);
    }
}
