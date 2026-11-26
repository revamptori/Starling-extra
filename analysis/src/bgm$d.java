/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
import java.util.List;

public static class bgm.d {
    private final String a;
    private final List<bgm.c> b;

    public bgm.d(String string, List<bgm.c> list) {
        this.a = string;
        this.b = list;
    }

    public List<bgm.c> b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof bgm.d)) {
            return false;
        }
        bgm.d d2 = (bgm.d)object;
        if (!this.a.equals((Object)d2.a)) {
            return false;
        }
        return this.b.equals(d2.b);
    }

    public int hashCode() {
        int n = this.a.hashCode();
        n = 31 * n + this.b.hashCode();
        return n;
    }

    static /* synthetic */ String a(bgm.d d2) {
        return d2.a;
    }
}
