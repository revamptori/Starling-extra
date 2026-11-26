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
 *  java.lang.reflect.Type
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

static class bgk.a
implements JsonDeserializer<bgk> {
    bgk.a() {
    }

    public bgk a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        float[] \u26032 = this.b(jsonObject);
        int \u26033 = this.a(jsonObject);
        return new bgk(\u26032, \u26033);
    }

    protected int a(JsonObject jsonObject) {
        int n = ni.a(jsonObject, "rotation", 0);
        if (n < 0 || n % 90 != 0 || n / 90 > 3) {
            throw new JsonParseException("Invalid rotation " + n + " found, only 0/90/180/270 allowed");
        }
        return n;
    }

    private float[] b(JsonObject jsonObject) {
        if (!jsonObject.has("uv")) {
            return null;
        }
        JsonArray jsonArray = ni.t(jsonObject, "uv");
        if (jsonArray.size() != 4) {
            throw new JsonParseException("Expected 4 uv values, found: " + jsonArray.size());
        }
        float[] \u26032 = new float[4];
        for (int i = 0; i < \u26032.length; ++i) {
            \u26032[i] = ni.d(jsonArray.get(i), "uv[" + i + "]");
        }
        return \u26032;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}
