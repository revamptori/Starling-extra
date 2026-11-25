/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
import net.minecraft.realms.RealmsButton;

public class awp
extends avs {
    private RealmsButton o;

    public awp(RealmsButton realmsButton, int n, int n2, int n3, String string) {
        super(n, n2, n3, string);
        this.o = realmsButton;
    }

    public awp(RealmsButton realmsButton, int n, int n2, int n3, String string, int n4, int n5) {
        super(n, n2, n3, n4, n5, string);
        this.o = realmsButton;
    }

    public int c() {
        return this.k;
    }

    public boolean d() {
        return this.l;
    }

    public void b(boolean bl) {
        this.l = bl;
    }

    public void a(String string) {
        this.j = string;
    }

    @Override
    public int b() {
        return super.b();
    }

    public int e() {
        return this.i;
    }

    @Override
    public boolean c(ave ave2, int n, int n2) {
        if (super.c(ave2, n, n2)) {
            this.o.clicked(n, n2);
        }
        return super.c(ave2, n, n2);
    }

    @Override
    public void a(int n, int n2) {
        this.o.released(n, n2);
    }

    @Override
    public void b(ave ave2, int n, int n2) {
        this.o.renderBg(n, n2);
    }

    public RealmsButton f() {
        return this.o;
    }

    @Override
    public int a(boolean bl) {
        return this.o.getYImage(bl);
    }

    public int c(boolean bl) {
        return super.a(bl);
    }

    public int g() {
        return this.g;
    }
}
