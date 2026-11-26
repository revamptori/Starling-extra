/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
import java.util.List;

public class zn
extends zw {
    @Override
    public int a(zx zx22, int n) {
        zx zx22;
        if (n == 1) {
            eb eb2 = zn.a(zx22, "Colors");
            if (eb2 instanceof ds) {
                ds ds2 = (ds)eb2;
                int[] \u26032 = ds2.c();
                if (\u26032.length == 1) {
                    return \u26032[0];
                }
                int \u26033 = 0;
                int \u26034 = 0;
                int \u26035 = 0;
                for (int n2 : \u26032) {
                    \u26033 += (n2 & 0xFF0000) >> 16;
                    \u26034 += (n2 & 0xFF00) >> 8;
                    \u26035 += (n2 & 0xFF) >> 0;
                }
                return (\u26033 /= \u26032.length) << 16 | (\u26034 /= \u26032.length) << 8 | (\u26035 /= \u26032.length);
            }
            return 0x8A8A8A;
        }
        return super.a(zx22, n);
    }

    public static eb a(zx zx2, String string) {
        if (zx2.n() && (\u2603 = zx2.o().m("Explosion")) != null) {
            return \u2603.a(string);
        }
        return null;
    }

    @Override
    public void a(zx zx2, wn wn2, List<String> list, boolean bl) {
        if (zx2.n() && (\u2603 = zx2.o().m("Explosion")) != null) {
            zn.a(\u2603, list);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(dn dn2, List<String> list2) {
        boolean bl;
        boolean bl2;
        int[] nArray;
        byte by = dn2.d("Type");
        if (by >= 0 && by <= 4) {
            list2.add((Object)di.a("item.fireworksCharge.type." + by).trim());
        } else {
            list2.add((Object)di.a("item.fireworksCharge.type").trim());
        }
        int[] \u26032 = dn2.l("Colors");
        if (\u26032.length > 0) {
            boolean bl22 = true;
            String \u26033 = "";
            for (int n2 : \u26032) {
                if (!bl22) {
                    \u26033 = \u26033 + ", ";
                }
                bl22 = false;
                boolean \u26034 = false;
                for (int n = 0; n < ze.a.length; ++n) {
                    if (n2 != ze.a[n]) continue;
                    \u26034 = true;
                    \u26033 = \u26033 + di.a("item.fireworksCharge." + zd.a(n).d());
                    break;
                }
                if (\u26034) continue;
                \u26033 = \u26033 + di.a("item.fireworksCharge.customColor");
            }
            list2.add((Object)\u26033);
        }
        if ((nArray = dn2.l("FadeColors")).length > 0) {
            void var6_11;
            boolean bl3 = true;
            String string = di.a("item.fireworksCharge.fadeTo") + " ";
            for (int n : nArray) {
                if (!bl3) {
                    String string2 = (String)var6_11 + ", ";
                }
                bl3 = false;
                boolean bl4 = false;
                for (int i = 0; i < 16; ++i) {
                    if (n != ze.a[i]) continue;
                    bl4 = true;
                    String string3 = (String)var6_11 + di.a("item.fireworksCharge." + zd.a(i).d());
                    break;
                }
                if (bl4) continue;
                String string4 = (String)var6_11 + di.a("item.fireworksCharge.customColor");
            }
            list2.add((Object)var6_11);
        }
        if (bl2 = dn2.n("Trail")) {
            list2.add((Object)di.a("item.fireworksCharge.trail"));
        }
        if (bl = dn2.n("Flicker")) {
            list2.add((Object)di.a("item.fireworksCharge.flicker"));
        }
    }
}
