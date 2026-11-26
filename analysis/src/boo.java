/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  java.lang.ClassCastException
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  java.util.List
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class boo
extends bnv<bon> {
    public bon a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        boolean \u26032 = ni.a(jsonObject, "blur", false);
        boolean \u26033 = ni.a(jsonObject, "clamp", false);
        ArrayList \u26034 = Lists.newArrayList();
        if (jsonObject.has("mipmaps")) {
            try {
                JsonArray jsonArray = jsonObject.getAsJsonArray("mipmaps");
                for (int i = 0; i < jsonArray.size(); ++i) {
                    JsonElement jsonElement2 = jsonArray.get(i);
                    if (jsonElement2.isJsonPrimitive()) {
                        try {
                            \u26034.add((Object)jsonElement2.getAsInt());
                            continue;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw new JsonParseException("Invalid texture->mipmap->" + i + ": expected number, was " + jsonElement2, (Throwable)numberFormatException);
                        }
                    }
                    if (!jsonElement2.isJsonObject()) continue;
                    throw new JsonParseException("Invalid texture->mipmap->" + i + ": expected number, was " + jsonElement2);
                }
            }
            catch (ClassCastException classCastException) {
                throw new JsonParseException("Invalid texture->mipmaps: expected array, was " + jsonObject.get("mipmaps"), (Throwable)classCastException);
            }
        }
        return new bon(\u26032, \u26033, (List<Integer>)\u26034);
    }

    @Override
    public String a() {
        return "texture";
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}
