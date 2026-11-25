/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
import net.minecraft.server.MinecraftServer;

class ad.1
implements m {
    final /* synthetic */ pk a;
    final /* synthetic */ m b;
    final /* synthetic */ cj c;
    final /* synthetic */ double d;
    final /* synthetic */ double e;
    final /* synthetic */ double f;

    ad.1(pk pk2, m m2, cj cj2, double d, double d2, double d3) {
        this.a = pk2;
        this.b = m2;
        this.c = cj2;
        this.d = d;
        this.e = d2;
        this.f = d3;
    }

    @Override
    public String e_() {
        return this.a.e_();
    }

    @Override
    public eu f_() {
        return this.a.f_();
    }

    @Override
    public void a(eu eu2) {
        this.b.a(eu2);
    }

    @Override
    public boolean a(int n2, String string) {
        return this.b.a(n2, string);
    }

    @Override
    public cj c() {
        return this.c;
    }

    @Override
    public aui d() {
        return new aui(this.d, this.e, this.f);
    }

    @Override
    public adm e() {
        return this.a.o;
    }

    @Override
    public pk f() {
        return this.a;
    }

    @Override
    public boolean u_() {
        MinecraftServer minecraftServer = MinecraftServer.N();
        return minecraftServer == null || minecraftServer.d[0].Q().b("commandBlockOutput");
    }

    @Override
    public void a(n.a a2, int n2) {
        this.a.a(a2, n2);
    }
}
