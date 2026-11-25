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

public static class aqj.q
extends aqj.a {
    public aqj.n b;
    public List<aqj.n> c;
    public List<aqj.n> d;
    public List<aqt> e = Lists.newArrayList();

    public aqj.q() {
    }

    public aqj.q(Random random, int n2, int n3) {
        super(random, n2, n3);
        this.c = Lists.newArrayList();
        for (aqj.n n4 : a) {
            n4.c = 0;
            this.c.add((Object)n4);
        }
        this.d = Lists.newArrayList();
        for (aqj.n n4 : b) {
            n4.c = 0;
            this.d.add((Object)n4);
        }
    }

    @Override
    protected void b(dn dn2) {
        super.b(dn2);
    }

    @Override
    protected void a(dn dn2) {
        super.a(dn2);
    }
}
