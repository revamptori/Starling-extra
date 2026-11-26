/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class bpf
extends bpa {
    public static bpf a(jy jy2, float f) {
        return new bpf(jy2, 0.25f, f, false, 0, bpj.a.a, 0.0f, 0.0f, 0.0f);
    }

    public static bpf a(jy jy2) {
        return new bpf(jy2, 1.0f, 1.0f, false, 0, bpj.a.a, 0.0f, 0.0f, 0.0f);
    }

    public static bpf a(jy jy2, float f, float f2, float f3) {
        return new bpf(jy2, 4.0f, 1.0f, false, 0, bpj.a.b, f, f2, f3);
    }

    public bpf(jy jy2, float f, float f2, float f3, float f4, float f5) {
        this(jy2, f, f2, false, 0, bpj.a.b, f3, f4, f5);
    }

    private bpf(jy jy2, float f, float f2, boolean bl, int n, bpj.a a2, float f3, float f4, float f5) {
        super(jy2);
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = bl;
        this.h = n;
        this.i = a2;
    }
}
