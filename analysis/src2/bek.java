/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class bek
extends ber {
    protected bek(adm adm2, double d, double d2, double d3, double d4, double d5, double d6) {
        super(adm2, d, d2, d3);
        this.i = 0.04f;
        this.k();
        if (d5 == 0.0 && (d4 != 0.0 || d6 != 0.0)) {
            this.v = d4;
            this.w = d5 + 0.1;
            this.x = d6;
        }
    }

    public static class a
    implements bed {
        @Override
        public beb a(int n2, adm adm2, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
            return new bek(adm2, d, d2, d3, d4, d5, d6);
        }
    }
}
