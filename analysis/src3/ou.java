/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 */
public class ou {
    private final ow a;
    private final int b;
    private final float c;
    private final float d;
    private final String e;
    private final float f;

    public ou(ow ow2, int n, float f, float f2, String string, float f3) {
        this.a = ow2;
        this.b = n;
        this.c = f2;
        this.d = f;
        this.e = string;
        this.f = f3;
    }

    public ow a() {
        return this.a;
    }

    public float c() {
        return this.c;
    }

    public boolean f() {
        return this.a.j() instanceof pr;
    }

    public String g() {
        return this.e;
    }

    public eu h() {
        return this.a().j() == null ? null : this.a().j().f_();
    }

    public float i() {
        if (this.a == ow.j) {
            return Float.MAX_VALUE;
        }
        return this.f;
    }
}
