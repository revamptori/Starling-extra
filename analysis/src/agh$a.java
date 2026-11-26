/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public static enum agh.a implements nw
{
    a,
    b;


    public String toString() {
        return this.l();
    }

    @Override
    public String l() {
        return this == a ? "upper" : "lower";
    }
}
