/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
static final class mw.2
implements mx {
    mw.2() {
    }

    @Override
    public String a(int n) {
        double d = (double)n / 20.0;
        \u2603 = d / 60.0;
        \u2603 = \u2603 / 60.0;
        \u2603 = \u2603 / 24.0;
        \u2603 = \u2603 / 365.0;
        if (\u2603 > 0.5) {
            return l.format(\u2603) + " y";
        }
        if (\u2603 > 0.5) {
            return l.format(\u2603) + " d";
        }
        if (\u2603 > 0.5) {
            return l.format(\u2603) + " h";
        }
        if (\u2603 > 0.5) {
            return l.format(\u2603) + " m";
        }
        return d + " s";
    }
}
