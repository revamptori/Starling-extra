/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
static final class mw.3
implements mx {
    mw.3() {
    }

    @Override
    public String a(int n) {
        double d = (double)n / 100.0;
        \u2603 = d / 1000.0;
        if (\u2603 > 0.5) {
            return l.format(\u2603) + " km";
        }
        if (d > 0.5) {
            return l.format(d) + " m";
        }
        return n + " cm";
    }
}
