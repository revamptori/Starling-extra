/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Random
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class aec {
    private ase b;
    private ase c;
    private adz d = new adz(this);
    private List<ady> e = Lists.newArrayList();
    private String f = "";

    protected aec() {
        this.e.add((Object)ady.t);
        this.e.add((Object)ady.q);
        this.e.add((Object)ady.u);
        this.e.add((Object)ady.I);
        this.e.add((Object)ady.H);
        this.e.add((Object)ady.K);
        this.e.add((Object)ady.L);
    }

    public aec(long l, adr adr2, String string) {
        this();
        this.f = string;
        ase[] aseArray = ase.a(l, adr2, string);
        this.b = aseArray[0];
        this.c = aseArray[1];
    }

    public aec(adm adm2) {
        this(adm2.J(), adm2.P().u(), adm2.P().B());
    }

    public List<ady> a() {
        return this.e;
    }

    public ady a(cj cj2) {
        return this.a(cj2, null);
    }

    public ady a(cj cj2, ady ady2) {
        return this.d.a(cj2.n(), cj2.p(), ady2);
    }

    public float[] a(float[] fArray2, int n5, int n2, int n3, int n4) {
        int n5;
        asc.a();
        if (fArray2 == null || fArray2.length < n3 * n4) {
            float[] fArray2 = new float[n3 * n4];
        }
        int[] \u26032 = this.c.a(n5, n2, n3, n4);
        for (\u2603 = 0; \u2603 < n3 * n4; ++\u2603) {
            try {
                float f = (float)ady.a(\u26032[\u2603], ady.ad).h() / 65536.0f;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                fArray2[\u2603] = f;
                continue;
            }
            catch (Throwable throwable) {
                b b2 = b.a(throwable, "Invalid Biome id");
                c \u26033 = b2.a("DownfallBlock");
                \u26033.a("biome id", \u2603);
                \u26033.a("downfalls[] size", fArray2.length);
                \u26033.a("x", n5);
                \u26033.a("z", n2);
                \u26033.a("w", n3);
                \u26033.a("h", n4);
                throw new e(b2);
            }
        }
        return fArray2;
    }

    public float a(float f, int n) {
        return f;
    }

    public ady[] a(ady[] adyArray2, int n5, int n2, int n3, int n4) {
        int n5;
        asc.a();
        if (adyArray2 == null || adyArray2.length < n3 * n4) {
            ady[] adyArray2 = new ady[n3 * n4];
        }
        int[] \u26032 = this.b.a(n5, n2, n3, n4);
        try {
            for (\u2603 = 0; \u2603 < n3 * n4; ++\u2603) {
                adyArray2[\u2603] = ady.a(\u26032[\u2603], ady.ad);
            }
        }
        catch (Throwable \u26033) {
            b b2 = b.a(\u26033, "Invalid Biome id");
            c \u26034 = b2.a("RawBiomeBlock");
            \u26034.a("biomes[] size", adyArray2.length);
            \u26034.a("x", n5);
            \u26034.a("z", n2);
            \u26034.a("w", n3);
            \u26034.a("h", n4);
            throw new e(b2);
        }
        return adyArray2;
    }

    public ady[] b(ady[] adyArray, int n, int n2, int n3, int n4) {
        return this.a(adyArray, n, n2, n3, n4, true);
    }

    public ady[] a(ady[] adyArray2, int n5, int n2, int n3, int n4, boolean bl2) {
        int n5;
        boolean bl2;
        asc.a();
        if (adyArray2 == null || adyArray2.length < n3 * n4) {
            ady[] adyArray2 = new ady[n3 * n4];
        }
        if (bl2 && n3 == 16 && n4 == 16 && (n5 & 0xF) == 0 && (n2 & 0xF) == 0) {
            ady[] adyArray3 = this.d.c(n5, n2);
            System.arraycopy((Object)adyArray3, (int)0, (Object)adyArray2, (int)0, (int)(n3 * n4));
            return adyArray2;
        }
        int[] \u26032 = this.c.a(n5, n2, n3, n4);
        for (\u2603 = 0; \u2603 < n3 * n4; ++\u2603) {
            adyArray2[\u2603] = ady.a(\u26032[\u2603], ady.ad);
        }
        return adyArray2;
    }

    public boolean a(int n, int n2, int n3, List<ady> list) {
        asc.a();
        int n4 = n - n3 >> 2;
        \u2603 = n2 - n3 >> 2;
        \u2603 = n + n3 >> 2;
        \u2603 = n2 + n3 >> 2;
        \u2603 = \u2603 - n4 + 1;
        \u2603 = \u2603 - \u2603 + 1;
        int[] \u26032 = this.b.a(n4, \u2603, \u2603, \u2603);
        try {
            for (\u2603 = 0; \u2603 < \u2603 * \u2603; ++\u2603) {
                ady ady2 = ady.e(\u26032[\u2603]);
                if (list.contains((Object)ady2)) continue;
                return false;
            }
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Invalid Biome id");
            c \u26033 = b2.a("Layer");
            \u26033.a("Layer", this.b.toString());
            \u26033.a("x", n);
            \u26033.a("z", n2);
            \u26033.a("radius", n3);
            \u26033.a("allowed", list);
            throw new e(b2);
        }
        return true;
    }

    public cj a(int n, int n2, int n3, List<ady> list, Random random) {
        asc.a();
        int n4 = n - n3 >> 2;
        \u2603 = n2 - n3 >> 2;
        \u2603 = n + n3 >> 2;
        \u2603 = n2 + n3 >> 2;
        \u2603 = \u2603 - n4 + 1;
        \u2603 = \u2603 - \u2603 + 1;
        int[] \u26032 = this.b.a(n4, \u2603, \u2603, \u2603);
        cj \u26033 = null;
        \u2603 = 0;
        for (\u2603 = 0; \u2603 < \u2603 * \u2603; ++\u2603) {
            \u2603 = n4 + \u2603 % \u2603 << 2;
            \u2603 = \u2603 + \u2603 / \u2603 << 2;
            ady ady2 = ady.e(\u26032[\u2603]);
            if (!list.contains((Object)ady2) || \u26033 != null && random.nextInt(\u2603 + 1) != 0) continue;
            \u26033 = new cj(\u2603, 0, \u2603);
            ++\u2603;
        }
        return \u26033;
    }

    public void b() {
        this.d.a();
    }
}
