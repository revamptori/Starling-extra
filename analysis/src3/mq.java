/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class mq
extends mw {
    public final int a;
    public final int b;
    public final mq c;
    private final String k;
    private ms l;
    public final zx d;
    private boolean m;

    public mq(String string, String string2, int n, int n2, zw zw2, mq mq2) {
        this(string, string2, n, n2, new zx(zw2), mq2);
    }

    public mq(String string, String string2, int n, int n2, afh afh2, mq mq2) {
        this(string, string2, n, n2, new zx(afh2), mq2);
    }

    public mq(String string, String string2, int n, int n2, zx zx2, mq mq2) {
        super(string, new fb("achievement." + string2, new Object[0]));
        this.d = zx2;
        this.k = "achievement." + string2 + ".desc";
        this.a = n;
        this.b = n2;
        if (n < mr.a) {
            mr.a = n;
        }
        if (n2 < mr.b) {
            mr.b = n2;
        }
        if (n > mr.c) {
            mr.c = n;
        }
        if (n2 > mr.d) {
            mr.d = n2;
        }
        this.c = mq2;
    }

    public mq a() {
        this.f = true;
        return this;
    }

    public mq b() {
        this.m = true;
        return this;
    }

    public mq c() {
        super.h();
        mr.e.add((Object)this);
        return this;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public eu e() {
        eu eu2 = super.e();
        eu2.b().a(this.g() ? a.f : a.k);
        return eu2;
    }

    public mq a(Class<? extends mz> clazz) {
        return (mq)super.b(clazz);
    }

    public String f() {
        if (this.l != null) {
            return this.l.a(di.a(this.k));
        }
        return di.a(this.k);
    }

    public mq a(ms ms2) {
        this.l = ms2;
        return this;
    }

    public boolean g() {
        return this.m;
    }

    public /* synthetic */ mw b(Class clazz) {
        return this.a((Class<? extends mz>)clazz);
    }

    @Override
    public /* synthetic */ mw h() {
        return this.c();
    }

    @Override
    public /* synthetic */ mw i() {
        return this.a();
    }
}
