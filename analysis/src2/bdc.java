/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
import com.google.common.base.Objects;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;

public class bdc {
    private final GameProfile a;
    private adp.a b;
    private int c;
    private boolean d = false;
    private jy e;
    private jy f;
    private String g;
    private eu h;
    private int i = 0;
    private int j = 0;
    private long k = 0L;
    private long l = 0L;
    private long m = 0L;

    public bdc(GameProfile gameProfile) {
        this.a = gameProfile;
    }

    public bdc(gz.b b2) {
        this.a = b2.a();
        this.b = b2.c();
        this.c = b2.b();
        this.h = b2.d();
    }

    public GameProfile a() {
        return this.a;
    }

    public adp.a b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    protected void a(adp.a a2) {
        this.b = a2;
    }

    protected void a(int n) {
        this.c = n;
    }

    public boolean e() {
        return this.e != null;
    }

    public String f() {
        if (this.g == null) {
            return bmz.b(this.a.getId());
        }
        return this.g;
    }

    public jy g() {
        if (this.e == null) {
            this.j();
        }
        return (jy)Objects.firstNonNull((Object)this.e, (Object)bmz.a(this.a.getId()));
    }

    public jy h() {
        if (this.f == null) {
            this.j();
        }
        return this.f;
    }

    public aul i() {
        return ave.A().f.Z().h(this.a().getName());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void j() {
        bdc bdc2 = this;
        synchronized (bdc2) {
            if (!this.d) {
                this.d = true;
                ave.A().ab().a(this.a, new bnp.a(){

                    @Override
                    public void a(MinecraftProfileTexture.Type type, jy jy2, MinecraftProfileTexture minecraftProfileTexture) {
                        switch (type) {
                            case SKIN: {
                                bdc.this.e = jy2;
                                bdc.this.g = minecraftProfileTexture.getMetadata("model");
                                if (bdc.this.g != null) break;
                                bdc.this.g = "default";
                                break;
                            }
                            case CAPE: {
                                bdc.this.f = jy2;
                            }
                        }
                    }
                }, true);
            }
        }
    }

    public void a(eu eu2) {
        this.h = eu2;
    }

    public eu k() {
        return this.h;
    }

    public int l() {
        return this.i;
    }

    public void b(int n) {
        this.i = n;
    }

    public int m() {
        return this.j;
    }

    public void c(int n) {
        this.j = n;
    }

    public long n() {
        return this.k;
    }

    public void a(long l) {
        this.k = l;
    }

    public long o() {
        return this.l;
    }

    public void b(long l) {
        this.l = l;
    }

    public long p() {
        return this.m;
    }

    public void c(long l) {
        this.m = l;
    }
}
