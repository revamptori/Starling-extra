/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class acq
extends aci {
    public acq(int n, jy jy2, int n2) {
        super(n, jy2, n2, acj.f);
        this.c("oxygen");
    }

    @Override
    public int a(int n) {
        return 10 * n;
    }

    @Override
    public int b(int n) {
        return this.a(n) + 30;
    }

    @Override
    public int b() {
        return 3;
    }
}
