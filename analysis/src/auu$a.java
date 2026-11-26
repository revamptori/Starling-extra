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

public static enum auu.a {
    a("integer"),
    b("hearts");

    private static final Map<String, auu.a> c;
    private final String d;

    private auu.a(String string2) {
        this.d = string2;
    }

    public String a() {
        return this.d;
    }

    public static auu.a a(String string) {
        auu.a a2 = (auu.a)((Object)c.get((Object)string));
        return a2 == null ? a : a2;
    }

    static {
        c = Maps.newHashMap();
        for (auu.a a2 : auu.a.values()) {
            c.put((Object)a2.a(), (Object)a2);
        }
    }
}
