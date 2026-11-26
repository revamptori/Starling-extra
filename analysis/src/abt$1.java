/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Comparator
 */
import java.util.Comparator;

class abt.1
implements Comparator<abs> {
    abt.1() {
    }

    public int a(abs abs2, abs abs3) {
        if (abs2 instanceof abw && abs3 instanceof abv) {
            return 1;
        }
        if (abs3 instanceof abw && abs2 instanceof abv) {
            return -1;
        }
        if (abs3.a() < abs2.a()) {
            return -1;
        }
        if (abs3.a() > abs2.a()) {
            return 1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((abs)object, (abs)object2);
    }
}
