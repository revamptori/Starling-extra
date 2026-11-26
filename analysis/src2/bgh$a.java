/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Type
 *  java.util.EnumMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  org.lwjgl.util.vector.Vector3f
 */
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Map;
import org.lwjgl.util.vector.Vector3f;

static class bgh.a
implements JsonDeserializer<bgh> {
    bgh.a() {
    }

    public bgh a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        Vector3f \u26032 = this.e(jsonObject);
        Vector3f \u26033 = this.d(jsonObject);
        bgj \u26034 = this.a(jsonObject);
        Map<cq, bgi> \u26035 = this.a(jsonDeserializationContext, jsonObject);
        if (jsonObject.has("shade") && !ni.c(jsonObject, "shade")) {
            throw new JsonParseException("Expected shade to be a Boolean");
        }
        boolean \u26036 = ni.a(jsonObject, "shade", true);
        return new bgh(\u26032, \u26033, \u26035, \u26034, \u26036);
    }

    private bgj a(JsonObject jsonObject) {
        bgj \u26036 = null;
        if (jsonObject.has("rotation")) {
            JsonObject jsonObject2 = ni.s(jsonObject, "rotation");
            Vector3f \u26032 = this.a(jsonObject2, "origin");
            \u26032.scale(0.0625f);
            cq.a \u26033 = this.c(jsonObject2);
            float \u26034 = this.b(jsonObject2);
            boolean \u26035 = ni.a(jsonObject2, "rescale", false);
            \u26036 = new bgj(\u26032, \u26033, \u26034, \u26035);
        }
        return \u26036;
    }

    private float b(JsonObject jsonObject) {
        float f = ni.k(jsonObject, "angle");
        if (f != 0.0f && ns.e(f) != 22.5f && ns.e(f) != 45.0f) {
            throw new JsonParseException("Invalid rotation " + f + " found, only -45/-22.5/0/22.5/45 allowed");
        }
        return f;
    }

    private cq.a c(JsonObject jsonObject) {
        String string = ni.h(jsonObject, "axis");
        cq.a \u26032 = cq.a.a(string.toLowerCase());
        if (\u26032 == null) {
            throw new JsonParseException("Invalid rotation axis: " + string);
        }
        return \u26032;
    }

    private Map<cq, bgi> a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        Map<cq, bgi> map = this.b(jsonDeserializationContext, jsonObject);
        if (map.isEmpty()) {
            throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
        }
        return map;
    }

    private Map<cq, bgi> b(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        EnumMap enumMap = Maps.newEnumMap(cq.class);
        JsonObject \u26032 = ni.s(jsonObject, "faces");
        for (Map.Entry entry : \u26032.entrySet()) {
            cq cq2 = this.a((String)entry.getKey());
            enumMap.put((Object)cq2, (Object)((bgi)jsonDeserializationContext.deserialize((JsonElement)entry.getValue(), bgi.class)));
        }
        return enumMap;
    }

    private cq a(String string) {
        cq cq2 = cq.a(string);
        if (cq2 == null) {
            throw new JsonParseException("Unknown facing: " + string);
        }
        return cq2;
    }

    private Vector3f d(JsonObject jsonObject) {
        Vector3f vector3f = this.a(jsonObject, "to");
        if (vector3f.x < -16.0f || vector3f.y < -16.0f || vector3f.z < -16.0f || vector3f.x > 32.0f || vector3f.y > 32.0f || vector3f.z > 32.0f) {
            throw new JsonParseException("'to' specifier exceeds the allowed boundaries: " + vector3f);
        }
        return vector3f;
    }

    private Vector3f e(JsonObject jsonObject) {
        Vector3f vector3f = this.a(jsonObject, "from");
        if (vector3f.x < -16.0f || vector3f.y < -16.0f || vector3f.z < -16.0f || vector3f.x > 32.0f || vector3f.y > 32.0f || vector3f.z > 32.0f) {
            throw new JsonParseException("'from' specifier exceeds the allowed boundaries: " + vector3f);
        }
        return vector3f;
    }

    private Vector3f a(JsonObject jsonObject, String string) {
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
