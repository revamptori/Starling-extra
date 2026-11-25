/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.List;

public abstract class bfh {
    private double c;
    private double d;
    private double e;
    protected List<bht> a = Lists.newArrayListWithCapacity((int)17424);
    protected boolean b;

    public void a(double d, double d2, double d3) {
        this.b = true;
        this.a.clear();
        this.c = d;
        this.d = d2;
        this.e = d3;
    }

    public void a(bht bht2) {
        cj cj2 = bht2.j();
        bfl.b((float)((double)cj2.n() - this.c), (float)((double)cj2.o() - this.d), (float)((double)cj2.p() - this.e));
    }

    public void a(bht bht2, adf adf2) {
        this.a.add((Object)bht2);
    }

    public abstract void a(adf var1);
}
