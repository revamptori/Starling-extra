/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.Map
 *  java.util.Map$Entry
 */
import com.google.common.collect.Maps;
import java.util.Map;

public class bfo {
    private final Map<Integer, bov> a = Maps.newHashMap();
    private final Map<Integer, boq> b = Maps.newHashMap();
    private final Map<zw, bfp> c = Maps.newHashMap();
    private final bou d;

    public bfo(bou bou2) {
        this.d = bou2;
    }

    public bmi a(zw zw2) {
        return this.a(zw2, 0);
    }

    public bmi a(zw zw2, int n) {
        return this.a(new zx(zw2, 1, n)).e();
    }

    public boq a(zx zx2) {
        zw zw2 = zx2.b();
        boq \u26032 = this.b(zw2, this.b(zx2));
        if (\u26032 == null && (\u2603 = (bfp)this.c.get((Object)zw2)) != null) {
            \u26032 = this.d.a(\u2603.a(zx2));
        }
        if (\u26032 == null) {
            \u26032 = this.d.a();
        }
        return \u26032;
    }

    protected int b(zx zx2) {
        return zx2.e() ? 0 : zx2.i();
    }

    protected boq b(zw zw2, int n) {
        return (boq)this.b.get((Object)this.c(zw2, n));
    }

    private int c(zw zw2, int n) {
        return zw.b(zw2) << 16 | n;
    }

    public void a(zw zw2, int n, bov bov2) {
        this.a.put((Object)this.c(zw2, n), (Object)bov2);
        this.b.put((Object)this.c(zw2, n), (Object)this.d.a(bov2));
    }

    public void a(zw zw2, bfp bfp2) {
        this.c.put((Object)zw2, (Object)bfp2);
    }

    public bou a() {
        return this.d;
    }

    public void b() {
        this.b.clear();
        for (Map.Entry entry : this.a.entrySet()) {
            this.b.put(entry.getKey(), (Object)this.d.a((bov)entry.getValue()));
        }
    }
}
