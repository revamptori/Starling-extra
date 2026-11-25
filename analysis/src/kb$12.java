/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
static final class kb.12
implements cr {
    private final cn b = new cn();

    kb.12() {
    }

    @Override
    public zx a(ck ck2, final zx zx2) {
        if (aai.f(zx2.i())) {
            return new ka(){

                @Override
                protected wv a(adm adm2, cz cz2) {
                    return new xc(adm2, cz2.a(), cz2.b(), cz2.c(), zx2.k());
                }

                @Override
                protected float a() {
                    return super.a() * 0.5f;
                }

                @Override
                protected float b() {
                    return super.b() * 1.25f;
                }
            }.a(ck2, zx2);
        }
        return this.b.a(ck2, zx2);
    }
}
