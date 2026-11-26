/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.ArrayList
 *  java.util.List
 */
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class baf {
    private static final bah b = new a();
    private static final bah c = new b(-1, true);
    private static final bah d = new b(1, true);
    private static final bah e = new b(1, false);
    public static final bah a = new bah(){

        @Override
        public void a(baf baf2) {
        }

        @Override
        public eu A_() {
            return new fa("");
        }

        @Override
        public void a(float f, int n) {
        }

        @Override
        public boolean B_() {
            return false;
        }
    };
    private final bai f;
    private final List<baj> g = Lists.newArrayList();
    private bag h = new bae();
    private int i = -1;
    private int j;

    public baf(bai bai2) {
        this.f = bai2;
    }

    public bah a(int n) {
        \u2603 = n + this.j * 6;
        if (this.j > 0 && n == 0) {
            return c;
        }
        if (n == 7) {
            if (\u2603 < this.h.a().size()) {
                return d;
            }
            return e;
        }
        if (n == 8) {
            return b;
        }
        if (\u2603 < 0 || \u2603 >= this.h.a().size()) {
            return a;
        }
        return (bah)Objects.firstNonNull((Object)this.h.a().get(\u2603), (Object)a);
    }

    public List<bah> a() {
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i <= 8; ++i) {
            arrayList.add((Object)this.a(i));
        }
        return arrayList;
    }

    public bah b() {
        return this.a(this.i);
    }

    public bag c() {
        return this.h;
    }

    public void b(int n) {
        bah bah2 = this.a(n);
        if (bah2 != a) {
            if (this.i == n && bah2.B_()) {
                bah2.a(this);
            } else {
                this.i = n;
            }
        }
    }

    public void d() {
        this.f.a(this);
    }

    public int e() {
        return this.i;
    }

    public void a(bag bag2) {
        this.g.add((Object)this.f());
        this.h = bag2;
        this.i = -1;
        this.j = 0;
    }

    public baj f() {
        return new baj(this.h, this.a(), this.i);
    }

    static class b
    implements bah {
        private final int a;
        private final boolean b;

        public b(int n, boolean bl) {
            this.a = n;
            this.b = bl;
        }

        @Override
        public void a(baf baf2) {
            baf2.j += this.a;
        }

        @Override
        public eu A_() {
            if (this.a < 0) {
                return new fa("Previous Page");
            }
            return new fa("Next Page");
        }

        @Override
        public void a(float f, int n) {
            ave.A().P().a(awm.a);
            if (this.a < 0) {
                avp.a(0, 0, 144.0f, 0.0f, 16, 16, 256.0f, 256.0f);
            } else {
                avp.a(0, 0, 160.0f, 0.0f, 16, 16, 256.0f, 256.0f);
            }
        }

        @Override
        public boolean B_() {
            return this.b;
        }
    }

    static class a
    implements bah {
        private a() {
        }

        @Override
        public void a(baf baf2) {
            baf2.d();
        }

        @Override
        public eu A_() {
            return new fa("Close menu");
        }

        @Override
        public void a(float f, int n) {
            ave.A().P().a(awm.a);
            avp.a(0, 0, 128.0f, 0.0f, 16, 16, 256.0f, 256.0f);
        }

        @Override
        public boolean B_() {
            return true;
        }
    }
}
