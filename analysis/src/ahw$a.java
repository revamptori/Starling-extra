/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum ahw.a implements nw
{
    a("x"),
    b("y"),
    c("z"),
    d("none");

    private final String e;

    private ahw.a(String string2) {
        this.e = string2;
    }

    public String toString() {
        return this.e;
    }

    public static ahw.a a(cq.a a2) {
        switch (a2) {
            case a: {
                return a;
            }
            case b: {
                return b;
            }
            case c: {
                return c;
            }
        }
        return d;
    }

    @Override
    public String l() {
        return this.e;
    }
}
