/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.ComparisonChain
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.server.MinecraftServer;

public class o {
    private static final Pattern a = Pattern.compile((String)"^@([pare])(?:\\[([\\w=,!-]*)\\])?$");
    private static final Pattern b = Pattern.compile((String)"\\G([-!]?[\\w-]*)(?:$|,)");
    private static final Pattern c = Pattern.compile((String)"\\G(\\w+)=([-!]?[\\w-]*)(?:$|,)");
    private static final Set<String> d = Sets.newHashSet((Object[])new String[]{"x", "y", "z", "dx", "dy", "dz", "rm", "r"});

    public static lf a(m m2, String string) {
        return o.a(m2, string, lf.class);
    }

    public static <T extends pk> T a(m m2, String string, Class<? extends T> clazz) {
        List<? extends T> list = o.b(m2, string, clazz);
        return (T)(list.size() == 1 ? (pk)list.get(0) : null);
    }

    public static eu b(m m2, String string) {
        List<pk> list = o.b(m2, string, pk.class);
        if (list.isEmpty()) {
            return null;
        }
        ArrayList \u26032 = Lists.newArrayList();
        for (pk pk2 : list) {
            \u26032.add((Object)pk2.f_());
        }
        return i.a((List<eu>)\u26032);
    }

    public static <T extends pk> List<T> b(m m2, String string, Class<? extends T> clazz) {
        Matcher matcher = a.matcher((CharSequence)string);
        if (matcher.matches() && m2.a(1, "@")) {
            Map<String, String> map = o.c(matcher.group(2));
            if (!o.b(m2, map)) {
                return Collections.emptyList();
            }
            String \u26032 = matcher.group(1);
            cj \u26033 = o.b(map, m2.c());
            List<adm> \u26034 = o.a(m2, map);
            ArrayList \u26035 = Lists.newArrayList();
            for (adm adm2 : \u26034) {
                if (adm2 == null) continue;
                ArrayList arrayList = Lists.newArrayList();
                arrayList.addAll(o.a(map, \u26032));
                arrayList.addAll(o.b(map));
                arrayList.addAll(o.c(map));
                arrayList.addAll(o.d(map));
                arrayList.addAll(o.e(map));
                arrayList.addAll(o.f(map));
                arrayList.addAll(o.a(map, \u26033));
                arrayList.addAll(o.g(map));
                \u26035.addAll(o.a(map, clazz, (List<Predicate<pk>>)arrayList, \u26032, adm2, \u26033));
            }
            return o.a(\u26035, map, m2, clazz, \u26032, \u26033);
        }
        return Collections.emptyList();
    }

    private static List<adm> a(m m2, Map<String, String> map) {
        ArrayList arrayList = Lists.newArrayList();
        if (o.h(map)) {
            arrayList.add((Object)m2.e());
        } else {
            Collections.addAll((Collection)arrayList, (Object[])MinecraftServer.N().d);
        }
        return arrayList;
    }

    private static <T extends pk> boolean b(m m2, Map<String, String> map) {
        String string = o.b(map, "type");
        String string2 = string = string != null && string.startsWith("!") ? string.substring(1) : string;
        if (string != null && !pm.b(string)) {
            fb fb2 = new fb("commands.generic.entity.invalidType", string);
            fb2.b().a(a.m);
            m2.a(fb2);
            return false;
        }
        return true;
    }

    private static List<Predicate<pk>> a(Map<String, String> map, String string) {
        ArrayList arrayList = Lists.newArrayList();
        String \u26032 = o.b(map, "type");
        boolean bl = \u2603 = \u26032 != null && \u26032.startsWith("!");
        if (\u2603) {
            \u26032 = \u26032.substring(1);
        }
        final String \u26033 = \u26032;
        boolean \u26034 = !string.equals((Object)"e");
        boolean bl2 = \u2603 = string.equals((Object)"r") && \u26032 != null;
        if (\u26032 != null && string.equals((Object)"e") || \u2603) {
            arrayList.add((Object)new Predicate<pk>(){

                public boolean a(pk pk2) {
                    return pm.a(pk2, \u26033) != \u2603;
                }

                public /* synthetic */ boolean apply(Object object) {
                    return this.a((pk)object);
                }
            });
        } else if (\u26034) {
            arrayList.add((Object)new Predicate<pk>(){

                public boolean a(pk pk2) {
                    return pk2 instanceof wn;
                }

                public /* synthetic */ boolean apply(Object object) {
                    return this.a((pk)object);
                }
            });
        }
        return arrayList;
    }

