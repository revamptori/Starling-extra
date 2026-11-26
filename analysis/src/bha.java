/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class bha
extends bhd<aku> {
    private static final Map<String, a> c = Maps.newHashMap();
    private static final jy d = new jy("textures/entity/banner_base.png");
    private bau e = new bau();

    @Override
    public void a(aku aku2, double d2, double d3, double d4, float f2, int n2) {
        float \u26035;
        boolean bl = aku2.z() != null;
        \u2603 = !bl || aku2.w() == afi.cK;
        int \u26032 = bl ? aku2.u() : 0;
        long \u26033 = bl ? aku2.z().K() : 0L;
        bfl.E();
        float \u26034 = 0.6666667f;
        if (\u2603) {
            bfl.b((float)d2 + 0.5f, (float)d3 + 0.75f * \u26034, (float)d4 + 0.5f);
            float f3 = (float)(\u26032 * 360) / 16.0f;
            bfl.b(-f3, 0.0f, 1.0f, 0.0f);
            this.e.b.j = true;
        } else {
            int n3 = \u26032;
            \u26035 = 0.0f;
            if (n3 == 2) {
                \u26035 = 180.0f;
            }
            if (n3 == 4) {
                \u26035 = 90.0f;
            }
            if (n3 == 5) {
                \u26035 = -90.0f;
            }
            bfl.b((float)d2 + 0.5f, (float)d3 - 0.25f * \u26034, (float)d4 + 0.5f);
            bfl.b(-\u26035, 0.0f, 1.0f, 0.0f);
            bfl.b(0.0f, -0.3125f, -0.4375f);
            this.e.b.j = false;
        }
        cj cj2 = aku2.v();
        \u26035 = (float)(cj2.n() * 7 + cj2.o() * 9 + cj2.p() * 13) + (float)\u26033 + f2;
        this.e.a.f = (-0.0125f + 0.01f * ns.b(\u26035 * (float)Math.PI * 0.02f)) * (float)Math.PI;
        bfl.B();
        jy \u26036 = this.a(aku2);
        if (\u26036 != null) {
            this.a(\u26036);
            bfl.E();
            bfl.a(\u26034, -\u26034, -\u26034);
            this.e.a();
            bfl.F();
        }
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.F();
    }

    private jy a(aku aku22) {
        String string = aku22.g();
        if (string.isEmpty()) {
            return null;
        }
        a \u26032 = (a)c.get((Object)string);
        if (\u26032 == null) {
            aku aku22;
            Iterator \u26033;
            if (c.size() >= 256) {
                long l2 = System.currentTimeMillis();
                \u26033 = c.keySet().iterator();
                while (\u26033.hasNext()) {
                    Object object = (String)\u26033.next();
                    object = (a)c.get(object);
                    if (l2 - ((a)object).a <= 60000L) continue;
                    ave.A().P().c(((a)object).b);
                    \u26033.remove();
                }
                if (c.size() >= 256) {
                    return null;
                }
            }
            List<aku.a> \u26034 = aku22.c();
            List<zd> \u26035 = aku22.e();
            \u26033 = Lists.newArrayList();
            for (Object object : \u26034) {
                \u26033.add((Object)("textures/entity/banner/" + ((aku.a)((Object)object)).a() + ".png"));
            }
            \u26032 = new a();
            \u26032.b = new jy(string);
            ave.A().P().a(\u26032.b, new bmc(d, (List<String>)\u26033, \u26035));
            c.put((Object)string, (Object)\u26032);
        }
        \u26032.a = System.currentTimeMillis();
        return \u26032.b;
    }

    static class a {
        public long a;
        public jy b;

        private a() {
        }
    }
}
