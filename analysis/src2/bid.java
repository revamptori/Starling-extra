/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class bid {
    public float[][] a = new float[6][4];
    public float[] b = new float[16];
    public float[] c = new float[16];
    public float[] d = new float[16];

    private double a(float[] fArray, double d, double d2, double d3) {
        return (double)fArray[0] * d + (double)fArray[1] * d2 + (double)fArray[2] * d3 + (double)fArray[3];
    }

    public boolean b(double d, double d2, double d3, double d4, double d5, double d6) {
        for (int i = 0; i < 6; ++i) {
            float[] fArray = this.a[i];
            if (this.a(fArray, d, d2, d3) > 0.0 || this.a(fArray, d4, d2, d3) > 0.0 || this.a(fArray, d, d5, d3) > 0.0 || this.a(fArray, d4, d5, d3) > 0.0 || this.a(fArray, d, d2, d6) > 0.0 || this.a(fArray, d4, d2, d6) > 0.0 || this.a(fArray, d, d5, d6) > 0.0 || this.a(fArray, d4, d5, d6) > 0.0) continue;
            return false;
        }
        return true;
    }
}
