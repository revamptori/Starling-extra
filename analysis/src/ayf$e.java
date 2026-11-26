/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 *  org.lwjgl.input.Mouse
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.lwjgl.input.Mouse;

abstract class ayf.e
extends awi {
    protected int v;
    protected List<mu> w;
    protected Comparator<mu> x;
    protected int y;
    protected int z;

    protected ayf.e(ave ave2) {
        super(ave2, ayf.this.l, ayf.this.m, 32, ayf.this.m - 64, 20);
        this.v = -1;
        this.y = -1;
        this.b(false);
        this.a(true, 20);
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
        ayf.this.c();
    }

    @Override
    protected void a(int n, int n2, bfx bfx2) {
        if (!Mouse.isButtonDown((int)0)) {
            this.v = -1;
        }
        if (this.v == 0) {
            ayf.this.c(n + 115 - 18, n2 + 1, 0, 0);
        } else {
            ayf.this.c(n + 115 - 18, n2 + 1, 0, 18);
        }
        if (this.v == 1) {
            ayf.this.c(n + 165 - 18, n2 + 1, 0, 0);
        } else {
            ayf.this.c(n + 165 - 18, n2 + 1, 0, 18);
        }
        if (this.v == 2) {
            ayf.this.c(n + 215 - 18, n2 + 1, 0, 0);
        } else {
            ayf.this.c(n + 215 - 18, n2 + 1, 0, 18);
        }
        if (this.y != -1) {
            int n3 = 79;
            \u2603 = 18;
            if (this.y == 1) {
                n3 = 129;
            } else if (this.y == 2) {
                n3 = 179;
            }
            if (this.z == 1) {
                \u2603 = 36;
            }
            ayf.this.c(n + n3, n2 + 1, \u2603, 0);
        }
    }

    @Override
    protected void a(int n, int n2) {
        this.v = -1;
        if (n >= 79 && n < 115) {
            this.v = 0;
        } else if (n >= 129 && n < 165) {
            this.v = 1;
        } else if (n >= 179 && n < 215) {
            this.v = 2;
        }
        if (this.v >= 0) {
            this.d(this.v);
            this.a.W().a(bpf.a(new jy("gui.button.press"), 1.0f));
        }
    }

    @Override
    protected final int b() {
        return this.w.size();
    }

    protected final mu c(int n) {
        return (mu)this.w.get(n);
    }

    protected abstract String b(int var1);

    protected void a(mw mw2, int n, int n2, boolean bl) {
        if (mw2 != null) {
            String string = mw2.a(ayf.this.s.a(mw2));
            ayf.this.c(ayf.this.q, string, n - ayf.this.q.a(string), n2 + 5, bl ? 0xFFFFFF : 0x909090);
        } else {
            String string = "-";
            ayf.this.c(ayf.this.q, string, n - ayf.this.q.a(string), n2 + 5, bl ? 0xFFFFFF : 0x909090);
        }
    }

    @Override
    protected void b(int n, int n2) {
        if (n2 < this.d || n2 > this.e) {
            return;
        }
        \u2603 = this.c(n, n2);
        \u2603 = this.b / 2 - 92 - 16;
        if (\u2603 >= 0) {
            if (n < \u2603 + 40 || n > \u2603 + 40 + 20) {
                return;
            }
            mu mu2 = this.c(\u2603);
            this.a(mu2, n, n2);
        } else {
            String string = "";
            if (n >= \u2603 + 115 - 18 && n <= \u2603 + 115) {
                string = this.b(0);
            } else if (n >= \u2603 + 165 - 18 && n <= \u2603 + 165) {
                string = this.b(1);
            } else if (n >= \u2603 + 215 - 18 && n <= \u2603 + 215) {
                string = this.b(2);
            } else {
                return;
            }
            string = ("" + bnq.a(string, new Object[0])).trim();
            if (string.length() > 0) {
                int n3 = n + 12;
                \u2603 = n2 - 12;
                \u2603 = ayf.this.q.a(string);
                ayf.this.a(n3 - 3, \u2603 - 3, n3 + \u2603 + 3, \u2603 + 8 + 3, -1073741824, -1073741824);
                ayf.this.q.a(string, (float)n3, (float)\u2603, -1);
            }
        }
    }

    protected void a(mu mu2, int n, int n2) {
        if (mu2 == null) {
            return;
        }
        zw zw2 = mu2.a();
        zx \u26032 = new zx(zw2);
        String \u26033 = \u26032.a();
        String \u26034 = ("" + bnq.a(\u26033 + ".name", new Object[0])).trim();
        if (\u26034.length() > 0) {
            int n3 = n + 12;
            \u2603 = n2 - 12;
            \u2603 = ayf.this.q.a(\u26034);
            ayf.this.a(n3 - 3, \u2603 - 3, n3 + \u2603 + 3, \u2603 + 8 + 3, -1073741824, -1073741824);
            ayf.this.q.a(\u26034, (float)n3, (float)\u2603, -1);
        }
    }

    protected void d(int n) {
        if (n != this.y) {
            this.y = n;
            this.z = -1;
        } else if (this.z == -1) {
            this.z = 1;
        } else {
            this.y = -1;
            this.z = 0;
        }
        Collections.sort(this.w, this.x);
    }
}
