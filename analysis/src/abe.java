/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Map
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class abe {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    private static final Map<Integer, String> o;
    private static final Map<Integer, String> p;
    private static final Map<Integer, Integer> q;
    private static final String[] r;

    public static boolean a(int n, int n2) {
        return (n & 1 << n2) != 0;
    }

    private static int c(int n, int n2) {
        return abe.a(n, n2) ? 1 : 0;
    }

    private static int d(int n, int n2) {
        return abe.a(n, n2) ? 0 : 1;
    }

    public static int a(int n) {
        return abe.a(n, 5, 4, 3, 2, 1);
    }

    public static int a(Collection<pf> collection) {
        int n = 3694022;
        if (collection == null || collection.isEmpty()) {
            return n;
        }
        float \u26032 = 0.0f;
        float \u26033 = 0.0f;
        float \u26034 = 0.0f;
        float \u26035 = 0.0f;
        for (pf pf2 : collection) {
            if (!pf2.f()) continue;
            int n2 = pe.a[pf2.a()].k();
            for (\u2603 = 0; \u2603 <= pf2.c(); ++\u2603) {
                \u26032 += (float)(n2 >> 16 & 0xFF) / 255.0f;
                \u26033 += (float)(n2 >> 8 & 0xFF) / 255.0f;
                \u26034 += (float)(n2 >> 0 & 0xFF) / 255.0f;
                \u26035 += 1.0f;
            }
        }
        if (\u26035 == 0.0f) {
            return 0;
        }
        \u26032 = \u26032 / \u26035 * 255.0f;
        \u26033 = \u26033 / \u26035 * 255.0f;
        \u26034 = \u26034 / \u26035 * 255.0f;
        return (int)\u26032 << 16 | (int)\u26033 << 8 | (int)\u26034;
    }

    public static boolean b(Collection<pf> collection) {
        for (pf pf2 : collection) {
            if (pf2.e()) continue;
            return false;
        }
        return true;
    }

    public static int a(int n, boolean bl) {
        Integer n2 = nl.a(n);
        if (!bl) {
            if (q.containsKey((Object)n2)) {
                return (Integer)q.get((Object)n2);
            }
            int n3 = abe.a(abe.b(n2, false));
            q.put((Object)n2, (Object)n3);
            return n3;
        }
        return abe.a(abe.b(n2, true));
    }

    public static String c(int n) {
        \u2603 = abe.a(n);
        return r[\u2603];
    }

    private static int a(boolean bl, boolean bl2, boolean bl3, int n, int n2, int n3, int n4) {
        \u2603 = 0;
        if (bl) {
            \u2603 = abe.d(n4, n2);
        } else if (n != -1) {
            if (n == 0 && abe.h(n4) == n2) {
                \u2603 = 1;
            } else if (n == 1 && abe.h(n4) > n2) {
                \u2603 = 1;
            } else if (n == 2 && abe.h(n4) < n2) {
                \u2603 = 1;
            }
        } else {
            \u2603 = abe.c(n4, n2);
        }
        if (bl2) {
            \u2603 *= n3;
        }
        if (bl3) {
            \u2603 *= -1;
        }
        return \u2603;
    }

    private static int h(int n) {
        \u2603 = 0;
        while (n > 0) {
            n &= n - 1;
            ++\u2603;
        }
        return \u2603;
    }

    private static int a(String string, int n, int n2, int n3) {
        boolean \u26039;
        boolean \u26038;
        boolean \u26036;
        boolean \u260310;
        if (n >= string.length() || n2 < 0 || n >= n2) {
            return 0;
        }
        \u2603 = string.indexOf(124, n);
        if (\u2603 >= 0 && \u2603 < n2) {
            \u2603 = abe.a(string, n, \u2603 - 1, n3);
            if (\u2603 > 0) {
                return \u2603;
            }
            \u2603 = abe.a(string, \u2603 + 1, n2, n3);
            if (\u2603 > 0) {
                return \u2603;
            }
            return 0;
        }
        \u2603 = string.indexOf(38, n);
        if (\u2603 >= 0 && \u2603 < n2) {
            \u2603 = abe.a(string, n, \u2603 - 1, n3);
            if (\u2603 <= 0) {
                return 0;
            }
            \u2603 = abe.a(string, \u2603 + 1, n2, n3);
            if (\u2603 <= 0) {
                return 0;
            }
            if (\u2603 > \u2603) {
                return \u2603;
            }
            return \u2603;
        }
        boolean \u26037 = false;
        \u260310 = false;
        \u26036 = false;
        \u26038 = false;
        \u26039 = false;
        int \u26032 = -1;
        int \u26033 = 0;
        int \u26034 = 0;
        int \u26035 = 0;
        for (int i = n; i < n2; ++i) {
            char c = string.charAt(i);
            if (c >= '0' && c <= '9') {
                if (\u26037) {
                    \u26034 = c - 48;
                    \u260310 = true;
                    continue;
                }
                \u26033 *= 10;
                \u26033 += c - 48;
                \u26036 = true;
                continue;
            }
            if (c == '*') {
                \u26037 = true;
                continue;
            }
            if (c == '!') {
                if (\u26036) {
                    \u26035 += abe.a(\u26038, \u260310, \u26039, \u26032, \u26033, \u26034, n3);
                    \u26038 = false;
                    \u26039 = false;
                    \u26037 = false;
                    \u260310 = false;
                    \u26036 = false;
                    \u26034 = 0;
                    \u26033 = 0;
                    \u26032 = -1;
                }
                \u26038 = true;
                continue;
            }
            if (c == '-') {
                if (\u26036) {
                    \u26035 += abe.a(\u26038, \u260310, \u26039, \u26032, \u26033, \u26034, n3);
                    \u26038 = false;
                    \u26039 = false;
                    \u26037 = false;
                    \u260310 = false;
                    \u26036 = false;
                    \u26034 = 0;
                    \u26033 = 0;
                    \u26032 = -1;
                }
                \u26039 = true;
                continue;
            }
            if (c == '=' || c == '<' || c == '>') {
                if (\u26036) {
                    \u26035 += abe.a(\u26038, \u260310, \u26039, \u26032, \u26033, \u26034, n3);
                    \u26038 = false;
                    \u26039 = false;
                    \u26037 = false;
                    \u260310 = false;
                    \u26036 = false;
                    \u26034 = 0;
                    \u26033 = 0;
                    \u26032 = -1;
                }
                if (c == '=') {
                    \u26032 = 0;
                    continue;
                }
                if (c == '<') {
                    \u26032 = 2;
                    continue;
                }
                if (c != '>') continue;
                \u26032 = 1;
                continue;
            }
            if (c != '+' || !\u26036) continue;
            \u26035 += abe.a(\u26038, \u260310, \u26039, \u26032, \u26033, \u26034, n3);
            \u26038 = false;
            \u26039 = false;
            \u26037 = false;
            \u260310 = false;
            \u26036 = false;
            \u26034 = 0;
            \u26033 = 0;
            \u26032 = -1;
        }
        if (\u26036) {
            \u26035 += abe.a(\u26038, \u260310, \u26039, \u26032, \u26033, \u26034, n3);
        }
        return \u26035;
    }

    public static List<pf> b(int n, boolean bl) {
        ArrayList arrayList = null;
        for (pe pe22 : pe.a) {
            pe pe22;
            if (pe22 == null || pe22.j() && !bl || (\u2603 = (String)o.get((Object)pe22.d())) == null || (\u2603 = abe.a(\u2603, 0, \u2603.length(), n)) <= 0) continue;
            int n2 = 0;
            String \u26032 = (String)p.get((Object)pe22.d());
            if (\u26032 != null && (n2 = abe.a(\u26032, 0, \u26032.length(), n)) < 0) {
                n2 = 0;
            }
            if (pe22.b()) {
                \u2603 = 1;
            } else {
                \u2603 = 1200 * (\u2603 * 3 + (\u2603 - 1) * 2);
                \u2603 >>= n2;
                \u2603 = (int)Math.round((double)((double)\u2603 * pe22.h()));
                if ((n & 0x4000) != 0) {
                    \u2603 = (int)Math.round((double)((double)\u2603 * 0.75 + 0.5));
                }
            }
            if (arrayList == null) {
                arrayList = Lists.newArrayList();
            }
            pf \u26033 = new pf(pe22.d(), \u2603, n2);
            if ((n & 0x4000) != 0) {
                \u26033.a(true);
            }
            arrayList.add((Object)\u26033);
        }
        return arrayList;
    }

    private static int a(int n3, int n2, boolean bl, boolean bl2, boolean bl3) {
        int n3;
        if (bl3) {
            if (!abe.a(n3, n2)) {
                return 0;
            }
        } else {
            n3 = bl ? (n3 &= ~(1 << n2)) : (bl2 ? ((n3 & 1 << n2) == 0 ? (n3 |= 1 << n2) : (n3 &= ~(1 << n2))) : (n3 |= 1 << n2));
        }
        return n3;
    }

    public static int a(int n2, String string) {
        int n2;
        int n3 = 0;
        \u2603 = string.length();
        boolean \u26032 = false;
        boolean \u26033 = false;
        boolean \u26034 = false;
        boolean \u26035 = false;
        \u2603 = 0;
        for (\u2603 = n3; \u2603 < \u2603; ++\u2603) {
            char c = string.charAt(\u2603);
            if (c >= '0' && c <= '9') {
                \u2603 *= 10;
                \u2603 += c - 48;
                \u26032 = true;
                continue;
            }
            if (c == '!') {
                if (\u26032) {
                    n2 = abe.a(n2, \u2603, \u26034, \u26033, \u26035);
                    \u26035 = false;
                    \u26033 = false;
                    \u26034 = false;
                    \u26032 = false;
                    \u2603 = 0;
                }
                \u26033 = true;
                continue;
            }
            if (c == '-') {
                if (\u26032) {
                    n2 = abe.a(n2, \u2603, \u26034, \u26033, \u26035);
                    \u26035 = false;
                    \u26033 = false;
                    \u26034 = false;
                    \u26032 = false;
                    \u2603 = 0;
                }
                \u26034 = true;
                continue;
            }
            if (c == '+') {
                if (!\u26032) continue;
                n2 = abe.a(n2, \u2603, \u26034, \u26033, \u26035);
                \u26035 = false;
                \u26033 = false;
                \u26034 = false;
                \u26032 = false;
                \u2603 = 0;
                continue;
            }
            if (c != '&') continue;
            if (\u26032) {
                n2 = abe.a(n2, \u2603, \u26034, \u26033, \u26035);
                \u26035 = false;
                \u26033 = false;
                \u26034 = false;
                \u26032 = false;
                \u2603 = 0;
            }
            \u26035 = true;
        }
        if (\u26032) {
            n2 = abe.a(n2, \u2603, \u26034, \u26033, \u26035);
        }
        return n2 & Short.MAX_VALUE;
    }

    public static int a(int n, int n2, int n3, int n4, int n5, int n6) {
        return (abe.a(n, n2) ? 16 : 0) | (abe.a(n, n3) ? 8 : 0) | (abe.a(n, n4) ? 4 : 0) | (abe.a(n, n5) ? 2 : 0) | (abe.a(n, n6) ? 1 : 0);
    }

    static {
        o = Maps.newHashMap();
        p = Maps.newHashMap();
        a = null;
        c = "+0-1-2-3&4-4+13";
        o.put((Object)pe.l.d(), (Object)"0 & !1 & !2 & !3 & 0+6");
        b = "-0+1-2-3&4-4+13";
        o.put((Object)pe.c.d(), (Object)"!0 & 1 & !2 & !3 & 1+6");
        h = "+0+1-2-3&4-4+13";
        o.put((Object)pe.n.d(), (Object)"0 & 1 & !2 & !3 & 0+6");
        f = "+0-1+2-3&4-4+13";
        o.put((Object)pe.h.d(), (Object)"0 & !1 & 2 & !3");
        d = "-0-1+2-3&4-4+13";
        o.put((Object)pe.u.d(), (Object)"!0 & !1 & 2 & !3 & 2+6");
        e = "-0+3-4+13";
        o.put((Object)pe.t.d(), (Object)"!0 & !1 & !2 & 3 & 3+6");
        o.put((Object)pe.i.d(), (Object)"!0 & !1 & 2 & 3");
        o.put((Object)pe.d.d(), (Object)"!0 & 1 & !2 & 3 & 3+6");
        g = "+0-1-2+3&4-4+13";
        o.put((Object)pe.g.d(), (Object)"0 & !1 & !2 & 3 & 3+6");
        l = "-0+1+2-3+13&4-4";
        o.put((Object)pe.r.d(), (Object)"!0 & 1 & 2 & !3 & 2+6");
        o.put((Object)pe.p.d(), (Object)"!0 & 1 & 2 & 3 & 2+6");
        m = "+0-1+2+3+13&4-4";
        o.put((Object)pe.o.d(), (Object)"0 & !1 & 2 & 3 & 2+6");
        n = "+0+1-2+3&4-4+13";
        o.put((Object)pe.j.d(), (Object)"0 & 1 & !2 & 3 & 3+6");
        j = "+5-6-7";
        p.put((Object)pe.c.d(), (Object)"5");
        p.put((Object)pe.e.d(), (Object)"5");
        p.put((Object)pe.g.d(), (Object)"5");
        p.put((Object)pe.l.d(), (Object)"5");
        p.put((Object)pe.i.d(), (Object)"5");
        p.put((Object)pe.h.d(), (Object)"5");
        p.put((Object)pe.m.d(), (Object)"5");
        p.put((Object)pe.u.d(), (Object)"5");
        p.put((Object)pe.j.d(), (Object)"5");
        i = "-5+6-7";
        k = "+14&13-13";
        q = Maps.newHashMap();
        r = new String[]{"potion.prefix.mundane", "potion.prefix.uninteresting", "potion.prefix.bland", "potion.prefix.clear", "potion.prefix.milky", "potion.prefix.diffuse", "potion.prefix.artless", "potion.prefix.thin", "potion.prefix.awkward", "potion.prefix.flat", "potion.prefix.bulky", "potion.prefix.bungling", "potion.prefix.buttered", "potion.prefix.smooth", "potion.prefix.suave", "potion.prefix.debonair", "potion.prefix.thick", "potion.prefix.elegant", "potion.prefix.fancy", "potion.prefix.charming", "potion.prefix.dashing", "potion.prefix.refined", "potion.prefix.cordial", "potion.prefix.sparkling", "potion.prefix.potent", "potion.prefix.foul", "potion.prefix.odorless", "potion.prefix.rank", "potion.prefix.harsh", "potion.prefix.acrid", "potion.prefix.gross", "potion.prefix.stinky"};
    }
}
