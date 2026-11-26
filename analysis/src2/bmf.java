/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  java.lang.Comparable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class bmf {
    private final int a;
    private final Set<a> b = Sets.newHashSetWithExpectedSize((int)256);
    private final List<b> c = Lists.newArrayListWithCapacity((int)256);
    private int d;
    private int e;
    private final int f;
    private final int g;
    private final boolean h;
    private final int i;

    public bmf(int n, int n2, boolean bl, int n3, int n4) {
        this.a = n4;
        this.f = n;
        this.g = n2;
        this.h = bl;
        this.i = n3;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public void a(bmi bmi2) {
        a a2 = new a(bmi2, this.a);
        if (this.i > 0) {
            a2.a(this.i);
        }
        this.b.add((Object)a2);
    }

    public void c() {
        Object[] objectArray = (a[])this.b.toArray((Object[])new a[this.b.size()]);
        Arrays.sort((Object[])objectArray);
        for (Object object : objectArray) {
            if (this.a((a)object)) continue;
            String string = String.format((String)"Unable to fit: %s - size: %dx%d - Maybe try a lowerresolution resourcepack?", (Object[])new Object[]{((a)object).a().i(), ((a)object).a().c(), ((a)object).a().d()});
            throw new bmg((a)object, string);
        }
        if (this.h) {
            this.d = ns.b(this.d);
            this.e = ns.b(this.e);
        }
    }

    public List<bmi> d() {
        ArrayList arrayList = Lists.newArrayList();
        for (b b2 : this.c) {
            b2.a((List<b>)arrayList);
        }
        Iterator iterator = Lists.newArrayList();
        for (b b3 : arrayList) {
            a a2 = b3.a();
            bmi \u26032 = a2.a();
            \u26032.a(this.d, this.e, b3.b(), b3.c(), a2.e());
            iterator.add((Object)\u26032);
        }
        return iterator;
    }

    private static int b(int n, int n2) {
        return (n >> n2) + ((n & (1 << n2) - 1) == 0 ? 0 : 1) << n2;
    }

    private boolean a(a a22) {
        a a22;
        for (int i = 0; i < this.c.size(); ++i) {
            if (((b)this.c.get(i)).a(a22)) {
                return true;
            }
            a22.d();
            if (((b)this.c.get(i)).a(a22)) {
                return true;
            }
            a22.d();
        }
        return this.b(a22);
    }

    private boolean b(a a2) {
        b \u26033;
        boolean \u26032;
        int n = Math.min((int)a2.b(), (int)a2.c());
        boolean bl = \u2603 = this.d == 0 && this.e == 0;
        if (this.h) {
            \u2603 = ns.b(this.d);
            \u2603 = ns.b(this.e);
            \u2603 = ns.b(this.d + n);
            \u2603 = ns.b(this.e + n);
            boolean bl2 = \u2603 <= this.f;
            boolean bl3 = \u2603 = \u2603 <= this.g;
            if (!bl2 && !\u2603) {
                return false;
            }
            \u2603 = \u2603 != \u2603;
            boolean bl4 = \u2603 = \u2603 != \u2603;
            \u26032 = \u2603 ^ \u2603 ? !\u2603 : bl2 && \u2603 <= \u2603;
        } else {
            \u2603 = this.d + n <= this.f ? 1 : 0;
            int n2 = \u2603 = this.e + n <= this.g ? 1 : 0;
            if (\u2603 == 0 && \u2603 == 0) {
                return false;
            }
            \u26032 = \u2603 != 0 && (\u2603 || this.d <= this.e);
        }
        \u2603 = Math.max((int)a2.b(), (int)a2.c());
        if (ns.b((\u26032 ? this.e : this.d) + \u2603) > (\u26032 ? this.g : this.f)) {
            return false;
        }
        if (\u26032) {
            if (a2.b() > a2.c()) {
                a2.d();
            }
            if (this.e == 0) {
                this.e = a2.c();
            }
            \u26033 = new b(this.d, 0, a2.b(), this.e);
            this.d += a2.b();
        } else {
            \u26033 = new b(0, this.e, this.d, a2.c());
            this.e += a2.c();
        }
        \u26033.a(a2);
        this.c.add((Object)\u26033);
        return true;
    }

    public static class b {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private List<b> e;
        private a f;

        public b(int n, int n2, int n3, int n4) {
            this.a = n;
            this.b = n2;
            this.c = n3;
            this.d = n4;
        }

        public a a() {
            return this.f;
        }

        public int b() {
            return this.a;
        }

        public int c() {
            return this.b;
        }

        public boolean a(a a2) {
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
                this.e.add((Object)new b(this.a, this.b, n, \u2603));
                \u2603 = this.c - n;
                \u2603 = this.d - \u2603;
                if (\u2603 > 0 && \u2603 > 0) {
                    \u2603 = Math.max((int)this.d, (int)\u2603);
                    if (\u2603 >= (\u2603 = Math.max((int)this.c, (int)\u2603))) {
                        this.e.add((Object)new b(this.a, this.b + \u2603, n, \u2603));
                        this.e.add((Object)new b(this.a + n, this.b, \u2603, this.d));
                    } else {
                        this.e.add((Object)new b(this.a + n, this.b, \u2603, \u2603));
                        this.e.add((Object)new b(this.a, this.b + \u2603, this.c, \u2603));
                    }
                } else if (\u2603 == 0) {
                    this.e.add((Object)new b(this.a, this.b + \u2603, n, \u2603));
                } else if (\u2603 == 0) {
                    this.e.add((Object)new b(this.a + n, this.b, \u2603, \u2603));
                }
            }
            for (b b2 : this.e) {
                if (!b2.a(a2)) continue;
                return true;
            }
            return false;
        }

        public void a(List<b> list) {
            if (this.f != null) {
                list.add((Object)this);
            } else if (this.e != null) {
                for (b b2 : this.e) {
                    b2.a(list);
                }
            }
        }

        public String toString() {
            return "Slot{originX=" + this.a + ", originY=" + this.b + ", width=" + this.c + ", height=" + this.d + ", texture=" + this.f + ", subSlots=" + this.e + '}';
        }
    }

    public static class a
    implements Comparable<a> {
        private final bmi a;
        private final int b;
        private final int c;
        private final int d;
        private boolean e;
        private float f = 1.0f;

        public a(bmi bmi2, int n) {
            this.a = bmi2;
            this.b = bmi2.c();
            this.c = bmi2.d();
            this.d = n;
            this.e = bmf.b(this.c, n) > bmf.b(this.b, n);
        }

        public bmi a() {
            return this.a;
        }

        public int b() {
            return this.e ? bmf.b((int)((float)this.c * this.f), this.d) : bmf.b((int)((float)this.b * this.f), this.d);
        }

        public int c() {
            return this.e ? bmf.b((int)((float)this.b * this.f), this.d) : bmf.b((int)((float)this.c * this.f), this.d);
        }

        public void d() {
            this.e = !this.e;
        }

        public boolean e() {
            return this.e;
        }

        public void a(int n) {
            if (this.b <= n || this.c <= n) {
                return;
            }
            this.f = (float)n / (float)Math.min((int)this.b, (int)this.c);
        }

        public String toString() {
            return "Holder{width=" + this.b + ", height=" + this.c + '}';
        }

        public int a(a a22) {
            int \u26032;
            if (this.c() == a22.c()) {
                if (this.b() == a22.b()) {
                    if (this.a.i() == null) {
                        return a22.a.i() == null ? 0 : -1;
                    }
                    return this.a.i().compareTo(a22.a.i());
                }
                \u26032 = this.b() < a22.b() ? 1 : -1;
            } else {
                a a22;
                \u26032 = this.c() < a22.c() ? 1 : -1;
            }
            return \u26032;
        }

        public /* synthetic */ int compareTo(Object object) {
            return this.a((a)object);
        }
    }
}
