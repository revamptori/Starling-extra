/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;

public static class box.a {
    private List<box.b> a = Lists.newArrayList();

    public box.a a(boq boq2, int n) {
        this.a.add((Object)new box.b(boq2, n));
        return this;
    }

    public box a() {
        Collections.sort(this.a);
        return new box(this.a);
    }

    public boq b() {
        return ((box.b)this.a.get((int)0)).b;
    }
}
