/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Comparator
 */
import java.util.Comparator;

public static class sp.a
implements Comparator<pk> {
    private final pk a;

    public sp.a(pk pk2) {
        this.a = pk2;
    }

    public int a(pk pk2, pk pk3) {
        double d = this.a.h(pk2);
        if (d < (\u2603 = this.a.h(pk3))) {
            return -1;
        }
        if (d > \u2603) {
            return 1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((pk)object, (pk)object2);
    }
}
