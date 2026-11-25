/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static class aez.a
implements ol {
    private final adm a;
    private final cj b;

    public aez.a(adm adm2, cj cj2) {
        this.a = adm2;
        this.b = cj2;
    }

    @Override
    public String e_() {
        return "anvil";
    }

    @Override
    public boolean l_() {
        return false;
    }

    @Override
    public eu f_() {
        return new fb(afi.cf.a() + ".name", new Object[0]);
    }

    @Override
    public xi a(wm wm2, wn wn2) {
        return new xk(wm2, this.a, this.b, wn2);
    }

    @Override
    public String k() {
        return "minecraft:anvil";
    }
}
