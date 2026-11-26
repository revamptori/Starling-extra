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

public class ta {
    ps a;
    List<pk> b = Lists.newArrayList();
    List<pk> c = Lists.newArrayList();

    public ta(ps ps2) {
        this.a = ps2;
    }

    public void a() {
        this.b.clear();
        this.c.clear();
    }

    public boolean a(pk pk2) {
        if (this.b.contains((Object)pk2)) {
            return true;
        }
        if (this.c.contains((Object)pk2)) {
            return false;
        }
        this.a.o.B.a("canSee");
        boolean bl = this.a.t(pk2);
        this.a.o.B.b();
        if (bl) {
            this.b.add((Object)pk2);
        } else {
            this.c.add((Object)pk2);
        }
        return bl;
    }
}
