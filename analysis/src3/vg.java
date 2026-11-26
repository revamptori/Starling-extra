/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class vg
extends va {
    public vg(adm adm2) {
        super(adm2);
    }

    public vg(adm adm2, double d, double d2, double d3) {
        super(adm2, d, d2, d3);
    }

    @Override
    public boolean e(wn wn2) {
        if (this.l != null && this.l instanceof wn && this.l != wn2) {
            return true;
        }
        if (this.l != null && this.l != wn2) {
            return false;
        }
        if (!this.o.D) {
            wn2.a(this);
        }
        return true;
    }

    @Override
    public void a(int n2, int n3, int n4, boolean bl) {
        if (bl) {
            if (this.l != null) {
                this.l.a((pk)null);
            }
            if (this.q() == 0) {
                this.k(-this.r());
                this.j(10);
                this.a(50.0f);
                this.ac();
            }
        }
    }

    @Override
    public va.a s() {
        return va.a.a;
    }
}
