/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class awb
extends avs {
    private boolean o;
    private String p;
    private final awg.b q;

    public awb(awg.b b2, int n, int n2, int n3, String string, boolean bl) {
        super(n, n2, n3, 150, 20, "");
        this.p = string;
        this.o = bl;
        this.j = this.c();
        this.q = b2;
    }

    private String c() {
        return bnq.a(this.p, new Object[0]) + ": " + (this.o ? bnq.a("gui.yes", new Object[0]) : bnq.a("gui.no", new Object[0]));
    }

    public void b(boolean bl) {
        this.o = bl;
        this.j = this.c();
        this.q.a(this.k, bl);
    }

    @Override
    public boolean c(ave ave2, int n, int n2) {
        if (super.c(ave2, n, n2)) {
            this.o = !this.o;
            this.j = this.c();
            this.q.a(this.k, this.o);
            return true;
        }
        return false;
    }
}
