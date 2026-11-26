/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.System
 *  org.lwjgl.util.vector.Matrix4f
 *  org.lwjgl.util.vector.ReadableVector3f
 *  org.lwjgl.util.vector.Vector3f
 *  org.lwjgl.util.vector.Vector4f
 */
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.ReadableVector3f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public class bgo {
    private static final float a = 1.0f / (float)Math.cos((double)0.3926991f) - 1.0f;
    private static final float b = 1.0f / (float)Math.cos((double)0.7853981852531433) - 1.0f;

    public bgg a(Vector3f vector3f, Vector3f vector3f2, bgi bgi2, bmi bmi2, cq cq2, bor bor2, bgj bgj2, boolean bl, boolean bl2) {
        int[] nArray = this.a(bgi2, bmi2, cq2, this.a(vector3f, vector3f2), bor2, bgj2, bl, bl2);
        cq \u26032 = bgo.a(nArray);
        if (bl) {
            this.a(nArray, \u26032, bgi2.e, bmi2);
        }
        if (bgj2 == null) {
            this.a(nArray, \u26032);
        }
        return new bgg(nArray, bgi2.c, \u26032);
    }

    private int[] a(bgi bgi2, bmi bmi2, cq cq2, float[] fArray, bor bor2, bgj bgj2, boolean bl, boolean bl2) {
        int[] nArray = new int[28];
        for (int i = 0; i < 4; ++i) {
            this.a(nArray, i, cq2, bgi2, fArray, bmi2, bor2, bgj2, bl, bl2);
        }
        return nArray;
    }

    private int a(cq cq2) {
        float f = this.b(cq2);
        int \u26032 = ns.a((int)(f * 255.0f), 0, 255);
        return 0xFF000000 | \u26032 << 16 | \u26032 << 8 | \u26032;
    }

    private float b(cq cq2) {
        switch (cq2) {
            case a: {
                return 0.5f;
            }
            case b: {
                return 1.0f;
            }
            case c: 
            case d: {
                return 0.8f;
            }
            case e: 
            case f: {
                return 0.6f;
            }
        }
        return 1.0f;
    }

    private float[] a(Vector3f vector3f, Vector3f vector3f2) {
        float[] fArray = new float[cq.values().length];
        fArray[bfj.a.f] = vector3f.x / 16.0f;
        fArray[bfj.a.e] = vector3f.y / 16.0f;
        fArray[bfj.a.d] = vector3f.z / 16.0f;
        fArray[bfj.a.c] = vector3f2.x / 16.0f;
        fArray[bfj.a.b] = vector3f2.y / 16.0f;
        fArray[bfj.a.a] = vector3f2.z / 16.0f;
        return fArray;
    }

    private void a(int[] nArray, int n, cq cq2, bgi bgi2, float[] fArray, bmi bmi2, bor bor2, bgj bgj2, boolean bl, boolean bl2) {
        cq cq3 = bor2.a(cq2);
        int \u26032 = bl2 ? this.a(cq3) : -1;
        bfj.b \u26033 = bfj.a(cq2).a(n);
        Vector3f \u26034 = new Vector3f(fArray[\u26033.a], fArray[\u26033.b], fArray[\u26033.c]);
        this.a(\u26034, bgj2);
        int \u26035 = this.a(\u26034, cq2, n, bor2, bl);
        this.a(nArray, \u26035, n, \u26034, \u26032, bmi2, bgi2.e);
    }

    private void a(int[] nArray, int n, int n2, Vector3f vector3f, int n3, bmi bmi2, bgk bgk2) {
        int n4 = n * 7;
        nArray[n4] = Float.floatToRawIntBits((float)vector3f.x);
        nArray[n4 + 1] = Float.floatToRawIntBits((float)vector3f.y);
        nArray[n4 + 2] = Float.floatToRawIntBits((float)vector3f.z);
        nArray[n4 + 3] = n3;
        nArray[n4 + 4] = Float.floatToRawIntBits((float)bmi2.a(bgk2.a(n2)));
        nArray[n4 + 4 + 1] = Float.floatToRawIntBits((float)bmi2.b(bgk2.b(n2)));
    }

    private void a(Vector3f vector3f, bgj bgj2) {
        if (bgj2 == null) {
            return;
        }
        Matrix4f matrix4f = this.a();
        Vector3f \u26032 = new Vector3f(0.0f, 0.0f, 0.0f);
        switch (bgj2.b) {
            case a: {
                Matrix4f.rotate((float)(bgj2.c * ((float)Math.PI / 180)), (Vector3f)new Vector3f(1.0f, 0.0f, 0.0f), (Matrix4f)matrix4f, (Matrix4f)matrix4f);
                \u26032.set(0.0f, 1.0f, 1.0f);
                break;
            }
            case b: {
                Matrix4f.rotate((float)(bgj2.c * ((float)Math.PI / 180)), (Vector3f)new Vector3f(0.0f, 1.0f, 0.0f), (Matrix4f)matrix4f, (Matrix4f)matrix4f);
                \u26032.set(1.0f, 0.0f, 1.0f);
                break;
            }
            case c: {
                Matrix4f.rotate((float)(bgj2.c * ((float)Math.PI / 180)), (Vector3f)new Vector3f(0.0f, 0.0f, 1.0f), (Matrix4f)matrix4f, (Matrix4f)matrix4f);
                \u26032.set(1.0f, 1.0f, 0.0f);
            }
        }
        if (bgj2.d) {
            if (Math.abs((float)bgj2.c) == 22.5f) {
                \u26032.scale(a);
            } else {
                \u26032.scale(b);
            }
            Vector3f.add((Vector3f)\u26032, (Vector3f)new Vector3f(1.0f, 1.0f, 1.0f), (Vector3f)\u26032);
        } else {
            \u26032.set(1.0f, 1.0f, 1.0f);
        }
        this.a(vector3f, new Vector3f((ReadableVector3f)bgj2.a), matrix4f, \u26032);
    }

    public int a(Vector3f vector3f, cq cq2, int n, bor bor2, boolean bl) {
        if (bor2 == bor.a) {
            return n;
        }
        this.a(vector3f, new Vector3f(0.5f, 0.5f, 0.5f), bor2.a(), new Vector3f(1.0f, 1.0f, 1.0f));
        return bor2.a(cq2, n);
    }

    private void a(Vector3f vector3f, Vector3f vector3f2, Matrix4f matrix4f, Vector3f vector3f3) {
        Vector4f vector4f = new Vector4f(vector3f.x - vector3f2.x, vector3f.y - vector3f2.y, vector3f.z - vector3f2.z, 1.0f);
        Matrix4f.transform((Matrix4f)matrix4f, (Vector4f)vector4f, (Vector4f)vector4f);
        vector4f.x *= vector3f3.x;
        vector4f.y *= vector3f3.y;
        vector4f.z *= vector3f3.z;
        vector3f.set(vector4f.x + vector3f2.x, vector4f.y + vector3f2.y, vector4f.z + vector3f2.z);
    }

    private Matrix4f a() {
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.setIdentity();
        return matrix4f;
    }

    public static cq a(int[] nArray) {
        Vector3f vector3f = new Vector3f(Float.intBitsToFloat((int)nArray[0]), Float.intBitsToFloat((int)nArray[1]), Float.intBitsToFloat((int)nArray[2]));
        \u2603 = new Vector3f(Float.intBitsToFloat((int)nArray[7]), Float.intBitsToFloat((int)nArray[8]), Float.intBitsToFloat((int)nArray[9]));
        \u2603 = new Vector3f(Float.intBitsToFloat((int)nArray[14]), Float.intBitsToFloat((int)nArray[15]), Float.intBitsToFloat((int)nArray[16]));
        \u2603 = new Vector3f();
        \u2603 = new Vector3f();
        \u2603 = new Vector3f();
        Vector3f.sub((Vector3f)vector3f, (Vector3f)\u2603, (Vector3f)\u2603);
        Vector3f.sub((Vector3f)\u2603, (Vector3f)\u2603, (Vector3f)\u2603);
        Vector3f.cross((Vector3f)\u2603, (Vector3f)\u2603, (Vector3f)\u2603);
        float \u26032 = (float)Math.sqrt((double)(\u2603.x * \u2603.x + \u2603.y * \u2603.y + \u2603.z * \u2603.z));
        \u2603.x /= \u26032;
        \u2603.y /= \u26032;
        \u2603.z /= \u26032;
        cq \u26033 = null;
        float \u26034 = 0.0f;
        for (cq cq2 : cq.values()) {
            df df2 = cq2.m();
            Vector3f \u26035 = new Vector3f((float)df2.n(), (float)df2.o(), (float)df2.p());
            float \u26036 = Vector3f.dot((Vector3f)\u2603, (Vector3f)\u26035);
            if (!(\u26036 >= 0.0f) || !(\u26036 > \u26034)) continue;
            \u26034 = \u26036;
            \u26033 = cq2;
        }
        if (\u26033 == null) {
            return cq.b;
        }
        return \u26033;
    }

    public void a(int[] nArray, cq cq2, bgk bgk2, bmi bmi2) {
        for (int i = 0; i < 4; ++i) {
            this.a(i, nArray, cq2, bgk2, bmi2);
        }
    }

    private void a(int[] nArray, cq cq22) {
        cq cq22;
        int[] nArray2 = new int[nArray.length];
        System.arraycopy((Object)nArray, (int)0, (Object)nArray2, (int)0, (int)nArray.length);
        float[] \u26032 = new float[cq.values().length];
        \u26032[bfj.a.f] = 999.0f;
        \u26032[bfj.a.e] = 999.0f;
        \u26032[bfj.a.d] = 999.0f;
        \u26032[bfj.a.c] = -999.0f;
        \u26032[bfj.a.b] = -999.0f;
        \u26032[bfj.a.a] = -999.0f;
        for (int i = 0; i < 4; ++i) {
            i = 7 * i;
            float f = Float.intBitsToFloat((int)nArray2[i]);
            \u2603 = Float.intBitsToFloat((int)nArray2[i + 1]);
            \u26034 = Float.intBitsToFloat((int)nArray2[i + 2]);
            if (f < \u26032[bfj.a.f]) {
                \u26032[bfj.a.f] = f;
            }
            if (\u2603 < \u26032[bfj.a.e]) {
                \u26032[bfj.a.e] = \u2603;
            }
            if (\u26034 < \u26032[bfj.a.d]) {
                \u26032[bfj.a.d] = \u26034;
            }
            if (f > \u26032[bfj.a.c]) {
                \u26032[bfj.a.c] = f;
            }
            if (\u2603 > \u26032[bfj.a.b]) {
                \u26032[bfj.a.b] = \u2603;
            }
            if (!(\u26034 > \u26032[bfj.a.a])) continue;
            \u26032[bfj.a.a] = \u26034;
        }
        bfj \u26033 = bfj.a(cq22);
        for (int i = 0; i < 4; ++i) {
            \u2603 = 7 * i;
            bfj.b b2 = \u26033.a(i);
            float \u26034 = \u26032[b2.a];
            float \u26035 = \u26032[b2.b];
            float \u26036 = \u26032[b2.c];
            nArray[\u2603] = Float.floatToRawIntBits((float)\u26034);
            nArray[\u2603 + 1] = Float.floatToRawIntBits((float)\u26035);
            nArray[\u2603 + 2] = Float.floatToRawIntBits((float)\u26036);
            for (int j = 0; j < 4; ++j) {
                \u2603 = 7 * j;
                float f = Float.intBitsToFloat((int)nArray2[\u2603]);
                \u2603 = Float.intBitsToFloat((int)nArray2[\u2603 + 1]);
                \u2603 = Float.intBitsToFloat((int)nArray2[\u2603 + 2]);
                if (!ns.a(\u26034, f) || !ns.a(\u26035, \u2603) || !ns.a(\u26036, \u2603)) continue;
                nArray[\u2603 + 4] = nArray2[\u2603 + 4];
                nArray[\u2603 + 4 + 1] = nArray2[\u2603 + 4 + 1];
            }
        }
    }

    private void a(int n, int[] nArray, cq cq2, bgk bgk2, bmi bmi2) {
        int n2 = 7 * n;
        float \u26032 = Float.intBitsToFloat((int)nArray[n2]);
        float \u26033 = Float.intBitsToFloat((int)nArray[n2 + 1]);
        float \u26034 = Float.intBitsToFloat((int)nArray[n2 + 2]);
        if (\u26032 < -0.1f || \u26032 >= 1.1f) {
            \u26032 -= (float)ns.d(\u26032);
        }
        if (\u26033 < -0.1f || \u26033 >= 1.1f) {
            \u26033 -= (float)ns.d(\u26033);
        }
        if (\u26034 < -0.1f || \u26034 >= 1.1f) {
            \u26034 -= (float)ns.d(\u26034);
        }
        float \u26035 = 0.0f;
        float \u26036 = 0.0f;
        switch (cq2) {
            case a: {
                \u26035 = \u26032 * 16.0f;
                \u26036 = (1.0f - \u26034) * 16.0f;
                break;
            }
            case b: {
                \u26035 = \u26032 * 16.0f;
                \u26036 = \u26034 * 16.0f;
                break;
            }
            case c: {
                \u26035 = (1.0f - \u26032) * 16.0f;
                \u26036 = (1.0f - \u26033) * 16.0f;
                break;
            }
            case d: {
                \u26035 = \u26032 * 16.0f;
                \u26036 = (1.0f - \u26033) * 16.0f;
                break;
            }
            case e: {
                \u26035 = \u26034 * 16.0f;
                \u26036 = (1.0f - \u26033) * 16.0f;
                break;
            }
            case f: {
                \u26035 = (1.0f - \u26034) * 16.0f;
                \u26036 = (1.0f - \u26033) * 16.0f;
            }
        }
        \u2603 = bgk2.c(n) * 7;
        nArray[\u2603 + 4] = Float.floatToRawIntBits((float)bmi2.a(\u26035));
        nArray[\u2603 + 4 + 1] = Float.floatToRawIntBits((float)bmi2.b(\u26036));
    }
}
