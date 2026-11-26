/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
import java.util.List;

public class ajh
extends agr {
    public static final amm<a> a = amm.a("variant", a.class);

    public ajh() {
        this.j(this.M.b().a(a, ajh$a.a));
    }

    @Override
    public int a(alz alz2) {
        return alz2.b(a).a();
    }

    @Override
    public void a(zw zw2, yz yz2, List<zx> list) {
        for (a a2 : ajh$a.values()) {
            list.add((Object)new zx(zw2, 1, a2.a()));
        }
    }

    @Override
    public arn g(alz alz2) {
        return alz2.b(a).c();
    }

    @Override
    public alz a(int n) {
        return this.Q().a(a, ajh$a.a(n));
    }

    @Override
    public int c(alz alz2) {
        return alz2.b(a).a();
    }

    @Override
    protected ama e() {
        return new ama(this, a);
    }

    public static enum a implements nw
    {
        a(0, "sand", "default", arn.d),
        b(1, "red_sand", "red", arn.q);

        private static final a[] c;
        private final int d;
        private final String e;
        private final arn f;
        private final String g;

        private a(int n2, String string2, String string3, arn arn2) {
            this.d = n2;
            this.e = string2;
            this.f = arn2;
            this.g = string3;
        }

        public int a() {
            return this.d;
        }

        public String toString() {
            return this.e;
        }

        public arn c() {
            return this.f;
        }

        public static a a(int n) {
            if (n < 0 || n >= c.length) {
                n = 0;
            }
            return c[n];
        }

        @Override
        public String l() {
            return this.e;
        }

        public String d() {
            return this.g;
        }

        static {
            c = new a[ajh$a.values().length];
            a[] aArray = ajh$a.values();
            int \u26032 = aArray.length;
            for (int i = 0; i < \u26032; ++i) {
                ajh$a.c[\u2603.a()] = \u2603 = aArray[i];
            }
        }
    }
}
