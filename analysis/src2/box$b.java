/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.common.collect.ComparisonChain;

static class box.b
extends oa.a
implements Comparable<box.b> {
    protected final boq b;

    public box.b(boq boq2, int n) {
        super(n);
        this.b = boq2;
    }

    public int a(box.b b2) {
        return ComparisonChain.start().compare(b2.a, this.a).compare(this.a(), b2.a()).result();
    }

    protected int a() {
        int n = this.b.a().size();
        for (cq cq2 : cq.values()) {
            n += this.b.a(cq2).size();
        }
        return n;
    }

    public String toString() {
        return "MyWeighedRandomItem{weight=" + this.a + ", model=" + this.b + '}';
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((box.b)object);
    }
}
