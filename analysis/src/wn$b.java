/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public static enum wn.b {
    a(0, "options.chat.visibility.full"),
    b(1, "options.chat.visibility.system"),
    c(2, "options.chat.visibility.hidden");

    private static final wn.b[] d;
    private final int e;
    private final String f;

    private wn.b(int n2, String string2) {
        this.e = n2;
        this.f = string2;
    }

    public int a() {
        return this.e;
    }

    public static wn.b a(int n) {
        return d[n % d.length];
    }

    public String b() {
        return this.f;
    }

    static {
        d = new wn.b[wn.b.values().length];
        wn.b[] bArray = wn.b.values();
        int \u26032 = bArray.length;
        for (int i = 0; i < \u26032; ++i) {
            wn.b.d[\u2603.e] = \u2603 = bArray[i];
        }
    }
}
