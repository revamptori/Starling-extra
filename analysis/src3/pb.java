/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class pb
extends pe {
    protected pb(int n, jy jy2, boolean bl, int n2) {
        super(n, jy2, bl, n2);
    }

    @Override
    public double a(int n, qd qd2) {
        if (this.H == pe.t.H) {
            return -0.5f * (float)(n + 1);
        }
        return 1.3 * (double)(n + 1);
    }
}
