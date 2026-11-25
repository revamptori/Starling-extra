/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
class avq.a {
    private final atg b;
    private final blz c;
    private final jy d;
    private final int[] e;

    private avq.a(atg atg2) {
        this.b = atg2;
        this.c = new blz(128, 128);
        this.e = this.c.e();
        this.d = avq.this.b.a("map/" + atg2.a, this.c);
        for (int i = 0; i < this.e.length; ++i) {
            this.e[i] = 0;
        }
    }

    private void a() {
        for (int i = 0; i < 16384; ++i) {
            \u2603 = this.b.f[i] & 0xFF;
            this.e[i] = \u2603 / 4 == 0 ? (i + i / 128 & 1) * 8 + 16 << 24 : arn.a[\u2603 / 4].a(\u2603 & 3);
        }
        this.c.d();
    }

    private void a(boolean bl) {
        int n2 = 0;
        \u2603 = 0;
        bfx \u26032 = bfx.a();
        bfd \u26033 = \u26032.c();
        float \u26034 = 0.0f;
        avq.this.b.a(this.d);
        bfl.l();
        bfl.a(1, 771, 0, 1);
        bfl.c();
        \u26033.a(7, bms.g);
        \u26033.b((double)((float)(n2 + 0) + \u26034), (double)((float)(\u2603 + 128) - \u26034), (double)-0.01f).a(0.0, 1.0).d();
        \u26033.b((double)((float)(n2 + 128) - \u26034), (double)((float)(\u2603 + 128) - \u26034), (double)-0.01f).a(1.0, 1.0).d();
        \u26033.b((double)((float)(n2 + 128) - \u26034), (double)((float)(\u2603 + 0) + \u26034), (double)-0.01f).a(1.0, 0.0).d();
        \u26033.b((double)((float)(n2 + 0) + \u26034), (double)((float)(\u2603 + 0) + \u26034), (double)-0.01f).a(0.0, 0.0).d();
        \u26032.b();
        bfl.d();
        bfl.k();
        avq.this.b.a(a);
        \u2603 = 0;
        for (atf atf2 : this.b.h.values()) {
            if (bl && atf2.a() != 1) continue;
            bfl.E();
            bfl.b((float)n2 + (float)atf2.b() / 2.0f + 64.0f, (float)\u2603 + (float)atf2.c() / 2.0f + 64.0f, -0.02f);
            bfl.b((float)(atf2.d() * 360) / 16.0f, 0.0f, 0.0f, 1.0f);
            bfl.a(4.0f, 4.0f, 3.0f);
            bfl.b(-0.125f, 0.125f, 0.0f);
            byte by = atf2.a();
            float \u26035 = (float)(by % 4 + 0) / 4.0f;
            float \u26036 = (float)(by / 4 + 0) / 4.0f;
            float \u26037 = (float)(by % 4 + 1) / 4.0f;
            float \u26038 = (float)(by / 4 + 1) / 4.0f;
            \u26033.a(7, bms.g);
            float \u26039 = -0.001f;
            \u26033.b(-1.0, 1.0, (double)((float)\u2603 * -0.001f)).a(\u26035, \u26036).d();
            \u26033.b(1.0, 1.0, (double)((float)\u2603 * -0.001f)).a(\u26037, \u26036).d();
            \u26033.b(1.0, -1.0, (double)((float)\u2603 * -0.001f)).a(\u26037, \u26038).d();
            \u26033.b(-1.0, -1.0, (double)((float)\u2603 * -0.001f)).a(\u26035, \u26038).d();
            \u26032.b();
            bfl.F();
            ++\u2603;
        }
        bfl.E();
        bfl.b(0.0f, 0.0f, -0.04f);
        bfl.a(1.0f, 1.0f, 1.0f);
        bfl.F();
    }

    static /* synthetic */ void a(avq.a a2) {
        a2.a();
    }

    static /* synthetic */ void a(avq.a a2, boolean bl) {
        a2.a(bl);
    }

    static /* synthetic */ jy b(avq.a a2) {
        return a2.d;
    }
}
