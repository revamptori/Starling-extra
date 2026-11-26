/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.List;

public class anu
implements amv {
    private static final List<alz> a = Lists.newArrayList();
    private static final int b;
    private static final int c;
    private final adm d;

    public anu(adm adm2) {
        this.d = adm2;
    }

    @Override
    public amy d(int n, int n2) {
        ans ans2 = new ans();
        for (int i = 0; i < 16; ++i) {
            for (\u2603 = 0; \u2603 < 16; ++\u2603) {
                \u2603 = n * 16 + i;
                i = n2 * 16 + \u2603;
                ans2.a(i, 60, \u2603, afi.cv.Q());
                alz alz2 = anu.b(\u2603, i);
                if (alz2 == null) continue;
                ans2.a(i, 70, \u2603, alz2);
            }
        }
        amy \u26032 = new amy(this.d, ans2, n, n2);
        \u26032.b();
        ady[] \u26033 = this.d.v().b(null, n * 16, n2 * 16, 16, 16);
        byte[] \u26034 = \u26032.k();
        for (int i = 0; i < \u26034.length; ++i) {
            \u26034[i] = (byte)\u26033[i].az;
        }
        \u26032.b();
        return \u26032;
    }

    public static alz b(int n, int n2) {
        alz alz2 = null;
        if (n > 0 && n2 > 0 && n % 2 != 0 && n2 % 2 != 0 && (n /= 2) <= b && (n2 /= 2) <= c && (\u2603 = ns.a(n * b + n2)) < a.size()) {
            alz2 = (alz)a.get(\u2603);
        }
        return alz2;
    }

    @Override
    public boolean a(int n, int n2) {
        return true;
    }

    @Override
    public void a(amv amv2, int n, int n2) {
    }

    @Override
    public boolean a(amv amv2, amy amy2, int n, int n2) {
        return false;
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
        return false;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public String f() {
        return "DebugLevelSource";
    }

    @Override
    public List<ady.c> a(pt pt2, cj cj2) {
        ady ady2 = this.d.b(cj2);
        return ady2.a(pt2);
    }

    @Override
    public cj a(adm adm2, String string, cj cj2) {
        return null;
    }

    @Override
    public int g() {
        return 0;
    }

    @Override
    public void a(amy amy2, int n, int n2) {
    }

    @Override
    public amy a(cj cj2) {
        return this.d(cj2.n() >> 4, cj2.p() >> 4);
    }

    static {
        for (afh afh2 : afh.c) {
            a.addAll(afh2.P().a());
        }
        b = ns.f(ns.c((float)a.size()));
        c = ns.f((float)a.size() / (float)b);
    }
}
