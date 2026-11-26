/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 *  java.util.List
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bcz
implements amv {
    private static final Logger a = LogManager.getLogger();
    private amy b;
    private nq<amy> c = new nq();
    private List<amy> d = Lists.newArrayList();
    private adm e;

    public bcz(adm adm2) {
        this.b = new amx(adm2, 0, 0);
        this.e = adm2;
    }

    @Override
    public boolean a(int n, int n2) {
        return true;
    }

    public void b(int n, int n2) {
        amy amy2 = this.d(n, n2);
        if (!amy2.f()) {
            amy2.d();
        }
        this.c.d(adg.a(n, n2));
        this.d.remove((Object)amy2);
    }

    public amy c(int n, int n2) {
        amy amy2 = new amy(this.e, n, n2);
        this.c.a(adg.a(n, n2), amy2);
        this.d.add((Object)amy2);
        amy2.c(true);
        return amy2;
    }

    @Override
    public amy d(int n, int n2) {
        amy amy2 = this.c.a(adg.a(n, n2));
        if (amy2 == null) {
            return this.b;
        }
        return amy2;
    }

    @Override
    public boolean a(boolean bl, nu nu2) {
        return true;
    }

    @Override
    public void c() {
    }

    @Override
    public boolean d() {
        long l = System.currentTimeMillis();
        for (amy amy2 : this.d) {
            amy2.b(System.currentTimeMillis() - l > 5L);
        }
        if (System.currentTimeMillis() - l > 100L) {
            a.info("Warning: Clientside chunk ticking took {} ms", new Object[]{System.currentTimeMillis() - l});
        }
        return false;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public void a(amv amv2, int n, int n2) {
    }

    @Override
    public boolean a(amv amv2, amy amy2, int n, int n2) {
        return false;
    }

    @Override
    public String f() {
        return "MultiplayerChunkCache: " + this.c.a() + ", " + this.d.size();
    }

    @Override
    public List<ady.c> a(pt pt2, cj cj2) {
        return null;
    }

    @Override
    public cj a(adm adm2, String string, cj cj2) {
        return null;
    }

    @Override
    public int g() {
        return this.d.size();
    }

    @Override
    public void a(amy amy2, int n, int n2) {
    }

    @Override
    public amy a(cj cj2) {
        return this.d(cj2.n() >> 4, cj2.p() >> 4);
    }
}
