/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
class ayn.c
extends ayn.d {
    private final int p;
    private final int q;

    public ayn.c(int n, int n2, int n3, int n4, int n5) {
        super(n, n2, n3, ayl.a, 0 + pe.a[n4].f() % 8 * 18, 198 + pe.a[n4].f() / 8 * 18);
        this.p = n4;
        this.q = n5;
    }

    @Override
    public void b(int n, int n2) {
        String string = bnq.a(pe.a[this.p].a(), new Object[0]);
        if (this.q >= 3 && this.p != pe.l.H) {
            string = string + " II";
        }
        ayn.this.a(string, n, n2);
    }
}
