/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public static enum aku.a {
    a("base", "b"),
    b("square_bottom_left", "bl", "   ", "   ", "#  "),
    c("square_bottom_right", "br", "   ", "   ", "  #"),
    d("square_top_left", "tl", "#  ", "   ", "   "),
    e("square_top_right", "tr", "  #", "   ", "   "),
    f("stripe_bottom", "bs", "   ", "   ", "###"),
    g("stripe_top", "ts", "###", "   ", "   "),
    h("stripe_left", "ls", "#  ", "#  ", "#  "),
    i("stripe_right", "rs", "  #", "  #", "  #"),
    j("stripe_center", "cs", " # ", " # ", " # "),
    k("stripe_middle", "ms", "   ", "###", "   "),
    l("stripe_downright", "drs", "#  ", " # ", "  #"),
    m("stripe_downleft", "dls", "  #", " # ", "#  "),
    n("small_stripes", "ss", "# #", "# #", "   "),
    o("cross", "cr", "# #", " # ", "# #"),
    p("straight_cross", "sc", " # ", "###", " # "),
    q("triangle_bottom", "bt", "   ", " # ", "# #"),
    r("triangle_top", "tt", "# #", " # ", "   "),
    s("triangles_bottom", "bts", "   ", "# #", " # "),
    t("triangles_top", "tts", " # ", "# #", "   "),
    u("diagonal_left", "ld", "## ", "#  ", "   "),
    v("diagonal_up_right", "rd", "   ", "  #", " ##"),
    w("diagonal_up_left", "lud", "   ", "#  ", "## "),
    x("diagonal_right", "rud", " ##", "  #", "   "),
    y("circle", "mc", "   ", " # ", "   "),
    z("rhombus", "mr", " # ", "# #", " # "),
    A("half_vertical", "vh", "## ", "## ", "## "),
    B("half_horizontal", "hh", "###", "###", "   "),
    C("half_vertical_right", "vhr", " ##", " ##", " ##"),
    D("half_horizontal_bottom", "hhb", "   ", "###", "###"),
    E("border", "bo", "###", "# #", "###"),
    F("curly_border", "cbo", new zx(afi.bn)),
    G("creeper", "cre", new zx(zy.bX, 1, 4)),
    H("gradient", "gra", "# #", " # ", " # "),
    I("gradient_up", "gru", " # ", " # ", "# #"),
    J("bricks", "bri", new zx(afi.V)),
    K("skull", "sku", new zx(zy.bX, 1, 1)),
    L("flower", "flo", new zx(afi.O, 1, agw.a.j.b())),
    M("mojang", "moj", new zx(zy.ao, 1, 1));

    private String N;
    private String O;
    private String[] P = new String[3];
    private zx Q;

    private aku.a(String string2, String string3) {
        this.N = string2;
        this.O = string3;
    }

    private aku.a(String string2, String string3, zx zx2) {
        this(string2, string3);
        this.Q = zx2;
    }

    private aku.a(String string2, String string3, String string4, String string5, String string6) {
        this(string2, string3);
        this.P[0] = string4;
        this.P[1] = string5;
        this.P[2] = string6;
    }

    public String a() {
        return this.N;
    }

    public String b() {
        return this.O;
    }

    public String[] c() {
        return this.P;
    }

    public boolean d() {
        return this.Q != null || this.P[0] != null;
    }

    public boolean e() {
        return this.Q != null;
    }

    public zx f() {
        return this.Q;
    }

    public static aku.a a(String string) {
        for (aku.a a2 : aku.a.values()) {
            if (!a2.O.equals((Object)string)) continue;
            return a2;
        }
        return null;
    }
}
