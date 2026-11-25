/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public class add.a
extends oa.a {
    private final dn c;
    private final String d;

    public add.a(dn dn2) {
        this(dn2.m("Properties"), dn2.j("Type"), dn2.f("Weight"));
    }

    public add.a(dn dn2, String string) {
        this(dn2, string, 1);
    }

    private add.a(dn dn22, String string2, int n) {
        dn dn22;
        super(n);
        if (string2.equals((Object)"Minecart")) {
            String string2 = dn22 != null ? va.a.a(dn22.f("Type")).b() : "MinecartRideable";
        }
        this.c = dn22;
        this.d = string2;
    }

    public dn a() {
        dn dn2 = new dn();
        dn2.a("Properties", this.c);
        dn2.a("Type", this.d);
        dn2.a("Weight", this.a);
        return dn2;
    }

    static /* synthetic */ String a(add.a a2) {
        return a2.d;
    }

    static /* synthetic */ dn b(add.a a2) {
        return a2.c;
    }
}
