/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class xp
implements og {
    private final zx[] a;
    private final int b;
    private final int c;
    private final xi d;

    public xp(xi xi2, int n, int n2) {
        \u2603 = n * n2;
        this.a = new zx[\u2603];
        this.d = xi2;
        this.b = n;
        this.c = n2;
    }

    @Override
    public int o_() {
        return this.a.length;
    }

    @Override
    public zx a(int n) {
        if (n >= this.o_()) {
            return null;
        }
        return this.a[n];
    }

    public zx c(int n, int n2) {
        if (n < 0 || n >= this.b || n2 < 0 || n2 > this.c) {
            return null;
        }
        return this.a(n + n2 * this.b);
    }

    @Override
    public String e_() {
        return "container.crafting";
    }

    @Override
    public boolean l_() {
        return false;
    }

    @Override
    public eu f_() {
        if (this.l_()) {
            return new fa(this.e_());
        }
        return new fb(this.e_(), new Object[0]);
    }

    @Override
    public zx b(int n) {
        if (this.a[n] != null) {
            zx zx2 = this.a[n];
            this.a[n] = null;
            return zx2;
        }
        return null;
    }

    @Override
    public zx a(int n3, int n2) {
        if (this.a[n3] != null) {
            int n3;
            if (this.a[n3].b <= n2) {
                zx zx2 = this.a[n3];
                this.a[n3] = null;
                this.d.a(this);
                return zx2;
            }
            zx \u26032 = this.a[n3].a(n2);
            if (this.a[n3].b == 0) {
                this.a[n3] = null;
            }
            this.d.a(this);
            return \u26032;
        }
        return null;
    }

    @Override
    public void a(int n, zx zx2) {
        this.a[n] = zx2;
        this.d.a(this);
    }

    @Override
    public int q_() {
        return 64;
    }

    @Override
    public void p_() {
    }

    @Override
    public boolean a(wn wn2) {
        return true;
    }

    @Override
    public void b(wn wn2) {
    }

    @Override
    public void c(wn wn2) {
    }

    @Override
    public boolean b(int n, zx zx2) {
        return true;
    }

    @Override
    public int a_(int n) {
        return 0;
    }

    @Override
    public void b(int n, int n2) {
    }

    @Override
    public int g() {
        return 0;
    }

    @Override
    public void l() {
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = null;
        }
    }

    public int h() {
        return this.c;
    }

    public int i() {
        return this.b;
    }
}
