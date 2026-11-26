/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.ParameterizedType
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Random
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bpz
implements bnj,
km {
    private static final Logger b = LogManager.getLogger();
    private static final Gson c = new GsonBuilder().registerTypeAdapter(bph.class, (Object)new bpi()).create();
    private static final ParameterizedType d = new ParameterizedType(){

        public Type[] getActualTypeArguments() {
            return new Type[]{String.class, bph.class};
        }

        public Type getRawType() {
            return Map.class;
        }

        public Type getOwnerType() {
            return null;
        }
    };
    public static final bpw a = new bpw(new jy("meta:missing_sound"), 0.0, 0.0, false);
    private final bqa e = new bqa();
    private final bpx f;
    private final bni g;

    public bpz(bni bni2, avh avh2) {
        this.g = bni2;
        this.f = new bpx(this, avh2);
    }

    @Override
    public void a(bni bni2) {
        this.f.a();
        this.e.a();
        for (String string : bni2.a()) {
            try {
                List<bnh> list = bni2.b(new jy(string, "sounds.json"));
                for (bnh bnh2 : list) {
                    try {
                        Map<String, bph> map = this.a(bnh2.b());
                        for (Map.Entry entry : map.entrySet()) {
                            this.a(new jy(string, (String)entry.getKey()), (bph)entry.getValue());
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        b.warn("Invalid sounds.json", (Throwable)runtimeException);
                    }
                }
            }
            catch (IOException iOException) {
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected Map<String, bph> a(InputStream inputStream) {
        try {
            Map map = (Map)c.fromJson((Reader)new InputStreamReader(inputStream), (Type)d);
            return map;
        }
        finally {
            IOUtils.closeQuietly((InputStream)inputStream);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    private void a(jy jy22, bph bph2) {
        bpy \u26032;
        boolean bl = bl = !this.e.d(jy22);
        if (bl || bph2.b()) {
            if (!bl) {
                b.debug("Replaced sound event location {}", new Object[]{jy22});
            }
            \u26032 = new bpy(jy22, 1.0, 1.0, bph2.c());
            this.e.a(\u26032);
        } else {
            jy jy22;
            \u26032 = (bpy)this.e.a(jy22);
        }
        block10: for (final bph.a \u26033 : bph2.a()) {
            bqb<bpw> \u26038;
            String string = \u26033.a();
            jy \u26034 = new jy(string);
            string2 = string.contains((CharSequence)":") ? \u26034.b() : jy22.b();
            switch (\u26033.e()) {
                case a: {
                    jy jy3 = new jy(string2, "sounds/" + \u26034.a() + ".ogg");
                    InputStream \u26035 = null;
                    try {
                        \u26035 = this.g.a(jy3).b();
                    }
                    catch (FileNotFoundException \u26036) {
                        b.warn("File {} does not exist, cannot add it to event {}", new Object[]{jy3, jy22});
                        IOUtils.closeQuietly((InputStream)\u26035);
                        continue block10;
                    }
                    catch (IOException \u26037) {
                        b.warn("Could not load sound file " + jy3 + ", cannot add it to event " + jy22, (Throwable)\u26037);
                        {
                            catch (Throwable throwable) {
                                IOUtils.closeQuietly(\u26035);
                                throw throwable;
                            }
                        }
                        IOUtils.closeQuietly((InputStream)\u26035);
                        continue block10;
                    }
                    IOUtils.closeQuietly((InputStream)\u26035);
                    \u26038 = new bqc(new bpw(jy3, \u26033.c(), \u26033.b(), \u26033.f()), \u26033.d());
                    break;
                }
                case b: {
                    \u26038 = new bqb<bpw>(){
                        final jy a;
                        {
                            this.a = new jy(string2, \u26033.a());
                        }

                        @Override
                        public int a() {
                            bpy bpy2 = (bpy)bpz.this.e.a(this.a);
                            return bpy2 == null ? 0 : bpy2.a();
                        }

                        public bpw b() {
                            bpy bpy2 = (bpy)bpz.this.e.a(this.a);
                            return bpy2 == null ? a : bpy2.b();
                        }

                        @Override
                        public /* synthetic */ Object g() {
                            return this.b();
                        }
                    };
                    break;
                }
                default: {
                    throw new IllegalStateException("IN YOU FACE");
                }
            }
            \u26032.a(\u26038);
        }
    }

    public bpy a(jy jy2) {
        return (bpy)this.e.a(jy2);
    }

    public void a(bpj bpj2) {
        this.f.c(bpj2);
    }

    public void a(bpj bpj2, int n) {
        this.f.a(bpj2, n);
    }

    public void a(wn wn2, float f) {
        this.f.a(wn2, f);
    }

    public void a() {
        this.f.e();
    }

    public void b() {
        this.f.c();
    }

    public void d() {
        this.f.b();
    }

    @Override
    public void c() {
        this.f.d();
    }

    public void e() {
        this.f.f();
    }

    public void a(bpg bpg2, float f) {
        if (bpg2 == bpg.a && f <= 0.0f) {
            this.b();
        }
        this.f.a(bpg2, f);
    }

    public void b(bpj bpj2) {
        this.f.b(bpj2);
    }

    public bpy a(bpg ... bpgArray) {
        ArrayList arrayList = Lists.newArrayList();
        for (jy jy2 : this.e.c()) {
            bpy bpy2 = (bpy)this.e.a(jy2);
            if (!ArrayUtils.contains((Object[])bpgArray, (Object)((Object)bpy2.d()))) continue;
            arrayList.add((Object)bpy2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (bpy)arrayList.get(new Random().nextInt(arrayList.size()));
    }

    public boolean c(bpj bpj2) {
        return this.f.a(bpj2);
    }
}
