/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 */
static class adk.a {
    private String a;
    private boolean b;
    private int c;
    private double d;
    private final adk.b e;

    public adk.a(String string, adk.b b2) {
        this.e = b2;
        this.a(string);
    }

    public void a(String string) {
        this.a = string;
        this.b = Boolean.parseBoolean((String)string);
        this.c = this.b ? 1 : 0;
        try {
            this.c = Integer.parseInt((String)string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        try {
            this.d = Double.parseDouble((String)string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
    }

    public String a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public adk.b e() {
        return this.e;
    }
}
