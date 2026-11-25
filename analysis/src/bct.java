/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class bct {
    public float a = 64.0f;
    public float b = 32.0f;
    private int r;
    private int s;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    private boolean t;
    private int u;
    public boolean i;
    public boolean j = true;
    public boolean k;
    public List<bcr> l = Lists.newArrayList();
    public List<bct> m;
    public final String n;
    private bbo v;
    public float o;
    public float p;
    public float q;

    public bct(bbo bbo2, String string) {
        this.v = bbo2;
        bbo2.s.add((Object)this);
        this.n = string;
        this.b(bbo2.t, bbo2.u);
    }

    public bct(bbo bbo2) {
        this(bbo2, null);
    }

    public bct(bbo bbo2, int n, int n2) {
        this(bbo2);
        this.a(n, n2);
    }

    public void a(bct bct2) {
        if (this.m == null) {
            this.m = Lists.newArrayList();
        }
        this.m.add((Object)bct2);
    }

    public bct a(int n, int n2) {
        this.r = n;
        this.s = n2;
        return this;
    }

    public bct a(String string2, float f, float f2, float f3, int n, int n2, int n3) {
        String string2 = this.n + "." + string2;
        bcu \u26032 = this.v.a(string2);
        this.a(\u26032.a, \u26032.b);
        this.l.add((Object)new bcr(this, this.r, this.s, f, f2, f3, n, n2, n3, 0.0f).a(string2));
        return this;
    }

    public bct a(float f, float f2, float f3, int n, int n2, int n3) {
        this.l.add((Object)new bcr(this, this.r, this.s, f, f2, f3, n, n2, n3, 0.0f));
        return this;
    }

    public bct a(float f, float f2, float f3, int n, int n2, int n3, boolean bl) {
        this.l.add((Object)new bcr(this, this.r, this.s, f, f2, f3, n, n2, n3, 0.0f, bl));
        return this;
    }

    public void a(float f, float f2, float f3, int n, int n2, int n3, float f4) {
        this.l.add((Object)new bcr(this, this.r, this.s, f, f2, f3, n, n2, n3, f4));
    }

    public void a(float f, float f2, float f3) {
        this.c = f;
        this.d = f2;
        this.e = f3;
    }

    public void a(float f22) {
        if (this.k) {
            return;
        }
        if (!this.j) {
            return;
        }
        if (!this.t) {
            this.d(f22);
        }
        bfl.b(this.o, this.p, this.q);
        if (this.f != 0.0f || this.g != 0.0f || this.h != 0.0f) {
            bfl.E();
            bfl.b(this.c * f22, this.d * f22, this.e * f22);
            if (this.h != 0.0f) {
                bfl.b(this.h * 57.295776f, 0.0f, 0.0f, 1.0f);
            }
            if (this.g != 0.0f) {
                bfl.b(this.g * 57.295776f, 0.0f, 1.0f, 0.0f);
            }
            if (this.f != 0.0f) {
                bfl.b(this.f * 57.295776f, 1.0f, 0.0f, 0.0f);
            }
            bfl.o(this.u);
            if (this.m != null) {
                for (int i2 = 0; i2 < this.m.size(); ++i2) {
                    ((bct)this.m.get(i2)).a(f22);
                }
            }
            bfl.F();
        } else if (this.c != 0.0f || this.d != 0.0f || this.e != 0.0f) {
            float f22;
            bfl.b(this.c * f22, this.d * f22, this.e * f22);
            bfl.o(this.u);
            if (this.m != null) {
                for (int i3 = 0; i3 < this.m.size(); ++i3) {
                    ((bct)this.m.get(i3)).a(f22);
                }
            }
            bfl.b(-this.c * f22, -this.d * f22, -this.e * f22);
        } else {
            bfl.o(this.u);
            if (this.m != null) {
                for (int i4 = 0; i4 < this.m.size(); ++i4) {
                    ((bct)this.m.get(i4)).a(f22);
                }
            }
        }
        bfl.b(-this.o, -this.p, -this.q);
    }

    public void b(float f2) {
        if (this.k) {
            return;
        }
        if (!this.j) {
            return;
        }
        if (!this.t) {
            this.d(f2);
        }
        bfl.E();
        bfl.b(this.c * f2, this.d * f2, this.e * f2);
        if (this.g != 0.0f) {
            bfl.b(this.g * 57.295776f, 0.0f, 1.0f, 0.0f);
        }
        if (this.f != 0.0f) {
            bfl.b(this.f * 57.295776f, 1.0f, 0.0f, 0.0f);
        }
        if (this.h != 0.0f) {
            bfl.b(this.h * 57.295776f, 0.0f, 0.0f, 1.0f);
        }
        bfl.o(this.u);
        bfl.F();
    }

    public void c(float f2) {
        if (this.k) {
            return;
        }
        if (!this.j) {
            return;
        }
        if (!this.t) {
            this.d(f2);
        }
        if (this.f != 0.0f || this.g != 0.0f || this.h != 0.0f) {
            bfl.b(this.c * f2, this.d * f2, this.e * f2);
            if (this.h != 0.0f) {
                bfl.b(this.h * 57.295776f, 0.0f, 0.0f, 1.0f);
            }
            if (this.g != 0.0f) {
                bfl.b(this.g * 57.295776f, 0.0f, 1.0f, 0.0f);
            }
            if (this.f != 0.0f) {
                bfl.b(this.f * 57.295776f, 1.0f, 0.0f, 0.0f);
            }
        } else if (this.c != 0.0f || this.d != 0.0f || this.e != 0.0f) {
            bfl.b(this.c * f2, this.d * f2, this.e * f2);
        }
    }

    private void d(float f2) {
        this.u = avd.a(1);
        GL11.glNewList((int)this.u, (int)4864);
        bfd bfd2 = bfx.a().c();
        for (int i2 = 0; i2 < this.l.size(); ++i2) {
            ((bcr)this.l.get(i2)).a(bfd2, f2);
        }
        GL11.glEndList();
        this.t = true;
    }

    public bct b(int n2, int n3) {
        this.a = n2;
        this.b = n3;
        return this;
    }
}
