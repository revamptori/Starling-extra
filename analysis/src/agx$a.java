/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum agx.a implements nw
{
    a("empty"),
    b("rose"),
    c("blue_orchid"),
    d("allium"),
    e("houstonia"),
    f("red_tulip"),
    g("orange_tulip"),
    h("white_tulip"),
    i("pink_tulip"),
    j("oxeye_daisy"),
    k("dandelion"),
    l("oak_sapling"),
    m("spruce_sapling"),
    n("birch_sapling"),
    o("jungle_sapling"),
    p("acacia_sapling"),
    q("dark_oak_sapling"),
    r("mushroom_red"),
    s("mushroom_brown"),
    t("dead_bush"),
    u("fern"),
    v("cactus");

    private final String w;

    private agx.a(String string2) {
        this.w = string2;
    }

    public String toString() {
        return this.w;
    }

    @Override
    public String l() {
        return this.w;
    }
}
