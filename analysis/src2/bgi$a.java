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

static class bgi.a
implements JsonDeserializer<bgi> {
    bgi.a() {
    }

    public bgi a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        cq \u26032 = this.c(jsonObject);
        int \u26033 = this.a(jsonObject);
        String \u26034 = this.b(jsonObject);
        bgk \u26035 = (bgk)jsonDeserializationContext.deserialize((JsonElement)jsonObject, bgk.class);
        return new bgi(\u26032, \u26033, \u26034, \u26035);
    }

    protected int a(JsonObject jsonObject) {
        return ni.a(jsonObject, "tintindex", -1);
    }

    private String b(JsonObject jsonObject) {
        return ni.h(jsonObject, "texture");
    }

    private cq c(JsonObject jsonObject) {
        String string = ni.a(jsonObject, "cullface", "");
        return cq.a(string);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}
