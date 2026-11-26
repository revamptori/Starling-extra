/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class apz {
    private final List<aqa> a = Lists.newArrayList();
    private final Map<String, Map<String, String>> b = Maps.newHashMap();
    private int c;

    public int a() {
        return this.c;
    }

    public void a(int n) {
        this.c = n;
    }

    public Map<String, Map<String, String>> b() {
        return this.b;
    }

    public List<aqa> c() {
        return this.a;
    }

    public void d() {
        int n = 0;
        for (aqa aqa2 : this.a) {
            aqa2.b(n);
            n += aqa2.b();
        }
    }

    public String toString() {
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(3);
        stringBuilder.append(";");
        for (n = 0; n < this.a.size(); ++n) {
            if (n > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(((aqa)this.a.get(n)).toString());
        }
        stringBuilder.append(";");
        stringBuilder.append(this.c);
        if (!this.b.isEmpty()) {
            stringBuilder.append(";");
            n = 0;
            for (Map.Entry entry : this.b.entrySet()) {
                if (n++ > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(((String)entry.getKey()).toLowerCase());
                Map map = (Map)entry.getValue();
                if (map.isEmpty()) continue;
                stringBuilder.append("(");
                int \u26032 = 0;
                for (Map.Entry entry2 : map.entrySet()) {
                    if (\u26032++ > 0) {
                        stringBuilder.append(" ");
                    }
                    stringBuilder.append((String)entry2.getKey());
                    stringBuilder.append("=");
                    stringBuilder.append((String)entry2.getValue());
                }
                stringBuilder.append(")");
            }
        } else {
            stringBuilder.append(";");
        }
        return stringBuilder.toString();
    }

    private static aqa a(int n, String string, int n2) {
        Object object;
        String[] \u26035 = n >= 3 ? string.split("\\*", 2) : string.split("x", 2);
        int \u26032 = 1;
        int \u26033 = 0;
        if (\u26035.length == 2) {
            try {
                \u26032 = Integer.parseInt((String)\u26035[0]);
                if (n2 + \u26032 >= 256) {
                    \u26032 = 256 - n2;
                }
                if (\u26032 < 0) {
                    \u26032 = 0;
                }
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        afh \u26034 = null;
        try {
            object = \u26035[\u26035.length - 1];
            if (n < 3) {
                \u26035 = object.split(":", 2);
                if (\u26035.length > 1) {
                    \u26033 = Integer.parseInt((String)\u26035[1]);
                }
                \u26034 = afh.c(Integer.parseInt((String)\u26035[0]));
            } else {
                \u26035 = object.split(":", 3);
                afh afh2 = \u26034 = \u26035.length > 1 ? afh.b(\u26035[0] + ":" + \u26035[1]) : null;
                if (\u26034 != null) {
                    \u26033 = \u26035.length > 2 ? Integer.parseInt((String)\u26035[2]) : 0;
                } else {
                    \u26034 = afh.b(\u26035[0]);
                    if (\u26034 != null) {
                        int n3 = \u26033 = \u26035.length > 1 ? Integer.parseInt((String)\u26035[1]) : 0;
                    }
                }
                if (\u26034 == null) {
                    return null;
                }
            }
            if (\u26034 == afi.a) {
                \u26033 = 0;
            }
            if (\u26033 < 0 || \u26033 > 15) {
                \u26033 = 0;
            }
        }
        catch (Throwable throwable) {
            return null;
        }
        object = new aqa(n, \u26032, \u26034, \u26033);
        ((aqa)object).b(n2);
        return object;
    }

    private static List<aqa> a(int n, String string) {
        if (string == null || string.length() < 1) {
            return null;
        }
        ArrayList arrayList = Lists.newArrayList();
        String[] \u26032 = string.split(",");
        int \u26033 = 0;
        for (String string2 : \u26032) {
            aqa aqa2 = apz.a(n, string2, \u26033);
            if (aqa2 == null) {
                return null;
            }
            arrayList.add((Object)aqa2);
            \u26033 += aqa2.b();
        }
        return arrayList;
    }

    public static apz a(String string) {
        if (string == null) {
            return apz.e();
        }
        String[] stringArray = string.split(";", -1);
        int n = \u2603 = stringArray.length == 1 ? 0 : ns.a(stringArray[0], 0);
        if (\u2603 < 0 || \u2603 > 3) {
            return apz.e();
        }
        apz \u26032 = new apz();
        int \u26033 = stringArray.length == 1 ? 0 : 1;
        if ((\u2603 = apz.a(\u2603, stringArray[\u26033++])) == null || \u2603.isEmpty()) {
            return apz.e();
        }
        \u26032.c().addAll(\u2603);
        \u26032.d();
        int \u26034 = ady.q.az;
        if (\u2603 > 0 && stringArray.length > \u26033) {
            \u26034 = ns.a(stringArray[\u26033++], \u26034);
        }
        \u26032.a(\u26034);
        if (\u2603 > 0 && stringArray.length > \u26033) {
            for (String string2 : \u2603 = stringArray[\u26033++].toLowerCase().split(",")) {
                String[] stringArray2 = string2.split("\\(", 2);
                HashMap \u26035 = Maps.newHashMap();
                if (stringArray2[0].length() <= 0) continue;
                \u26032.b().put((Object)stringArray2[0], (Object)\u26035);
                if (stringArray2.length <= 1 || !stringArray2[1].endsWith(")") || stringArray2[1].length() <= 1) continue;
                \u2603 = stringArray2[1].substring(0, stringArray2[1].length() - 1).split(" ");
                for (int i = 0; i < \u2603.length; ++i) {
                    String[] stringArray3 = \u2603[i].split("=", 2);
                    if (stringArray3.length != 2) continue;
                    \u26035.put((Object)stringArray3[0], (Object)stringArray3[1]);
                }
            }
        } else {
            \u26032.b().put((Object)"village", (Object)Maps.newHashMap());
        }
        return \u26032;
    }

    public static apz e() {
        apz apz2 = new apz();
        apz2.a(ady.q.az);
        apz2.c().add((Object)new aqa(1, afi.h));
        apz2.c().add((Object)new aqa(2, afi.d));
        apz2.c().add((Object)new aqa(1, afi.c));
        apz2.d();
        apz2.b().put((Object)"village", (Object)Maps.newHashMap());
        return apz2;
    }
}