    private static List<Predicate<pk>> b(Map<String, String> map) {
        ArrayList arrayList = Lists.newArrayList();
        final int \u26032 = o.a(map, "lm", -1);
        final int \u26033 = o.a(map, "l", -1);
        if (\u26032 > -1 || \u26033 > -1) {
            arrayList.add((Object)new Predicate<pk>(){

                public boolean a(pk pk2) {
                    if (!(pk2 instanceof lf)) {
                        return false;
                    }
                    lf lf2 = (lf)pk2;
                    return !(\u26032 > -1 && lf2.bB < \u26032 || \u26033 > -1 && lf2.bB > \u26033);
                }

                public /* synthetic */ boolean apply(Object object) {
                    return this.a((pk)object);
                }
            });
        }
        return arrayList;
    }

    private static List<Predicate<pk>> c(Map<String, String> map) {
        ArrayList arrayList = Lists.newArrayList();
        final int \u26032 = o.a(map, "m", adp.a.a.a());
        if (\u26032 != adp.a.a.a()) {
            arrayList.add((Object)new Predicate<pk>(){

                public boolean a(pk pk2) {
                    if (!(pk2 instanceof lf)) {
                        return false;
                    }
                    lf lf2 = (lf)pk2;
                    return lf2.c.b().a() == \u26032;
                }

                public /* synthetic */ boolean apply(Object object) {
                    return this.a((pk)object);
                }
            });
        }
        return arrayList;
    }

    private static List<Predicate<pk>> d(Map<String, String> map) {
        ArrayList arrayList = Lists.newArrayList();
        String \u26032 = o.b(map, "team");
        boolean bl = \u2603 = \u26032 != null && \u26032.startsWith("!");
        if (\u2603) {
            \u26032 = \u26032.substring(1);
        }
        final String \u26033 = \u26032;
        if (\u26032 != null) {
            arrayList.add((Object)new Predicate<pk>(){

                public boolean a(pk pk2) {
                    if (!(pk2 instanceof pr)) {
                        return false;
                    }
                    pr pr2 = (pr)pk2;
                    auq \u26032 = pr2.bO();
                    String \u260332 = \u26032 == null ? "" : \u26032.b();
                    return \u260332.equals((Object)\u26033) != \u2603;
                }

                public /* synthetic */ boolean apply(Object object) {
                    return this.a((pk)object);
                }
            });
        }
        return arrayList;
    }

    private static List<Predicate<pk>> e(Map<String, String> map) {
        ArrayList arrayList = Lists.newArrayList();
        final Map<String, Integer> \u26032 = o.a(map);
        if (\u26032 != null && \u26032.size() > 0) {
            arrayList.add((Object)new Predicate<pk>(){

                public boolean a(pk pk2) {
                    auo auo2 = MinecraftServer.N().a(0).Z();
                    for (Map.Entry entry : \u26032.entrySet()) {
                        String string = (String)entry.getKey();
                        boolean \u260322 = false;
                        if (string.endsWith("_min") && string.length() > 4) {
                            \u260322 = true;
                            string = string.substring(0, string.length() - 4);
                        }
                        if ((\u2603 = auo2.b(string)) == null) {
                            return false;
                        }
                        String string2 = \u2603 = pk2 instanceof lf ? pk2.e_() : pk2.aK().toString();
                        if (!auo2.b(\u2603, \u2603)) {
                            return false;
                        }
                        aum \u26033 = auo2.c(\u2603, \u2603);
                        int \u26034 = \u26033.c();
                        if (\u26034 < (Integer)entry.getValue() && \u260322) {
                            return false;
                        }
                        if (\u26034 <= (Integer)entry.getValue() || \u260322) continue;
                        return false;
                    }
                    return true;
                }

                public /* synthetic */ boolean apply(Object object) {
                    return this.a((pk)object);
                }
            });
        }
        return arrayList;
    }

