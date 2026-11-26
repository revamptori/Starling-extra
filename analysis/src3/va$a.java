/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
import com.google.common.collect.Maps;
import java.util.Map;

public static enum va.a {
    a(0, "MinecartRideable"),
    b(1, "MinecartChest"),
    c(2, "MinecartFurnace"),
    d(3, "MinecartTNT"),
    e(4, "MinecartSpawner"),
    f(5, "MinecartHopper"),
    g(6, "MinecartCommandBlock");

    private static final Map<Integer, va.a> h;
    private final int i;
    private final String j;

    private va.a(int n2, String string2) {
        this.i = n2;
        this.j = string2;
    }

    public int a() {
        return this.i;
    }

    public String b() {
        return this.j;
    }

    public static va.a a(int n) {
        va.a a2 = (va.a)((Object)h.get((Object)n));
        return a2 == null ? a : a2;
    }

    static {
        h = Maps.newHashMap();
        for (va.a a2 : va.a.values()) {
            h.put((Object)a2.a(), (Object)a2);
        }
    }
}
