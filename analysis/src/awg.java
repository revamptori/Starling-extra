/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import java.util.List;

public class awg
extends awd {
    private final List<d> u = Lists.newArrayList();
    private final nm<avp> v = new nm();
    private final List<avw> w = Lists.newArrayList();
    private final f[][] x;
    private int y;
    private b z;
    private avp A;

    public awg(ave ave2, int n, int n2, int n3, int n4, int n5, b b2, f[] ... fArray) {
        super(ave2, n, n2, n3, n4, n5);
        this.z = b2;
        this.x = fArray;
        this.k = false;
        this.s();
        this.t();
    }

    private void s() {
        for (f[] fArray : this.x) {
            for (int i = 0; i < fArray.length; i += 2) {
                f f2 = fArray[i];
                \u2603 = i < fArray.length - 1 ? fArray[i + 1] : null;
                avp \u26032 = this.a(f2, 0, \u2603 == null);
                avp \u26033 = this.a(\u2603, 160, f2 == null);
                d \u26034 = new d(\u26032, \u26033);
                this.u.add((Object)\u26034);
                if (f2 != null && \u26032 != null) {
                    this.v.a(f2.b(), \u26032);
                    if (\u26032 instanceof avw) {
                        this.w.add((Object)((avw)\u26032));
                    }
                }
                if (\u2603 == null || \u26033 == null) continue;
                this.v.a(\u2603.b(), \u26033);
                if (!(\u26033 instanceof avw)) continue;
                this.w.add((Object)((avw)\u26033));
            }
        }
    }

    private void t() {
        this.u.clear();
        for (int i = 0; i < this.x[this.y].length; i += 2) {
            f f2 = this.x[this.y][i];
            \u2603 = i < this.x[this.y].length - 1 ? this.x[this.y][i + 1] : null;
            avp \u26032 = this.v.a(f2.b());
            avp \u26033 = \u2603 != null ? this.v.a(\u2603.b()) : null;
            d \u26034 = new d(\u26032, \u26033);
            this.u.add((Object)\u26034);
        }
    }

    public void c(int n) {
        if (n == this.y) {
            return;
        }
        \u2603 = this.y;
        this.y = n;
        this.t();
        this.e(\u2603, n);
        this.n = 0.0f;
    }

    public int e() {
        return this.y;
    }

    public int f() {
        return this.x.length;
    }

    public avp g() {
        return this.A;
    }

    public void h() {
        if (this.y > 0) {
            this.c(this.y - 1);
        }
    }

    public void i() {
        if (this.y < this.x.length - 1) {
            this.c(this.y + 1);
        }
    }

    public avp d(int n) {
        return this.v.a(n);
    }

    private void e(int n, int n22) {
        int n22;
        for (f \u26032 : this.x[n]) {
            if (\u26032 == null) continue;
            this.a(this.v.a(\u26032.b()), false);
        }
        for (f \u26032 : this.x[n22]) {
            if (\u26032 == null) continue;
            this.a(this.v.a(\u26032.b()), true);
        }
    }

    private void a(avp avp2, boolean bl) {
        if (avp2 instanceof avs) {
            ((avs)avp2).m = bl;
        } else if (avp2 instanceof avw) {
            ((avw)avp2).e(bl);
        } else if (avp2 instanceof avy) {
            ((avy)avp2).j = bl;
        }
    }

    private avp a(f f2, int n, boolean bl) {
        if (f2 instanceof g) {
            return this.a(this.b / 2 - 155 + n, 0, (g)f2);
        }
        if (f2 instanceof a) {
            return this.a(this.b / 2 - 155 + n, 0, (a)f2);
        }
        if (f2 instanceof c) {
            return this.a(this.b / 2 - 155 + n, 0, (c)f2);
        }
        if (f2 instanceof e) {
            return this.a(this.b / 2 - 155 + n, 0, (e)f2, bl);
        }
        return null;
    }

    public void a(boolean bl) {
        for (d d2 : this.u) {
            if (d2.b instanceof avs) {
                ((avs)((d)d2).b).l = bl;
            }
            if (!(d2.c instanceof avs)) continue;
            ((avs)((d)d2).c).l = bl;
        }
    }

    @Override
    public boolean b(int n, int n2, int n3) {
        boolean bl = super.b(n, n2, n3);
        int \u26032 = this.c(n, n2);
        if (\u26032 >= 0) {
            d d2 = this.e(\u26032);
            if (this.A != d2.d && this.A != null && this.A instanceof avw) {
                ((avw)this.A).b(false);
            }
            this.A = d2.d;
        }
        return bl;
    }

    private avx a(int n, int n2, g g2) {
        avx avx2 = new avx(this.z, g2.b(), n, n2, g2.c(), g2.e(), g2.f(), g2.g(), g2.a());
        avx2.m = g2.d();
        return avx2;
    }

    private awb a(int n, int n2, a a2) {
        awb awb2 = new awb(this.z, a2.b(), n, n2, a2.c(), a2.a());
        awb2.m = a2.d();
        return awb2;
    }

    private avw a(int n, int n2, c c2) {
        avw avw2 = new avw(c2.b(), this.a.k, n, n2, 150, 20);
        avw2.a(c2.c());
        avw2.a(this.z);
        avw2.e(c2.d());
        avw2.a(c2.a());
        return avw2;
    }

    private avy a(int n, int n2, e e2, boolean bl) {
        avy avy2 = bl ? new avy(this.a.k, e2.b(), n, n2, this.b - n * 2, 20, -1) : new avy(this.a.k, e2.b(), n, n2, 150, 20, -1);
        avy2.j = e2.d();
        avy2.a(e2.c());
        avy2.a();
        return avy2;
    }

    public void a(char c2, int n) {
        if (!(this.A instanceof avw)) {
            return;
        }
        avw \u26035 = (avw)this.A;
        if (axu.e(n)) {
            String string = axu.o();
            String[] \u26032 = string.split(";");
            int \u26033 = \u2603 = this.w.indexOf((Object)this.A);
            for (String string2 : \u26032) {
                ((avw)this.w.get(\u26033)).a(string2);
                \u26033 = \u26033 == this.w.size() - 1 ? 0 : ++\u26033;
                if (\u26033 == \u2603) break;
            }
            return;
        }
        if (n == 15) {
            \u26035.b(false);
            int \u26034 = this.w.indexOf((Object)this.A);
            \u26034 = axu.r() ? (\u26034 == 0 ? this.w.size() - 1 : --\u26034) : (\u26034 == this.w.size() - 1 ? 0 : ++\u26034);
            this.A = (avp)this.w.get(\u26034);
            \u26035 = (avw)this.A;
            \u26035.b(true);
            int \u26036 = \u26035.f + this.h;
            int \u26037 = \u26035.f;
            if (\u26036 > this.e) {
                this.n += (float)(\u26036 - this.e);
            } else if (\u26037 < this.d) {
                this.n = \u26037;
            }
        } else {
            \u26035.a(c2, n);
        }
    }

    public d e(int n) {
        return (d)this.u.get(n);
    }

    @Override
    public int b() {
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
        return this.e(n);
    }

    public static interface b {
        public void a(int var1, boolean var2);

        public void a(int var1, float var2);

        public void a(int var1, String var2);
    }

    public static class e
    extends f {
        public e(int n, String string, boolean bl) {
            super(n, string, bl);
        }
    }

    public static class c
    extends f {
        private final Predicate<String> a;

        public c(int n, String string, boolean bl, Predicate<String> predicate) {
            super(n, string, bl);
            this.a = (Predicate)Objects.firstNonNull(predicate, (Object)Predicates.alwaysTrue());
        }

        public Predicate<String> a() {
            return this.a;
        }
    }

    public static class a
    extends f {
        private final boolean a;

        public a(int n, String string, boolean bl, boolean bl2) {
            super(n, string, bl);
            this.a = bl2;
        }

        public boolean a() {
            return this.a;
        }
    }

    public static class g
    extends f {
        private final avx.a a;
        private final float b;
        private final float c;
        private final float d;

        public g(int n, String string, boolean bl, avx.a a2, float f2, float f3, float f4) {
            super(n, string, bl);
            this.a = a2;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public avx.a a() {
            return this.a;
        }

        public float e() {
            return this.b;
        }

        public float f() {
            return this.c;
        }

        public float g() {
            return this.d;
        }
    }

    public static class f {
        private final int a;
        private final String b;
        private final boolean c;

        public f(int n, String string, boolean bl) {
            this.a = n;
            this.b = string;
            this.c = bl;
        }

        public int b() {
            return this.a;
        }

        public String c() {
            return this.b;
        }

        public boolean d() {
            return this.c;
        }
    }

    public static class d
    implements awd.a {
        private final ave a = ave.A();
        private final avp b;
        private final avp c;
        private avp d;

        public d(avp avp2, avp avp3) {
            this.b = avp2;
            this.c = avp3;
        }

        public avp a() {
            return this.b;
        }

        public avp b() {
            return this.c;
        }

        @Override
        public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
            this.a(this.b, n3, n6, n7, false);
            this.a(this.c, n3, n6, n7, false);
        }

        private void a(avp avp2, int n, int n2, int n3, boolean bl) {
            if (avp2 == null) {
                return;
            }
            if (avp2 instanceof avs) {
                this.a((avs)avp2, n, n2, n3, bl);
            } else if (avp2 instanceof avw) {
                this.a((avw)avp2, n, bl);
            } else if (avp2 instanceof avy) {
                this.a((avy)avp2, n, n2, n3, bl);
            }
        }

        private void a(avs avs2, int n, int n2, int n3, boolean bl) {
            avs2.i = n;
            if (!bl) {
                avs2.a(this.a, n2, n3);
            }
        }

        private void a(avw avw2, int n, boolean bl) {
            avw2.f = n;
            if (!bl) {
                avw2.g();
            }
        }

        private void a(avy avy2, int n, int n2, int n3, boolean bl) {
            avy2.h = n;
            if (!bl) {
                avy2.a(this.a, n2, n3);
            }
        }

        @Override
        public void a(int n, int n2, int n3) {
            this.a(this.b, n3, 0, 0, true);
            this.a(this.c, n3, 0, 0, true);
        }

        @Override
        public boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
            boolean bl = this.a(this.b, n2, n3, n4);
            \u2603 = this.a(this.c, n2, n3, n4);
            return bl || \u2603;
        }

        private boolean a(avp avp2, int n, int n2, int n3) {
            if (avp2 == null) {
                return false;
            }
            if (avp2 instanceof avs) {
                return this.a((avs)avp2, n, n2, n3);
            }
            if (avp2 instanceof avw) {
                this.a((avw)avp2, n, n2, n3);
            }
            return false;
        }

        private boolean a(avs avs2, int n, int n2, int n3) {
            boolean bl = avs2.c(this.a, n, n2);
            if (bl) {
                this.d = avs2;
            }
            return bl;
        }

        private void a(avw avw2, int n, int n2, int n3) {
            avw2.a(n, n2, n3);
            if (avw2.m()) {
                this.d = avw2;
            }
        }

        @Override
        public void b(int n, int n2, int n3, int n4, int n5, int n6) {
            this.b(this.b, n2, n3, n4);
            this.b(this.c, n2, n3, n4);
        }

        private void b(avp avp2, int n, int n2, int n3) {
            if (avp2 == null) {
                return;
            }
            if (avp2 instanceof avs) {
                this.b((avs)avp2, n, n2, n3);
            }
        }

        private void b(avs avs2, int n, int n2, int n3) {
            avs2.a(n, n2);
        }
    }
}
