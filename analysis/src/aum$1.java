/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Comparator
 */
import java.util.Comparator;

static final class aum.1
implements Comparator<aum> {
    aum.1() {
    }

    public int a(aum aum2, aum aum3) {
        if (aum2.c() > aum3.c()) {
            return 1;
        }
        if (aum2.c() < aum3.c()) {
            return -1;
        }
        return aum3.e().compareToIgnoreCase(aum2.e());
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((aum)object, (aum)object2);
    }
}
