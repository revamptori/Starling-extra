/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class bcg {
    public aui a;
    public float b;
    public float c;

    public bcg(float f, float f2, float f3, float f4, float f5) {
        this(new aui(f, f2, f3), f4, f5);
    }

    public bcg a(float f, float f2) {
        return new bcg(this, f, f2);
    }

    public bcg(bcg bcg2, float f, float f2) {
        this.a = bcg2.a;
        this.b = f;
        this.c = f2;
    }

    public bcg(aui aui2, float f, float f2) {
        this.a = aui2;
        this.b = f;
        this.c = f2;
    }
}
