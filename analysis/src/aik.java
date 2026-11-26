/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
import com.google.common.base.Predicate;
import java.util.List;

public class aik
extends ahs {
    public static final amm<aio.a> Q = amm.a("variant", aio.a.class, new Predicate<aio.a>(){

        public boolean a(aio.a a2) {
            return a2.a() < 4;
        }

        public /* synthetic */ boolean apply(Object object) {
            return this.a((aio.a)object);
        }
    });

    public aik() {
        this.j(this.M.b().a(Q, aio.a.a).a(b, true).a(a, true));
    }

    @Override
    public int h(alz alz2) {
        if (alz2.c() != this) {
            return super.h(alz2);
        }
        aio.a a2 = alz2.b(Q);
        if (a2 == aio.a.b) {
            return adj.a();
        }
        if (a2 == aio.a.c) {
            return adj.b();
        }
        return super.h(alz2);
    }

    @Override
    public int a(adq adq22, cj cj2, int n) {
        adq adq22;
        alz alz2 = adq22.p(cj2);
        if (alz2.c() == this) {
            aio.a a2 = alz2.b(Q);
            if (a2 == aio.a.b) {
                return adj.a();
            }
            if (a2 == aio.a.c) {
                return adj.b();
            }
        }
        return super.a(adq22, cj2, n);
    }

    @Override
    protected void a(adm adm2, cj cj2, alz alz2, int n) {
        if (alz2.b(Q) == aio.a.a && adm2.s.nextInt(n) == 0) {
            aik.a(adm2, cj2, new zx(zy.e, 1, 0));
        }
    }

    @Override
    protected int d(alz alz2) {
        if (alz2.b(Q) == aio.a.d) {
            return 40;
        }
        return super.d(alz2);
    }

    @Override
    public void a(zw zw2, yz yz2, List<zx> list) {
        list.add((Object)new zx(zw2, 1, aio.a.a.a()));
        list.add((Object)new zx(zw2, 1, aio.a.b.a()));
        list.add((Object)new zx(zw2, 1, aio.a.c.a()));
        list.add((Object)new zx(zw2, 1, aio.a.d.a()));
    }

    @Override
    protected zx i(alz alz2) {
        return new zx(zw.a(this), 1, alz2.b(Q).a());
    }

    @Override
    public alz a(int n) {
        return this.Q().a(Q, this.b(n)).a(a, (n & 4) == 0).a(b, (n & 8) > 0);
    }

    @Override
    public int c(alz alz2) {
        int n = 0;
        n |= alz2.b(Q).a();
        if (!alz2.b(a).booleanValue()) {
            n |= 4;
        }
        if (alz2.b(b).booleanValue()) {
            n |= 8;
        }
        return n;
    }

    @Override
    public aio.a b(int n) {
        return aio.a.a((n & 3) % 4);
    }

    @Override
    protected ama e() {
        return new ama(this, Q, b, a);
    }

    @Override
    public int a(alz alz2) {
        return alz2.b(Q).a();
    }

    @Override
    public void a(adm adm2, wn wn2, cj cj2, alz alz2, akw akw2) {
        if (!adm2.D && wn2.bZ() != null && wn2.bZ().b() == zy.be) {
            wn2.b(na.ab[afh.a(this)]);
            aik.a(adm2, cj2, new zx(zw.a(this), 1, alz2.b(Q).a()));
            return;
        }
        super.a(adm2, wn2, cj2, alz2, akw2);
    }
}
