/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Collections2
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Collection
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.Collection;

public static enum agw.a implements nw
{
    a(agw.b.a, 0, "dandelion"),
    b(agw.b.b, 0, "poppy"),
    c(agw.b.b, 1, "blue_orchid", "blueOrchid"),
    d(agw.b.b, 2, "allium"),
    e(agw.b.b, 3, "houstonia"),
    f(agw.b.b, 4, "red_tulip", "tulipRed"),
    g(agw.b.b, 5, "orange_tulip", "tulipOrange"),
    h(agw.b.b, 6, "white_tulip", "tulipWhite"),
    i(agw.b.b, 7, "pink_tulip", "tulipPink"),
    j(agw.b.b, 8, "oxeye_daisy", "oxeyeDaisy");

    private static final agw.a[][] k;
    private final agw.b l;
    private final int m;
    private final String n;
    private final String o;

    private agw.a(agw.b b2, int n2, String string2) {
        this(b2, n2, string2, string2);
    }

    private agw.a(agw.b b2, int n2, String string2, String string3) {
        this.l = b2;
        this.m = n2;
        this.n = string2;
        this.o = string3;
    }

    public agw.b a() {
        return this.l;
    }

    public int b() {
        return this.m;
    }

    public static agw.a a(agw.b b2, int n2) {
        agw.a[] aArray = k[b2.ordinal()];
        if (n2 < 0 || n2 >= aArray.length) {
            int n2 = 0;
        }
        return aArray[n2];
    }

    public static agw.a[] a(agw.b b2) {
        return k[b2.ordinal()];
    }

    public String toString() {
        return this.n;
    }

    @Override
    public String l() {
        return this.n;
    }

    public String d() {
        return this.o;
    }

    static {
        k = new agw.a[agw.b.values().length][];
        for (final agw.b b2 : agw.b.values()) {
            Collection collection = Collections2.filter((Collection)Lists.newArrayList((Object[])agw.a.values()), (Predicate)new Predicate<agw.a>(){

                public boolean a(agw.a a2) {
                    return a2.a() == b2;
                }

                public /* synthetic */ boolean apply(Object object) {
                    return this.a((agw.a)object);
                }
            });
            agw.a.k[b2.ordinal()] = (agw.a[])collection.toArray((Object[])new agw.a[collection.size()]);
        }
    }
}
