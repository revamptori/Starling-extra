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

public static class aqp.m
extends aqp.l {
    public aqp.f a;
    public aqp.g b;
    public List<aqt> c = Lists.newArrayList();

    public aqp.m() {
    }

    public aqp.m(int n, Random random, int n2, int n3) {
        super(0, random, n2, n3);
    }

    @Override
    public cj a() {
        if (this.b != null) {
            return this.b.a();
        }
        return super.a();
    }
}
