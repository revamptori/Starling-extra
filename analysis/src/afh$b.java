/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public static class afh.b {
    public final String a;
    public final float b;
    public final float c;

    public afh.b(String string, float f, float f2) {
        this.a = string;
        this.b = f;
        this.c = f2;
    }

    public float d() {
        return this.b;
    }

    public float e() {
        return this.c;
    }

    public String a() {
        return "dig." + this.a;
    }

    public String c() {
        return "step." + this.a;
    }

    public String b() {
        return this.a();
    }
}
