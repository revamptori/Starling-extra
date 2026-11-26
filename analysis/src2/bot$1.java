/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Comparator
 */
import java.util.Comparator;

class bot.1
implements Comparator<bov> {
    bot.1() {
    }

    public int a(bov bov2, bov bov3) {
        return bov2.toString().compareTo(bov3.toString());
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bov)object, (bov)object2);
    }
}
