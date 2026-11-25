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

public static enum et.a {
    a("open_url", true),
    b("open_file", false),
    c("run_command", true),
    d("twitch_user_info", false),
    e("suggest_command", true),
    f("change_page", true);

    private static final Map<String, et.a> g;
    private final boolean h;
    private final String i;

    private et.a(String string2, boolean bl) {
        this.i = string2;
        this.h = bl;
    }

    public boolean a() {
        return this.h;
    }

    public String b() {
        return this.i;
    }

    public static et.a a(String string) {
        return (et.a)((Object)g.get((Object)string));
    }

    static {
        g = Maps.newHashMap();
        for (et.a a2 : et.a.values()) {
            g.put((Object)a2.b(), (Object)a2);
        }
    }
}
