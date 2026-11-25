/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.DataInputStream
 *  java.io.DataOutput
 *  java.io.DataOutputStream
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class anj
implements and,
aud {
    private static final Logger a = LogManager.getLogger();
    private Map<adg, dn> b = new ConcurrentHashMap();
    private Set<adg> c = Collections.newSetFromMap((Map)new ConcurrentHashMap());
    private final File d;
    private boolean e = false;

    public anj(File file) {
        this.d = file;
    }

    @Override
    public amy a(adm adm22, int n, int n2) throws IOException {
        adm adm22;
        adg adg2 = new adg(n, n2);
        dn \u26032 = (dn)this.b.get((Object)adg2);
        if (\u26032 == null) {
            DataInputStream dataInputStream = ani.c(this.d, n, n2);
            if (dataInputStream != null) {
                \u26032 = dx.a(dataInputStream);
            } else {
                return null;
            }
        }
        return this.a(adm22, n, n2, \u26032);
    }

    protected amy a(adm adm2, int n, int n2, dn dn2) {
        if (!dn2.b("Level", 10)) {
            a.error("Chunk file at " + n + "," + n2 + " is missing level data, skipping");
            return null;
        }
        \u2603 = dn2.m("Level");
        if (!\u2603.b("Sections", 9)) {
            a.error("Chunk file at " + n + "," + n2 + " is missing block data, skipping");
            return null;
        }
        amy amy2 = this.a(adm2, \u2603);
        if (!amy2.a(n, n2)) {
            a.error("Chunk file at " + n + "," + n2 + " is in the wrong location; relocating. (Expected " + n + ", " + n2 + ", got " + amy2.a + ", " + amy2.b + ")");
            \u2603.a("xPos", n);
            \u2603.a("zPos", n2);
            amy2 = this.a(adm2, \u2603);
        }
        return amy2;
    }

    @Override
    public void a(adm adm2, amy amy2) throws IOException, adn {
        adm2.I();
        try {
            dn dn2 = new dn();
            \u2603 = new dn();
            dn2.a("Level", \u2603);
            this.a(amy2, adm2, \u2603);
            this.a(amy2.j(), dn2);
        }
        catch (Exception exception) {
            a.error("Failed to save chunk", (Throwable)exception);
        }
    }

    protected void a(adg adg2, dn dn2) {
        if (!this.c.contains((Object)adg2)) {
            this.b.put((Object)adg2, (Object)dn2);
        }
        auc.a().a(this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean c() {
        if (this.b.isEmpty()) {
            if (this.e) {
                a.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", new Object[]{this.d.getName()});
            }
            return false;
        }
        adg adg2 = (adg)this.b.keySet().iterator().next();
        try {
            this.c.add((Object)adg2);
            dn dn2 = (dn)this.b.remove((Object)adg2);
            if (dn2 != null) {
                try {
                    this.b(adg2, dn2);
                }
                catch (Exception exception) {
                    a.error("Failed to save chunk", (Throwable)exception);
                }
            }
            boolean bl = true;
            return bl;
        }
        finally {
            this.c.remove((Object)adg2);
        }
    }

    private void b(adg adg2, dn dn2) throws IOException {
        DataOutputStream dataOutputStream = ani.d(this.d, adg2.a, adg2.b);
        dx.a(dn2, (DataOutput)dataOutputStream);
        dataOutputStream.close();
    }

    @Override
    public void b(adm adm2, amy amy2) throws IOException {
    }

    @Override
    public void a() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b() {
        try {
            this.e = true;
            while (this.c()) {
            }
        }
        finally {
            this.e = false;
        }
    }

    private void a(amy amy2, adm adm2, dn dn22) {
        dn dn22;
        Object \u26034;
        dn22.a("V", (byte)1);
        dn22.a("xPos", amy2.a);
        dn22.a("zPos", amy2.b);
        dn22.a("LastUpdate", adm2.K());
        dn22.a("HeightMap", amy2.q());
        dn22.a("TerrainPopulated", amy2.t());
        dn22.a("LightPopulated", amy2.u());
        dn22.a("InhabitedTime", amy2.w());
        amz[] amzArray = amy2.h();
        du \u26032 = new du();
        boolean \u26033 = !adm2.t.o();
        for (amz amz2 : amzArray) {
            if (amz2 == null) continue;
            dn dn3 = new dn();
            dn3.a("Y", (byte)(amz2.d() >> 4 & 0xFF));
            \u26034 = new byte[amz2.g().length];
            amw \u26035 = new amw();
            Object \u26036 = null;
            for (int i = 0; i < amz2.g().length; ++i) {
                char c2 = amz2.g()[i];
                int \u26037 = i & 0xF;
                int \u26038 = i >> 8 & 0xF;
                int \u26039 = i >> 4 & 0xF;
                if (c2 >> 12 != 0) {
                    if (\u26036 == null) {
                        \u26036 = new amw();
                    }
                    ((amw)\u26036).a(\u26037, \u26038, \u26039, c2 >> 12);
                }
                \u26034[i] = (byte)(c2 >> 4 & 0xFF);
                \u26035.a(\u26037, \u26038, \u26039, c2 & 0xF);
            }
            dn3.a("Blocks", (byte[])\u26034);
            dn3.a("Data", \u26035.a());
            if (\u26036 != null) {
                dn3.a("Add", ((amw)\u26036).a());
            }
            dn3.a("BlockLight", amz2.h().a());
            if (\u26033) {
                dn3.a("SkyLight", amz2.i().a());
            } else {
                dn3.a("SkyLight", new byte[amz2.h().a().length]);
            }
            \u26032.a(dn3);
        }
        dn22.a("Sections", \u26032);
        dn22.a("Biomes", amy2.k());
        amy2.g(false);
        du du2 = new du();
        for (int i = 0; i < amy2.s().length; ++i) {
            Iterator<pk> iterator = amy2.s()[i].iterator();
            while (iterator.hasNext()) {
                pk pk2 = (pk)iterator.next();
                if (!pk2.d(dn3 = new dn())) continue;
                amy2.g(true);
                du2.a(dn3);
            }
        }
        dn22.a("Entities", du2);
        du \u260310 = new du();
        for (akw akw2 : amy2.r().values()) {
            dn3 = new dn();
            akw2.b(dn3);
            \u260310.a(dn3);
        }
        dn22.a("TileEntities", \u260310);
        List<adw> \u260311 = adm2.a(amy2, false);
        if (\u260311 != null) {
            long l = adm2.K();
            \u26034 = new du();
            for (Object \u26036 : \u260311) {
                \u2603 = new dn();
                jy jy2 = (jy)afh.c.c(((adw)\u26036).a());
                \u2603.a("i", jy2 == null ? "" : jy2.toString());
                \u2603.a("x", ((adw)\u26036).a.n());
                \u2603.a("y", ((adw)\u26036).a.o());
                \u2603.a("z", ((adw)\u26036).a.p());
                \u2603.a("t", (int)(((adw)\u26036).b - l));
                \u2603.a("p", ((adw)\u26036).c);
                ((du)\u26034).a(\u2603);
            }
            dn22.a("TileTicks", (eb)\u26034);
        }
    }

    private amy a(adm adm2, dn dn22) {
        du du2;
        dn dn22;
        Object \u260310;
        Object \u26039;
        Object \u26038;
        Object \u26037;
        int n2 = dn22.f("xPos");
        \u2603 = dn22.f("zPos");
        amy \u26032 = new amy(adm2, n2, \u2603);
        \u26032.a(dn22.l("HeightMap"));
        \u26032.d(dn22.n("TerrainPopulated"));
        \u26032.e(dn22.n("LightPopulated"));
        \u26032.c(dn22.g("InhabitedTime"));
        du \u26033 = dn22.c("Sections", 10);
        \u2603 = 16;
        amz[] \u26034 = new amz[\u2603];
        boolean \u26035 = !adm2.t.o();
        for (\u2603 = 0; \u2603 < \u26033.c(); ++\u2603) {
            dn dn3 = \u26033.b(\u2603);
            byte \u26036 = dn3.d("Y");
            \u26037 = new amz(\u26036 << 4, \u26035);
            \u26038 = dn3.k("Blocks");
            \u26039 = new amw(dn3.k("Data"));
            \u260310 = dn3.b("Add", 7) ? new amw(dn3.k("Add")) : null;
            char[] \u260311 = new char[((byte[])\u26038).length];
            for (int i = 0; i < \u260311.length; ++i) {
                \u2603 = i & 0xF;
                \u2603 = i >> 8 & 0xF;
                \u2603 = i >> 4 & 0xF;
                \u2603 = \u260310 != null ? ((amw)\u260310).a(\u2603, \u2603, \u2603) : 0;
                \u260311[i] = (char)(\u2603 << 12 | (\u26038[i] & 0xFF) << 4 | ((amw)\u26039).a(\u2603, \u2603, \u2603));
            }
            ((amz)\u26037).a(\u260311);
            ((amz)\u26037).a(new amw(dn3.k("BlockLight")));
            if (\u26035) {
                ((amz)\u26037).b(new amw(dn3.k("SkyLight")));
            }
            ((amz)\u26037).e();
            \u26034[\u26036] = \u26037;
        }
        \u26032.a(\u26034);
        if (dn22.b("Biomes", 7)) {
            \u26032.a(dn22.k("Biomes"));
        }
        if ((\u2603 = dn22.c("Entities", 10)) != null) {
            for (int i = 0; i < \u2603.c(); ++i) {
                dn dn4 = \u2603.b(i);
                \u26037 = pm.a(dn4, adm2);
                \u26032.g(true);
                if (\u26037 == null) continue;
                \u26032.a((pk)\u26037);
                \u26038 = \u26037;
                \u26039 = dn4;
                while (((dn)\u26039).b("Riding", 10)) {
                    \u260310 = pm.a(((dn)\u26039).m("Riding"), adm2);
                    if (\u260310 != null) {
                        \u26032.a((pk)\u260310);
                        ((pk)\u26038).a((pk)\u260310);
                    }
                    \u26038 = \u260310;
                    \u26039 = ((dn)\u26039).m("Riding");
                }
            }
        }
        if ((du2 = dn22.c("TileEntities", 10)) != null) {
            for (int i = 0; i < du2.c(); ++i) {
                \u26037 = du2.b(i);
                \u26038 = akw.c((dn)\u26037);
                if (\u26038 == null) continue;
                \u26032.a((akw)\u26038);
            }
        }
        if (dn22.b("TileTicks", 9) && (\u2603 = dn22.c("TileTicks", 10)) != null) {
            for (int i = 0; i < \u2603.c(); ++i) {
                \u26038 = \u2603.b(i);
                \u26039 = ((dn)\u26038).b("i", 8) ? afh.b(((dn)\u26038).j("i")) : afh.c(((dn)\u26038).f("i"));
                adm2.b(new cj(((dn)\u26038).f("x"), ((dn)\u26038).f("y"), ((dn)\u26038).f("z")), (afh)\u26039, ((dn)\u26038).f("t"), ((dn)\u26038).f("p"));
            }
        }
        return \u26032;
    }
}
