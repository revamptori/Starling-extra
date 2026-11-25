/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.EnumSet
 *  java.util.Set
 */
import java.util.EnumSet;
import java.util.Set;

public static enum fi.a {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4);

    private int f;

    private fi.a(int n2) {
        this.f = n2;
    }

    private int a() {
        return 1 << this.f;
    }

    private boolean b(int n) {
        return (n & this.a()) == this.a();
    }

    public static Set<fi.a> a(int n) {
        EnumSet enumSet = EnumSet.noneOf(fi.a.class);
        for (fi.a a2 : fi.a.values()) {
            if (!a2.b(n)) continue;
            enumSet.add((Object)a2);
        }
        return enumSet;
    }

    public static int a(Set<fi.a> set) {
        int n = 0;
        for (fi.a a2 : set) {
            n |= a2.a();
        }
        return n;
    }
}
