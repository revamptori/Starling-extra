/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class ben
extends beo {
    protected ben(adm adm2, double d, double d2, double d3, double d4, double d5, double d6, alz alz2) {
        super(adm2, d, d2, d3, d4, d5, d6, alz2);
        this.v = d4;
        this.w = d5;
        this.x = d6;
    }

    public static class a
    implements bed {
        @Override
        public beb a(int n2, adm adm2, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
            alz alz2 = afh.d(nArray[0]);
            if (alz2.c().b() == -1) {
                return null;
            }
            return new ben(adm2, d, d2, d3, d4, d5, d6, alz2).l();
        }
    }
}
