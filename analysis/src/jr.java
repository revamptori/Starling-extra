/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.TypeAdapterFactory
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Short
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import java.io.IOException;

public class jr
implements ff<jp> {
    private static final Gson a = new GsonBuilder().registerTypeAdapter(js.c.class, (Object)new js.c.a()).registerTypeAdapter(js.a.class, (Object)new js.a.a()).registerTypeAdapter(js.class, (Object)new js.b()).registerTypeHierarchyAdapter(eu.class, (Object)new eu.a()).registerTypeHierarchyAdapter(ez.class, (Object)new ez.a()).registerTypeAdapterFactory((TypeAdapterFactory)new nr()).create();
    private js b;

    public jr() {
    }

    public jr(js js2) {
        this.b = js2;
    }

    @Override
    public void a(em em2) throws IOException {
        this.b = (js)a.fromJson(em2.c(Short.MAX_VALUE), js.class);
    }

    @Override
    public void b(em em2) throws IOException {
        em2.a(a.toJson((Object)this.b));
    }

    @Override
    public void a(jp jp2) {
        jp2.a(this);
    }

    public js a() {
        return this.b;
    }
}
