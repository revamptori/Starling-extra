/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  java.io.BufferedWriter
 *  java.io.File
 *  java.io.IOException
 *  java.io.Writer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.ParameterizedType
 *  java.lang.reflect.Type
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Map
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class mb<K, V extends ma<K>> {
    protected static final Logger a = LogManager.getLogger();
    protected final Gson b;
    private final File c;
    private final Map<String, V> d = Maps.newHashMap();
    private boolean e = true;
    private static final ParameterizedType f = new ParameterizedType(){

        public Type[] getActualTypeArguments() {
            return new Type[]{ma.class};
        }

        public Type getRawType() {
            return List.class;
        }

        public Type getOwnerType() {
            return null;
        }
    };

    public mb(File file) {
        this.c = file;
        GsonBuilder gsonBuilder = new GsonBuilder().setPrettyPrinting();
        gsonBuilder.registerTypeHierarchyAdapter(ma.class, (Object)new a());
        this.b = gsonBuilder.create();
    }

    public boolean b() {
        return this.e;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    public void a(V v) {
        this.d.put((Object)this.a((K)((ma)v).f()), v);
        try {
            this.f();
        }
        catch (IOException iOException) {
            a.warn("Could not save the list after adding a user.", (Throwable)iOException);
        }
    }

    public V b(K k) {
        this.h();
        return (V)((ma)this.d.get((Object)this.a(k)));
    }

    public void c(K k) {
        this.d.remove((Object)this.a(k));
        try {
            this.f();
        }
        catch (IOException iOException) {
            a.warn("Could not save the list after removing a user.", (Throwable)iOException);
        }
    }

    public String[] a() {
        return (String[])this.d.keySet().toArray((Object[])new String[this.d.size()]);
    }

    protected String a(K k) {
        return k.toString();
    }

    protected boolean d(K k) {
        return this.d.containsKey((Object)this.a(k));
    }

    private void h() {
        ArrayList arrayList = Lists.newArrayList();
        for (Object \u26032 : this.d.values()) {
            if (!((ma)\u26032).e()) continue;
            arrayList.add(((ma)\u26032).f());
        }
        for (Object \u26032 : arrayList) {
            this.d.remove(\u26032);
        }
    }

    protected ma<K> a(JsonObject jsonObject) {
        return new ma<Object>(null, jsonObject);
    }

    protected Map<String, V> e() {
        return this.d;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f() throws IOException {
        Collection collection = this.d.values();
        String \u26032 = this.b.toJson((Object)collection);
        BufferedWriter \u26033 = null;
        try {
            \u26033 = Files.newWriter((File)this.c, (Charset)Charsets.UTF_8);
            \u26033.write(\u26032);
        }
        catch (Throwable throwable) {
            IOUtils.closeQuietly(\u26033);
            throw throwable;
        }
        IOUtils.closeQuietly((Writer)\u26033);
    }

    class a
    implements JsonDeserializer<ma<K>>,
    JsonSerializer<ma<K>> {
        private a() {
        }

        public JsonElement a(ma<K> ma2, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonObject jsonObject = new JsonObject();
            ma2.a(jsonObject);
            return jsonObject;
        }

        public ma<K> a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            if (jsonElement.isJsonObject()) {
                JsonObject jsonObject = jsonElement.getAsJsonObject();
                ma \u26032 = mb.this.a(jsonObject);
                return \u26032;
            }
            return null;
        }

        public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
            return this.a((ma)object, type, jsonSerializationContext);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}
