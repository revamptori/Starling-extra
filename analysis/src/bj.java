/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Random
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import net.minecraft.server.MinecraftServer;

public class bj
extends i {
    @Override
    public String c() {
        return "spreadplayers";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(m m2) {
        return "commands.spreadplayers.usage";
    }

    @Override
    public void a(m m2, String[] stringArray) throws bz {
        if (stringArray.length < 6) {
            throw new cf("commands.spreadplayers.usage", new Object[0]);
        }
        int n2 = 0;
        cj \u26032 = m2.c();
        double \u26033 = bj.b(\u26032.n(), stringArray[n2++], true);
        double \u26034 = bj.b(\u26032.p(), stringArray[n2++], true);
        double \u26035 = bj.a(stringArray[n2++], 0.0);
        double \u26036 = bj.a(stringArray[n2++], \u26035 + 1.0);
        boolean \u26037 = bj.d(stringArray[n2++]);
        ArrayList \u26038 = Lists.newArrayList();
        while (n2 < stringArray.length) {
            String string;
            Object \u26039;
            if (o.b(string = stringArray[n2++])) {
                \u26039 = o.b(m2, string, pk.class);
                if (\u26039.size() == 0) {
                    throw new ca();
                }
                \u26038.addAll(\u26039);
                continue;
            }
            \u26039 = MinecraftServer.N().ap().a(string);
            if (\u26039 == null) {
                throw new cd();
            }
            \u26038.add(\u26039);
        }
        m2.a(n.a.c, \u26038.size());
        if (\u26038.isEmpty()) {
            throw new ca();
        }
        m2.a(new fb("commands.spreadplayers.spreading." + (\u26037 ? "teams" : "players"), \u26038.size(), \u26036, \u26033, \u26034, \u26035));
        this.a(m2, (List<pk>)\u26038, new a(\u26033, \u26034), \u26035, \u26036, ((pk)\u26038.get((int)0)).o, \u26037);
    }

    private void a(m m2, List<pk> list, a a2, double d, double d2, adm adm2, boolean bl) throws bz {
        Random random = new Random();
        double \u26032 = a2.a - d2;
        double \u26033 = a2.b - d2;
        double \u26034 = a2.a + d2;
        double \u26035 = a2.b + d2;
        a[] \u26036 = this.a(random, bl ? this.b(list) : list.size(), \u26032, \u26033, \u26034, \u26035);
        int \u26037 = this.a(a2, d, adm2, random, \u26032, \u26033, \u26034, \u26035, \u26036, bl);
        double \u26038 = this.a(list, adm2, \u26036, bl);
        bj.a(m2, (k)this, "commands.spreadplayers.success." + (bl ? "teams" : "players"), \u26036.length, a2.a, a2.b);
        if (\u26036.length > 1) {
            m2.a(new fb("commands.spreadplayers.info." + (bl ? "teams" : "players"), String.format((String)"%.2f", (Object[])new Object[]{\u26038}), \u26037));
        }
    }

    private int b(List<pk> list) {
        HashSet hashSet = Sets.newHashSet();
        for (pk pk2 : list) {
            if (pk2 instanceof wn) {
                hashSet.add((Object)((wn)pk2).bO());
                continue;
            }
            hashSet.add(null);
        }
        return hashSet.size();
    }

    private int a(a a2, double d, adm adm2, Random random, double d2, double d3, double d4, double d5, a[] aArray, boolean bl) throws bz {
        int n2;
        \u26035 = true;
        double \u26032 = 3.4028234663852886E38;
        for (n2 = 0; n2 < 10000 && \u26035; ++n2) {
            boolean \u26035 = false;
            \u26032 = 3.4028234663852886E38;
            for (int j = 0; j < aArray.length; ++j) {
                a a3 = aArray[j];
                int \u26033 = 0;
                a5 = new a();
                for (int i2 = 0; i2 < aArray.length; ++i2) {
                    if (j == i2) continue;
                    a a4 = aArray[i2];
                    double \u26034 = a3.a(a4);
                    \u26032 = Math.min((double)\u26034, (double)\u26032);
                    if (!(\u26034 < d)) continue;
                    ++\u26033;
                    a5.a += a4.a - a3.a;
                    a5.b += a4.b - a3.b;
                }
                if (\u26033 > 0) {
                    a5.a /= (double)\u26033;
                    a5.b /= (double)\u26033;
                    double d6 = a5.b();
                    if (d6 > 0.0) {
                        a5.a();
                        a3.b(a5);
                    } else {
                        a3.a(random, d2, d3, d4, d5);
                    }
                    \u26035 = true;
                }
                if (!a3.a(d2, d3, d4, d5)) continue;
                \u26035 = true;
            }
            if (\u26035) continue;
            for (a a5 : aArray) {
                if (a5.b(adm2)) continue;
                a5.a(random, d2, d3, d4, d5);
                \u26035 = true;
            }
        }
        if (n2 >= 10000) {
            throw new bz("commands.spreadplayers.failure." + (bl ? "teams" : "players"), aArray.length, a2.a, a2.b, String.format((String)"%.2f", (Object[])new Object[]{\u26032}));
        }
        return n2;
    }

    private double a(List<pk> list2, adm adm2, a[] aArray2, boolean bl) {
        List<pk> list2;
        double d = 0.0;
        int \u26032 = 0;
        HashMap \u26033 = Maps.newHashMap();
        for (int j = 0; j < list2.size(); ++j) {
            a \u26034;
            pk pk2 = (pk)list2.get(j);
            if (bl) {
                auq auq2 = \u2603 = pk2 instanceof wn ? ((wn)pk2).bO() : null;
                if (!\u26033.containsKey((Object)\u2603)) {
                    \u26033.put((Object)\u2603, (Object)aArray2[\u26032++]);
                }
                \u26034 = (a)\u26033.get((Object)\u2603);
            } else {
                a[] aArray2;
                \u26034 = aArray2[\u26032++];
            }
            pk2.a((double)((float)ns.c(\u26034.a) + 0.5f), (double)\u26034.a(adm2), (double)ns.c(\u26034.b) + 0.5);
            double d2 = Double.MAX_VALUE;
            for (int i2 = 0; i2 < aArray2.length; ++i2) {
                if (\u26034 == aArray2[i2]) continue;
                double d3 = \u26034.a(aArray2[i2]);
                d2 = Math.min((double)d3, (double)d2);
            }
            d += d2;
        }
        return d /= (double)list2.size();
    }

    private a[] a(Random random, int n2, double d, double d2, double d3, double d4) {
        a[] aArray = new a[n2];
        for (int j = 0; j < aArray.length; ++j) {
            a a2 = new a();
            a2.a(random, d, d2, d3, d4);
            aArray[j] = a2;
        }
        return aArray;
    }

    @Override
    public List<String> a(m m2, String[] stringArray, cj cj2) {
        if (stringArray.length >= 1 && stringArray.length <= 2) {
            return bj.b(stringArray, 0, cj2);
        }
        return null;
    }

    static class a {
        double a;
        double b;

        a() {
        }

        a(double d, double d2) {
            this.a = d;
            this.b = d2;
        }

        double a(a a2) {
            double d = this.a - a2.a;
            \u2603 = this.b - a2.b;
            return Math.sqrt((double)(d * d + \u2603 * \u2603));
        }

        void a() {
            double d = this.b();
            this.a /= d;
            this.b /= d;
        }

        float b() {
            return ns.a(this.a * this.a + this.b * this.b);
        }

        public void b(a a2) {
            this.a -= a2.a;
            this.b -= a2.b;
        }

        public boolean a(double d, double d2, double d3, double d4) {
            boolean bl = false;
            if (this.a < d) {
                this.a = d;
                bl = true;
            } else if (this.a > d3) {
                this.a = d3;
                bl = true;
            }
            if (this.b < d2) {
                this.b = d2;
                bl = true;
            } else if (this.b > d4) {
                this.b = d4;
                bl = true;
            }
            return bl;
        }

        public int a(adm adm2) {
            cj cj2 = new cj(this.a, 256.0, this.b);
            while (cj2.o() > 0) {
                if (adm2.p(cj2 = cj2.b()).c().t() == arm.a) continue;
                return cj2.o() + 1;
            }
            return 257;
        }

        public boolean b(adm adm2) {
            cj cj2 = new cj(this.a, 256.0, this.b);
            while (cj2.o() > 0) {
                arm arm2 = adm2.p(cj2 = cj2.b()).c().t();
                if (arm2 == arm.a) continue;
                return !arm2.d() && arm2 != arm.o;
            }
            return false;
        }

        public void a(Random random, double d, double d2, double d3, double d4) {
            this.a = ns.a(random, d, d3);
            this.b = ns.a(random, d2, d4);
        }
    }
}
