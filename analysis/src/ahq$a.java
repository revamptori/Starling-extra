/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public static class ahq.a
extends akw {
    private zx a;

    @Override
    public void a(dn dn2) {
        super.a(dn2);
        if (dn2.b("RecordItem", 10)) {
            this.a(zx.a(dn2.m("RecordItem")));
        } else if (dn2.f("Record") > 0) {
            this.a(new zx(zw.b(dn2.f("Record")), 1, 0));
        }
    }

    @Override
    public void b(dn dn2) {
        super.b(dn2);
        if (this.a() != null) {
            dn2.a("RecordItem", this.a().b(new dn()));
        }
    }

    public zx a() {
        return this.a;
    }

    public void a(zx zx2) {
        this.a = zx2;
        this.p_();
    }
}
