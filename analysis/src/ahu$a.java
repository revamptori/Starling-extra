/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum ahu.a implements nw
{
    a(0, "down_x", cq.a),
    b(1, "east", cq.f),
    c(2, "west", cq.e),
    d(3, "south", cq.d),
    e(4, "north", cq.c),
    f(5, "up_z", cq.b),
    g(6, "up_x", cq.b),
    h(7, "down_z", cq.a);

    private static final ahu.a[] i;
    private final int j;
    private final String k;
    private final cq l;

    private ahu.a(int n2, String string2, cq cq2) {
        this.j = n2;
        this.k = string2;
        this.l = cq2;
    }

    public int a() {
        return this.j;
    }

    public cq c() {
        return this.l;
    }

    public String toString() {
        return this.k;
    }

    public static ahu.a a(int n) {
        if (n < 0 || n >= i.length) {
            n = 0;
        }
        return i[n];
    }

    public static ahu.a a(cq cq2, cq cq3) {
        switch (cq2) {
            case a: {
                switch (cq3.k()) {
                    case a: {
                        return a;
                    }
                    case c: {
                        return h;
                    }
                }
                throw new IllegalArgumentException("Invalid entityFacing " + cq3 + " for facing " + cq2);
            }
            case b: {
                switch (cq3.k()) {
                    case a: {
                        return g;
                    }
                    case c: {
                        return f;
                    }
                }
                throw new IllegalArgumentException("Invalid entityFacing " + cq3 + " for facing " + cq2);
            }
            case c: {
                return e;
            }
            case d: {
                return d;
            }
            case e: {
                return c;
            }
            case f: {
                return b;
            }
        }
        throw new IllegalArgumentException("Invalid facing: " + cq2);
    }

    @Override
    public String l() {
        return this.k;
    }

    static {
        i = new ahu.a[ahu.a.values().length];
        ahu.a[] aArray = ahu.a.values();
        int \u26032 = aArray.length;
        for (int i = 0; i < \u26032; ++i) {
            ahu.a.i[\u2603.a()] = \u2603 = aArray[i];
        }
    }
}
