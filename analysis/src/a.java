/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Map
 *  java.util.regex.Pattern
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

public enum a {
    a("BLACK", '0', 0),
    b("DARK_BLUE", '1', 1),
    c("DARK_GREEN", '2', 2),
    d("DARK_AQUA", '3', 3),
    e("DARK_RED", '4', 4),
    f("DARK_PURPLE", '5', 5),
    g("GOLD", '6', 6),
    h("GRAY", '7', 7),
    i("DARK_GRAY", '8', 8),
    j("BLUE", '9', 9),
    k("GREEN", 'a', 10),
    l("AQUA", 'b', 11),
    m("RED", 'c', 12),
    n("LIGHT_PURPLE", 'd', 13),
    o("YELLOW", 'e', 14),
    p("WHITE", 'f', 15),
    q("OBFUSCATED", 'k', true),
    r("BOLD", 'l', true),
    s("STRIKETHROUGH", 'm', true),
    t("UNDERLINE", 'n', true),
    u("ITALIC", 'o', true),
    v("RESET", 'r', -1);

    private static final Map<String, a> w;
    private static final Pattern x;
    private final String y;
    private final char z;
    private final boolean A;
    private final String B;
    private final int C;

    private static String c(String string) {
        return string.toLowerCase().replaceAll("[^a-z]", "");
    }

    private a(String string2, char c, int n2) {
        this(string2, c, false, n2);
    }

    private a(String string2, char c, boolean bl) {
        this(string2, c, bl, -1);
    }

    private a(String string2, char c, boolean bl, int n2) {
        this.y = string2;
        this.z = c;
        this.A = bl;
        this.C = n2;
        this.B = "\u00a7" + c;
    }

    public int b() {
        return this.C;
    }

    public boolean c() {
        return this.A;
    }

    public boolean d() {
        return !this.A && this != v;
    }

    public String e() {
        return this.name().toLowerCase();
    }

    public String toString() {
        return this.B;
    }

    public static String a(String string) {
        return string == null ? null : x.matcher((CharSequence)string).replaceAll("");
    }

    public static a b(String string) {
        if (string == null) {
            return null;
        }
        return (a)((Object)w.get((Object)a.c(string)));
    }

    public static a a(int n) {
        if (n < 0) {
            return v;
        }
        for (a a2 : a.values()) {
            if (a2.b() != n) continue;
            return a2;
        }
        return null;
    }

    public static Collection<String> a(boolean bl, boolean bl2) {
        ArrayList arrayList = Lists.newArrayList();
        for (a a2 : a.values()) {
            if (a2.d() && !bl || a2.c() && !bl2) continue;
            arrayList.add((Object)a2.e());
        }
        return arrayList;
    }

    static {
        w = Maps.newHashMap();
        x = Pattern.compile((String)("(?i)" + String.valueOf((char)'\u00a7') + "[0-9A-FK-OR]"));
        for (a a2 : a.values()) {
            w.put((Object)a.c(a2.y), (Object)a2);
        }
    }
}
