/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Comparator
 */
import java.util.Comparator;

class ama.2
implements Comparator<amo> {
    ama.2() {
    }

    public int a(amo amo2, amo amo3) {
        return amo2.a().compareTo(amo3.a());
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((amo)object, (amo)object2);
    }
}
