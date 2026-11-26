/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.ClassCastException
 *  java.lang.Object
 */
public class ang {
    public static a a(dn dn2) {
        int n = dn2.f("xPos");
        \u2603 = dn2.f("zPos");
        a \u26032 = new a(n, \u2603);
        \u26032.g = dn2.k("Blocks");
        \u26032.f = new ana(dn2.k("Data"), 7);
        \u26032.e = new ana(dn2.k("SkyLight"), 7);
        \u26032.d = new ana(dn2.k("BlockLight"), 7);
        \u26032.c = dn2.k("HeightMap");
        \u26032.b = dn2.n("TerrainPopulated");
        \u26032.h = dn2.c("Entities", 10);
        \u26032.i = dn2.c("TileEntities", 10);
        \u26032.j = dn2.c("TileTicks", 10);
        try {
            \u26032.a = dn2.g("LastUpdate");
        }
        catch (ClassCastException \u26033) {
            \u26032.a = dn2.f("LastUpdate");
        }
        return \u26032;
    }

    public static void a(a a2, dn dn22, aec aec2) {
        int n;
        dn dn22;
        dn22.a("xPos", a2.k);
        dn22.a("zPos", a2.l);
        dn22.a("LastUpdate", a2.a);
        int[] nArray = new int[a2.c.length];
        for (int i = 0; i < a2.c.length; ++i) {
            nArray[i] = a2.c[i];
        }
        dn22.a("HeightMap", nArray);
        dn22.a("TerrainPopulated", a2.b);
        du \u26032 = new du();
        for (int i = 0; i < 8; ++i) {
            boolean bl = true;
            for (n = 0; n < 16 && bl; ++n) {
                block3: for (\u2603 = 0; \u2603 < 16 && bl; ++\u2603) {
                    for (\u2603 = 0; \u2603 < 16; ++\u2603) {
                        \u2603 = n << 11 | \u2603 << 7 | \u2603 + (i << 4);
                        j = a2.g[\u2603];
                        if (j == 0) continue;
                        bl = false;
                        continue block3;
                    }
                }
            }
            if (bl) continue;
            byte[] \u26033 = new byte[4096];
            amw \u26034 = new amw();
            amw \u26035 = new amw();
            amw \u26036 = new amw();
            for (int j = 0; j < 16; ++j) {
                for (\u2603 = 0; \u2603 < 16; ++\u2603) {
                    for (\u2603 = 0; \u2603 < 16; ++\u2603) {
                        \u2603 = j << 11 | \u2603 << 7 | \u2603 + (i << 4);
                        byte by = a2.g[\u2603];
                        \u26033[\u2603 << 8 | \u2603 << 4 | j] = (byte)(by & 0xFF);
                        \u26034.a(j, \u2603, \u2603, a2.f.a(j, \u2603 + (i << 4), \u2603));
                        \u26035.a(j, \u2603, \u2603, a2.e.a(j, \u2603 + (i << 4), \u2603));
                        \u26036.a(j, \u2603, \u2603, a2.d.a(j, \u2603 + (i << 4), \u2603));
                    }
                }
            }
            dn dn3 = new dn();
            dn3.a("Y", (byte)(i & 0xFF));
            dn3.a("Blocks", \u26033);
            dn3.a("Data", \u26034.a());
            dn3.a("SkyLight", \u26035.a());
            dn3.a("BlockLight", \u26036.a());
            \u26032.a(dn3);
        }
        dn22.a("Sections", \u26032);
        byte[] \u26037 = new byte[256];
        cj.a \u26038 = new cj.a();
        for (n = 0; n < 16; ++n) {
            for (\u2603 = 0; \u2603 < 16; ++\u2603) {
                \u26038.c(a2.k << 4 | n, 0, a2.l << 4 | \u2603);
                \u26037[\u2603 << 4 | n] = (byte)(aec2.a((cj)\u26038, (ady)ady.ad).az & 0xFF);
            }
        }
        dn22.a("Biomes", \u26037);
        dn22.a("Entities", a2.h);
        dn22.a("TileEntities", a2.i);
        if (a2.j != null) {
            dn22.a("TileTicks", a2.j);
        }
    }

    public static class a {
        public long a;
        public boolean b;
        public byte[] c;
        public ana d;
        public ana e;
        public ana f;
        public byte[] g;
        public du h;
        public du i;
        public du j;
        public final int k;
        public final int l;

        public a(int n, int n2) {
            this.k = n;
            this.l = n2;
        }
    }
}
