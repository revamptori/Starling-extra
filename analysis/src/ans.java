/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 */
public class ans {
    private final short[] a = new short[65536];
    private final alz b = afi.a.Q();

    public alz a(int n, int n2, int n3) {
        \u2603 = n << 12 | n3 << 8 | n2;
        return this.a(\u2603);
    }

    public alz a(int n) {
        if (n < 0 || n >= this.a.length) {
            throw new IndexOutOfBoundsException("The coordinate is out of range");
        }
        alz alz2 = afh.d.a(this.a[n]);
        if (alz2 != null) {
            return alz2;
        }
        return this.b;
    }

    public void a(int n, int n2, int n3, alz alz2) {
        int n4 = n << 12 | n3 << 8 | n2;
        this.a(n4, alz2);
    }

    public void a(int n, alz alz2) {
        if (n < 0 || n >= this.a.length) {
            throw new IndexOutOfBoundsException("The coordinate is out of range");
        }
        this.a[n] = (short)afh.d.b(alz2);
    }
}
