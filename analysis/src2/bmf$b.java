/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.List;

public static class bmf.b {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private List<bmf.b> e;
    private bmf.a f;

    public bmf.b(int n, int n2, int n3, int n4) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public bmf.a a() {
        return this.f;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public boolean a(bmf.a a2) {
        if (this.f != null) {
            return false;
        }
        int n = a2.b();
        \u2603 = a2.c();
        if (n > this.c || \u2603 > this.d) {
            return false;
        }
        if (n == this.c && \u2603 == this.d) {
            this.f = a2;
            return true;
        }
        if (this.e == null) {
            this.e = Lists.newArrayListWithCapacity((int)1);
            this.e.add((Object)new bmf.b(this.a, this.b, n, \u2603));
            \u2603 = this.c - n;
            \u2603 = this.d - \u2603;
            if (\u2603 > 0 && \u2603 > 0) {
                \u2603 = Math.max((int)this.d, (int)\u2603);
                if (\u2603 >= (\u2603 = Math.max((int)this.c, (int)\u2603))) {
                    this.e.add((Object)new bmf.b(this.a, this.b + \u2603, n, \u2603));
                    this.e.add((Object)new bmf.b(this.a + n, this.b, \u2603, this.d));
                } else {
                    this.e.add((Object)new bmf.b(this.a + n, this.b, \u2603, \u2603));
                    this.e.add((Object)new bmf.b(this.a, this.b + \u2603, this.c, \u2603));
                }
            } else if (\u2603 == 0) {
                this.e.add((Object)new bmf.b(this.a, this.b + \u2603, n, \u2603));
            } else if (\u2603 == 0) {
                this.e.add((Object)new bmf.b(this.a + n, this.b, \u2603, \u2603));
            }
        }
        for (bmf.b b2 : this.e) {
            if (!b2.a(a2)) continue;
            return true;
        }
        return false;
    }

    public void a(List<bmf.b> list) {
        if (this.f != null) {
            list.add((Object)this);
        } else if (this.e != null) {
            for (bmf.b b2 : this.e) {
                b2.a(list);
            }
        }
    }

    public String toString() {
        return "Slot{originX=" + this.a + ", originY=" + this.b + ", width=" + this.c + ", height=" + this.d + ", texture=" + this.f + ", subSlots=" + this.e + '}';
    }
}
