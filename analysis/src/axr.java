/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class axr
extends axu
implements nu {
    private String a = "";
    private String f = "";
    private int g;
    private boolean h;

    @Override
    public void a(String string) {
        this.b(string);
    }

    @Override
    public void b(String string) {
        this.a = string;
        this.c("Working...");
    }

    @Override
    public void c(String string) {
        this.f = string;
        this.a(0);
    }

    @Override
    public void a(int n) {
        this.g = n;
    }

    @Override
    public void a() {
        this.h = true;
    }

    @Override
    public void a(int n, int n2, float f) {
        if (this.h) {
            if (!this.j.al()) {
                this.j.a((axu)null);
            }
            return;
        }
        this.c();
        this.a(this.q, this.a, this.l / 2, 70, 0xFFFFFF);
        this.a(this.q, this.f + " " + this.g + "%", this.l / 2, 90, 0xFFFFFF);
        super.a(n, n2, f);
    }
}
