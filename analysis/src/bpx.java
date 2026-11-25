/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  io.netty.util.internal.ThreadLocalRandom
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Error
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.MalformedURLException
 *  java.net.URL
 *  java.net.URLConnection
 *  java.net.URLStreamHandler
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Random
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 *  paulscode.sound.SoundSystem
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.SoundSystemException
 *  paulscode.sound.SoundSystemLogger
 *  paulscode.sound.Source
 *  paulscode.sound.codecs.CodecJOrbis
 *  paulscode.sound.libraries.LibraryLWJGLOpenAL
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import io.netty.util.internal.ThreadLocalRandom;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemException;
import paulscode.sound.SoundSystemLogger;
import paulscode.sound.Source;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

public class bpx {
    private static final Marker a = MarkerManager.getMarker((String)"SOUNDS");
    private static final Logger b = LogManager.getLogger();
    private final bpz c;
    private final avh d;
    private a e;
    private boolean f;
    private int g = 0;
    private final Map<String, bpj> h = HashBiMap.create();
    private final Map<bpj, String> i = ((BiMap)this.h).inverse();
    private Map<bpj, bpw> j = Maps.newHashMap();
    private final Multimap<bpg, String> k = HashMultimap.create();
    private final List<bpk> l = Lists.newArrayList();
    private final Map<bpj, Integer> m = Maps.newHashMap();
    private final Map<String, Integer> n = Maps.newHashMap();

    public bpx(bpz bpz2, avh avh2) {
        this.c = bpz2;
        this.d = avh2;
        try {
            SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
            SoundSystemConfig.setCodec((String)"ogg", CodecJOrbis.class);
        }
        catch (SoundSystemException soundSystemException) {
            b.error(a, "Error linking with the LibraryJavaSound plug-in", (Throwable)soundSystemException);
        }
    }

    public void a() {
        this.b();
        this.i();
    }

    private synchronized void i() {
        if (this.f) {
            return;
        }
        try {
            new Thread(new Runnable(){

                public void run() {
                    SoundSystemConfig.setLogger((SoundSystemLogger)new SoundSystemLogger(){

                        public void message(String string, int n) {
                            if (!string.isEmpty()) {
                                b.info(string);
                            }
                        }

                        public void importantMessage(String string, int n) {
                            if (!string.isEmpty()) {
                                b.warn(string);
                            }
                        }

                        public void errorMessage(String string, String string2, int n) {
                            if (!string2.isEmpty()) {
                                b.error("Error in class '" + string + "'");
                                b.error(string2);
                            }
                        }
                    });
                    bpx.this.e = new a();
                    bpx.this.f = true;
                    bpx.this.e.setMasterVolume(bpx.this.d.a(bpg.a));
                    b.info(a, "Sound engine started");
                }
            }, "Sound Library Loader").start();
        }
        catch (RuntimeException runtimeException) {
            b.error(a, "Error starting SoundSystem. Turning off sounds & music", (Throwable)runtimeException);
            this.d.a(bpg.a, 0.0f);
            this.d.b();
        }
    }

    private float a(bpg bpg2) {
        if (bpg2 == null || bpg2 == bpg.a) {
            return 1.0f;
        }
        return this.d.a(bpg2);
    }

    public void a(bpg bpg2, float f) {
        if (!this.f) {
            return;
        }
        if (bpg2 == bpg.a) {
            this.e.setMasterVolume(f);
            return;
        }
        for (String string : this.k.get((Object)bpg2)) {
            bpj bpj2 = (bpj)this.h.get((Object)string);
            float \u26032 = this.a(bpj2, (bpw)this.j.get((Object)bpj2), bpg2);
            if (\u26032 <= 0.0f) {
                this.b(bpj2);
                continue;
            }
            this.e.setVolume(string, \u26032);
        }
    }

    public void b() {
        if (this.f) {
            this.c();
            this.e.cleanup();
            this.f = false;
        }
    }

    public void c() {
        if (this.f) {
            for (String string : this.h.keySet()) {
                this.e.stop(string);
            }
            this.h.clear();
            this.m.clear();
            this.l.clear();
            this.k.clear();
            this.j.clear();
            this.n.clear();
        }
    }

