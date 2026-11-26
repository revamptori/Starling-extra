/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Type
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public static class ez.a
implements JsonDeserializer<ez>,
JsonSerializer<ez> {
    public ez a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement.isJsonObject()) {
            Object \u26034;
            et.a \u26033;
            ez ez2 = new ez();
            JsonObject \u26032 = jsonElement.getAsJsonObject();
            if (\u26032 == null) {
                return null;
            }
            if (\u26032.has("bold")) {
                ez2.c = \u26032.get("bold").getAsBoolean();
            }
            if (\u26032.has("italic")) {
                ez2.d = \u26032.get("italic").getAsBoolean();
            }
            if (\u26032.has("underlined")) {
                ez2.e = \u26032.get("underlined").getAsBoolean();
            }
            if (\u26032.has("strikethrough")) {
                ez2.f = \u26032.get("strikethrough").getAsBoolean();
            }
            if (\u26032.has("obfuscated")) {
                ez2.g = \u26032.get("obfuscated").getAsBoolean();
            }
            if (\u26032.has("color")) {
                ez2.b = (a)((Object)jsonDeserializationContext.deserialize(\u26032.get("color"), a.class));
            }
            if (\u26032.has("insertion")) {
                ez2.j = \u26032.get("insertion").getAsString();
            }
            if (\u26032.has("clickEvent") && (\u2603 = \u26032.getAsJsonObject("clickEvent")) != null) {
                JsonPrimitive jsonPrimitive = \u2603.getAsJsonPrimitive("action");
                \u26033 = jsonPrimitive == null ? null : et.a.a(jsonPrimitive.getAsString());
                \u26034 = \u2603.getAsJsonPrimitive("value");
                String string = \u2603 = \u26034 == null ? null : \u26034.getAsString();
                if (\u26033 != null && \u2603 != null && \u26033.a()) {
                    ez2.h = new et(\u26033, \u2603);
                }
            }
            if (\u26032.has("hoverEvent") && (\u2603 = \u26032.getAsJsonObject("hoverEvent")) != null) {
                jsonPrimitive = \u2603.getAsJsonPrimitive("action");
                \u26033 = jsonPrimitive == null ? null : ew.a.a(jsonPrimitive.getAsString());
                \u26034 = (eu)jsonDeserializationContext.deserialize(\u2603.get("value"), eu.class);
                if (\u26033 != null && \u26034 != null && ((ew.a)((Object)\u26033)).a()) {
                    ez2.i = new ew((ew.a)((Object)\u26033), (eu)\u26034);
                }
            }
            return ez2;
        }
        return null;
    }

    public JsonElement a(ez ez2, Type type, JsonSerializationContext jsonSerializationContext) {
        if (ez2.g()) {
            return null;
        }
        JsonObject jsonObject = new JsonObject();
        if (ez2.c != null) {
            jsonObject.addProperty("bold", ez2.c);
        }
        if (ez2.d != null) {
            jsonObject.addProperty("italic", ez2.d);
        }
        if (ez2.e != null) {
            jsonObject.addProperty("underlined", ez2.e);
        }
        if (ez2.f != null) {
            jsonObject.addProperty("strikethrough", ez2.f);
        }
        if (ez2.g != null) {
            jsonObject.addProperty("obfuscated", ez2.g);
        }
        if (ez2.b != null) {
            jsonObject.add("color", jsonSerializationContext.serialize((Object)ez2.b));
        }
        if (ez2.j != null) {
            jsonObject.add("insertion", jsonSerializationContext.serialize((Object)ez2.j));
        }
        if (ez2.h != null) {
            \u2603 = new JsonObject();
            \u2603.addProperty("action", ez2.h.a().b());
            \u2603.addProperty("value", ez2.h.b());
            jsonObject.add("clickEvent", (JsonElement)\u2603);
        }
        if (ez2.i != null) {
            \u2603 = new JsonObject();
            \u2603.addProperty("action", ez2.i.a().b());
            \u2603.add("value", jsonSerializationContext.serialize((Object)ez2.i.b()));
            jsonObject.add("hoverEvent", (JsonElement)\u2603);
        }
        return jsonObject;
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((ez)object, type, jsonSerializationContext);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}
