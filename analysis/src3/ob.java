/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.Random
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ob
extends oa.a {
    private zx b;
    private int c;
    private int d;

    public ob(zw zw2, int n, int n2, int n3, int n4) {
        super(n4);
        this.b = new zx(zw2, 1, n);
        this.c = n2;
        this.d = n3;
    }

    public ob(zx zx2, int n, int n2, int n3) {
        super(n3);
        this.b = zx2;
        this.c = n;
        this.d = n2;
    }

    public static void a(Random random, List<ob> list, og og2, int n) {
        for (\u2603 = 0; \u2603 < n; ++\u2603) {
            ob ob2 = oa.a(random, list);
            int \u26032 = ob2.c + random.nextInt(ob2.d - ob2.c + 1);
            if (ob2.b.c() >= \u26032) {
                zx zx2 = ob2.b.k();
                zx2.b = \u26032;
                og2.a(random.nextInt(og2.o_()), zx2);
                continue;
            }
            for (int i = 0; i < \u26032; ++i) {
                zx zx3 = ob2.b.k();
                zx3.b = 1;
                og2.a(random.nextInt(og2.o_()), zx3);
            }
        }
    }

    public static void a(Random random, List<ob> list, alc alc2, int n) {
        for (\u2603 = 0; \u2603 < n; ++\u2603) {
            ob ob2 = oa.a(random, list);
            int \u26032 = ob2.c + random.nextInt(ob2.d - ob2.c + 1);
            if (ob2.b.c() >= \u26032) {
                zx zx2 = ob2.b.k();
                zx2.b = \u26032;
                alc2.a(random.nextInt(alc2.o_()), zx2);
                continue;
            }
            for (int i = 0; i < \u26032; ++i) {
                zx zx3 = ob2.b.k();
                zx3.b = 1;
                alc2.a(random.nextInt(alc2.o_()), zx3);
            }
        }
    }

    public static List<ob> a(List<ob> list, ob ... obArray) {
        ArrayList arrayList = Lists.newArrayList(list);
        Collections.addAll((Collection)arrayList, (Object[])obArray);
        return arrayList;
    }
}
