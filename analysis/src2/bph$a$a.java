/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public static enum bph.a.a {
    a("file"),
    b("event");

    private final String c;

    private bph.a.a(String string2) {
        this.c = string2;
    }

    public static bph.a.a a(String string) {
        for (bph.a.a a2 : bph.a.a.values()) {
            if (!a2.c.equals((Object)string)) continue;
            return a2;
        }
        return null;
    }
}
