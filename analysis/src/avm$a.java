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

public static enum avm.a {
    a("legacy"),
    b("mojang");

    private static final Map<String, avm.a> c;
    private final String d;

    private avm.a(String string2) {
        this.d = string2;
    }

    public static avm.a a(String string) {
        return (avm.a)((Object)c.get((Object)string.toLowerCase()));
    }

    static {
        c = Maps.newHashMap();
        for (avm.a a2 : avm.a.values()) {
            c.put((Object)a2.d, (Object)a2);
        }
    }
}
