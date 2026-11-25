/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum akh.a implements nw
{
    a("top"),
    b("bottom");

    private final String c;

    private akh.a(String string2) {
        this.c = string2;
    }

    public String toString() {
        return this.c;
    }

    @Override
    public String l() {
        return this.c;
    }
}
