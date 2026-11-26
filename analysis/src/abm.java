/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.ArrayList
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;

public class abm
implements abs {
    private zx a;

    @Override
    public boolean a(xp xp2, adm adm2) {
        int n;
        int n2;
        Object \u26032;
        this.a = null;
        int n3 = 0;
        n = 0;
        n2 = 0;
        \u2603 = 0;
        \u2603 = 0;
        \u2603 = 0;
        for (\u2603 = 0; \u2603 < xp2.o_(); ++\u2603) {
            \u26032 = xp2.a(\u2603);
            if (\u26032 == null) continue;
            if (((zx)\u26032).b() == zy.H) {
                ++n;
                continue;
            }
            if (((zx)\u26032).b() == zy.cc) {
                ++\u2603;
                continue;
            }
            if (((zx)\u26032).b() == zy.aW) {
                ++n2;
                continue;
            }
            if (((zx)\u26032).b() == zy.aK) {
                ++n3;
                continue;
            }
            if (((zx)\u26032).b() == zy.aT) {
                ++\u2603;
                continue;
            }
            if (((zx)\u26032).b() == zy.i) {
                ++\u2603;
                continue;
            }
            if (((zx)\u26032).b() == zy.bL) {
                ++\u2603;
                continue;
            }
            if (((zx)\u26032).b() == zy.G) {
                ++\u2603;
                continue;
            }
            if (((zx)\u26032).b() == zy.bx) {
                ++\u2603;
                continue;
            }
            if (((zx)\u26032).b() == zy.bX) {
                ++\u2603;
                continue;
            }
            return false;
        }
        \u2603 += n2 + \u2603;
        if (n > 3 || n3 > 1) {
            return false;
        }
        if (n >= 1 && n3 == 1 && \u2603 == 0) {
            this.a = new zx(zy.cb);
            if (\u2603 > 0) {
                dn dn2 = new dn();
                \u26032 = new dn();
                du \u26033 = new du();
                for (int i = 0; i < xp2.o_(); ++i) {
                    zx zx2 = xp2.a(i);
                    if (zx2 == null || zx2.b() != zy.cc || !zx2.n() || !zx2.o().b("Explosion", 10)) continue;
                    \u26033.a(zx2.o().m("Explosion"));
                }
                ((dn)\u26032).a("Explosions", \u26033);
                ((dn)\u26032).a("Flight", (byte)n);
                dn2.a("Fireworks", (eb)\u26032);
                this.a.d(dn2);
            }
            return true;
        }
        if (n == 1 && n3 == 0 && \u2603 == 0 && n2 > 0 && \u2603 <= 1) {
            this.a = new zx(zy.cc);
            dn dn3 = new dn();
            \u26032 = new dn();
            int \u26034 = 0;
            ArrayList \u26035 = Lists.newArrayList();
            for (int i = 0; i < xp2.o_(); ++i) {
                zx zx3 = xp2.a(i);
                if (zx3 == null) continue;
                if (zx3.b() == zy.aW) {
                    \u26035.add((Object)ze.a[zx3.i() & 0xF]);
                    continue;
                }
                if (zx3.b() == zy.aT) {
                    ((dn)\u26032).a("Flicker", true);
                    continue;
                }
                if (zx3.b() == zy.i) {
                    ((dn)\u26032).a("Trail", true);
                    continue;
                }
                if (zx3.b() == zy.bL) {
                    \u26034 = 1;
                    continue;
                }
                if (zx3.b() == zy.G) {
                    \u26034 = 4;
                    continue;
                }
                if (zx3.b() == zy.bx) {
                    \u26034 = 2;
                    continue;
                }
                if (zx3.b() != zy.bX) continue;
                \u26034 = 3;
            }
            int[] nArray = new int[\u26035.size()];
            for (int i = 0; i < nArray.length; ++i) {
                nArray[i] = (Integer)\u26035.get(i);
            }
            ((dn)\u26032).a("Colors", nArray);
            ((dn)\u26032).a("Type", (byte)\u26034);
            dn3.a("Explosion", (eb)\u26032);
            this.a.d(dn3);
            return true;
        }
        if (n == 0 && n3 == 0 && \u2603 == 1 && n2 > 0 && n2 == \u2603) {
            dn dn4;
            ArrayList arrayList = Lists.newArrayList();
            for (int i = 0; i < xp2.o_(); ++i) {
                zx zx4 = xp2.a(i);
                if (zx4 == null) continue;
                if (zx4.b() == zy.aW) {
                    arrayList.add((Object)ze.a[zx4.i() & 0xF]);
                    continue;
                }
                if (zx4.b() != zy.cc) continue;
                this.a = zx4.k();
                this.a.b = 1;
            }
            int[] \u26036 = new int[arrayList.size()];
            for (int i = 0; i < \u26036.length; ++i) {
                \u26036[i] = (Integer)arrayList.get(i);
            }
            if (this.a != null && this.a.n()) {
                dn4 = this.a.o().m("Explosion");
                if (dn4 == null) {
                    return false;
                }
            } else {
                return false;
            }
            dn4.a("FadeColors", \u26036);
            return true;
        }
        return false;
    }

    @Override
    public zx a(xp xp2) {
        return this.a.k();
    }

    @Override
    public int a() {
        return 10;
    }

    @Override
    public zx b() {
        return this.a;
    }

    @Override
    public zx[] b(xp xp2) {
        zx[] zxArray = new zx[xp2.o_()];
        for (int i = 0; i < zxArray.length; ++i) {
            zx zx2 = xp2.a(i);
            if (zx2 == null || !zx2.b().r()) continue;
            zxArray[i] = new zx(zx2.b().q());
        }
        return zxArray;
    }
}
