/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public static enum hv.a {
    a,
    b,
    c,
    d,
    e;


    public static hv.a a(String string) {
        for (hv.a a2 : hv.a.values()) {
            if (!a2.name().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return a;
    }

    public static String[] a() {
        String[] stringArray = new String[hv.a.values().length];
        int \u26032 = 0;
        for (hv.a a2 : hv.a.values()) {
            stringArray[\u26032++] = a2.name().toLowerCase();
        }
        return stringArray;
    }
}