    private static List<Predicate<pk>> f(Map<String, String> map) {
        ArrayList arrayList = Lists.newArrayList();
        String \u26032 = o.b(map, "name");
        boolean bl = \u2603 = \u26032 != null && \u26032.startsWith("!");
        if (\u2603) {
            \u26032 = \u26032.substring(1);
        }
        final String \u26033 = \u26032;
        if (\u26032 != null) {
            arrayList.add((Object)new Predicate<pk>(){

                public boolean a(pk pk2) {
                    return pk2.e_().equals((Object)\u26033) != \u2603;
                }

                public /* synthetic */ boolean apply(Object object) {
                    return this.a((pk)object);
                }
            });
        }
        return arrayList;
    }

    private static List<Predicate<pk>> a(Map<String, String> map, final cj cj2) {
        ArrayList arrayList = Lists.newArrayList();
        final int \u26032 = o.a(map, "rm", -1);
        final int \u26033 = o.a(map, "r", -1);
        if (cj2 != null && (\u26032 >= 0 || \u26033 >= 0)) {
            final int n2 = \u26032 * \u26032;
            \u2603 = \u26033 * \u26033;
            arrayList.add((Object)new Predicate<pk>(){

                public boolean a(pk pk2) {
                    int n22 = (int)pk2.c(cj2);
                    return !(\u26032 >= 0 && n22 < n2 || \u26033 >= 0 && n22 > \u2603);
                }

                public /* synthetic */ boolean apply(Object object) {
                    return this.a((pk)object);
                }
            });
        }
        return arrayList;
    }

    private static List<Predicate<pk>> g(Map<String, String> map2) {
        Map<String, String> map2;
        int n2;
        ArrayList arrayList = Lists.newArrayList();
        if (map2.containsKey((Object)"rym") || map2.containsKey((Object)"ry")) {
            n2 = o.a(o.a(map2, "rym", 0));
            \u2603 = o.a(o.a(map2, "ry", 359));
            arrayList.add((Object)new Predicate<pk>(){

                public boolean a(pk pk2) {
                    int n22 = o.a((int)Math.floor((double)pk2.y));
                    if (n2 > \u2603) {
                        return n22 >= n2 || n22 <= \u2603;
                    }
                    return n22 >= n2 && n22 <= \u2603;
                }

                public /* synthetic */ boolean apply(Object object) {
                    return this.a((pk)object);
                }
            });
        }
        if (map2.containsKey((Object)"rxm") || map2.containsKey((Object)"rx")) {
            n2 = o.a(o.a(map2, "rxm", 0));
            \u2603 = o.a(o.a(map2, "rx", 359));
            arrayList.add((Object)new Predicate<pk>(){

                public boolean a(pk pk2) {
                    int n22 = o.a((int)Math.floor((double)pk2.z));
                    if (n2 > \u2603) {
                        return n22 >= n2 || n22 <= \u2603;
                    }
                    return n22 >= n2 && n22 <= \u2603;
                }

                public /* synthetic */ boolean apply(Object object) {
                    return this.a((pk)object);
                }
            });
        }
        return arrayList;
    }

