/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  java.awt.image.BufferedImage
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.concurrent.Callable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bmh
extends bly
implements bmn {
    private static final Logger h = LogManager.getLogger();
    public static final jy f = new jy("missingno");
    public static final jy g = new jy("textures/atlas/blocks.png");
    private final List<bmi> i = Lists.newArrayList();
    private final Map<String, bmi> j = Maps.newHashMap();
    private final Map<String, bmi> k = Maps.newHashMap();
    private final String l;
    private final bmb m;
    private int n;
    private final bmi o = new bmi("missingno");

    public bmh(String string) {
        this(string, null);
    }

    public bmh(String string, bmb bmb2) {
        this.l = string;
        this.m = bmb2;
    }

    private void g() {
        int[] nArray = bml.b;
        this.o.b(16);
        this.o.c(16);
        int[][] \u26032 = new int[this.n + 1][];
        \u26032[0] = nArray;
        this.o.a((List<int[][]>)Lists.newArrayList((Object[])new int[][][]{\u26032}));
    }

    @Override
    public void a(bni bni2) throws IOException {
        if (this.m != null) {
            this.a(bni2, this.m);
        }
    }

    public void a(bni bni2, bmb bmb2) {
        this.j.clear();
        bmb2.a(this);
        this.g();
        this.c();
        this.b(bni2);
    }

    public void b(bni bni2) {
        int n;
        Object object;
        Object \u26036;
        Object \u26035;
        bmi bmi2;
        int n2 = ave.C();
        bmf \u26032 = new bmf(n2, n2, true, 0, this.n);
        this.k.clear();
        this.i.clear();
        n = Integer.MAX_VALUE;
        \u2603 = 1 << this.n;
        for (Map.Entry entry : this.j.entrySet()) {
            bmi2 = (bmi)entry.getValue();
            Object \u26033 = new jy(bmi2.i());
            Object \u26034 = this.a((jy)\u26033, 0);
            try {
                bnh bnh2 = bni2.a((jy)\u26034);
                \u26035 = new BufferedImage[1 + this.n];
                \u26035[0] = bml.a(bnh2.b());
                \u26036 = (bon)bnh2.a("texture");
                if (\u26036 != null) {
                    object = ((bon)\u26036).c();
                    if (!object.isEmpty()) {
                        int n3 = \u26035[0].getWidth();
                        n4 = \u26035[0].getHeight();
                        if (ns.b(n3) != n3 || ns.b(n4) != n4) {
                            throw new RuntimeException("Unable to load extra miplevels, source-texture is not power of two");
                        }
                    }
                    Iterator \u26037 = object.iterator();
                    while (\u26037.hasNext()) {
                        int n4 = (Integer)\u26037.next();
                        if (n4 <= 0 || n4 >= ((Object)\u26035).length - 1 || \u26035[n4] != null) continue;
                        jy \u26038 = this.a((jy)\u26033, n4);
                        try {
                            \u26035[n4] = bml.a(bni2.a(\u26038).b());
                        }
                        catch (IOException \u26039) {
                            h.error("Unable to load miplevel {} from: {}", new Object[]{n4, \u26038, \u26039});
                        }
                    }
                }
                object = (boa)bnh2.a("animation");
                bmi2.a((BufferedImage[])\u26035, (boa)object);
            }
            catch (RuntimeException runtimeException) {
                h.error("Unable to parse metadata from " + \u26034, (Throwable)runtimeException);
                continue;
            }
            catch (IOException iOException) {
                h.error("Using missing texture, unable to load " + \u26034, (Throwable)iOException);
                continue;
            }
            n = Math.min((int)n, (int)Math.min((int)bmi2.c(), (int)bmi2.d()));
            \u2603 = Math.min((int)Integer.lowestOneBit((int)bmi2.c()), (int)Integer.lowestOneBit((int)bmi2.d()));
            if (\u2603 < \u2603) {
                h.warn("Texture {} with size {}x{} limits mip level from {} to {}", new Object[]{\u26034, bmi2.c(), bmi2.d(), ns.c(\u2603), ns.c(\u2603)});
                \u2603 = \u2603;
            }
            \u26032.a(bmi2);
        }
        \u2603 = Math.min((int)n, (int)\u2603);
        \u2603 = ns.c(\u2603);
        if (\u2603 < this.n) {
            h.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", new Object[]{this.l, this.n, \u2603, \u2603});
            this.n = \u2603;
        }
        for (Object \u26033 : this.j.values()) {
            try {
                ((bmi)\u26033).d(this.n);
            }
            catch (Throwable throwable) {
                b b2 = b.a(throwable, "Applying mipmap");
                \u26035 = b2.a("Sprite being mipmapped");
                ((c)\u26035).a("Sprite name", new Callable<String>((bmi)\u26033){
                    final /* synthetic */ bmi a;
                    {
                        this.a = bmi2;
                    }

                    public String a() throws Exception {
                        return this.a.i();
                    }

                    public /* synthetic */ Object call() throws Exception {
                        return this.a();
                    }
                });
                ((c)\u26035).a("Sprite size", new Callable<String>((bmi)\u26033){
                    final /* synthetic */ bmi a;
                    {
                        this.a = bmi2;
                    }

                    public String a() throws Exception {
                        return this.a.c() + " x " + this.a.d();
                    }

                    public /* synthetic */ Object call() throws Exception {
                        return this.a();
                    }
                });
                ((c)\u26035).a("Sprite frames", new Callable<String>((bmi)\u26033){
                    final /* synthetic */ bmi a;
                    {
                        this.a = bmi2;
                    }

                    public String a() throws Exception {
                        return this.a.k() + " frames";
                    }

                    public /* synthetic */ Object call() throws Exception {
                        return this.a();
                    }
                });
                ((c)\u26035).a("Mipmap levels", this.n);
                throw new e(b2);
            }
        }
        this.o.d(this.n);
        \u26032.a(this.o);
        \u26032.c();
        h.info("Created: {}x{} {}-atlas", new Object[]{\u26032.a(), \u26032.b(), this.l});
        bml.a(this.b(), this.n, \u26032.a(), \u26032.b());
        bmi2 = Maps.newHashMap(this.j);
        for (Object \u26034 : \u26032.d()) {
            String string = ((bmi)\u26034).i();
            bmi2.remove(string);
            this.k.put((Object)string, \u26034);
            try {
                bml.a(((bmi)\u26034).a(0), ((bmi)\u26034).c(), ((bmi)\u26034).d(), ((bmi)\u26034).a(), ((bmi)\u26034).b(), false, false);
            }
            catch (Throwable \u260310) {
                \u26036 = b.a(\u260310, "Stitching texture atlas");
                object = ((b)\u26036).a("Texture being stitched together");
                ((c)object).a("Atlas path", this.l);
                ((c)object).a("Sprite", \u26034);
                throw new e((b)\u26036);
            }
            if (!((bmi)\u26034).m()) continue;
            this.i.add(\u26034);
        }
        for (Object \u26034 : bmi2.values()) {
            ((bmi)\u26034).a(this.o);
        }
    }

    private jy a(jy jy2, int n) {
        if (n == 0) {
            return new jy(jy2.b(), String.format((String)"%s/%s%s", (Object[])new Object[]{this.l, jy2.a(), ".png"}));
        }
        return new jy(jy2.b(), String.format((String)"%s/mipmaps/%s.%d%s", (Object[])new Object[]{this.l, jy2.a(), n, ".png"}));
    }

    public bmi a(String string) {
        bmi bmi2 = (bmi)this.k.get((Object)string);
        if (bmi2 == null) {
            bmi2 = this.o;
        }
        return bmi2;
    }

    public void d() {
        bml.b(this.b());
        for (bmi bmi2 : this.i) {
            bmi2.j();
        }
    }

    public bmi a(jy jy2) {
        if (jy2 == null) {
            throw new IllegalArgumentException("Location cannot be null!");
        }
        bmi bmi2 = (bmi)this.j.get((Object)jy2);
        if (bmi2 == null) {
            bmi2 = bmi.a(jy2);
            this.j.put((Object)jy2.toString(), (Object)bmi2);
        }
        return bmi2;
    }

    @Override
    public void e() {
        this.d();
    }

    public void a(int n) {
        this.n = n;
    }

    public bmi f() {
        return this.o;
    }
}
