/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
public static enum avh.a {
    a("options.invertMouse", false, true),
    b("options.sensitivity", true, false),
    c("options.fov", true, false, 30.0f, 110.0f, 1.0f),
    d("options.gamma", true, false),
    e("options.saturation", true, false),
    f("options.renderDistance", true, false, 2.0f, 16.0f, 1.0f),
    g("options.viewBobbing", false, true),
    h("options.anaglyph", false, true),
    i("options.framerateLimit", true, false, 10.0f, 260.0f, 10.0f),
    j("options.fboEnable", false, true),
    k("options.renderClouds", false, false),
    l("options.graphics", false, false),
    m("options.ao", false, false),
    n("options.guiScale", false, false),
    o("options.particles", false, false),
    p("options.chat.visibility", false, false),
    q("options.chat.color", false, true),
    r("options.chat.links", false, true),
    s("options.chat.opacity", true, false),
    t("options.chat.links.prompt", false, true),
    u("options.snooper", false, true),
    v("options.fullscreen", false, true),
    w("options.vsync", false, true),
    x("options.vbo", false, true),
    y("options.touchscreen", false, true),
    z("options.chat.scale", true, false),
    A("options.chat.width", true, false),
    B("options.chat.height.focused", true, false),
    C("options.chat.height.unfocused", true, false),
    D("options.mipmapLevels", true, false, 0.0f, 4.0f, 1.0f),
    E("options.forceUnicodeFont", false, true),
    F("options.stream.bytesPerPixel", true, false),
    G("options.stream.micVolumne", true, false),
    H("options.stream.systemVolume", true, false),
    I("options.stream.kbps", true, false),
    J("options.stream.fps", true, false),
    K("options.stream.compression", false, false),
    L("options.stream.sendMetadata", false, true),
    M("options.stream.chat.enabled", false, false),
    N("options.stream.chat.userFilter", false, false),
    O("options.stream.micToggleBehavior", false, false),
    P("options.blockAlternatives", false, true),
    Q("options.reducedDebugInfo", false, true),
    R("options.entityShadows", false, true),
    S("options.realmsNotifications", false, true);

    private final boolean T;
    private final boolean U;
    private final String V;
    private final float W;
    private float X;
    private float Y;

    public static avh.a a(int n) {
        for (avh.a a2 : avh.a.values()) {
            if (a2.c() != n) continue;
            return a2;
        }
        return null;
    }

    private avh.a(String string2, boolean bl, boolean bl2) {
        this(string2, bl, bl2, 0.0f, 1.0f, 0.0f);
    }

    private avh.a(String string2, boolean bl, boolean bl2, float f, float f2, float f3) {
        this.V = string2;
        this.T = bl;
        this.U = bl2;
        this.X = f;
        this.Y = f2;
        this.W = f3;
    }

    public boolean a() {
        return this.T;
    }

    public boolean b() {
        return this.U;
    }

    public int c() {
        return this.ordinal();
    }

    public String d() {
        return this.V;
    }

    public float f() {
        return this.Y;
    }

    public void a(float f) {
        this.Y = f;
    }

    public float c(float f) {
        return ns.a((this.e(f) - this.X) / (this.Y - this.X), 0.0f, 1.0f);
    }

    public float d(float f) {
        return this.e(this.X + (this.Y - this.X) * ns.a(f, 0.0f, 1.0f));
    }

    public float e(float f) {
        f = this.f(f);
        return ns.a(f, this.X, this.Y);
    }

    protected float f(float f) {
        if (this.W > 0.0f) {
            f = this.W * (float)Math.round((float)(f / this.W));
        }
        return f;
    }

    static /* synthetic */ float a(avh.a a2) {
        return a2.Y;
    }

    static /* synthetic */ float b(avh.a a2) {
        return a2.X;
    }
}