    private static <T extends pk> List<T> a(Map<String, String> map, Class<? extends T> clazz, List<Predicate<pk>> list, String string, adm adm2, cj cj22) {
        ArrayList arrayList = Lists.newArrayList();
        String \u26032 = o.b(map, "type");
        \u26032 = \u26032 != null && \u26032.startsWith("!") ? \u26032.substring(1) : \u26032;
        boolean \u26033 = !string.equals((Object)"e");
        boolean \u26034 = string.equals((Object)"r") && \u26032 != null;
        int \u26035 = o.a(map, "dx", 0);
        int \u26036 = o.a(map, "dy", 0);
        int \u26037 = o.a(map, "dz", 0);
        int \u26038 = o.a(map, "r", -1);
        Predicate \u26039 = Predicates.and(list);
        Predicate \u260310 = Predicates.and(po.a, (Predicate)\u26039);
        if (cj22 != null) {
            int n2 = adm2.j.size();
            boolean bl = \u2603 = n2 < (\u2603 = adm2.f.size()) / 16;
            if (map.containsKey((Object)"dx") || map.containsKey((Object)"dy") || map.containsKey((Object)"dz")) {
                final aug aug2 = o.a(cj22, \u26035, \u26036, \u26037);
                if (\u26033 && \u2603 && !\u26034) {
                    Predicate<pk> predicate = new Predicate<pk>(){

                        public boolean a(pk pk2) {
                            if (pk2.s < aug2.a || pk2.t < aug2.b || pk2.u < aug2.c) {
                                return false;
                            }
                            return !(pk2.s >= aug2.d) && !(pk2.t >= aug2.e) && !(pk2.u >= aug2.f);
                        }

                        public /* synthetic */ boolean apply(Object object) {
                            return this.a((pk)object);
                        }
                    };
                    arrayList.addAll(adm2.b(clazz, Predicates.and((Predicate)\u260310, (Predicate)predicate)));
                } else {
                    arrayList.addAll((Collection)adm2.a(clazz, aug2, \u260310));
                }
            } else if (\u26038 >= 0) {
                cj cj22;
                aug \u260311 = new aug(cj22.n() - \u26038, cj22.o() - \u26038, cj22.p() - \u26038, cj22.n() + \u26038 + 1, cj22.o() + \u26038 + 1, cj22.p() + \u26038 + 1);
                if (\u26033 && \u2603 && !\u26034) {
                    arrayList.addAll(adm2.b(clazz, \u260310));
                } else {
                    arrayList.addAll((Collection)adm2.a(clazz, \u260311, \u260310));
                }
            } else if (string.equals((Object)"a")) {
                arrayList.addAll(adm2.b(clazz, \u26039));
            } else if (string.equals((Object)"p") || string.equals((Object)"r") && !\u26034) {
                arrayList.addAll(adm2.b(clazz, \u260310));
            } else {
                arrayList.addAll(adm2.a(clazz, \u260310));
            }
        } else if (string.equals((Object)"a")) {
            arrayList.addAll(adm2.b(clazz, \u26039));
        } else if (string.equals((Object)"p") || string.equals((Object)"r") && !\u26034) {
            arrayList.addAll(adm2.b(clazz, \u260310));
        } else {
            arrayList.addAll(adm2.a(clazz, \u260310));
        }
        return arrayList;
    }

    private static <T extends pk> List<T> a(List<T> list2, Map<String, String> map, m m2, Class<? extends T> clazz, String string, final cj cj2) {
        List list2;
        int n2 = o.a(map, "c", string.equals((Object)"a") || string.equals((Object)"e") ? 0 : 1);
        if (string.equals((Object)"p") || string.equals((Object)"a") || string.equals((Object)"e")) {
            if (cj2 != null) {
                Collections.sort(list2, (Comparator)new Comparator<pk>(){

                    public int a(pk pk2, pk pk3) {
                        return ComparisonChain.start().compare(pk2.b(cj2), pk3.b(cj2)).result();
                    }

                    public /* synthetic */ int compare(Object object, Object object2) {
                        return this.a((pk)object, (pk)object2);
                    }
                });
            }
        } else if (string.equals((Object)"r")) {
            Collections.shuffle(list2);
        }
        if ((\u2603 = m2.f()) != null && clazz.isAssignableFrom(\u2603.getClass()) && n2 == 1 && list2.contains((Object)\u2603) && !"r".equals((Object)string)) {
            list2 = Lists.newArrayList((Object[])new pk[]{\u2603});
        }
        if (n2 != 0) {
            if (n2 < 0) {
                Collections.reverse(list2);
            }
            list2 = list2.subList(0, Math.min((int)Math.abs((int)n2), (int)list2.size()));
        }
        return list2;
    }

