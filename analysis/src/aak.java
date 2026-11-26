/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class aak
extends zw {
    private static final Map<String, aak> b = Maps.newHashMap();
    public final String a;

    protected aak(String string) {
        this.a = string;
        this.h = 1;
        this.a(yz.f);
        b.put((Object)("records." + string), (Object)this);
    }

    @Override
    public boolean a(zx zx2, wn wn2, adm adm2, cj cj2, cq cq2, float f, float f2, float f3) {
        alz alz2 = adm2.p(cj2);
        if (alz2.c() == afi.aN && !alz2.b(ahq.a).booleanValue()) {
            if (adm2.D) {
                return true;
            }
            ((ahq)afi.aN).a(adm2, cj2, alz2, zx2);
            adm2.a(null, 1005, cj2, zw.b(this));
            --zx2.b;
            wn2.b(na.X);
            return true;
        }
        return false;
    }

    @Override
    public void a(zx zx2, wn wn2, List<String> list, boolean bl) {
        list.add((Object)this.g());
    }

    public String g() {
        return di.a("item.record." + this.a + ".desc");
    }

    @Override
    public aaj g(zx zx2) {
        return aaj.c;
    }

    public static aak b(String string) {
        return (aak)b.get((Object)string);
    }
}
