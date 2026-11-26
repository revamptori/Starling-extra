/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public static class awg.d
implements awd.a {
    private final ave a = ave.A();
    private final avp b;
    private final avp c;
    private avp d;

    public awg.d(avp avp2, avp avp3) {
        this.b = avp2;
        this.c = avp3;
    }

    public avp a() {
        return this.b;
    }

    public avp b() {
        return this.c;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        this.a(this.b, n3, n6, n7, false);
        this.a(this.c, n3, n6, n7, false);
    }

    private void a(avp avp2, int n, int n2, int n3, boolean bl) {
        if (avp2 == null) {
            return;
        }
        if (avp2 instanceof avs) {
            this.a((avs)avp2, n, n2, n3, bl);
        } else if (avp2 instanceof avw) {
            this.a((avw)avp2, n, bl);
        } else if (avp2 instanceof avy) {
            this.a((avy)avp2, n, n2, n3, bl);
        }
    }

    private void a(avs avs2, int n, int n2, int n3, boolean bl) {
        avs2.i = n;
        if (!bl) {
            avs2.a(this.a, n2, n3);
        }
    }

    private void a(avw avw2, int n, boolean bl) {
        avw2.f = n;
        if (!bl) {
            avw2.g();
        }
    }

    private void a(avy avy2, int n, int n2, int n3, boolean bl) {
        avy2.h = n;
        if (!bl) {
            avy2.a(this.a, n2, n3);
        }
    }

    @Override
    public void a(int n, int n2, int n3) {
        this.a(this.b, n3, 0, 0, true);
        this.a(this.c, n3, 0, 0, true);
    }

    @Override
    public boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
        boolean bl = this.a(this.b, n2, n3, n4);
        \u2603 = this.a(this.c, n2, n3, n4);
        return bl || \u2603;
    }

    private boolean a(avp avp2, int n, int n2, int n3) {
        if (avp2 == null) {
            return false;
        }
        if (avp2 instanceof avs) {
            return this.a((avs)avp2, n, n2, n3);
        }
        if (avp2 instanceof avw) {
            this.a((avw)avp2, n, n2, n3);
        }
        return false;
    }

    private boolean a(avs avs2, int n, int n2, int n3) {
        boolean bl = avs2.c(this.a, n, n2);
        if (bl) {
            this.d = avs2;
        }
        return bl;
    }

    private void a(avw avw2, int n, int n2, int n3) {
        avw2.a(n, n2, n3);
        if (avw2.m()) {
            this.d = avw2;
        }
    }

    @Override
    public void b(int n, int n2, int n3, int n4, int n5, int n6) {
        this.b(this.b, n2, n3, n4);
        this.b(this.c, n2, n3, n4);
    }

    private void b(avp avp2, int n, int n2, int n3) {
        if (avp2 == null) {
            return;
        }
        if (avp2 instanceof avs) {
            this.b((avs)avp2, n, n2, n3);
        }
    }

    private void b(avs avs2, int n, int n2, int n3) {
        avs2.a(n, n2);
    }

    static /* synthetic */ avp a(awg.d d2) {
        return d2.b;
    }

    static /* synthetic */ avp b(awg.d d2) {
        return d2.c;
    }

    static /* synthetic */ avp c(awg.d d2) {
        return d2.d;
    }
}
