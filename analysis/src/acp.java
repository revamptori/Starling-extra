/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class acp
extends aci {
    protected acp(int n, jy jy2, int n2, acj acj2) {
        super(n, jy2, n2, acj2);
        if (acj2 == acj.h) {
            this.c("lootBonusDigger");
        } else if (acj2 == acj.i) {
            this.c("lootBonusFishing");
        } else {
            this.c("lootBonus");
        }
    }

    @Override
    public int a(int n) {
        return 15 + (n - 1) * 9;
    }

    @Override
    public int b(int n) {
        return super.a(n) + 50;
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public boolean a(aci aci2) {
        return super.a(aci2) && aci2.B != acp.s.B;
    }
}
