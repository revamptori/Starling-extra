/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  java.lang.Object
 *  java.lang.reflect.Type
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public static class js.b
implements JsonDeserializer<js>,
JsonSerializer<js> {
    public js a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = ni.l(jsonElement, "status");
        js \u26032 = new js();
        if (jsonObject.has("description")) {
            \u26032.a((eu)jsonDeserializationContext.deserialize(jsonObject.get("description"), eu.class));
        }
        if (jsonObject.has("players")) {
            \u26032.a((js.a)jsonDeserializationContext.deserialize(jsonObject.get("players"), js.a.class));
        }
        if (jsonObject.has("version")) {
            \u26032.a((js.c)jsonDeserializationContext.deserialize(jsonObject.get("version"), js.c.class));
        }
        if (jsonObject.has("favicon")) {
            \u26032.a(ni.h(jsonObject, "favicon"));
        }
        return \u26032;
    }

    public JsonElement a(js js2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        if (js2.a() != null) {
            jsonObject.add("description", jsonSerializationContext.serialize((Object)js2.a()));
        }
        if (js2.b() != null) {
            jsonObject.add("players", jsonSerializationContext.serialize((Object)js2.b()));
        }
        if (js2.c() != null) {
            jsonObject.add("version", jsonSerializationContext.serialize((Object)js2.c()));
        }
        if (js2.d() != null) {
            jsonObject.addProperty("favicon", js2.d());
        }
        return jsonObject;
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((js)object, type, jsonSerializationContext);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}
