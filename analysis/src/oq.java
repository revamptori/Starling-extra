/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.List;

public class oq
implements og {
    private String a;
    private int b;
    private zx[] c;
    private List<oh> d;
    private boolean e;

    public oq(String string, boolean bl, int n) {
        this.a = string;
        this.e = bl;
        this.b = n;
        this.c = new zx[n];
    }

    public oq(eu eu2, int n) {
        this(eu2.c(), true, n);
    }

    public void a(oh oh2) {
        if (this.d == null) {
            this.d = Lists.newArrayList();
        }
        this.d.add((Object)oh2);
    }

    public void b(oh oh2) {
        this.d.remove((Object)oh2);
    }

    @Override
    public zx a(int n) {
        if (n < 0 || n >= this.c.length) {
            return null;
        }
        return this.c[n];
    }

    @Override
    public zx a(int n3, int n2) {
        if (this.c[n3] != null) {
            int n3;
            if (this.c[n3].b <= n2) {
                zx zx2 = this.c[n3];
                this.c[n3] = null;
                this.p_();
                return zx2;
            }
            zx \u26032 = this.c[n3].a(n2);
            if (this.c[n3].b == 0) {
                this.c[n3] = null;
            }
            this.p_();
            return \u26032;
        }
        return null;
    }

    public zx a(zx zx2) {
        zx zx3;
        zx3 = zx2.k();
        for (int i = 0; i < this.b; ++i) {
            zx zx4 = this.a(i);
            if (zx4 == null) {
                this.a(i, zx3);
                this.p_();
                return null;
            }
            if (!zx.c(zx4, zx3) || (\u2603 = Math.min((int)zx3.b, (int)((\u2603 = Math.min((int)this.q_(), (int)zx4.c())) - zx4.b))) <= 0) continue;
            zx4.b += \u2603;
            zx3.b -= \u2603;
            if (zx3.b > 0) continue;
            this.p_();
            return null;
        }
        if (zx3.b != zx2.b) {
            this.p_();
        }
        return zx3;
    }

    @Override
    public zx b(int n) {
        if (this.c[n] != null) {
            zx zx2 = this.c[n];
            this.c[n] = null;
            return zx2;
        }
        return null;
    }

    @Override
    public void a(int n, zx zx2) {
        this.c[n] = zx2;
        if (zx2 != null && zx2.b > this.q_()) {
            zx2.b = this.q_();
        }
        this.p_();
    }

    @Override
    public int o_() {
        return this.b;
    }

    @Override
    public String e_() {
        return this.a;
    }

    @Override
    public boolean l_() {
        return this.e;
    }

    public void a(String string) {
        this.e = true;
        this.a = string;
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
    public void p_() {
        if (this.d != null) {
            for (int i = 0; i < this.d.size(); ++i) {
                ((oh)this.d.get(i)).a(this);
            }
        }
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
        for (int i = 0; i < this.c.length; ++i) {
            this.c[i] = null;
        }
    }
}
