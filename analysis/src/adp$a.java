/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public static enum adp.a {
    a(-1, ""),
    b(0, "survival"),
    c(1, "creative"),
    d(2, "adventure"),
    e(3, "spectator");

    int f;
    String g;

    private adp.a(int n2, String string2) {
        this.f = n2;
        this.g = string2;
    }

    public int a() {
        return this.f;
    }

    public String b() {
        return this.g;
    }

    public void a(wl wl2) {
        if (this == c) {
            wl2.c = true;
            wl2.d = true;
            wl2.a = true;
        } else if (this == e) {
            wl2.c = true;
            wl2.d = false;
            wl2.a = true;
            wl2.b = true;
        } else {
            wl2.c = false;
            wl2.d = false;
            wl2.a = false;
            wl2.b = false;
        }
        wl2.e = !this.c();
    }

    public boolean c() {
        return this == d || this == e;
    }

    public boolean d() {
        return this == c;
    }

    public boolean e() {
        return this == b || this == d;
    }

    public static adp.a a(int n) {
        for (adp.a a2 : adp.a.values()) {
            if (a2.f != n) continue;
            return a2;
        }
        return b;
    }

    public static adp.a a(String string) {
        for (adp.a a2 : adp.a.values()) {
            if (!a2.g.equals((Object)string)) continue;
            return a2;
        }
        return b;
    }
}
