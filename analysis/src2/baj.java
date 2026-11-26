/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  java.lang.Object
 *  java.util.List
 */
import com.google.common.base.Objects;
import java.util.List;

public class baj {
    private final bag a;
    private final List<bah> b;
    private final int c;

    public baj(bag bag2, List<bah> list, int n) {
        this.a = bag2;
        this.b = list;
        this.c = n;
    }

    public bah a(int n) {
        if (n < 0 || n >= this.b.size()) {
            return baf.a;
        }
        return (bah)Objects.firstNonNull((Object)this.b.get(n), (Object)baf.a);
    }

    public int b() {
        return this.c;
    }
}
