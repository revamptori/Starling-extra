/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public static final class cj.a
extends cj {
    private int c;
    private int d;
    private int e;

    public cj.a() {
        this(0, 0, 0);
    }

    public cj.a(int n, int n2, int n3) {
        super(0, 0, 0);
        this.c = n;
        this.d = n2;
        this.e = n3;
    }

    @Override
    public int n() {
        return this.c;
    }

    @Override
    public int o() {
        return this.d;
    }

    @Override
    public int p() {
        return this.e;
    }

    public cj.a c(int n, int n2, int n3) {
        this.c = n;
        this.d = n2;
        this.e = n3;
        return this;
    }

    @Override
    public /* synthetic */ df d(df df2) {
        return super.c(df2);
    }

    static /* synthetic */ int a(cj.a a2, int n) {
        a2.c = n;
        return a2.c;
    }

    static /* synthetic */ int b(cj.a a2, int n) {
        a2.d = n;
        return a2.d;
    }

    static /* synthetic */ int c(cj.a a2, int n) {
        a2.e = n;
        return a2.e;
    }
}
