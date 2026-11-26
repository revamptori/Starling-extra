/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class ya
implements og {
    private final acy a;
    private zx[] b = new zx[3];
    private final wn c;
    private acz d;
    private int e;

    public ya(wn wn2, acy acy2) {
        this.c = wn2;
        this.a = acy2;
    }

    @Override
    public int o_() {
        return this.b.length;
    }

    @Override
    public zx a(int n) {
        return this.b[n];
    }

    @Override
    public zx a(int n3, int n2) {
        if (this.b[n3] != null) {
            int n3;
            if (n3 == 2) {
                zx zx2 = this.b[n3];
                this.b[n3] = null;
                return zx2;
            }
            if (this.b[n3].b <= n2) {
                zx zx3 = this.b[n3];
                this.b[n3] = null;
                if (this.e(n3)) {
                    this.h();
                }
                return zx3;
            }
            zx \u26032 = this.b[n3].a(n2);
            if (this.b[n3].b == 0) {
                this.b[n3] = null;
            }
            if (this.e(n3)) {
                this.h();
            }
            return \u26032;
        }
        return null;
    }

    private boolean e(int n) {
        return n == 0 || n == 1;
    }

    @Override
    public zx b(int n) {
        if (this.b[n] != null) {
            zx zx2 = this.b[n];
            this.b[n] = null;
            return zx2;
        }
        return null;
    }

    @Override
    public void a(int n, zx zx2) {
        this.b[n] = zx2;
        if (zx2 != null && zx2.b > this.q_()) {
            zx2.b = this.q_();
        }
        if (this.e(n)) {
            this.h();
        }
    }

    @Override
    public String e_() {
        return "mob.villager";
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
    public int q_() {
        return 64;
    }

    @Override
    public boolean a(wn wn2) {
        return this.a.v_() == wn2;
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
    public void p_() {
        this.h();
    }

    public void h() {
        this.d = null;
        zx zx2 = this.b[0];
        \u2603 = this.b[1];
        if (zx2 == null) {
            zx2 = \u2603;
            \u2603 = null;
        }
        if (zx2 == null) {
            this.a(2, null);
        } else {
            ada ada2 = this.a.b_(this.c);
            if (ada2 != null) {
                acz acz2 = ada2.a(zx2, \u2603, this.e);
                if (acz2 != null && !acz2.h()) {
                    this.d = acz2;
                    this.a(2, acz2.d().k());
                } else if (\u2603 != null) {
                    acz2 = ada2.a(\u2603, zx2, this.e);
                    if (acz2 != null && !acz2.h()) {
                        this.d = acz2;
                        this.a(2, acz2.d().k());
                    } else {
                        this.a(2, null);
                    }
                } else {
                    this.a(2, null);
                }
            }
        }
        this.a.a_(this.a(2));
    }

    public acz i() {
        return this.d;
    }

    public void d(int n) {
        this.e = n;
        this.h();
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
        for (int i = 0; i < this.b.length; ++i) {
            this.b[i] = null;
        }
    }
}
