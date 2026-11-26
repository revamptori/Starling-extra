/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Short
 *  java.lang.String
 */
public class abc
extends zw {
    public abc() {
        this.c(1);
    }

    @Override
    public zx a(zx zx2, adm adm2, wn wn2) {
        wn2.a(zx2);
        wn2.b(na.ad[zw.b(this)]);
        return zx2;
    }

    public static boolean b(dn dn2) {
        if (dn2 == null) {
            return false;
        }
        if (!dn2.b("pages", 9)) {
            return false;
        }
        du du2 = dn2.c("pages", 8);
        for (int i = 0; i < du2.c(); ++i) {
            String string = du2.f(i);
            if (string == null) {
                return false;
            }
            if (string.length() <= Short.MAX_VALUE) continue;
            return false;
        }
        return true;
    }
}
