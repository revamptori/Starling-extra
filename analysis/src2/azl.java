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

public class azl
extends awd {
    private final azh u;
    private final List<azk> v = Lists.newArrayList();
    private final List<azj> w = Lists.newArrayList();
    private final awd.a x = new azi();
    private int y = -1;

    public azl(azh azh2, ave ave2, int n, int n2, int n3, int n4, int n5) {
        super(ave2, n, n2, n3, n4, n5);
        this.u = azh2;
    }

    @Override
    public awd.a b(int n) {
        if (n < this.v.size()) {
            return (awd.a)this.v.get(n);
        }
        if ((n -= this.v.size()) == 0) {
            return this.x;
        }
        return (awd.a)this.w.get(--n);
    }

    @Override
    protected int b() {
        return this.v.size() + 1 + this.w.size();
    }

    public void c(int n) {
        this.y = n;
    }

    @Override
    protected boolean a(int n) {
        return n == this.y;
    }

    public int e() {
        return this.y;
    }

    public void a(bdf bdf2) {
        this.v.clear();
        for (int i = 0; i < bdf2.c(); ++i) {
            this.v.add((Object)new azk(this.u, bdf2.a(i)));
        }
    }

    public void a(List<bpq.a> list) {
        this.w.clear();
        for (bpq.a a2 : list) {
            this.w.add((Object)new azj(this.u, a2));
        }
    }

    @Override
    protected int d() {
        return super.d() + 30;
    }

    @Override
    public int c() {
        return super.c() + 85;
    }
}
