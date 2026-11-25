/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class bjm<T extends va>
extends biv<T> {
    private static final jy e = new jy("textures/entity/minecart.png");
    protected bbo a = new bbn();

    public bjm(biu biu2) {
        super(biu2);
        this.c = 0.5f;
    }

    @Override
    public void a(T t2, double d22, double d3, double d4, float f22, float f3) {
        T t2;
        double d22;
        bfl.E();
        this.c(t2);
        long l2 = (long)((pk)t2).F() * 493286711L;
        l2 = l2 * l2 * 4392167121L + l2 * 98761L;
        float \u26032 = (((float)(l2 >> 16 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float \u26033 = (((float)(l2 >> 20 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        float \u26034 = (((float)(l2 >> 24 & 7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        bfl.b(\u26032, \u26033, \u26034);
        double \u26035 = ((va)t2).P + (((va)t2).s - ((va)t2).P) * (double)f3;
        double \u26036 = ((va)t2).Q + (((va)t2).t - ((va)t2).Q) * (double)f3;
        double \u26037 = ((va)t2).R + (((va)t2).u - ((va)t2).R) * (double)f3;
        double \u26038 = 0.3f;
        aui \u26039 = ((va)t2).k(\u26035, \u26036, \u26037);
        float \u260310 = ((va)t2).B + (((va)t2).z - ((va)t2).B) * f3;
        if (\u26039 != null) {
            aui aui2 = ((va)t2).a(\u26035, \u26036, \u26037, \u26038);
            \u2603 = ((va)t2).a(\u26035, \u26036, \u26037, -\u26038);
            if (aui2 == null) {
                aui2 = \u26039;
            }
            if (\u2603 == null) {
                \u2603 = \u26039;
            }
            d22 += \u26039.a - \u26035;
            d3 += (aui2.b + \u2603.b) / 2.0 - \u26036;
            d4 += \u26039.c - \u26037;
            \u2603 = \u2603.b(-aui2.a, -aui2.b, -aui2.c);
            if (\u2603.b() != 0.0) {
                \u2603 = \u2603.a();
                float f22 = (float)(Math.atan2((double)\u2603.c, (double)\u2603.a) * 180.0 / Math.PI);
                \u260310 = (float)(Math.atan((double)\u2603.b) * 73.0);
            }
        }
        bfl.b((float)d22, (float)d3 + 0.375f, (float)d4);
        bfl.b(180.0f - f22, 0.0f, 1.0f, 0.0f);
        bfl.b(-\u260310, 0.0f, 0.0f, 1.0f);
        float \u260311 = (float)((va)t2).q() - f3;
        float \u260312 = ((va)t2).p() - f3;
        if (\u260312 < 0.0f) {
            \u260312 = 0.0f;
        }
        if (\u260311 > 0.0f) {
            bfl.b(ns.a(\u260311) * \u260311 * \u260312 / 10.0f * (float)((va)t2).r(), 1.0f, 0.0f, 0.0f);
        }
        int \u260313 = ((va)t2).v();
        alz \u260314 = ((va)t2).t();
        if (\u260314.c().b() != -1) {
            bfl.E();
            this.a(bmh.g);
            float f4 = 0.75f;
            bfl.a(f4, f4, f4);
            bfl.b(-0.5f, (float)(\u260313 - 8) / 16.0f, 0.5f);
            this.a(t2, f3, \u260314);
            bfl.F();
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.c(t2);
        }
        bfl.a(-1.0f, -1.0f, 1.0f);
        this.a.a((pk)t2, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        bfl.F();
        super.a(t2, d22, d3, d4, f22, f3);
    }

    @Override
    protected jy a(T t) {
        return e;
    }

    protected void a(T t, float f2, alz alz2) {
        bfl.E();
        ave.A().ae().a(alz2, ((pk)t).c(f2));
        bfl.F();
    }
}
