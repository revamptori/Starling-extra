/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Random
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ack {
    private static final Random a = new Random();
    private static final e b = new e();
    private static final d c = new d();
    private static final b d = new b();
    private static final a e = new a();

    public static int a(int n, zx zx2) {
        if (zx2 == null) {
            return 0;
        }
        du du2 = zx2.p();
        if (du2 == null) {
            return 0;
        }
        for (int i = 0; i < du2.c(); ++i) {
            short s = du2.b(i).e("id");
            \u2603 = du2.b(i).e("lvl");
            if (s != n) continue;
            return \u2603;
        }
        return 0;
    }

    public static Map<Integer, Integer> a(zx zx2) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        du du2 = \u2603 = zx2.b() == zy.cd ? zy.cd.h(zx2) : zx2.p();
        if (\u2603 != null) {
            for (int i = 0; i < \u2603.c(); ++i) {
                short s = \u2603.b(i).e("id");
                \u2603 = \u2603.b(i).e("lvl");
                linkedHashMap.put((Object)s, (Object)\u2603);
            }
        }
        return linkedHashMap;
    }

    public static void a(Map<Integer, Integer> map, zx zx2) {
        du du2 = new du();
        Iterator \u26032 = map.keySet().iterator();
        while (\u26032.hasNext()) {
            int n = (Integer)\u26032.next();
            aci \u26033 = aci.c(n);
            if (\u26033 == null) continue;
            dn \u26034 = new dn();
            \u26034.a("id", (short)n);
            \u26034.a("lvl", (short)((Integer)map.get((Object)n)).intValue());
            du2.a(\u26034);
            if (zx2.b() != zy.cd) continue;
            zy.cd.a(zx2, new acl(\u26033, (Integer)map.get((Object)n)));
        }
        if (du2.c() > 0) {
            if (zx2.b() != zy.cd) {
                zx2.a("ench", du2);
            }
        } else if (zx2.n()) {
            zx2.o().o("ench");
        }
    }

    public static int a(int n, zx[] zxArray) {
        if (zxArray == null) {
            return 0;
        }
        int n2 = 0;
        for (zx zx2 : zxArray) {
            int n3 = ack.a(n, zx2);
            if (n3 <= n2) continue;
            n2 = n3;
        }
        return n2;
    }

    private static void a(c c2, zx zx2) {
        if (zx2 == null) {
            return;
        }
        du du2 = zx2.p();
        if (du2 == null) {
            return;
        }
        for (int i = 0; i < du2.c(); ++i) {
            short s = du2.b(i).e("id");
            \u2603 = du2.b(i).e("lvl");
            if (aci.c(s) == null) continue;
            c2.a(aci.c(s), \u2603);
        }
    }

    private static void a(c c2, zx[] zxArray) {
        for (zx zx2 : zxArray) {
            ack.a(c2, zx2);
        }
    }

    public static int a(zx[] zxArray, ow ow2) {
        ack.b.a = 0;
        ack.b.b = ow2;
        ack.a((c)b, zxArray);
        if (ack.b.a > 25) {
            ack.b.a = 25;
        } else if (ack.b.a < 0) {
            ack.b.a = 0;
        }
        return (ack.b.a + 1 >> 1) + a.nextInt((ack.b.a >> 1) + 1);
    }

    public static float a(zx zx2, pw pw2) {
        ack.c.a = 0.0f;
        ack.c.b = pw2;
        ack.a((c)c, zx2);
        return ack.c.a;
    }

    public static void a(pr pr2, pk pk2) {
        ack.d.b = pk2;
        ack.d.a = pr2;
        if (pr2 != null) {
            ack.a((c)d, pr2.as());
        }
        if (pk2 instanceof wn) {
            ack.a((c)d, pr2.bA());
        }
    }

    public static void b(pr pr2, pk pk2) {
        ack.e.a = pr2;
        ack.e.b = pk2;
        if (pr2 != null) {
            ack.a((c)e, pr2.as());
        }
        if (pr2 instanceof wn) {
            ack.a((c)e, pr2.bA());
        }
    }

    public static int a(pr pr2) {
        return ack.a(aci.o.B, pr2.bA());
    }

    public static int b(pr pr2) {
        return ack.a(aci.p.B, pr2.bA());
    }

    public static int a(pk pk2) {
        return ack.a(aci.h.B, pk2.as());
    }

    public static int b(pk pk2) {
        return ack.a(aci.k.B, pk2.as());
    }

    public static int c(pr pr2) {
        return ack.a(aci.r.B, pr2.bA());
    }

    public static boolean e(pr pr2) {
        return ack.a(aci.s.B, pr2.bA()) > 0;
    }

    public static int f(pr pr2) {
        return ack.a(aci.u.B, pr2.bA());
    }

    public static int g(pr pr2) {
        return ack.a(aci.z.B, pr2.bA());
    }

    public static int h(pr pr2) {
        return ack.a(aci.A.B, pr2.bA());
    }

    public static int i(pr pr2) {
        return ack.a(aci.q.B, pr2.bA());
    }

    public static boolean j(pr pr2) {
        return ack.a(aci.i.B, pr2.as()) > 0;
    }

    public static zx a(aci aci2, pr pr2) {
        for (zx zx2 : pr2.as()) {
            if (zx2 == null || ack.a(aci2.B, zx2) <= 0) continue;
            return zx2;
        }
        return null;
    }

    public static int a(Random random2, int n2, int n32, zx zx2) {
        Random random2;
        zw zw2 = zx2.b();
        int \u26032 = zw2.b();
        if (\u26032 <= 0) {
            return 0;
        }
        if (n32 > 15) {
            int n32 = 15;
        }
        int \u26033 = random2.nextInt(8) + 1 + (n32 >> 1) + random2.nextInt(n32 + 1);
        if (n2 == 0) {
            return Math.max((int)(\u26033 / 3), (int)1);
        }
        if (n2 == 1) {
            return \u26033 * 2 / 3 + 1;
        }
        return Math.max((int)\u26033, (int)(n32 * 2));
    }

    public static zx a(Random random, zx zx22, int n2) {
        zx zx22;
        List<acl> list = ack.b(random, zx22, n2);
        boolean bl = \u2603 = zx22.b() == zy.aL;
        if (\u2603) {
            zx22.a(zy.cd);
        }
        if (list != null) {
            for (acl acl2 : list) {
                if (\u2603) {
                    zy.cd.a(zx22, acl2);
                    continue;
                }
                zx22.a(acl2.b, acl2.c);
            }
        }
        return zx22;
    }

    public static List<acl> b(Random random2, zx zx2, int n2) {
        zw zw2 = zx2.b();
        int \u26032 = zw2.b();
        if (\u26032 <= 0) {
            return null;
        }
        \u26032 /= 2;
        int \u26033 = (\u26032 = 1 + random2.nextInt((\u26032 >> 1) + 1) + random2.nextInt((\u26032 >> 1) + 1)) + n2;
        int \u26034 = (int)((float)\u26033 * (1.0f + (\u2603 = (random2.nextFloat() + random2.nextFloat() - 1.0f) * 0.15f)) + 0.5f);
        if (\u26034 < 1) {
            \u26034 = 1;
        }
        ArrayList \u26035 = null;
        Map<Integer, acl> \u26036 = ack.b(\u26034, zx2);
        if (\u26036 != null && !\u26036.isEmpty() && (\u2603 = (acl)oa.a(random2, \u26036.values())) != null) {
            \u26035 = Lists.newArrayList();
            \u26035.add((Object)\u2603);
            for (int i = \u26034; random2.nextInt(50) <= i; i >>= 1) {
                Random random2;
                Object \u26038;
                Iterator iterator = \u26036.keySet().iterator();
                while (iterator.hasNext()) {
                    \u26038 = (Integer)iterator.next();
                    boolean \u26037 = true;
                    for (acl acl2 : \u26035) {
                        if (acl2.b.a(aci.c(\u26038))) continue;
                        \u26037 = false;
                        break;
                    }
                    if (\u26037) continue;
                    iterator.remove();
                }
                if (\u26036.isEmpty()) continue;
                \u26038 = (acl)oa.a(random2, \u26036.values());
                \u26035.add(\u26038);
            }
        }
        return \u26035;
    }

    public static Map<Integer, acl> b(int n2, zx zx2) {
        zw zw2 = zx2.b();
        HashMap \u26032 = null;
        boolean \u26033 = zx2.b() == zy.aL;
        for (aci aci2 : aci.b) {
            if (aci2 == null || !aci2.C.a(zw2) && !\u26033) continue;
            for (int i = aci2.e(); i <= aci2.b(); ++i) {
                if (n2 < aci2.a(i) || n2 > aci2.b(i)) continue;
                if (\u26032 == null) {
                    \u26032 = Maps.newHashMap();
                }
                \u26032.put((Object)aci2.B, (Object)new acl(aci2, i));
            }
        }
        return \u26032;
    }

    static final class a
    implements c {
        public pr a;
        public pk b;

        private a() {
        }

        @Override
        public void a(aci aci2, int n) {
            aci2.a(this.a, this.b, n);
        }
    }

    static final class b
    implements c {
        public pr a;
        public pk b;

        private b() {
        }

        @Override
        public void a(aci aci2, int n) {
            aci2.b(this.a, this.b, n);
        }
    }

    static final class d
    implements c {
        public float a;
        public pw b;

        private d() {
        }

        @Override
        public void a(aci aci2, int n) {
            this.a += aci2.a(n, this.b);
        }
    }

    static final class e
    implements c {
        public int a;
        public ow b;

        private e() {
        }

        @Override
        public void a(aci aci2, int n) {
            this.a += aci2.a(n, this.b);
        }
    }

    static interface c {
        public void a(aci var1, int var2);
    }
}
