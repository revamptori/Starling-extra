/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.String
 */
public class ats
implements Comparable<ats> {
    private final String a;
    private final String b;
    private final long c;
    private final long d;
    private final boolean e;
    private final adp.a f;
    private final boolean g;
    private final boolean h;

    public ats(String string, String string2, long l, long l2, adp.a a2, boolean bl, boolean bl2, boolean bl3) {
        this.a = string;
        this.b = string2;
        this.c = l;
        this.d = l2;
        this.f = a2;
        this.e = bl;
        this.g = bl2;
        this.h = bl3;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public long c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public long e() {
        return this.c;
    }

    public int a(ats ats2) {
        if (this.c < ats2.c) {
            return 1;
        }
        if (this.c > ats2.c) {
            return -1;
        }
        return this.a.compareTo(ats2.a);
    }

    public adp.a f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((ats)object);
    }
}
