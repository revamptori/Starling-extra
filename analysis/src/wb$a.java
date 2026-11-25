/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static class wb.a
extends rd {
    private wb a;
    private int b;

    public wb.a(wb wb2) {
        this.a = wb2;
        this.a(2);
    }

    @Override
    public boolean a() {
        pr pr2 = this.a.u();
        if (pr2 == null) {
            return false;
        }
        if (!pr2.ai()) {
            return false;
        }
        return !(pr2 instanceof wn) || !((wn)pr2).bA.a;
    }

    @Override
    public void c() {
        this.b = 300;
        super.c();
    }

    @Override
    public boolean b() {
        pr pr2 = this.a.u();
        if (pr2 == null) {
            return false;
        }
        if (!pr2.ai()) {
            return false;
        }
        if (pr2 instanceof wn && ((wn)pr2).bA.a) {
            return false;
        }
        return --this.b > 0;
    }

    @Override
    public void e() {
        this.a.a(this.a.u(), 10.0f, 10.0f);
        ((wb.d)this.a.q()).a(this.a.y, this.a.ci());
    }
}
