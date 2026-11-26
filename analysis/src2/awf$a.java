/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public static class awf.a
implements awd.a {
    private final ave a = ave.A();
    private final avs b;
    private final avs c;

    public awf.a(avs avs2, avs avs3) {
        this.b = avs2;
        this.c = avs3;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        if (this.b != null) {
            this.b.i = n3;
            this.b.a(this.a, n6, n7);
        }
        if (this.c != null) {
            this.c.i = n3;
            this.c.a(this.a, n6, n7);
        }
    }

    @Override
    public boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
        if (this.b.c(this.a, n2, n3)) {
            if (this.b instanceof awe) {
                this.a.t.a(((awe)this.b).c(), 1);
                this.b.j = this.a.t.c(avh.a.a(this.b.k));
            }
            return true;
        }
        if (this.c != null && this.c.c(this.a, n2, n3)) {
            if (this.c instanceof awe) {
                this.a.t.a(((awe)this.c).c(), 1);
                this.c.j = this.a.t.c(avh.a.a(this.c.k));
            }
            return true;
        }
        return false;
    }

    @Override
    public void b(int n, int n2, int n3, int n4, int n5, int n6) {
        if (this.b != null) {
            this.b.a(n2, n3);
        }
        if (this.c != null) {
            this.c.a(n2, n3);
        }
    }

    @Override
    public void a(int n, int n2, int n3) {
    }
}
