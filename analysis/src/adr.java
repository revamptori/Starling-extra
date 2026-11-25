/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public class adr {
    public static final adr[] a = new adr[16];
    public static final adr b = new adr(0, "default", 1).i();
    public static final adr c = new adr(1, "flat");
    public static final adr d = new adr(2, "largeBiomes");
    public static final adr e = new adr(3, "amplified").j();
    public static final adr f = new adr(4, "customized");
    public static final adr g = new adr(5, "debug_all_block_states");
    public static final adr h = new adr(8, "default_1_1", 0).a(false);
    private final int i;
    private final String j;
    private final int k;
    private boolean l;
    private boolean m;
    private boolean n;

    private adr(int n, String string) {
        this(n, string, 0);
    }

    private adr(int n, String string, int n2) {
        this.j = string;
        this.k = n2;
        this.l = true;
        this.i = n;
        adr.a[n] = this;
    }

    public String a() {
        return this.j;
    }

    public String b() {
        return "generator." + this.j;
    }

    public String c() {
        return this.b() + ".info";
    }

    public int d() {
        return this.k;
    }

    public adr a(int n) {
        if (this == b && n == 0) {
            return h;
        }
        return this;
    }

    private adr a(boolean bl) {
        this.l = bl;
        return this;
    }

    public boolean e() {
        return this.l;
    }

    private adr i() {
        this.m = true;
        return this;
    }

    public boolean f() {
        return this.m;
    }

    public static adr a(String string) {
        for (int i = 0; i < a.length; ++i) {
            if (a[i] == null || !adr.a[i].j.equalsIgnoreCase(string)) continue;
            return a[i];
        }
        return null;
    }

    public int g() {
        return this.i;
    }

    public boolean h() {
        return this.n;
    }

    private adr j() {
        this.n = true;
        return this;
    }
}
