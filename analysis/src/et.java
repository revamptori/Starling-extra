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

public class et {
    private final a a;
    private final String b;

    public et(a a2, String string) {
        this.a = a2;
        this.b = string;
    }

    public a a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        et et2 = (et)object;
        if (this.a != et2.a) {
            return false;
        }
        return !(this.b != null ? !this.b.equals((Object)et2.b) : et2.b != null);
    }

    public String toString() {
        return "ClickEvent{action=" + (Object)((Object)this.a) + ", value='" + this.b + '\'' + '}';
    }

    public int hashCode() {
        int n = this.a.hashCode();
        n = 31 * n + (this.b != null ? this.b.hashCode() : 0);
        return n;
    }

    public static enum a {
        a("open_url", true),
        b("open_file", false),
        c("run_command", true),
        d("twitch_user_info", false),
        e("suggest_command", true),
        f("change_page", true);

        private static final Map<String, a> g;
        private final boolean h;
        private final String i;

        private a(String string2, boolean bl) {
            this.i = string2;
            this.h = bl;
        }

        public boolean a() {
            return this.h;
        }

        public String b() {
            return this.i;
        }

        public static a a(String string) {
            return (a)((Object)g.get((Object)string));
        }

        static {
            g = Maps.newHashMap();
            for (a a2 : et$a.values()) {
                g.put((Object)a2.b(), (Object)a2);
            }
        }
    }
}
