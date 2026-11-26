/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public static enum bde.a {
    a("enabled"),
    b("disabled"),
    c("prompt");

    private final eu d;

    private bde.a(String string2) {
        this.d = new fb("addServer.resourcePack." + string2, new Object[0]);
    }

    public eu a() {
        return this.d;
    }
}
