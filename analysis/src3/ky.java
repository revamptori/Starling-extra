/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class ky
extends lg {
    private boolean c;
    private boolean d;
    private int e;
    private int f;

    public ky(adm adm2) {
        super(adm2);
    }

    @Override
    public void a() {
        super.a();
        ++this.f;
        long l = this.a.K();
        \u2603 = l / 24000L + 1L;
        if (!this.c && this.f > 20) {
            this.c = true;
            this.b.a.a(new gm(5, 0.0f));
        }
        boolean bl = this.d = l > 120500L;
        if (this.d) {
            ++this.e;
        }
        if (l % 24000L == 500L) {
            if (\u2603 <= 6L) {
                this.b.a(new fb("demo.day." + \u2603, new Object[0]));
            }
        } else if (\u2603 == 1L) {
            if (l == 100L) {
                this.b.a.a(new gm(5, 101.0f));
            } else if (l == 175L) {
                this.b.a.a(new gm(5, 102.0f));
            } else if (l == 250L) {
                this.b.a.a(new gm(5, 103.0f));
            }
        } else if (\u2603 == 5L && l % 24000L == 22000L) {
            this.b.a(new fb("demo.day.warning", new Object[0]));
        }
    }

    private void f() {
        if (this.e > 100) {
            this.b.a(new fb("demo.reminder", new Object[0]));
            this.e = 0;
        }
    }

    @Override
    public void a(cj cj2, cq cq2) {
        if (this.d) {
            this.f();
            return;
        }
        super.a(cj2, cq2);
    }

    @Override
    public void a(cj cj2) {
        if (this.d) {
            return;
        }
        super.a(cj2);
    }

    @Override
    public boolean b(cj cj2) {
        if (this.d) {
            return false;
        }
        return super.b(cj2);
    }

    @Override
    public boolean a(wn wn2, adm adm2, zx zx2) {
        if (this.d) {
            this.f();
            return false;
        }
        return super.a(wn2, adm2, zx2);
    }

    @Override
    public boolean a(wn wn2, adm adm2, zx zx2, cj cj2, cq cq2, float f, float f2, float f3) {
        if (this.d) {
            this.f();
            return false;
        }
        return super.a(wn2, adm2, zx2, cj2, cq2, f, f2, f3);
    }
}
