/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  org.lwjgl.input.Mouse
 */
import net.minecraft.realms.RealmsClickableScrolledSelectionList;
import net.minecraft.realms.Tezzelator;
import org.lwjgl.input.Mouse;

public class awq
extends awi {
    private final RealmsClickableScrolledSelectionList u;

    public awq(RealmsClickableScrolledSelectionList realmsClickableScrolledSelectionList, int n, int n2, int n3, int n4, int n5) {
        super(ave.A(), n, n2, n3, n4, n5);
        this.u = realmsClickableScrolledSelectionList;
    }

    @Override
    protected int b() {
        return this.u.getItemCount();
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
        this.u.selectItem(n, bl, n2, n3);
    }

    @Override
    protected boolean a(int n) {
        return this.u.isSelectedItem(n);
    }

    @Override
    protected void a() {
        this.u.renderBackground();
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        this.u.renderItem(n, n2, n3, n4, n5, n6);
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.j;
    }

    public int g() {
        return this.i;
    }

    @Override
    protected int k() {
        return this.u.getMaxPosition();
    }

    @Override
    protected int d() {
        return this.u.getScrollbarPosition();
    }

    @Override
    public void p() {
        super.p();
        if (this.m > 0.0f && Mouse.getEventButtonState()) {
            this.u.customMouseEvent(this.d, this.e, this.t, this.n, this.h);
        }
    }

    public void a(int n, int n2, int n3, Tezzelator tezzelator) {
        this.u.renderSelected(n, n2, n3, tezzelator);
    }

    @Override
    protected void b(int n, int n2, int n3, int n4) {
        \u2603 = this.b();
        for (\u2603 = 0; \u2603 < \u2603; ++\u2603) {
            \u2603 = n2 + \u2603 * this.h + this.t;
            \u2603 = this.h - 4;
            if (\u2603 > this.e || \u2603 + \u2603 < this.d) {
                this.a(\u2603, n, \u2603);
            }
            if (this.r && this.a(\u2603)) {
                this.a(this.b, \u2603, \u2603, Tezzelator.instance);
            }
            this.a(\u2603, n, \u2603, \u2603, n3, n4);
        }
    }
}
