/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
import com.google.common.collect.Maps;
import java.util.Map;

public static enum auq.a {
    a("always", 0),
    b("never", 1),
    c("hideForOtherTeams", 2),
    d("hideForOwnTeam", 3);

    private static Map<String, auq.a> g;
    public final String e;
    public final int f;

    public static String[] a() {
        return (String[])g.keySet().toArray((Object[])new String[g.size()]);
    }

    public static auq.a a(String string) {
        return (auq.a)((Object)g.get((Object)string));
    }

    private auq.a(String string2, int n2) {
        this.e = string2;
        this.f = n2;
    }

    static {
        g = Maps.newHashMap();
        for (auq.a a2 : auq.a.values()) {
            g.put((Object)a2.e, (Object)a2);
        }
    }
}