    public void d() {
        bpj \u26033;
        String \u26032;
        ++this.g;
        for (bpk bpk2 : this.l) {
            bpk2.c();
            if (bpk2.k()) {
                this.b(bpk2);
                continue;
            }
            \u26032 = (String)this.i.get((Object)bpk2);
            this.e.setVolume(\u26032, this.a(bpk2, (bpw)this.j.get((Object)bpk2), this.c.a(bpk2.a()).d()));
            this.e.setPitch(\u26032, this.a((bpj)bpk2, (bpw)this.j.get((Object)bpk2)));
            this.e.setPosition(\u26032, bpk2.g(), bpk2.h(), bpk2.i());
        }
        Iterator iterator = this.h.entrySet().iterator();
        while (iterator.hasNext()) {
            bpk bpk2;
            bpk2 = (Map.Entry)iterator.next();
            \u26032 = (String)bpk2.getKey();
            \u26033 = (bpj)bpk2.getValue();
            if (this.e.playing(\u26032) || (\u2603 = ((Integer)this.n.get((Object)\u26032)).intValue()) > this.g) continue;
            int \u26034 = \u26033.d();
            if (\u26033.b() && \u26034 > 0) {
                this.m.put((Object)\u26033, (Object)(this.g + \u26034));
            }
            iterator.remove();
            b.debug(a, "Removed channel {} because it's not playing anymore", new Object[]{\u26032});
            this.e.removeSource(\u26032);
            this.n.remove((Object)\u26032);
            this.j.remove((Object)\u26033);
            try {
                this.k.remove((Object)this.c.a(\u26033.a()).d(), (Object)\u26032);
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
            if (!(\u26033 instanceof bpk)) continue;
            this.l.remove((Object)\u26033);
        }
        bpk2 = this.m.entrySet().iterator();
        while (bpk2.hasNext()) {
            \u26032 = (Map.Entry)bpk2.next();
            if (this.g < (Integer)\u26032.getValue()) continue;
            \u26033 = (bpj)\u26032.getKey();
            if (\u26033 instanceof bpk) {
                ((bpk)\u26033).c();
            }
            this.c(\u26033);
            bpk2.remove();
        }
    }

    public boolean a(bpj bpj2) {
        if (!this.f) {
            return false;
        }
        String string = (String)this.i.get((Object)bpj2);
        if (string == null) {
            return false;
        }
        return this.e.playing(string) || this.n.containsKey((Object)string) && (Integer)this.n.get((Object)string) <= this.g;
    }

    public void b(bpj bpj2) {
        if (!this.f) {
            return;
        }
        String string = (String)this.i.get((Object)bpj2);
        if (string != null) {
            this.e.stop(string);
        }
    }

    public void c(bpj bpj2) {
        if (!this.f) {
            return;
        }
        if (this.e.getMasterVolume() <= 0.0f) {
            b.debug(a, "Skipped playing soundEvent: {}, master volume was zero", new Object[]{bpj2.a()});
            return;
        }
        bpy bpy2 = this.c.a(bpj2.a());
        if (bpy2 == null) {
            b.warn(a, "Unable to play unknown soundEvent: {}", new Object[]{bpj2.a()});
            return;
        }
        bpw \u26032 = bpy2.b();
        if (\u26032 == bpz.a) {
            b.warn(a, "Unable to play empty soundEvent: {}", new Object[]{bpy2.c()});
            return;
        }
        float \u26033 = bpj2.e();
        float \u26034 = 16.0f;
        if (\u26033 > 1.0f) {
            \u26034 *= \u26033;
        }
        bpg \u26035 = bpy2.d();
        float \u26036 = this.a(bpj2, \u26032, \u26035);
        double \u26037 = this.a(bpj2, \u26032);
        jy \u26038 = \u26032.a();
        if (\u26036 == 0.0f) {
            b.debug(a, "Skipped playing sound {}, volume was zero.", new Object[]{\u26038});
            return;
        }
        boolean \u26039 = bpj2.b() && bpj2.d() == 0;
        String \u260310 = ns.a((Random)ThreadLocalRandom.current()).toString();
        if (\u26032.d()) {
            this.e.newStreamingSource(false, \u260310, bpx.a(\u26038), \u26038.toString(), \u26039, bpj2.g(), bpj2.h(), bpj2.i(), bpj2.j().a(), \u26034);
        } else {
            this.e.newSource(false, \u260310, bpx.a(\u26038), \u26038.toString(), \u26039, bpj2.g(), bpj2.h(), bpj2.i(), bpj2.j().a(), \u26034);
        }
        b.debug(a, "Playing sound {} for event {} as channel {}", new Object[]{\u26032.a(), bpy2.c(), \u260310});
        this.e.setPitch(\u260310, (float)\u26037);
        this.e.setVolume(\u260310, \u26036);
        this.e.play(\u260310);
        this.n.put((Object)\u260310, (Object)(this.g + 20));
        this.h.put((Object)\u260310, (Object)bpj2);
        this.j.put((Object)bpj2, (Object)\u26032);
        if (\u26035 != bpg.a) {
            this.k.put((Object)\u26035, (Object)\u260310);
        }
        if (bpj2 instanceof bpk) {
            this.l.add((Object)((bpk)bpj2));
        }
    }

    private float a(bpj bpj2, bpw bpw2) {
        return (float)ns.a((double)bpj2.f() * bpw2.b(), 0.5, 2.0);
    }

    private float a(bpj bpj2, bpw bpw2, bpg bpg2) {
        return (float)ns.a((double)bpj2.e() * bpw2.c(), 0.0, 1.0) * this.a(bpg2);
    }

    public void e() {
        for (String string : this.h.keySet()) {
            b.debug(a, "Pausing channel {}", new Object[]{string});
            this.e.pause(string);
        }
    }

    public void f() {
        for (String string : this.h.keySet()) {
            b.debug(a, "Resuming channel {}", new Object[]{string});
            this.e.play(string);
        }
    }

    public void a(bpj bpj2, int n) {
        this.m.put((Object)bpj2, (Object)(this.g + n));
    }

    private static URL a(final jy jy2) {
        String string = String.format((String)"%s:%s:%s", (Object[])new Object[]{"mcsounddomain", jy2.b(), jy2.a()});
        URLStreamHandler \u26032 = new URLStreamHandler(){

            protected URLConnection openConnection(URL uRL) {
                return new URLConnection(uRL){

                    public void connect() throws IOException {
                    }

                    public InputStream getInputStream() throws IOException {
                        return ave.A().Q().a(jy2).b();
                    }
                };
            }
        };
        try {
            return new URL(null, string, \u26032);
        }
        catch (MalformedURLException \u26033) {
            throw new Error("TODO: Sanely handle url exception! :D");
        }
    }

    public void a(wn wn2, float f) {
        if (!this.f || wn2 == null) {
            return;
        }
        \u2603 = wn2.B + (wn2.z - wn2.B) * f;
        \u2603 = wn2.A + (wn2.y - wn2.A) * f;
        double d2 = wn2.p + (wn2.s - wn2.p) * (double)f;
        \u2603 = wn2.q + (wn2.t - wn2.q) * (double)f + (double)wn2.aS();
        \u2603 = wn2.r + (wn2.u - wn2.r) * (double)f;
        float \u26032 = ns.b((\u2603 + 90.0f) * ((float)Math.PI / 180));
        float \u26033 = ns.a((\u2603 + 90.0f) * ((float)Math.PI / 180));
        float \u26034 = ns.b(-\u2603 * ((float)Math.PI / 180));
        float \u26035 = ns.a(-\u2603 * ((float)Math.PI / 180));
        float \u26036 = ns.b((-\u2603 + 90.0f) * ((float)Math.PI / 180));
        float \u26037 = ns.a((-\u2603 + 90.0f) * ((float)Math.PI / 180));
        float \u26038 = \u26032 * \u26034;
        float \u26039 = \u26035;
        float \u260310 = \u26033 * \u26034;
        float \u260311 = \u26032 * \u26036;
        float \u260312 = \u26037;
        float \u260313 = \u26033 * \u26036;
        this.e.setListenerPosition((float)d2, (float)\u2603, (float)\u2603);
        this.e.setListenerOrientation(\u26038, \u26039, \u260310, \u260311, \u260312, \u260313);
    }

    class a
    extends SoundSystem {
        private a() {
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public boolean playing(String string) {
            Object object = SoundSystemConfig.THREAD_SYNC;
            synchronized (object) {
                if (this.soundLibrary == null) {
                    return false;
                }
                Source source = (Source)this.soundLibrary.getSources().get((Object)string);
                if (source == null) {
                    return false;
                }
                return source.playing() || source.paused() || source.preLoad;
            }
        }
    }
}
