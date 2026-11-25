/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.System
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.List;

public class ams {
    private final List<amq> a = Lists.newArrayList();
    private double b = 0.0;
    private double c = 0.0;
    private double d;
    private double e = this.d = 6.0E7;
    private long f;
    private long g;
    private int h = 29999984;
    private double i = 0.2;
    private double j = 5.0;
    private int k = 15;
    private int l = 5;

    public boolean a(cj cj2) {
        return (double)(cj2.n() + 1) > this.b() && (double)cj2.n() < this.d() && (double)(cj2.p() + 1) > this.c() && (double)cj2.p() < this.e();
    }

    public boolean a(adg adg2) {
        return (double)adg2.e() > this.b() && (double)adg2.c() < this.d() && (double)adg2.f() > this.c() && (double)adg2.d() < this.e();
    }

    public boolean a(aug aug2) {
        return aug2.d > this.b() && aug2.a < this.d() && aug2.f > this.c() && aug2.c < this.e();
    }

    public double a(pk pk2) {
        return this.b(pk2.s, pk2.u);
    }

    public double b(double d, double d2) {
        \u2603 = d2 - this.c();
        \u2603 = this.e() - d2;
        \u2603 = d - this.b();
        \u2603 = this.d() - d;
        \u2603 = Math.min((double)\u2603, (double)\u2603);
        \u2603 = Math.min((double)\u2603, (double)\u2603);
        return Math.min((double)\u2603, (double)\u2603);
    }

    public amr a() {
        if (this.e < this.d) {
            return amr.b;
        }
        if (this.e > this.d) {
            return amr.a;
        }
        return amr.c;
    }

    public double b() {
        double d = this.f() - this.h() / 2.0;
        if (d < (double)(-this.h)) {
            d = -this.h;
        }
        return d;
    }

    public double c() {
        double d = this.g() - this.h() / 2.0;
        if (d < (double)(-this.h)) {
            d = -this.h;
        }
        return d;
    }

    public double d() {
        double d = this.f() + this.h() / 2.0;
        if (d > (double)this.h) {
            d = this.h;
        }
        return d;
    }

    public double e() {
        double d = this.g() + this.h() / 2.0;
        if (d > (double)this.h) {
            d = this.h;
        }
        return d;
    }

    public double f() {
        return this.b;
    }

    public double g() {
        return this.c;
    }

    public void c(double d, double d2) {
        this.b = d;
        this.c = d2;
        for (amq amq2 : this.k()) {
            amq2.a(this, d, d2);
        }
    }

    public double h() {
        if (this.a() != amr.c) {
            double d = (float)(System.currentTimeMillis() - this.g) / (float)(this.f - this.g);
            if (d >= 1.0) {
                this.a(this.e);
            } else {
                return this.d + (this.e - this.d) * d;
            }
        }
        return this.d;
    }

    public long i() {
        if (this.a() != amr.c) {
            return this.f - System.currentTimeMillis();
        }
        return 0L;
    }

    public double j() {
        return this.e;
    }

    public void a(double d) {
        this.d = d;
        this.e = d;
        this.g = this.f = System.currentTimeMillis();
        for (amq amq2 : this.k()) {
            amq2.a(this, d);
        }
    }

    public void a(double d, double d2, long l) {
        this.d = d;
        this.e = d2;
        this.g = System.currentTimeMillis();
        this.f = this.g + l;
        for (amq amq2 : this.k()) {
            amq2.a(this, d, d2, l);
        }
    }

    protected List<amq> k() {
        return Lists.newArrayList(this.a);
    }

    public void a(amq amq2) {
        this.a.add((Object)amq2);
    }

    public void a(int n2) {
        this.h = n2;
    }

    public int l() {
        return this.h;
    }

    public double m() {
        return this.j;
    }

    public void b(double d) {
        this.j = d;
        for (amq amq2 : this.k()) {
            amq2.c(this, d);
        }
    }

    public double n() {
        return this.i;
    }

    public void c(double d) {
        this.i = d;
        for (amq amq2 : this.k()) {
            amq2.b(this, d);
        }
    }

    public double o() {
        if (this.f == this.g) {
            return 0.0;
        }
        return Math.abs((double)(this.d - this.e)) / (double)(this.f - this.g);
    }

    public int p() {
        return this.k;
    }

    public void b(int n2) {
        this.k = n2;
        for (amq amq2 : this.k()) {
            amq2.a(this, n2);
        }
    }

    public int q() {
        return this.l;
    }

    public void c(int n2) {
        this.l = n2;
        for (amq amq2 : this.k()) {
            amq2.b(this, n2);
        }
    }
}
