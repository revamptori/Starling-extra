/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Type
 *  org.lwjgl.util.vector.ReadableVector3f
 *  org.lwjgl.util.vector.Vector3f
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.lwjgl.util.vector.ReadableVector3f;
import org.lwjgl.util.vector.Vector3f;

public class bgq {
    public static final bgq a = new bgq(new Vector3f(), new Vector3f(), new Vector3f(1.0f, 1.0f, 1.0f));
    public final Vector3f b;
    public final Vector3f c;
    public final Vector3f d;

    public bgq(Vector3f vector3f, Vector3f vector3f2, Vector3f vector3f3) {
        this.b = new Vector3f((ReadableVector3f)vector3f);
        this.c = new Vector3f((ReadableVector3f)vector3f2);
        this.d = new Vector3f((ReadableVector3f)vector3f3);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        bgq bgq2 = (bgq)object;
        if (!this.b.equals((Object)bgq2.b)) {
            return false;
        }
        if (!this.d.equals((Object)bgq2.d)) {
            return false;
        }
        return this.c.equals((Object)bgq2.c);
    }

    public int hashCode() {
        int n = this.b.hashCode();
        n = 31 * n + this.c.hashCode();
        n = 31 * n + this.d.hashCode();
        return n;
    }

    static class a
    implements JsonDeserializer<bgq> {
        private static final Vector3f a = new Vector3f(0.0f, 0.0f, 0.0f);
        private static final Vector3f b = new Vector3f(0.0f, 0.0f, 0.0f);
        private static final Vector3f c = new Vector3f(1.0f, 1.0f, 1.0f);

        a() {
        }

        public bgq a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            Vector3f \u26032 = this.a(jsonObject, "rotation", a);
            Vector3f \u26033 = this.a(jsonObject, "translation", b);
            \u26033.scale(0.0625f);
            \u26033.x = ns.a(\u26033.x, -1.5f, 1.5f);
            \u26033.y = ns.a(\u26033.y, -1.5f, 1.5f);
            \u26033.z = ns.a(\u26033.z, -1.5f, 1.5f);
            Vector3f \u26034 = this.a(jsonObject, "scale", c);
            \u26034.x = ns.a(\u26034.x, -4.0f, 4.0f);
            \u26034.y = ns.a(\u26034.y, -4.0f, 4.0f);
            \u26034.z = ns.a(\u26034.z, -4.0f, 4.0f);
            return new bgq(\u26032, \u26033, \u26034);
        }

        private Vector3f a(JsonObject jsonObject, String string, Vector3f vector3f) {
            if (!jsonObject.has(string)) {
                return vector3f;
            }
            JsonArray jsonArray = ni.t(jsonObject, string);
            if (jsonArray.size() != 3) {
                throw new JsonParseException("Expected 3 " + string + " values, found: " + jsonArray.size());
            }
            float[] \u26032 = new float[3];
            for (int i = 0; i < \u26032.length; ++i) {
                \u26032[i] = ni.d(jsonArray.get(i), string + "[" + i + "]");
            }
            return new Vector3f(\u26032[0], \u26032[1], \u26032[2]);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}
