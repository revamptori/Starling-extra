/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class akg
extends afh {
    protected boolean R;

    protected akg(arm arm2, boolean bl) {
        super(arm2);
        this.R = bl;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean a(adq adq2, cj cj2, cq cq2) {
        if (!this.R && adq2.p(cj2).c() == this) {
            return false;
        }
        return super.a(adq2, cj2, cq2);
    }
}
