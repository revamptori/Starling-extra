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
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
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
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class bgm {
    static final Gson a = new GsonBuilder().registerTypeAdapter(bgm.class, (Object)new a()).registerTypeAdapter(c.class, (Object)new c.a()).create();
    private final Map<String, d> b = Maps.newHashMap();

    public static bgm a(Reader reader) {
        return (bgm)a.fromJson(reader, bgm.class);
    }

    public bgm(Collection<d> collection) {
        for (d d2 : collection) {
            this.b.put((Object)d2.a, (Object)d2);
        }
    }

    public bgm(List<bgm> list) {
        for (bgm bgm2 : list) {
            this.b.putAll(bgm2.b);
        }
    }

    public d b(String string) {
        d d2 = (d)this.b.get((Object)string);
        if (d2 == null) {
            throw new b();
        }
        return d2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof bgm) {
            bgm bgm2 = (bgm)object;
            return this.b.equals(bgm2.b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public class b
    extends RuntimeException {
        protected b() {
        }
    }

    public static class a
    implements JsonDeserializer<bgm> {
        public bgm a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            List<d> \u26032 = this.a(jsonDeserializationContext, jsonObject);
            return new bgm((Collection<d>)\u26032);
        }

        protected List<d> a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
            \u2603 = ni.s(jsonObject, "variants");
            ArrayList arrayList = Lists.newArrayList();
            for (Map.Entry entry : \u2603.entrySet()) {
                arrayList.add((Object)this.a(jsonDeserializationContext, (Map.Entry<String, JsonElement>)entry));
            }
            return arrayList;
        }

        protected d a(JsonDeserializationContext jsonDeserializationContext2, Map.Entry<String, JsonElement> entry) {
            String string = (String)entry.getKey();
            ArrayList \u26032 = Lists.newArrayList();
            JsonElement \u26033 = (JsonElement)entry.getValue();
            if (\u26033.isJsonArray()) {
                for (JsonElement jsonElement : \u26033.getAsJsonArray()) {
                    \u26032.add((Object)((c)jsonDeserializationContext2.deserialize(jsonElement, c.class)));
                }
            } else {
                JsonDeserializationContext jsonDeserializationContext2;
                \u26032.add((Object)((c)jsonDeserializationContext2.deserialize(\u26033, c.class)));
            }
            return new d(string, (List<c>)\u26032);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }

    public static class c {
        private final jy a;
        private final bor b;
        private final boolean c;
        private final int d;

        public c(jy jy2, bor bor2, boolean bl, int n) {
            this.a = jy2;
            this.b = bor2;
            this.c = bl;
            this.d = n;
        }

        public jy a() {
            return this.a;
        }

        public bor b() {
            return this.b;
        }

        public boolean c() {
            return this.c;
        }

        public int d() {
            return this.d;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object instanceof c) {
                c c2 = (c)object;
                return this.a.equals(c2.a) && this.b == c2.b && this.c == c2.c;
            }
            return false;
        }

        public int hashCode() {
            int n = this.a.hashCode();
            n = 31 * n + (this.b != null ? this.b.hashCode() : 0);
            n = 31 * n + (this.c ? 1 : 0);
            return n;
        }

        public static class a
        implements JsonDeserializer<c> {
            public c a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                JsonObject jsonObject = jsonElement.getAsJsonObject();
                String \u26032 = this.b(jsonObject);
                bor \u26033 = this.a(jsonObject);
                boolean \u26034 = this.d(jsonObject);
                int \u26035 = this.c(jsonObject);
                return new c(this.a(\u26032), \u26033, \u26034, \u26035);
            }

            private jy a(String string) {
                jy jy2 = new jy(string);
                jy2 = new jy(jy2.b(), "block/" + jy2.a());
                return jy2;
            }

            private boolean d(JsonObject jsonObject) {
                return ni.a(jsonObject, "uvlock", false);
            }

            protected bor a(JsonObject jsonObject) {
                int n = ni.a(jsonObject, "x", 0);
                bor \u26032 = bor.a(n, \u2603 = ni.a(jsonObject, "y", 0));
                if (\u26032 == null) {
                    throw new JsonParseException("Invalid BlockModelRotation x: " + n + ", y: " + \u2603);
                }
                return \u26032;
            }

            protected String b(JsonObject jsonObject) {
                return ni.h(jsonObject, "model");
            }

            protected int c(JsonObject jsonObject) {
                return ni.a(jsonObject, "weight", 1);
            }

            public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                return this.a(jsonElement, type, jsonDeserializationContext);
            }
        }
    }

    public static class d {
        private final String a;
        private final List<c> b;

        public d(String string, List<c> list) {
            this.a = string;
            this.b = list;
        }

        public List<c> b() {
            return this.b;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof d)) {
                return false;
            }
            d d2 = (d)object;
            if (!this.a.equals((Object)d2.a)) {
                return false;
            }
            return this.b.equals(d2.b);
        }

        public int hashCode() {
            int n = this.a.hashCode();
            n = 31 * n + this.b.hashCode();
            return n;
        }
    }
}
