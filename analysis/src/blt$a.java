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

public static enum blt.a {
    a("vertex", ".vsh", bqs.o),
    b("fragment", ".fsh", bqs.p);

    private final String c;
    private final String d;
    private final int e;
    private final Map<String, blt> f = Maps.newHashMap();

    private blt.a(String string2, String string3, int n2) {
        this.c = string2;
        this.d = string3;
        this.e = n2;
    }

    public String a() {
        return this.c;
    }

    protected String b() {
        return this.d;
    }

    protected int c() {
        return this.e;
    }

    protected Map<String, blt> d() {
        return this.f;
    }
}
