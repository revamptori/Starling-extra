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

public static enum ew.a {
    a("show_text", true),
    b("show_achievement", true),
    c("show_item", true),
    d("show_entity", true);

    private static final Map<String, ew.a> e;
    private final boolean f;
    private final String g;

    private ew.a(String string2, boolean bl) {
        this.g = string2;
        this.f = bl;
    }

    public boolean a() {
        return this.f;
    }

    public String b() {
        return this.g;
    }

    public static ew.a a(String string) {
        return (ew.a)((Object)e.get((Object)string));
    }

    static {
        e = Maps.newHashMap();
        for (ew.a a2 : ew.a.values()) {
            e.put((Object)a2.b(), (Object)a2);
        }
    }
}
