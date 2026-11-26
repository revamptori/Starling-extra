/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.TypeAdapterFactory
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;

public class bny {
    private final db<String, a<? extends bnw>> a = new dd<String, a<? extends bnw>>();
    private final GsonBuilder b = new GsonBuilder();
    private Gson c;

    public bny() {
        this.b.registerTypeHierarchyAdapter(eu.class, (Object)new eu.a());
        this.b.registerTypeHierarchyAdapter(ez.class, (Object)new ez.a());
        this.b.registerTypeAdapterFactory((TypeAdapterFactory)new nr());
    }

    public <T extends bnw> void a(bnx<T> bnx2, Class<T> clazz) {
        this.a.a(bnx2.a(), new a(bnx2, clazz));
        this.b.registerTypeAdapter(clazz, bnx2);
        this.c = null;
    }

    public <T extends bnw> T a(String string, JsonObject jsonObject) {
        if (string == null) {
            throw new IllegalArgumentException("Metadata section name cannot be null");
        }
        if (!jsonObject.has(string)) {
            return null;
        }
        if (!jsonObject.get(string).isJsonObject()) {
            throw new IllegalArgumentException("Invalid metadata for '" + string + "' - expected object, found " + jsonObject.get(string));
        }
        a<? extends bnw> a2 = this.a.a(string);
        if (a2 == null) {
            throw new IllegalArgumentException("Don't know how to handle metadata section '" + string + "'");
        }
        return (T)((bnw)this.a().fromJson((JsonElement)jsonObject.getAsJsonObject(string), a2.b));
    }

    private Gson a() {
        if (this.c == null) {
            this.c = this.b.create();
        }
        return this.c;
    }

    class a<T extends bnw> {
        final bnx<T> a;
        final Class<T> b;

        private a(bnx<T> bnx2, Class<T> clazz) {
            this.a = bnx2;
            this.b = clazz;
        }
    }
}
