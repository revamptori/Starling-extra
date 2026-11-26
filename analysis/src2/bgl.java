/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  java.io.Reader
 *  java.io.StringReader
 *  java.lang.CharSequence
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bgl {
    private static final Logger f = LogManager.getLogger();
    static final Gson a = new GsonBuilder().registerTypeAdapter(bgl.class, (Object)new b()).registerTypeAdapter(bgh.class, (Object)new bgh.a()).registerTypeAdapter(bgi.class, (Object)new bgi.a()).registerTypeAdapter(bgk.class, (Object)new bgk.a()).registerTypeAdapter(bgq.class, (Object)new bgq.a()).registerTypeAdapter(bgr.class, (Object)new bgr.a()).create();
    private final List<bgh> g;
    private final boolean h;
    private final boolean i;
    private bgr j;
    public String b = "";
    protected final Map<String, String> c;
    protected bgl d;
    protected jy e;

    public static bgl a(Reader reader) {
        return (bgl)a.fromJson(reader, bgl.class);
    }

    public static bgl a(String string) {
        return bgl.a((Reader)new StringReader(string));
    }

    protected bgl(List<bgh> list, Map<String, String> map, boolean bl, boolean bl2, bgr bgr2) {
        this(null, list, map, bl, bl2, bgr2);
    }

    protected bgl(jy jy2, Map<String, String> map, boolean bl, boolean bl2, bgr bgr2) {
        this(jy2, (List<bgh>)Collections.emptyList(), map, bl, bl2, bgr2);
    }

    private bgl(jy jy2, List<bgh> list, Map<String, String> map, boolean bl, boolean bl2, bgr bgr2) {
        this.g = list;
        this.i = bl;
        this.h = bl2;
        this.c = map;
        this.e = jy2;
        this.j = bgr2;
    }

    public List<bgh> a() {
        if (this.h()) {
            return this.d.a();
        }
        return this.g;
    }

    private boolean h() {
        return this.d != null;
    }

    public boolean b() {
        if (this.h()) {
            return this.d.b();
        }
        return this.i;
    }

    public boolean c() {
        return this.h;
    }

    public boolean d() {
        return this.e == null || this.d != null && this.d.d();
    }

    public void a(Map<jy, bgl> map) {
        if (this.e != null) {
            this.d = (bgl)map.get((Object)this.e);
        }
    }

    public boolean b(String string) {
        return !"missingno".equals((Object)this.c(string));
    }

    public String c(String string) {
        if (!this.d(string)) {
            string = '#' + string;
        }
        return this.a(string, new a(this));
    }

    private String a(String string2, a a2) {
        String string2;
        if (this.d(string2)) {
            if (this == a2.b) {
                f.warn("Unable to resolve texture due to upward reference: " + string2 + " in " + this.b);
                return "missingno";
            }
            String string3 = (String)this.c.get((Object)string2.substring(1));
            if (string3 == null && this.h()) {
                string3 = this.d.a(string2, a2);
            }
            a2.b = this;
            if (string3 != null && this.d(string3)) {
                string3 = a2.a.a(string3, a2);
            }
            if (string3 == null || this.d(string3)) {
                return "missingno";
            }
            return string3;
        }
        return string2;
    }

    private boolean d(String string) {
        return string.charAt(0) == '#';
    }

    public jy e() {
        return this.e;
    }

    public bgl f() {
        return this.h() ? this.d.f() : this;
    }

    public bgr g() {
        bgq bgq2 = this.a(bgr.b.b);
        \u2603 = this.a(bgr.b.c);
        \u2603 = this.a(bgr.b.d);
        \u2603 = this.a(bgr.b.e);
        \u2603 = this.a(bgr.b.f);
        \u2603 = this.a(bgr.b.g);
        return new bgr(bgq2, \u2603, \u2603, \u2603, \u2603, \u2603);
    }

    private bgq a(bgr.b b2) {
        if (this.d != null && !this.j.c(b2)) {
            return this.d.a(b2);
        }
        return this.j.b(b2);
    }

    public static void b(Map<jy, bgl> map) {
        for (bgl bgl2 : map.values()) {
            try {
                \u2603 = bgl2.d;
                \u2603 = \u2603.d;
                while (\u2603 != \u2603) {
                    \u2603 = \u2603.d;
                    \u2603 = \u2603.d.d;
                }
                throw new c();
            }
            catch (NullPointerException nullPointerException) {
            }
        }
    }

    public static class c
    extends RuntimeException {
    }

    public static class b
    implements JsonDeserializer<bgl> {
        public bgl a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            List<bgh> \u26032 = this.a(jsonDeserializationContext, jsonObject);
            String \u26033 = this.c(jsonObject);
            boolean \u26034 = StringUtils.isEmpty((CharSequence)\u26033);
            boolean \u26035 = \u26032.isEmpty();
            if (\u26035 && \u26034) {
                throw new JsonParseException("BlockModel requires either elements or parent, found neither");
            }
            if (!\u26034 && !\u26035) {
                throw new JsonParseException("BlockModel requires either elements or parent, found both");
            }
            Map<String, String> \u26036 = this.b(jsonObject);
            boolean \u26037 = this.a(jsonObject);
            bgr \u26038 = bgr.a;
            if (jsonObject.has("display")) {
                \u2603 = ni.s(jsonObject, "display");
                \u26038 = (bgr)jsonDeserializationContext.deserialize((JsonElement)\u2603, bgr.class);
            }
            if (\u26035) {
                return new bgl(new jy(\u26033), \u26036, \u26037, true, \u26038);
            }
            return new bgl(\u26032, \u26036, \u26037, true, \u26038);
        }

        private Map<String, String> b(JsonObject jsonObject) {
            HashMap hashMap = Maps.newHashMap();
            if (jsonObject.has("textures")) {
                JsonObject jsonObject2 = jsonObject.getAsJsonObject("textures");
                for (Map.Entry entry : jsonObject2.entrySet()) {
                    hashMap.put(entry.getKey(), (Object)((JsonElement)entry.getValue()).getAsString());
                }
            }
            return hashMap;
        }

        private String c(JsonObject jsonObject) {
            return ni.a(jsonObject, "parent", "");
        }

        protected boolean a(JsonObject jsonObject) {
            return ni.a(jsonObject, "ambientocclusion", true);
        }

        protected List<bgh> a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
            ArrayList arrayList = Lists.newArrayList();
            if (jsonObject.has("elements")) {
                for (JsonElement jsonElement : ni.t(jsonObject, "elements")) {
                    arrayList.add((Object)((bgh)jsonDeserializationContext.deserialize(jsonElement, bgh.class)));
                }
            }
            return arrayList;
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }

    static final class a {
        public final bgl a;
        public bgl b;

        private a(bgl bgl2) {
            this.a = bgl2;
        }
    }
}
