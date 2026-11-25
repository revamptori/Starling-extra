/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.System
 */
public class asu {
    private asv[] a = new asv[1024];
    private int b;

    public asv a(asv asv22) {
        asv asv22;
        if (asv22.d >= 0) {
            throw new IllegalStateException("OW KNOWS!");
        }
        if (this.b == this.a.length) {
            asv[] asvArray = new asv[this.b << 1];
            System.arraycopy((Object)this.a, (int)0, (Object)asvArray, (int)0, (int)this.b);
            this.a = asvArray;
        }
        this.a[this.b] = asv22;
        asv22.d = this.b;
        this.a(this.b++);
        return asv22;
    }

    public void a() {
        this.b = 0;
    }

    public asv c() {
        asv asv2 = this.a[0];
        this.a[0] = this.a[--this.b];
        this.a[this.b] = null;
        if (this.b > 0) {
            this.b(0);
        }
        asv2.d = -1;
        return asv2;
    }

    public void a(asv asv2, float f) {
        \u2603 = asv2.g;
        asv2.g = f;
        if (f < \u2603) {
            this.a(asv2.d);
        } else {
            this.b(asv2.d);
        }
    }

    private void a(int n) {
        asv asv2 = this.a[n];
        float \u26032 = asv2.g;
        while (n > 0) {
            int n2 = n - 1 >> 1;
            asv \u26033 = this.a[n2];
            if (!(\u26032 < \u26033.g)) break;
            this.a[n] = \u26033;
            \u26033.d = n;
            n = n2;
        }
        this.a[n] = asv2;
        asv2.d = n;
    }

    private void b(int \u260362) {
        int \u260362;
        asv asv2 = this.a[\u260362];
        float \u26032 = asv2.g;
        while (true) {
            float \u26035;
            asv asv3;
            int n = 1 + (\u260362 << 1);
            \u2603 = n + 1;
            if (n >= this.b) break;
            asv \u26033 = this.a[n];
            float \u26034 = \u26033.g;
            if (\u2603 >= this.b) {
                asv3 = null;
                \u26035 = Float.POSITIVE_INFINITY;
            } else {
                asv3 = this.a[\u2603];
                \u26035 = asv3.g;
            }
            if (\u26034 < \u26035) {
                if (!(\u26034 < \u26032)) break;
                this.a[\u260362] = \u26033;
                \u26033.d = \u260362;
                \u260362 = n;
                continue;
            }
            if (!(\u26035 < \u26032)) break;
            this.a[\u260362] = asv3;
            asv3.d = \u260362;
            \u260362 = \u2603;
        }
        this.a[\u260362] = asv2;
        asv2.d = \u260362;
    }

    public boolean e() {
        return this.b == 0;
    }
}
