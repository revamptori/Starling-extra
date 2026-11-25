/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class bpc
extends bpb {
    private final vt k;

    public bpc(vt vt2) {
        super(new jy("minecraft:mob.guardian.attack"));
        this.k = vt2;
        this.i = bpj.a.a;
        this.g = true;
        this.h = 0;
    }

    @Override
    public void c() {
        if (this.k.I || !this.k.cp()) {
            this.j = true;
            return;
        }
        this.d = (float)this.k.s;
        this.e = (float)this.k.t;
        this.f = (float)this.k.u;
        float f = this.k.q(0.0f);
        this.b = 0.0f + 1.0f * f * f;
        this.c = 0.7f + 0.5f * f;
    }
}
