/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.awt.image.BufferedImage
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.Callable
 */
import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class bmi {
    private final String j;
    protected List<int[][]> a = Lists.newArrayList();
    protected int[][] b;
    private boa k;
    protected boolean c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    private float l;
    private float m;
    private float n;
    private float o;
    protected int h;
    protected int i;
    private static String p = "builtin/clock";
    private static String q = "builtin/compass";

    protected bmi(String string) {
        this.j = string;
    }

    protected static bmi a(jy jy2) {
        String string = jy2.toString();
        if (p.equals((Object)string)) {
            return new bmo(string);
        }
        if (q.equals((Object)string)) {
            return new bmp(string);
        }
        return new bmi(string);
    }

    public static void a(String string) {
        p = string;
    }

    public static void b(String string) {
        q = string;
    }

    public void a(int n, int n2, int n3, int n4, boolean bl) {
        this.d = n3;
        this.e = n4;
        this.c = bl;
        float f = (float)((double)0.01f / (double)n);
        \u2603 = (float)((double)0.01f / (double)n2);
        this.l = (float)n3 / (float)((double)n) + f;
        this.m = (float)(n3 + this.f) / (float)((double)n) - f;
        this.n = (float)n4 / (float)n2 + \u2603;
        this.o = (float)(n4 + this.g) / (float)n2 - \u2603;
    }

    public void a(bmi bmi2) {
        this.d = bmi2.d;
        this.e = bmi2.e;
        this.f = bmi2.f;
        this.g = bmi2.g;
        this.c = bmi2.c;
        this.l = bmi2.l;
        this.m = bmi2.m;
        this.n = bmi2.n;
        this.o = bmi2.o;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.g;
    }

    public float e() {
        return this.l;
    }

    public float f() {
        return this.m;
    }

    public float a(double d) {
        float f = this.m - this.l;
        return this.l + f * (float)d / 16.0f;
    }

    public float g() {
        return this.n;
    }

    public float h() {
        return this.o;
    }

    public float b(double d) {
        float f = this.o - this.n;
        return this.n + f * ((float)d / 16.0f);
    }

    public String i() {
        return this.j;
    }

    public void j() {
        ++this.i;
        if (this.i >= this.k.a(this.h)) {
            int n = this.k.c(this.h);
            \u2603 = this.k.c() == 0 ? this.a.size() : this.k.c();
            this.h = (this.h + 1) % \u2603;
            this.i = 0;
            \u2603 = this.k.c(this.h);
            if (n != \u2603 && \u2603 >= 0 && \u2603 < this.a.size()) {
                bml.a((int[][])this.a.get(\u2603), this.f, this.g, this.d, this.e, false, false);
            }
        } else if (this.k.e()) {
            this.n();
        }
    }

    private void n() {
        double d = 1.0 - (double)this.i / (double)this.k.a(this.h);
        int \u26032 = this.k.c(this.h);
        if (\u26032 != (\u2603 = this.k.c((this.h + 1) % (\u2603 = this.k.c() == 0 ? this.a.size() : this.k.c()))) && \u2603 >= 0 && \u2603 < this.a.size()) {
            int[][] nArray = (int[][])this.a.get(\u26032);
            \u2603 = (int[][])this.a.get(\u2603);
            if (this.b == null || this.b.length != nArray.length) {
                this.b = new int[nArray.length][];
            }
            for (int i = 0; i < nArray.length; ++i) {
                if (this.b[i] == null) {
                    this.b[i] = new int[nArray[i].length];
                }
                if (i >= \u2603.length || \u2603[i].length != nArray[i].length) continue;
                for (\u2603 = 0; \u2603 < nArray[i].length; ++\u2603) {
                    \u2603 = nArray[i][\u2603];
                    \u2603 = \u2603[i][\u2603];
                    \u2603 = (int)((double)((\u2603 & 0xFF0000) >> 16) * d + (double)((\u2603 & 0xFF0000) >> 16) * (1.0 - d));
                    \u2603 = (int)((double)((\u2603 & 0xFF00) >> 8) * d + (double)((\u2603 & 0xFF00) >> 8) * (1.0 - d));
                    \u2603 = (int)((double)(\u2603 & 0xFF) * d + (double)(\u2603 & 0xFF) * (1.0 - d));
                    this.b[i][\u2603] = \u2603 & 0xFF000000 | \u2603 << 16 | \u2603 << 8 | \u2603;
                }
            }
            bml.a(this.b, this.f, this.g, this.d, this.e, false, false);
        }
    }

    public int[][] a(int n) {
        return (int[][])this.a.get(n);
    }

    public int k() {
        return this.a.size();
    }

    public void b(int n) {
        this.f = n;
    }

    public void c(int n) {
        this.g = n;
    }

    public void a(BufferedImage[] bufferedImageArray, boa boa22) throws IOException {
        boa boa22;
        this.o();
        int n = bufferedImageArray[0].getWidth();
        \u2603 = bufferedImageArray[0].getHeight();
        this.f = n;
        this.g = \u2603;
        int[][] \u26032 = new int[bufferedImageArray.length][];
        for (n2 = 0; n2 < bufferedImageArray.length; ++n2) {
            BufferedImage bufferedImage = bufferedImageArray[n2];
            if (bufferedImage == null) continue;
            if (n2 > 0 && (bufferedImage.getWidth() != n >> n2 || bufferedImage.getHeight() != \u2603 >> n2)) {
                throw new RuntimeException(String.format((String)"Unable to load miplevel: %d, image is size: %dx%d, expected %dx%d", (Object[])new Object[]{n2, bufferedImage.getWidth(), bufferedImage.getHeight(), n >> n2, \u2603 >> n2}));
            }
            \u26032[n2] = new int[bufferedImage.getWidth() * bufferedImage.getHeight()];
            bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), \u26032[n2], 0, bufferedImage.getWidth());
        }
        if (boa22 == null) {
            if (\u2603 != n) {
                throw new RuntimeException("broken aspect ratio and not an animation");
            }
            this.a.add((Object)\u26032);
        } else {
            int n2 = \u2603 / n;
            \u2603 = n;
            \u2603 = n;
            this.g = this.f;
            if (boa22.c() > 0) {
                Iterator iterator = boa22.f().iterator();
                while (iterator.hasNext()) {
                    int n3 = (Integer)iterator.next();
                    if (n3 >= n2) {
                        throw new RuntimeException("invalid frameindex " + n3);
                    }
                    this.e(n3);
                    this.a.set(n3, (Object)bmi.a(\u26032, \u2603, \u2603, n3));
                }
                this.k = boa22;
            } else {
                ArrayList arrayList = Lists.newArrayList();
                for (int i = 0; i < n2; ++i) {
                    this.a.add((Object)bmi.a(\u26032, \u2603, \u2603, i));
                    arrayList.add((Object)new bnz(i, -1));
                }
                this.k = new boa((List<bnz>)arrayList, this.f, this.g, boa22.d(), boa22.e());
            }
        }
    }

    public void d(int n) {
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < this.a.size(); ++i) {
            final int[][] nArray = (int[][])this.a.get(i);
            if (nArray == null) continue;
            try {
                arrayList.add((Object)bml.a(n, this.f, nArray));
                continue;
            }
            catch (Throwable \u26032) {
                b b2 = b.a(\u26032, "Generating mipmaps for frame");
                c \u26033 = b2.a("Frame being iterated");
                \u26033.a("Frame index", i);
                \u26033.a("Frame sizes", new Callable<String>(){

                    public String a() throws Exception {
                        StringBuilder stringBuilder = new StringBuilder();
                        for (int[] nArray2 : nArray) {
                            if (stringBuilder.length() > 0) {
                                stringBuilder.append(", ");
                            }
                            stringBuilder.append((Object)(nArray2 == null ? "null" : Integer.valueOf((int)nArray2.length)));
                        }
                        return stringBuilder.toString();
                    }

                    public /* synthetic */ Object call() throws Exception {
                        return this.a();
                    }
                });
                throw new e(b2);
            }
        }
        this.a((List<int[][]>)arrayList);
    }

    private void e(int n) {
        if (this.a.size() > n) {
            return;
        }
        for (\u2603 = this.a.size(); \u2603 <= n; ++\u2603) {
            this.a.add(null);
        }
    }

    private static int[][] a(int[][] nArray, int n, int n2, int n3) {
        int[][] nArrayArray = new int[nArray.length][];
        for (int i = 0; i < nArray.length; ++i) {
            int[] nArray2 = nArray[i];
            if (nArray2 == null) continue;
            nArrayArray[i] = new int[(n >> i) * (n2 >> i)];
            System.arraycopy((Object)nArray2, (int)(n3 * nArrayArray[i].length), (Object)nArrayArray[i], (int)0, (int)nArrayArray[i].length);
        }
        return nArrayArray;
    }

    public void l() {
        this.a.clear();
    }

    public boolean m() {
        return this.k != null;
    }

    public void a(List<int[][]> list) {
        this.a = list;
    }

    private void o() {
        this.k = null;
        this.a((List<int[][]>)Lists.newArrayList());
        this.h = 0;
        this.i = 0;
    }

    public String toString() {
        return "TextureAtlasSprite{name='" + this.j + '\'' + ", frameCount=" + this.a.size() + ", rotated=" + this.c + ", x=" + this.d + ", y=" + this.e + ", height=" + this.g + ", width=" + this.f + ", u0=" + this.l + ", u1=" + this.m + ", v0=" + this.n + ", v1=" + this.o + '}';
    }
}
