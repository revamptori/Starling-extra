/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  java.lang.Object
 *  java.lang.Override
 */
import com.mojang.authlib.GameProfile;

static final class kb.7
extends cn {
    private boolean b = true;

    kb.7() {
    }

    @Override
    protected zx b(ck ck2, zx zx22) {
        zx zx22;
        adm adm2 = ck2.i();
        cq \u26032 = agg.b(ck2.f());
        cj \u26033 = ck2.d().a(\u26032);
        ajm \u26034 = afi.ce;
        if (adm2.d(\u26033) && \u26034.b(adm2, \u26033, zx22)) {
            if (!adm2.D) {
                adm2.a(\u26033, \u26034.Q().a(ajm.a, cq.b), 3);
                akw akw2 = adm2.s(\u26033);
                if (akw2 instanceof alo) {
                    if (zx22.i() == 3) {
                        GameProfile gameProfile = null;
                        if (zx22.n()) {
                            dn dn2 = zx22.o();
                            if (dn2.b("SkullOwner", 10)) {
                                gameProfile = dy.a(dn2.m("SkullOwner"));
                            } else if (dn2.b("SkullOwner", 8) && !nx.b(\u2603 = dn2.j("SkullOwner"))) {
                                gameProfile = new GameProfile(null, \u2603);
                            }
                        }
                        ((alo)akw2).a(gameProfile);
                    } else {
                        ((alo)akw2).a(zx22.i());
                    }
                    ((alo)akw2).b(\u26032.d().b() * 4);
                    afi.ce.a(adm2, \u26033, (alo)akw2);
                }
                --zx22.b;
            }
        } else {
            this.b = false;
        }
        return zx22;
    }

    @Override
    protected void a(ck ck2) {
        if (this.b) {
            ck2.i().b(1000, ck2.d(), 0);
        } else {
            ck2.i().b(1001, ck2.d(), 0);
        }
    }
}
