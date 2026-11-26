/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
public static class bmf.a
implements Comparable<bmf.a> {
    private final bmi a;
    private final int b;
    private final int c;
    private final int d;
    private boolean e;
    private float f = 1.0f;

    public bmf.a(bmi bmi2, int n) {
        this.a = bmi2;
        this.b = bmi2.c();
        this.c = bmi2.d();
        this.d = n;
        this.e = bmf.b(this.c, n) > bmf.b(this.b, n);
    }

    public bmi a() {
        return this.a;
    }

    public int b() {
        return this.e ? bmf.b((int)((float)this.c * this.f), this.d) : bmf.b((int)((float)this.b * this.f), this.d);
    }

    public int c() {
        return this.e ? bmf.b((int)((float)this.b * this.f), this.d) : bmf.b((int)((float)this.c * this.f), this.d);
    }

    public void d() {
        this.e = !this.e;
    }

    public boolean e() {
        return this.e;
    }

    public void a(int n) {
        if (this.b <= n || this.c <= n) {
            return;
        }
        this.f = (float)n / (float)Math.min((int)this.b, (int)this.c);
    }

    public String toString() {
        return "Holder{width=" + this.b + ", height=" + this.c + '}';
    }

    public int a(bmf.a a22) {
        int \u26032;
        if (this.c() == a22.c()) {
            if (this.b() == a22.b()) {
                if (this.a.i() == null) {
                    return a22.a.i() == null ? 0 : -1;
                }
                return this.a.i().compareTo(a22.a.i());
            }
            \u26032 = this.b() < a22.b() ? 1 : -1;
        } else {
            bmf.a a22;
            \u26032 = this.c() < a22.c() ? 1 : -1;
        }
        return \u26032;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((bmf.a)object);
    }
}
