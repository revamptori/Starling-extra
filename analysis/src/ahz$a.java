/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum ahz.a implements nw
{
    a(0, "stone"){

        @Override
        public alz d() {
            return afi.b.Q().a(ajy.a, ajy.a.a);
        }
    }
    ,
    b(1, "cobblestone", "cobble"){

        @Override
        public alz d() {
            return afi.e.Q();
        }
    }
    ,
    c(2, "stone_brick", "brick"){

        @Override
        public alz d() {
            return afi.bf.Q().a(ajz.a, ajz.a.a);
        }
    }
    ,
    d(3, "mossy_brick", "mossybrick"){

        @Override
        public alz d() {
            return afi.bf.Q().a(ajz.a, ajz.a.b);
        }
    }
    ,
    e(4, "cracked_brick", "crackedbrick"){

        @Override
        public alz d() {
            return afi.bf.Q().a(ajz.a, ajz.a.c);
        }
    }
    ,
    f(5, "chiseled_brick", "chiseledbrick"){

        @Override
        public alz d() {
            return afi.bf.Q().a(ajz.a, ajz.a.d);
        }
    };

    private static final ahz.a[] g;
    private final int h;
    private final String i;
    private final String j;

    private ahz.a(int n2, String string2) {
        this(n2, string2, string2);
    }

    private ahz.a(int n2, String string2, String string3) {
        this.h = n2;
        this.i = string2;
        this.j = string3;
    }

    public int a() {
        return this.h;
    }

    public String toString() {
        return this.i;
    }

    public static ahz.a a(int n) {
        if (n < 0 || n >= g.length) {
            n = 0;
        }
        return g[n];
    }

    @Override
    public String l() {
        return this.i;
    }

    public String c() {
        return this.j;
    }

    public abstract alz d();

    public static ahz.a a(alz alz2) {
        for (ahz.a a2 : ahz.a.values()) {
            if (alz2 != a2.d()) continue;
            return a2;
        }
        return a;
    }

    static {
        g = new ahz.a[ahz.a.values().length];
        ahz.a[] aArray = ahz.a.values();
        int \u26032 = aArray.length;
        for (int i = 0; i < \u26032; ++i) {
            ahz.a.g[\u2603.a()] = \u2603 = aArray[i];
        }
    }
}
