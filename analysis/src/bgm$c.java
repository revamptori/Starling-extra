/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Type
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public static class bgm.c {
    private final jy a;
    private final bor b;
    private final boolean c;
    private final int d;

    public bgm.c(jy jy2, bor bor2, boolean bl, int n) {
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
        if (object instanceof bgm.c) {
            bgm.c c2 = (bgm.c)object;
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
    implements JsonDeserializer<bgm.c> {
        public bgm.c a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            String \u26032 = this.b(jsonObject);
            bor \u26033 = this.a(jsonObject);
            boolean \u26034 = this.d(jsonObject);
            int \u26035 = this.c(jsonObject);
            return new bgm.c(this.a(\u26032), \u26033, \u26034, \u26035);
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
