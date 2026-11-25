/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
public class aqa {
    private final int a;
    private alz b;
    private int c = 1;
    private int d;

    public aqa(int n, afh afh2) {
        this(3, n, afh2);
    }

    public aqa(int n, int n2, afh afh2) {
        this.a = n;
        this.c = n2;
        this.b = afh2.Q();
    }

    public aqa(int n, int n2, afh afh2, int n3) {
        this(n, n2, afh2);
        this.b = afh2.a(n3);
    }

    public int b() {
        return this.c;
    }

    public alz c() {
        return this.b;
    }

    private afh e() {
        return this.b.c();
    }

    private int f() {
        return this.b.c().c(this.b);
    }

    public int d() {
        return this.d;
    }

    public void b(int n) {
        this.d = n;
    }

    public String toString() {
        String string;
        if (this.a >= 3) {
            jy jy2 = (jy)afh.c.c(this.e());
            String string2 = string = jy2 == null ? "null" : jy2.toString();
            if (this.c > 1) {
                string = this.c + "*" + string;
            }
        } else {
            string = Integer.toString((int)afh.a(this.e()));
            if (this.c > 1) {
                string = this.c + "x" + string;
            }
        }
        int n = this.f();
        if (n > 0) {
            string = string + ":" + n;
        }
        return string;
    }
}
