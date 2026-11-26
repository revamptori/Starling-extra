/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class ajc
extends afh {
    private final boolean a;

    public ajc(boolean bl) {
        super(arm.t);
        this.a = bl;
        if (bl) {
            this.a(1.0f);
        }
    }

    @Override
    public void c(adm adm2, cj cj2, alz alz2) {
        if (adm2.D) {
            return;
        }
        if (this.a && !adm2.z(cj2)) {
            adm2.a(cj2, afi.bJ.Q(), 2);
        } else if (!this.a && adm2.z(cj2)) {
            adm2.a(cj2, afi.bK.Q(), 2);
        }
    }

    @Override
    public void a(adm adm2, cj cj2, alz alz2, afh afh2) {
        if (adm2.D) {
            return;
        }
        if (this.a && !adm2.z(cj2)) {
            adm2.a(cj2, (afh)this, 4);
        } else if (!this.a && adm2.z(cj2)) {
            adm2.a(cj2, afi.bK.Q(), 2);
        }
    }

    @Override
    public void b(adm adm2, cj cj2, alz alz2, Random random) {
        if (adm2.D) {
            return;
        }
        if (this.a && !adm2.z(cj2)) {
            adm2.a(cj2, afi.bJ.Q(), 2);
        }
    }

    @Override
    public zw a(alz alz2, Random random, int n) {
        return zw.a(afi.bJ);
    }

    @Override
    public zw c(adm adm2, cj cj2) {
        return zw.a(afi.bJ);
    }

    @Override
    protected zx i(alz alz2) {
        return new zx(afi.bJ);
    }
}