    private static aug a(cj cj2, int n2, int n3, int n4) {
        boolean bl = n2 < 0;
        \u2603 = n3 < 0;
        \u2603 = n4 < 0;
        int \u26032 = cj2.n() + (bl ? n2 : 0);
        int \u26033 = cj2.o() + (\u2603 ? n3 : 0);
        int \u26034 = cj2.p() + (\u2603 ? n4 : 0);
        int \u26035 = cj2.n() + (bl ? 0 : n2) + 1;
        int \u26036 = cj2.o() + (\u2603 ? 0 : n3) + 1;
        int \u26037 = cj2.p() + (\u2603 ? 0 : n4) + 1;
        return new aug(\u26032, \u26033, \u26034, \u26035, \u26036, \u26037);
    }

    public static int a(int n2) {
        if ((n2 %= 360) >= 160) {
            n2 -= 360;
        }
        if (n2 < 0) {
            n2 += 360;
        }
        return n2;
    }

    private static cj b(Map<String, String> map, cj cj2) {
        return new cj(o.a(map, "x", cj2.n()), o.a(map, "y", cj2.o()), o.a(map, "z", cj2.p()));
    }

    private static boolean h(Map<String, String> map) {
        for (String string : d) {
            if (!map.containsKey((Object)string)) continue;
            return true;
        }
        return false;
    }

    private static int a(Map<String, String> map, String string, int n2) {
        return map.containsKey((Object)string) ? ns.a((String)map.get((Object)string), n2) : n2;
    }

    private static String b(Map<String, String> map, String string) {
        return (String)map.get((Object)string);
    }

    public static Map<String, Integer> a(Map<String, String> map) {
        HashMap hashMap = Maps.newHashMap();
        for (String string : map.keySet()) {
            if (!string.startsWith("score_") || string.length() <= "score_".length()) continue;
            hashMap.put((Object)string.substring("score_".length()), (Object)ns.a((String)map.get((Object)string), 1));
        }
        return hashMap;
    }

    public static boolean a(String string) {
        Matcher matcher = a.matcher((CharSequence)string);
        if (matcher.matches()) {
            Map<String, String> map = o.c(matcher.group(2));
            String \u26032 = matcher.group(1);
            int \u26033 = "a".equals((Object)\u26032) || "e".equals((Object)\u26032) ? 0 : 1;
            return o.a(map, "c", \u26033) != 1;
        }
        return false;
    }

    public static boolean b(String string) {
        return a.matcher((CharSequence)string).matches();
    }

    private static Map<String, String> c(String string2) {
        String string2;
        HashMap hashMap = Maps.newHashMap();
        if (string2 == null) {
            return hashMap;
        }
        int \u26032 = 0;
        int \u26033 = -1;
        Matcher \u26034 = b.matcher((CharSequence)string2);
        while (\u26034.find()) {
            String string3 = null;
            switch (\u26032++) {
                case 0: {
                    string3 = "x";
                    break;
                }
                case 1: {
                    string3 = "y";
                    break;
                }
                case 2: {
                    string3 = "z";
                    break;
                }
                case 3: {
                    string3 = "r";
                }
            }
            if (string3 != null && \u26034.group(1).length() > 0) {
                hashMap.put((Object)string3, (Object)\u26034.group(1));
            }
            \u26033 = \u26034.end();
        }
        if (\u26033 < string2.length()) {
            string3 = c.matcher((CharSequence)(\u26033 == -1 ? string2 : string2.substring(\u26033)));
            while (string3.find()) {
                hashMap.put((Object)string3.group(1), (Object)string3.group(2));
            }
        }
        return hashMap;
    }
}
