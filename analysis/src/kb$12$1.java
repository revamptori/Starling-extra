/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
class kb.1
extends ka {
    final /* synthetic */ zx b;

    kb.1(zx zx2) {
        this.b = zx2;
    }

    @Override
    protected wv a(adm adm2, cz cz2) {
        return new xc(adm2, cz2.a(), cz2.b(), cz2.c(), this.b.k());
    }

    @Override
    protected float a() {
        return super.a() * 0.5f;
    }

    @Override
    protected float b() {
        return super.b() * 1.25f;
    }
}
