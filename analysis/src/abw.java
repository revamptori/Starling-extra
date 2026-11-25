/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Short
 *  java.util.ArrayList
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class abw
implements abs {
    private final zx a;
    private final List<zx> b;

    public abw(zx zx2, List<zx> list) {
        this.a = zx2;
        this.b = list;
    }

    @Override
    public zx b() {
        return this.a;
    }

    @Override
    public zx[] b(xp xp2) {
        zx[] zxArray = new zx[xp2.o_()];
        for (int i = 0; i < zxArray.length; ++i) {
            zx zx2 = xp2.a(i);
            if (zx2 == null || !zx2.b().r()) continue;
            zxArray[i] = new zx(zx2.b().q());
        }
        return zxArray;
    }

    @Override
    public boolean a(xp xp2, adm adm2) {
        ArrayList arrayList = Lists.newArrayList(this.b);
        for (int i = 0; i < xp2.h(); ++i) {
            for (\u2603 = 0; \u2603 < xp2.i(); ++\u2603) {
                zx zx2 = xp2.c(\u2603, i);
                if (zx2 == null) continue;
                boolean \u26032 = false;
                for (zx zx3 : arrayList) {
                    if (zx2.b() != zx3.b() || zx3.i() != Short.MAX_VALUE && zx2.i() != zx3.i()) continue;
                    \u26032 = true;
                    arrayList.remove((Object)zx3);
                    break;
                }
                if (\u26032) continue;
                return false;
            }
        }
        return arrayList.isEmpty();
    }

    @Override
    public zx a(xp xp2) {
        return this.a.k();
    }

    @Override
    public int a() {
        return this.b.size();
    }
}
