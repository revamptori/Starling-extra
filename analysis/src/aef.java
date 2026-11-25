/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Arrays
 *  java.util.List
 *  java.util.Random
 */
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class aef
extends aec {
    private ady b;
    private float c;

    public aef(ady ady2, float f) {
        this.b = ady2;
        this.c = f;
    }

    @Override
    public ady a(cj cj2) {
        return this.b;
    }

    @Override
    public ady[] a(ady[] adyArray2, int n, int n2, int n3, int n4) {
        ady[] adyArray2;
        if (adyArray2 == null || adyArray2.length < n3 * n4) {
            adyArray2 = new ady[n3 * n4];
        }
        Arrays.fill((Object[])adyArray2, (int)0, (int)(n3 * n4), (Object)this.b);
        return adyArray2;
    }

    @Override
    public float[] a(float[] fArray2, int n, int n2, int n3, int n4) {
        float[] fArray2;
        if (fArray2 == null || fArray2.length < n3 * n4) {
            fArray2 = new float[n3 * n4];
        }
        Arrays.fill((float[])fArray2, (int)0, (int)(n3 * n4), (float)this.c);
        return fArray2;
    }

    @Override
    public ady[] b(ady[] adyArray2, int n, int n2, int n3, int n4) {
        ady[] adyArray2;
        if (adyArray2 == null || adyArray2.length < n3 * n4) {
            adyArray2 = new ady[n3 * n4];
        }
        Arrays.fill((Object[])adyArray2, (int)0, (int)(n3 * n4), (Object)this.b);
        return adyArray2;
    }

    @Override
    public ady[] a(ady[] adyArray, int n, int n2, int n3, int n4, boolean bl) {
        return this.b(adyArray, n, n2, n3, n4);
    }

    @Override
    public cj a(int n, int n2, int n3, List<ady> list, Random random) {
        if (list.contains((Object)this.b)) {
            return new cj(n - n3 + random.nextInt(n3 * 2 + 1), 0, n2 - n3 + random.nextInt(n3 * 2 + 1));
        }
        return null;
    }

    @Override
    public boolean a(int n, int n2, int n3, List<ady> list) {
        return list.contains((Object)this.b);
    }
}
