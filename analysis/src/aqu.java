/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.Random
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public abstract class aqu {
    protected LinkedList<aqt> a = new LinkedList();
    protected aqe b;
    private int c;
    private int d;

    public aqu() {
    }

    public aqu(int n, int n2) {
        this.c = n;
        this.d = n2;
    }

    public aqe a() {
        return this.b;
    }

    public LinkedList<aqt> b() {
        return this.a;
    }

    public void a(adm adm2, Random random, aqe aqe2) {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            aqt aqt2 = (aqt)iterator.next();
            if (!aqt2.c().a(aqe2) || aqt2.a(adm2, random, aqe2)) continue;
            iterator.remove();
        }
    }

    protected void c() {
        this.b = aqe.a();
        for (aqt aqt2 : this.a) {
            this.b.b(aqt2.c());
        }
    }

    public dn a(int n, int n2) {
        dn dn2 = new dn();
        dn2.a("id", aqr.a(this));
        dn2.a("ChunkX", n);
        dn2.a("ChunkZ", n2);
        dn2.a("BB", this.b.g());
        du \u26032 = new du();
        for (aqt aqt2 : this.a) {
            \u26032.a(aqt2.b());
        }
        dn2.a("Children", \u26032);
        this.a(dn2);
        return dn2;
    }

    public void a(dn dn2) {
    }

    public void a(adm adm2, dn dn22) {
        dn dn22;
        this.c = dn22.f("ChunkX");
        this.d = dn22.f("ChunkZ");
        if (dn22.c("BB")) {
            this.b = new aqe(dn22.l("BB"));
        }
        du du2 = dn22.c("Children", 10);
        for (int i = 0; i < du2.c(); ++i) {
            this.a.add((Object)aqr.b(du2.b(i), adm2));
        }
        this.b(dn22);
    }

    public void b(dn dn2) {
    }

    protected void a(adm adm2, Random random, int n) {
        \u2603 = adm2.F() - n;
        \u2603 = this.b.d() + 1;
        if (\u2603 < \u2603) {
            \u2603 += random.nextInt(\u2603 - \u2603);
        }
        \u2603 = \u2603 - this.b.e;
        this.b.a(0, \u2603, 0);
        for (aqt aqt2 : this.a) {
            aqt2.a(0, \u2603, 0);
        }
    }

    protected void a(adm adm2, Random random, int n, int n2) {
        \u2603 = n2 - n + 1 - this.b.d();
        \u2603 = 1;
        \u2603 = \u2603 > 1 ? n + random.nextInt(\u2603) : n;
        \u2603 = \u2603 - this.b.b;
        this.b.a(0, \u2603, 0);
        for (aqt aqt2 : this.a) {
            aqt2.a(0, \u2603, 0);
        }
    }

    public boolean d() {
        return true;
    }

    public boolean a(adg adg2) {
        return true;
    }

    public void b(adg adg2) {
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }
}
