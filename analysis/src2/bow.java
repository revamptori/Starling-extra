/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.List;

public class bow
implements boq {
    protected final List<bgg> a;
    protected final List<List<bgg>> b;
    protected final boolean c;
    protected final boolean d;
    protected final bmi e;
    protected final bgr f;

    public bow(List<bgg> list, List<List<bgg>> list2, boolean bl, boolean bl2, bmi bmi2, bgr bgr2) {
        this.a = list;
        this.b = list2;
        this.c = bl;
        this.d = bl2;
        this.e = bmi2;
        this.f = bgr2;
    }

    @Override
    public List<bgg> a(cq cq2) {
        return (List)this.b.get(cq2.ordinal());
    }

    @Override
    public List<bgg> a() {
        return this.a;
    }

    @Override
    public boolean b() {
        return this.c;
    }

    @Override
    public boolean c() {
        return this.d;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public bmi e() {
        return this.e;
    }

    @Override
    public bgr f() {
        return this.f;
    }

    public static class a {
        private final List<bgg> a = Lists.newArrayList();
        private final List<List<bgg>> b = Lists.newArrayListWithCapacity((int)6);
        private final boolean c;
        private bmi d;
        private boolean e;
        private bgr f;

        public a(bgl bgl2) {
            this(bgl2.b(), bgl2.c(), bgl2.g());
        }

        public a(boq boq22, bmi bmi2) {
            this(boq22.b(), boq22.c(), boq22.f());
            boq boq22;
            this.d = boq22.e();
            for (cq cq2 : cq.values()) {
                this.a(boq22, bmi2, cq2);
            }
            this.a(boq22, bmi2);
        }

        private void a(boq boq2, bmi bmi2, cq cq2) {
            for (bgg bgg2 : boq2.a(cq2)) {
                this.a(cq2, new bgn(bgg2, bmi2));
            }
        }

        private void a(boq boq2, bmi bmi2) {
            for (bgg bgg2 : boq2.a()) {
                this.a(new bgn(bgg2, bmi2));
            }
        }

        private a(boolean bl3, boolean bl2, bgr bgr2) {
            boolean bl3;
            for (cq cq2 : cq.values()) {
                this.b.add((Object)Lists.newArrayList());
            }
            this.c = bl3;
            this.e = bl2;
            this.f = bgr2;
        }

        public a a(cq cq2, bgg bgg2) {
            ((List)this.b.get(cq2.ordinal())).add((Object)bgg2);
            return this;
        }

        public a a(bgg bgg2) {
            this.a.add((Object)bgg2);
            return this;
        }

        public a a(bmi bmi2) {
            this.d = bmi2;
            return this;
        }

        public boq b() {
            if (this.d == null) {
                throw new RuntimeException("Missing particle!");
            }
            return new bow(this.a, this.b, this.c, this.e, this.d, this.f);
        }
    }
}
