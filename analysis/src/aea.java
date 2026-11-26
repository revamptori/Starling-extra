/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class aea {
    private static final a a = new a(){

        @Override
        public int a(ady ady2, cj cj2) {
            return ady2.b(cj2);
        }
    };
    private static final a b = new a(){

        @Override
        public int a(ady ady2, cj cj2) {
            return ady2.c(cj2);
        }
    };
    private static final a c = new a(){

        @Override
        public int a(ady ady2, cj cj2) {
            return ady2.ar;
        }
    };

    private static int a(adq adq2, cj cj2, a a2) {
        int n = 0;
        \u2603 = 0;
        \u2603 = 0;
        for (cj.a a3 : cj.b(cj2.a(-1, 0, -1), cj2.a(1, 0, 1))) {
            int n2 = a2.a(adq2.b(a3), a3);
            n += (n2 & 0xFF0000) >> 16;
            \u2603 += (n2 & 0xFF00) >> 8;
            \u2603 += n2 & 0xFF;
        }
        return (n / 9 & 0xFF) << 16 | (\u2603 / 9 & 0xFF) << 8 | \u2603 / 9 & 0xFF;
    }

    public static int a(adq adq2, cj cj2) {
        return aea.a(adq2, cj2, a);
    }

    public static int b(adq adq2, cj cj2) {
        return aea.a(adq2, cj2, b);
    }

    public static int c(adq adq2, cj cj2) {
        return aea.a(adq2, cj2, c);
    }

    static interface a {
        public int a(ady var1, cj var2);
    }
}
