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

public class ahn
extends afc {
    public static final aml a = aml.a("facing", new Predicate<cq>(){

        public boolean a(cq cq2) {
            return cq2 != cq.b;
        }

        public /* synthetic */ boolean apply(Object object) {
            return this.a((cq)object);
        }
    });
    public static final amk b = amk.a("enabled");

    public ahn() {
        super(arm.f, arn.m);
        this.j(this.M.b().a(a, cq.a).a(b, true));
        this.a(yz.d);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void a(adq adq2, cj cj2) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void a(adm adm2, cj cj2, alz alz2, aug aug2, List<aug> list, pk pk2) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.625f, 1.0f);
        super.a(adm2, cj2, alz2, aug2, list, pk2);
        float f = 0.125f;
        this.a(0.0f, 0.0f, 0.0f, f, 1.0f, 1.0f);
        super.a(adm2, cj2, alz2, aug2, list, pk2);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f);
        super.a(adm2, cj2, alz2, aug2, list, pk2);
        this.a(1.0f - f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.a(adm2, cj2, alz2, aug2, list, pk2);
        this.a(0.0f, 0.0f, 1.0f - f, 1.0f, 1.0f, 1.0f);
        super.a(adm2, cj2, alz2, aug2, list, pk2);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public alz a(adm adm2, cj cj2, cq cq2, float f, float f2, float f3, int n, pr pr2) {
        cq cq3 = cq2.d();
        if (cq3 == cq.b) {
            cq3 = cq.a;
        }
        return this.Q().a(a, cq3).a(b, true);
    }

    @Override
    public akw a(adm adm2, int n) {
        return new alj();
    }

    @Override
    public void a(adm adm2, cj cj2, alz alz2, pr pr2, zx zx2) {
        super.a(adm2, cj2, alz2, pr2, zx2);
        if (zx2.s() && (\u2603 = adm2.s(cj2)) instanceof alj) {
            ((alj)\u2603).a(zx2.q());
        }
    }

    @Override
    public void c(adm adm2, cj cj2, alz alz2) {
        this.e(adm2, cj2, alz2);
    }

    @Override
    public boolean a(adm adm2, cj cj2, alz alz2, wn wn2, cq cq2, float f, float f2, float f3) {
        if (adm2.D) {
            return true;
        }
        akw akw2 = adm2.s(cj2);
        if (akw2 instanceof alj) {
            wn2.a((alj)akw2);
            wn2.b(na.P);
        }
        return true;
    }

    @Override
    public void a(adm adm2, cj cj2, alz alz2, afh afh2) {
        this.e(adm2, cj2, alz2);
    }

    private void e(adm adm2, cj cj2, alz alz2) {
        boolean bl = \u2603 = !adm2.z(cj2);
        if (\u2603 != alz2.b(b)) {
            adm2.a(cj2, alz2.a(b, \u2603), 4);
        }
    }

    @Override
    public void b(adm adm2, cj cj2, alz alz2) {
        akw akw2 = adm2.s(cj2);
        if (akw2 instanceof alj) {
            oi.a(adm2, cj2, (og)((alj)akw2));
            adm2.e(cj2, this);
        }
        super.b(adm2, cj2, alz2);
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean a(adq adq2, cj cj2, cq cq2) {
        return true;
    }

    public static cq b(int n2) {
        return cq.a(n2 & 7);
    }

    public static boolean f(int n2) {
        return (n2 & 8) != 8;
    }

    @Override
    public boolean O() {
        return true;
    }

    @Override
    public int l(adm adm2, cj cj2) {
        return xi.a(adm2.s(cj2));
    }

    @Override
    public adf m() {
        return adf.b;
    }

    @Override
    public alz a(int n2) {
        return this.Q().a(a, ahn.b(n2)).a(b, ahn.f(n2));
    }

    @Override
    public int c(alz alz2) {
        int n2 = 0;
        n2 |= alz2.b(a).a();
        if (!alz2.b(b).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected ama e() {
        return new ama(this, a, b);
    }
}
