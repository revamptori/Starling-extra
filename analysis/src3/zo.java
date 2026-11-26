/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class zo
extends zw {
    @Override
    public boolean a(zx zx2, wn wn2, adm adm2, cj cj2, cq cq2, float f, float f2, float f3) {
        if (!adm2.D) {
            wt wt2 = new wt(adm2, (float)cj2.n() + f, (float)cj2.o() + f2, (float)cj2.p() + f3, zx2);
            adm2.d(wt2);
            if (!wn2.bA.d) {
                --zx2.b;
            }
            return true;
        }
        return false;
    }

    @Override
    public void a(zx zx2, wn wn2, List<String> list2, boolean bl) {
        if (!zx2.n()) {
            return;
        }
        dn dn2 = zx2.o().m("Fireworks");
        if (dn2 == null) {
            return;
        }
        if (dn2.b("Flight", 99)) {
            list2.add((Object)(di.a("item.fireworks.flight") + " " + dn2.d("Flight")));
        }
        if ((\u2603 = dn2.c("Explosions", 10)) != null && \u2603.c() > 0) {
            for (int i = 0; i < \u2603.c(); ++i) {
                List<String> list2;
                dn dn3 = \u2603.b(i);
                ArrayList \u26032 = Lists.newArrayList();
                zn.a(dn3, (List<String>)\u26032);
                if (\u26032.size() <= 0) continue;
                for (int j = 1; j < \u26032.size(); ++j) {
                    \u26032.set(j, (Object)("  " + (String)\u26032.get(j)));
                }
                list2.addAll((Collection)\u26032);
            }
        }
    }
}
