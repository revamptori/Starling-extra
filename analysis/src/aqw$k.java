/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.util.List
 *  java.util.Random
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public static class aqw.k
extends aqw.p {
    public aec a;
    public boolean b;
    public int c;
    public aqw.e d;
    public List<aqw.e> e;
    public List<aqt> f = Lists.newArrayList();
    public List<aqt> g = Lists.newArrayList();

    public aqw.k() {
    }

    public aqw.k(aec aec2, int n2, Random random, int n3, int n4, List<aqw.e> list, int n5) {
        super(null, 0, random, n3, n4);
        this.a = aec2;
        this.e = list;
        this.c = n5;
        ady ady2 = aec2.a(new cj(n3, 0, n4), ady.ad);
        this.b = ady2 == ady.r || ady2 == ady.G;
        this.a(this.b);
    }

    public aec e() {
        return this.a;
    }
}
