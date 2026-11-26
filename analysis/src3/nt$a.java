/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.String
 */
public static final class nt.a
implements Comparable<nt.a> {
    public double a;
    public double b;
    public String c;

    public nt.a(String string, double d, double d2) {
        this.c = string;
        this.a = d;
        this.b = d2;
    }

    public int a(nt.a a2) {
        if (a2.a < this.a) {
            return -1;
        }
        if (a2.a > this.a) {
            return 1;
        }
        return a2.c.compareTo(this.c);
    }

    public int a() {
        return (this.c.hashCode() & 0xAAAAAA) + 0x444444;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((nt.a)object);
    }
}
