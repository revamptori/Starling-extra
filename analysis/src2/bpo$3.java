/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayList
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;

class bpo.3
implements Runnable {
    bpo.3() {
    }

    public void run() {
        ArrayList arrayList = Lists.newArrayList(bpo.this.ap().v());
        for (lf lf2 : arrayList) {
            bpo.this.ap().e(lf2);
        }
    }
}
