/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Maps
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Map
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.Map;

public static enum cq.a implements Predicate<cq>,
nw
{
    a("x", cq.c.a),
    b("y", cq.c.b),
    c("z", cq.c.a);

    private static final Map<String, cq.a> d;
    private final String e;
    private final cq.c f;

    private cq.a(String string2, cq.c c2) {
        this.e = string2;
        this.f = c2;
    }

    public static cq.a a(String string) {
        if (string == null) {
            return null;
        }
        return (cq.a)d.get((Object)string.toLowerCase());
    }

    public String a() {
        return this.e;
    }

    public boolean b() {
        return this.f == cq.c.b;
    }

    public boolean c() {
        return this.f == cq.c.a;
    }

    public String toString() {
        return this.e;
    }

    public boolean a(cq cq2) {
        return cq2 != null && cq2.k() == this;
    }

    public cq.c d() {
        return this.f;
    }

    @Override
    public String l() {
        return this.e;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((cq)object);
    }

    static {
        d = Maps.newHashMap();
        for (cq.a a2 : cq.a.values()) {
            d.put((Object)a2.a().toLowerCase(), (Object)a2);
        }
    }
}
