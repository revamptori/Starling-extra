/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class asx {
    private final asv[] a;
    private int b;
    private int c;

    public asx(asv[] asvArray) {
        this.a = asvArray;
        this.c = asvArray.length;
    }

    public void a() {
        ++this.b;
    }

    public boolean b() {
        return this.b >= this.c;
    }

    public asv c() {
        if (this.c > 0) {
            return this.a[this.c - 1];
        }
        return null;
    }

    public asv a(int n) {
        return this.a[n];
    }

    public int d() {
        return this.c;
    }

    public void b(int n) {
        this.c = n;
    }

    public int e() {
        return this.b;
    }

    public void c(int n) {
        this.b = n;
    }

    public aui a(pk pk2, int n2) {
        double d = (double)this.a[n2].a + (double)((int)(pk2.J + 1.0f)) * 0.5;
        \u2603 = this.a[n2].b;
        \u2603 = (double)this.a[n2].c + (double)((int)(pk2.J + 1.0f)) * 0.5;
        return new aui(d, \u2603, \u2603);
    }

    public aui a(pk pk2) {
        return this.a(pk2, this.b);
    }

    public boolean a(asx asx2) {
        if (asx2 == null) {
            return false;
        }
        if (asx2.a.length != this.a.length) {
            return false;
        }
        for (int i = 0; i < this.a.length; ++i) {
            if (this.a[i].a == asx2.a[i].a && this.a[i].b == asx2.a[i].b && this.a[i].c == asx2.a[i].c) continue;
            return false;
        }
        return true;
    }

    public boolean b(aui aui2) {
        asv asv2 = this.c();
        if (asv2 == null) {
            return false;
        }
        return asv2.a == (int)aui2.a && asv2.c == (int)aui2.c;
    }
}
