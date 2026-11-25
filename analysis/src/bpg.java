/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.Error
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
import com.google.common.collect.Maps;
import java.util.Map;

public enum bpg {
    a("master", 0),
    b("music", 1),
    c("record", 2),
    d("weather", 3),
    e("block", 4),
    f("hostile", 5),
    g("neutral", 6),
    h("player", 7),
    i("ambient", 8);

    private static final Map<String, bpg> j;
    private static final Map<Integer, bpg> k;
    private final String l;
    private final int m;

    private bpg(String string2, int n2) {
        this.l = string2;
        this.m = n2;
    }

    public String a() {
        return this.l;
    }

    public int b() {
        return this.m;
    }

    public static bpg a(String string) {
        return (bpg)((Object)j.get((Object)string));
    }

    static {
        j = Maps.newHashMap();
        k = Maps.newHashMap();
        for (bpg bpg2 : bpg.values()) {
            if (j.containsKey((Object)bpg2.a()) || k.containsKey((Object)bpg2.b())) {
                throw new Error("Clash in Sound Category ID & Name pools! Cannot insert " + (Object)((Object)bpg2));
            }
            j.put((Object)bpg2.a(), (Object)bpg2);
            k.put((Object)bpg2.b(), (Object)bpg2);
        }
    }
}
