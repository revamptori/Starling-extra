/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class tu.e
extends qo {
    private tu c;
    private boolean d;

    public tu.e(tu tu3) {
        super(tu3);
        this.d = false;
        this.c = tu3;
    }

    public boolean c() {
        return this.a;
    }

    public boolean d() {
        return this.d;
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    @Override
    public void b() {
        if (this.a) {
            this.c.b(tu.b.c);
            this.a = false;
        }
    }
}
