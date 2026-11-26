/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public static enum n.a {
    a(0, "SuccessCount"),
    b(1, "AffectedBlocks"),
    c(2, "AffectedEntities"),
    d(3, "AffectedItems"),
    e(4, "QueryResult");

    final int f;
    final String g;

    private n.a(int n3, String string2) {
        this.f = n3;
        this.g = string2;
    }

    public int a() {
        return this.f;
    }

    public String b() {
        return this.g;
    }

    public static String[] c() {
        String[] stringArray = new String[n.a.values().length];
        int \u26032 = 0;
        for (n.a a2 : n.a.values()) {
            stringArray[\u26032++] = a2.b();
        }
        return stringArray;
    }

    public static n.a a(String string) {
        for (n.a a2 : n.a.values()) {
            if (!a2.b().equals((Object)string)) continue;
            return a2;
        }
        return null;
    }
}
