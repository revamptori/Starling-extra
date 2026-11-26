/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Functions
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.primitives.Doubles
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.UUID
 */
import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public abstract class i
implements k {
    private static h a;

    public int a() {
        return 4;
    }

    @Override
    public List<String> b() {
        return Collections.emptyList();
    }

    @Override
    public boolean a(m m2) {
        return m2.a(this.a(), this.c());
    }

    @Override
    public List<String> a(m m2, String[] stringArray, cj cj2) {
        return null;
    }

    public static int a(String string) throws cb {
        try {
            return Integer.parseInt((String)string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new cb("commands.generic.num.invalid", string);
        }
    }

    public static int a(String string, int n2) throws cb {
        return i.a(string, n2, Integer.MAX_VALUE);
    }

    public static int a(String string, int n2, int n3) throws cb {
        \u2603 = i.a(string);
        if (\u2603 < n2) {
            throw new cb("commands.generic.num.tooSmall", \u2603, n2);
        }
        if (\u2603 > n3) {
            throw new cb("commands.generic.num.tooBig", \u2603, n3);
        }
        return \u2603;
    }

    public static long b(String string) throws cb {
        try {
            return Long.parseLong((String)string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new cb("commands.generic.num.invalid", string);
        }
    }

    public static long a(String string, long l, long l2) throws cb {
        \u2603 = i.b(string);
        if (\u2603 < l) {
            throw new cb("commands.generic.num.tooSmall", \u2603, l);
        }
        if (\u2603 > l2) {
            throw new cb("commands.generic.num.tooBig", \u2603, l2);
        }
        return \u2603;
    }

    public static cj a(m m2, String[] stringArray, int n2, boolean bl) throws cb {
        cj cj2 = m2.c();
        return new cj(i.b(cj2.n(), stringArray[n2], -30000000, 30000000, bl), i.b(cj2.o(), stringArray[n2 + 1], 0, 256, false), i.b(cj2.p(), stringArray[n2 + 2], -30000000, 30000000, bl));
    }

    public static double c(String string) throws cb {
        try {
            double d = Double.parseDouble((String)string);
            if (!Doubles.isFinite((double)d)) {
                throw new cb("commands.generic.num.invalid", string);
            }
            return d;
        }
        catch (NumberFormatException numberFormatException) {
            throw new cb("commands.generic.num.invalid", string);
        }
    }

    public static double a(String string, double d) throws cb {
        return i.a(string, d, Double.MAX_VALUE);
    }

    public static double a(String string, double d, double d2) throws cb {
        \u2603 = i.c(string);
        if (\u2603 < d) {
            throw new cb("commands.generic.double.tooSmall", \u2603, d);
        }
        if (\u2603 > d2) {
            throw new cb("commands.generic.double.tooBig", \u2603, d2);
        }
        return \u2603;
    }

    public static boolean d(String string) throws bz {
        if (string.equals((Object)"true") || string.equals((Object)"1")) {
            return true;
        }
        if (string.equals((Object)"false") || string.equals((Object)"0")) {
            return false;
        }
        throw new bz("commands.generic.boolean.invalid", string);
    }

    public static lf b(m m2) throws cd {
        if (m2 instanceof lf) {
            return (lf)m2;
        }
        throw new cd("You must specify which player you wish to perform this action on.", new Object[0]);
    }

    public static lf a(m m2, String string) throws cd {
        lf lf2 = o.a(m2, string);
        if (lf2 == null) {
            try {
                lf2 = MinecraftServer.N().ap().a(UUID.fromString((String)string));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
        }
        if (lf2 == null) {
            lf2 = MinecraftServer.N().ap().a(string);
        }
        if (lf2 == null) {
            throw new cd();
        }
        return lf2;
    }

    public static pk b(m m2, String string) throws ca {
        return i.a(m2, string, pk.class);
    }

    public static <T extends pk> T a(m m2, String string, Class<? extends T> clazz2) throws ca {
        Class<? extends T> clazz2;
        Object \u26033 = o.a(m2, string, clazz2);
        MinecraftServer \u26032 = MinecraftServer.N();
        if (\u26033 == null) {
            \u26033 = \u26032.ap().a(string);
        }
        if (\u26033 == null) {
            try {
                UUID uUID = UUID.fromString((String)string);
                \u26033 = \u26032.a(uUID);
                if (\u26033 == null) {
                    \u26033 = \u26032.ap().a(uUID);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new ca("commands.generic.entity.invalidUuid", new Object[0]);
            }
        }
        if (\u26033 == null || !clazz2.isAssignableFrom(\u26033.getClass())) {
            throw new ca();
        }
        return \u26033;
    }

    public static List<pk> c(m m2, String string) throws ca {
        if (o.b(string)) {
            return o.b(m2, string, pk.class);
        }
        return Lists.newArrayList((Object[])new pk[]{i.b(m2, string)});
    }

    public static String d(m m2, String string) throws cd {
        try {
            return i.a(m2, string).e_();
        }
        catch (cd cd2) {
            if (o.b(string)) {
                throw cd2;
            }
            return string;
        }
    }

    public static String e(m m2, String string) throws ca {
        try {
            return i.a(m2, string).e_();
        }
        catch (cd cd2) {
            try {
                return i.b(m2, string).aK().toString();
            }
            catch (ca ca2) {
                if (o.b(string)) {
                    throw ca2;
                }
                return string;
            }
        }
    }

    public static eu a(m m2, String[] stringArray, int n2) throws cd {
        return i.b(m2, stringArray, n2, false);
    }

    public static eu b(m m2, String[] stringArray, int n2, boolean bl) throws cd {
        fa fa2 = new fa("");
        for (int j = n2; j < stringArray.length; ++j) {
            if (j > n2) {
                fa2.a(" ");
            }
            eu eu2 = new fa(stringArray[j]);
            if (bl) {
                \u2603 = o.b(m2, stringArray[j]);
                if (\u2603 == null) {
                    if (o.b(stringArray[j])) {
                        throw new cd();
                    }
                } else {
                    eu2 = \u2603;
                }
            }
            fa2.a(eu2);
        }
        return fa2;
    }

    public static String a(String[] stringArray, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = n2; j < stringArray.length; ++j) {
            if (j > n2) {
                stringBuilder.append(" ");
            }
            String string = stringArray[j];
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static a a(double d, String string, boolean bl) throws cb {
        return i.a(d, string, -30000000, 30000000, bl);
    }

    public static a a(double d, String string2, int n22, int n3, boolean bl) throws cb {
        int n22;
        \u2603 = string2.startsWith("~");
        if (\u2603 && Double.isNaN((double)d)) {
            throw new cb("commands.generic.num.invalid", d);
        }
        double d2 = 0.0;
        if (!\u2603 || string2.length() > 1) {
            String string2;
            boolean bl2 = string2.contains((CharSequence)".");
            if (\u2603) {
                string2 = string2.substring(1);
            }
            d2 += i.c(string2);
            if (!bl2 && !\u2603 && bl) {
                d2 += 0.5;
            }
        }
        if (n22 != 0 || n3 != 0) {
            if (d2 < (double)n22) {
                throw new cb("commands.generic.double.tooSmall", d2, n22);
            }
            if (d2 > (double)n3) {
                throw new cb("commands.generic.double.tooBig", d2, n3);
            }
        }
        return new a(d2 + (\u2603 ? d : 0.0), d2, \u2603);
    }

    public static double b(double d, String string, boolean bl) throws cb {
        return i.b(d, string, -30000000, 30000000, bl);
    }

    public static double b(double d, String string2, int n22, int n3, boolean bl) throws cb {
        int n22;
        \u2603 = string2.startsWith("~");
        if (\u2603 && Double.isNaN((double)d)) {
            throw new cb("commands.generic.num.invalid", d);
        }
        double d2 = \u2603 = \u2603 ? d : 0.0;
        if (!\u2603 || string2.length() > 1) {
            String string2;
            \u2603 = string2.contains((CharSequence)".");
            if (\u2603) {
                string2 = string2.substring(1);
            }
            \u2603 += i.c(string2);
            if (!\u2603 && !\u2603 && bl) {
                \u2603 += 0.5;
            }
        }
        if (n22 != 0 || n3 != 0) {
            if (\u2603 < (double)n22) {
                throw new cb("commands.generic.double.tooSmall", \u2603, n22);
            }
            if (\u2603 > (double)n3) {
                throw new cb("commands.generic.double.tooBig", \u2603, n3);
            }
        }
        return \u2603;
    }

    public static zw f(m m2, String string) throws cb {
        jy jy2 = new jy(string);
        zw \u26032 = zw.e.a(jy2);
        if (\u26032 == null) {
            throw new cb("commands.give.item.notFound", jy2);
        }
        return \u26032;
    }

    public static afh g(m m2, String string) throws cb {
        jy jy2 = new jy(string);
        if (!afh.c.d(jy2)) {
            throw new cb("commands.give.block.notFound", jy2);
        }
        afh \u26032 = afh.c.a(jy2);
        if (\u26032 == null) {
            throw new cb("commands.give.block.notFound", jy2);
        }
        return \u26032;
    }

    public static String a(Object[] objectArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < objectArray.length; ++j) {
            String string = objectArray[j].toString();
            if (j > 0) {
                if (j == objectArray.length - 1) {
                    stringBuilder.append(" and ");
                } else {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static eu a(List<eu> list) {
        fa fa2 = new fa("");
        for (int j = 0; j < list.size(); ++j) {
            if (j > 0) {
                if (j == list.size() - 1) {
                    fa2.a(" and ");
                } else if (j > 0) {
                    fa2.a(", ");
                }
            }
            fa2.a((eu)list.get(j));
        }
        return fa2;
    }

    public static String a(Collection<String> collection) {
        return i.a(collection.toArray((Object[])new String[collection.size()]));
    }

    public static List<String> a(String[] stringArray, int n2, cj cj2) {
        String string;
        if (cj2 == null) {
            return null;
        }
        int n3 = stringArray.length - 1;
        if (n3 == n2) {
            string = Integer.toString((int)cj2.n());
        } else if (n3 == n2 + 1) {
            string = Integer.toString((int)cj2.o());
        } else if (n3 == n2 + 2) {
            string = Integer.toString((int)cj2.p());
        } else {
            return null;
        }
        return Lists.newArrayList((Object[])new String[]{string});
    }

    public static List<String> b(String[] stringArray, int n2, cj cj2) {
        String string;
        if (cj2 == null) {
            return null;
        }
        int n3 = stringArray.length - 1;
        if (n3 == n2) {
            string = Integer.toString((int)cj2.n());
        } else if (n3 == n2 + 1) {
            string = Integer.toString((int)cj2.p());
        } else {
            return null;
        }
        return Lists.newArrayList((Object[])new String[]{string});
    }

    public static boolean a(String string, String string2) {
        return string2.regionMatches(true, 0, string, 0, string.length());
    }

    public static List<String> a(String[] stringArray, String ... stringArray2) {
        return i.a(stringArray, Arrays.asList((Object[])stringArray2));
    }

    public static List<String> a(String[] stringArray, Collection<?> collection2) {
        String string = stringArray[stringArray.length - 1];
        ArrayList \u26032 = Lists.newArrayList();
        if (!collection2.isEmpty()) {
            for (Object \u26033 : Iterables.transform(collection2, (Function)Functions.toStringFunction())) {
                if (!i.a(string, (String)\u26033)) continue;
                \u26032.add(\u26033);
            }
            if (\u26032.isEmpty()) {
                Collection<?> collection2;
                for (Object \u26033 : collection2) {
                    if (!(\u26033 instanceof jy) || !i.a(string, ((jy)\u26033).a())) continue;
                    \u26032.add((Object)String.valueOf((Object)\u26033));
                }
            }
        }
        return \u26032;
    }

    @Override
    public boolean b(String[] stringArray, int n2) {
        return false;
    }

    public static void a(m m2, k k2, String string, Object ... objectArray) {
        i.a(m2, k2, 0, string, objectArray);
    }

    public static void a(m m2, k k2, int n2, String string, Object ... objectArray) {
        if (a != null) {
            a.a(m2, k2, n2, string, objectArray);
        }
    }

    public static void a(h h2) {
        a = h2;
    }

    public int a(k k2) {
        return this.c().compareTo(k2.c());
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((k)object);
    }

    public static class a {
        private final double a;
        private final double b;
        private final boolean c;

        protected a(double d, double d2, boolean bl) {
            this.a = d;
            this.b = d2;
            this.c = bl;
        }

        public double a() {
            return this.a;
        }

        public double b() {
            return this.b;
        }

        public boolean c() {
            return this.c;
        }
    }
}
