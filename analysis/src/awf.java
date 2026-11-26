/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.List;

public class awf
extends awd {
    private final List<a> u = Lists.newArrayList();

    public awf(ave ave2, int n, int n2, int n3, int n4, int n5, avh.a ... aArray) {
        super(ave2, n, n2, n3, n4, n5);
        this.k = false;
        for (int i = 0; i < aArray.length; i += 2) {
            avh.a a2 = aArray[i];
            \u2603 = i < aArray.length - 1 ? aArray[i + 1] : null;
            avs \u26032 = this.a(ave2, n / 2 - 155, 0, a2);
            avs \u26033 = this.a(ave2, n / 2 - 155 + 160, 0, \u2603);
            this.u.add((Object)new a(\u26032, \u26033));
        }
    }

    private avs a(ave ave2, int n, int n2, avh.a a2) {
        if (a2 == null) {
            return null;
        }
        int n3 = a2.c();
        return a2.a() ? new awj(n3, n, n2, a2) : new awe(n3, n, n2, a2, ave2.t.c(a2));
    }

    public a c(int n) {
        return (a)this.u.get(n);
    }

    @Override
    protected int b() {
        return this.u.size();
    }

    @Override
    public int c() {
        return 400;
    }

    @Override
    protected int d() {
        return super.d() + 32;
    }

    @Override
    public /* synthetic */ awd.a b(int n) {
        return this.c(n);
    }

    public static class a
    implements awd.a {
        private final ave a = ave.A();
        private final avs b;
        private final avs c;

        public a(avs avs2, avs avs3) {
            this.b = avs2;
            this.c = avs3;
        }

        @Override
        public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
            if (this.b != null) {
                this.b.i = n3;
                this.b.a(this.a, n6, n7);
            }
            if (this.c != null) {
                this.c.i = n3;
                this.c.a(this.a, n6, n7);
            }
        }

        @Override
        public boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
            if (this.b.c(this.a, n2, n3)) {
                if (this.b instanceof awe) {
                    this.a.t.a(((awe)this.b).c(), 1);
                    this.b.j = this.a.t.c(avh.a.a(this.b.k));
                }
                return true;
            }
            if (this.c != null && this.c.c(this.a, n2, n3)) {
                if (this.c instanceof awe) {
                    this.a.t.a(((awe)this.c).c(), 1);
                    this.c.j = this.a.t.c(avh.a.a(this.c.k));
                }
                return true;
            }
            return false;
        }

        @Override
        public void b(int n, int n2, int n3, int n4, int n5, int n6) {
            if (this.b != null) {
                this.b.a(n2, n3);
            }
            if (this.c != null) {
                this.c.a(n2, n3);
            }
        }

        @Override
        public void a(int n, int n2, int n3) {
        }
    }
}
