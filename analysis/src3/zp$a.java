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

public static enum zp.a {
    a(0, "cod", 2, 0.1f, 5, 0.6f),
    b(1, "salmon", 2, 0.1f, 6, 0.8f),
    c(2, "clownfish", 1, 0.1f),
    d(3, "pufferfish", 1, 0.1f);

    private static final Map<Integer, zp.a> e;
    private final int f;
    private final String g;
    private final int h;
    private final float i;
    private final int j;
    private final float k;
    private boolean l = false;

    private zp.a(int n2, String string2, int n3, float f, int n4, float f2) {
        this.f = n2;
        this.g = string2;
        this.h = n3;
        this.i = f;
        this.j = n4;
        this.k = f2;
        this.l = true;
    }

    private zp.a(int n2, String string2, int n3, float f) {
        this.f = n2;
        this.g = string2;
        this.h = n3;
        this.i = f;
        this.j = 0;
        this.k = 0.0f;
        this.l = false;
    }

    public int a() {
        return this.f;
    }

    public String b() {
        return this.g;
    }

    public int c() {
        return this.h;
    }

    public float d() {
        return this.i;
    }

    public int e() {
        return this.j;
    }

    public float f() {
        return this.k;
    }

    public boolean g() {
        return this.l;
    }

    public static zp.a a(int n) {
        zp.a a2 = (zp.a)((Object)e.get((Object)n));
        if (a2 == null) {
            return a;
        }
        return a2;
    }

    public static zp.a a(zx zx2) {
        if (zx2.b() instanceof zp) {
            return zp.a.a(zx2.i());
        }
        return a;
    }

    static {
        e = Maps.newHashMap();
        for (zp.a a2 : zp.a.values()) {
            e.put((Object)a2.a(), (Object)a2);
        }
    }
}
