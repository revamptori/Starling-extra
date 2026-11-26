/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
public class akp
extends afd {
    public static final amn a = amn.a("power", 0, 15);
    private final int b;

    protected akp(arm arm2, int n) {
        this(arm2, n, arm2.r());
    }

    protected akp(arm arm2, int n, arn arn2) {
        super(arm2, arn2);
        this.j(this.M.b().a(a, 0));
        this.b = n;
    }

    @Override
    protected int f(adm adm2, cj cj2) {
        int n = Math.min((int)adm2.a(pk.class, this.a(cj2)).size(), (int)this.b);
        if (n > 0) {
            float f = (float)Math.min((int)this.b, (int)n) / (float)this.b;
            return ns.f(f * 15.0f);
        }
        return 0;
    }

    @Override
    protected int e(alz alz2) {
        return alz2.b(a);
    }

    @Override
    protected alz a(alz alz2, int n) {
        return alz2.a(a, n);
    }

    @Override
    public int a(adm adm2) {
        return 10;
    }

    @Override
    public alz a(int n) {
        return this.Q().a(a, n);
    }

    @Override
    public int c(alz alz2) {
        return alz2.b(a);
    }

    @Override
    protected ama e() {
        return new ama(this, a);
    }
}
