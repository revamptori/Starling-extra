/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 *  java.util.Random
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class bpy
implements bqb<bpw> {
    private final List<bqb<bpw>> a = Lists.newArrayList();
    private final Random b = new Random();
    private final jy c;
    private final bpg d;
    private double e;
    private double f;

    public bpy(jy jy2, double d, double d2, bpg bpg2) {
        this.c = jy2;
        this.f = d2;
        this.e = d;
        this.d = bpg2;
    }

    @Override
    public int a() {
        int n = 0;
        for (bqb bqb2 : this.a) {
            n += bqb2.a();
        }
        return n;
    }

    public bpw b() {
        int n = this.a();
        if (this.a.isEmpty() || n == 0) {
            return bpz.a;
        }
        \u2603 = this.b.nextInt(n);
        for (bqb bqb2 : this.a) {
            if ((\u2603 -= bqb2.a()) >= 0) continue;
            bpw bpw2 = (bpw)bqb2.g();
            bpw2.a(bpw2.b() * this.e);
            bpw2.b(bpw2.c() * this.f);
            return bpw2;
        }
        return bpz.a;
    }

    public void a(bqb<bpw> bqb2) {
        this.a.add(bqb2);
    }

    public jy c() {
        return this.c;
    }

    public bpg d() {
        return this.d;
    }

    @Override
    public /* synthetic */ Object g() {
        return this.b();
    }
}
