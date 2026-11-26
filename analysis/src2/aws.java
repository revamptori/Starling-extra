/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
import net.minecraft.realms.RealmsScrolledSelectionList;

public class aws
extends awi {
    private final RealmsScrolledSelectionList u;

    public aws(RealmsScrolledSelectionList realmsScrolledSelectionList, int n, int n2, int n3, int n4, int n5) {
        super(ave.A(), n, n2, n3, n4, n5);
        this.u = realmsScrolledSelectionList;
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
    }
}
