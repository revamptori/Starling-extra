/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
static class aql.v {
    int a;
    aql.v[] b = new aql.v[6];
    boolean[] c = new boolean[6];
    boolean d;
    boolean e;
    int f;

    public aql.v(int n) {
        this.a = n;
    }

    public void a(cq cq2, aql.v v2) {
        this.b[cq2.a()] = v2;
        v2.b[cq2.d().a()] = this;
    }

    public void a() {
        for (int i = 0; i < 6; ++i) {
            this.c[i] = this.b[i] != null;
        }
    }

    public boolean a(int n) {
        if (this.e) {
            return true;
        }
        this.f = n;
        for (\u2603 = 0; \u2603 < 6; ++\u2603) {
            if (this.b[\u2603] == null || !this.c[\u2603] || this.b[\u2603].f == n || !this.b[\u2603].a(n)) continue;
            return true;
        }
        return false;
    }

    public boolean b() {
        return this.a >= 75;
    }

    public int c() {
        int n = 0;
        for (\u2603 = 0; \u2603 < 6; ++\u2603) {
            if (!this.c[\u2603]) continue;
            ++n;
        }
        return n;
    }
}
