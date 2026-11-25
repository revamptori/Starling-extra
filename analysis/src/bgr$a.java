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

static class bgr.a
implements JsonDeserializer<bgr> {
    bgr.a() {
    }

    public bgr a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        bgq \u26032 = this.a(jsonDeserializationContext, jsonObject, "thirdperson");
        bgq \u26033 = this.a(jsonDeserializationContext, jsonObject, "firstperson");
        bgq \u26034 = this.a(jsonDeserializationContext, jsonObject, "head");
        bgq \u26035 = this.a(jsonDeserializationContext, jsonObject, "gui");
        bgq \u26036 = this.a(jsonDeserializationContext, jsonObject, "ground");
        bgq \u26037 = this.a(jsonDeserializationContext, jsonObject, "fixed");
        return new bgr(\u26032, \u26033, \u26034, \u26035, \u26036, \u26037);
    }

    private bgq a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return (bgq)jsonDeserializationContext.deserialize(jsonObject.get(string), bgq.class);
        }
        return bgq.a;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}
