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

public class aig
extends ahw {
    public static final amm<aio.a> b = amm.a("variant", aio.a.class, new Predicate<aio.a>(){

        public boolean a(aio.a a2) {
            return a2.a() >= 4;
        }

        public /* synthetic */ boolean apply(Object object) {
            return this.a((aio.a)object);
        }
    });

    public aig() {
        this.j(this.M.b().a(b, aio.a.e).a(a, ahw.a.b));
    }

    @Override
    public arn g(alz alz2) {
        aio.a a2 = alz2.b(b);
        switch ((ahw.a)alz2.b(a)) {
            default: {
                switch (a2) {
                    default: {
                        return arn.m;
                    }
                    case f: 
                }
                return aio.a.f.c();
            }
            case b: 
        }
        return a2.c();
    }

    @Override
    public void a(zw zw2, yz yz2, List<zx> list) {
        list.add((Object)new zx(zw2, 1, aio.a.e.a() - 4));
        list.add((Object)new zx(zw2, 1, aio.a.f.a() - 4));
    }

    @Override
    public alz a(int n) {
        alz alz2 = this.Q().a(b, aio.a.a((n & 3) + 4));
        switch (n & 0xC) {
            case 0: {
                alz2 = alz2.a(a, ahw.a.b);
                break;
            }
            case 4: {
                alz2 = alz2.a(a, ahw.a.a);
                break;
            }
            case 8: {
                alz2 = alz2.a(a, ahw.a.c);
                break;
            }
            default: {
                alz2 = alz2.a(a, ahw.a.d);
            }
        }
        return alz2;
    }

    @Override
    public int c(alz alz2) {
        int n = 0;
        n |= alz2.b(b).a() - 4;
        switch ((ahw.a)alz2.b(a)) {
            case a: {
                n |= 4;
                break;
            }
            case c: {
                n |= 8;
                break;
            }
            case d: {
                n |= 0xC;
            }
        }
        return n;
    }

    @Override
    protected ama e() {
        return new ama(this, b, a);
    }

    @Override
    protected zx i(alz alz2) {
        return new zx(zw.a(this), 1, alz2.b(b).a() - 4);
    }

    @Override
    public int a(alz alz2) {
        return alz2.b(b).a() - 4;
    }
}
