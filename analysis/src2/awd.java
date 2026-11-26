/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public abstract class awd
extends awi {
    public awd(ave ave2, int n, int n2, int n3, int n4, int n5) {
        super(ave2, n, n2, n3, n4, n5);
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
    }

    @Override
    protected boolean a(int n) {
        return false;
    }

    @Override
    protected void a() {
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        this.b(n).a(n, n2, n3, this.c(), n4, n5, n6, this.c(n5, n6) == n);
    }

    @Override
    protected void a(int n, int n2, int n3) {
        this.b(n).a(n, n2, n3);
    }

    public boolean b(int n, int n2, int n3) {
        if (this.g(n2) && (\u2603 = this.c(n, n2)) >= 0) {
            \u2603 = this.g + (this.b / 2 - this.c() / 2 + 2);
            \u2603 = this.d + 4 - this.n() + (\u2603 * this.h + this.t);
            \u2603 = n - \u2603;
            \u2603 = n2 - \u2603;
            if (this.b(\u2603).a(\u2603, n, n2, n3, \u2603, \u2603)) {
                this.d(false);
                return true;
            }
        }
        return false;
    }

    public boolean c(int n, int n2, int n3) {
        for (\u2603 = 0; \u2603 < this.b(); ++\u2603) {
            \u2603 = this.g + (this.b / 2 - this.c() / 2 + 2);
            \u2603 = this.d + 4 - this.n() + (\u2603 * this.h + this.t);
            \u2603 = n - \u2603;
            \u2603 = n2 - \u2603;
            this.b(\u2603).b(\u2603, n, n2, n3, \u2603, \u2603);
        }
        this.d(true);
        return false;
    }

    public abstract a b(int var1);

    public static interface a {
        public void a(int var1, int var2, int var3);

        public void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8);

        public boolean a(int var1, int var2, int var3, int var4, int var5, int var6);

        public void b(int var1, int var2, int var3, int var4, int var5, int var6);
    }
}
