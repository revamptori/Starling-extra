/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class pa
extends pe {
    protected pa(int n, jy jy2, boolean bl, int n2) {
        super(n, jy2, bl, n2);
    }

    @Override
    public void a(pr pr2, qf qf2, int n2) {
        pr2.m(pr2.bN() - (float)(4 * (n2 + 1)));
        super.a(pr2, qf2, n2);
    }

    @Override
    public void b(pr pr2, qf qf2, int n2) {
        pr2.m(pr2.bN() + (float)(4 * (n2 + 1)));
        super.b(pr2, qf2, n2);
    }
}
