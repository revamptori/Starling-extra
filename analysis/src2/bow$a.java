/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.List;

public static class bow.a {
    private final List<bgg> a = Lists.newArrayList();
    private final List<List<bgg>> b = Lists.newArrayListWithCapacity((int)6);
    private final boolean c;
    private bmi d;
    private boolean e;
    private bgr f;

    public bow.a(bgl bgl2) {
        this(bgl2.b(), bgl2.c(), bgl2.g());
    }

    public bow.a(boq boq22, bmi bmi2) {
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

    private bow.a(boolean bl3, boolean bl2, bgr bgr2) {
        boolean bl3;
        for (cq cq2 : cq.values()) {
            this.b.add((Object)Lists.newArrayList());
        }
        this.c = bl3;
        this.e = bl2;
        this.f = bgr2;
    }

    public bow.a a(cq cq2, bgg bgg2) {
        ((List)this.b.get(cq2.ordinal())).add((Object)bgg2);
        return this;
    }

    public bow.a a(bgg bgg2) {
        this.a.add((Object)bgg2);
        return this;
    }

    public bow.a a(bmi bmi2) {
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
