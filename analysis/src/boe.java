/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.reflect.Type
 *  org.apache.commons.lang3.Validate
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.apache.commons.lang3.Validate;

public class boe
extends bnv<bod> {
    public bod a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        float[] \u26032 = new float[256];
        float[] \u26033 = new float[256];
        float[] \u26034 = new float[256];
        float \u26035 = 1.0f;
        float \u26036 = 0.0f;
        float \u26037 = 0.0f;
        if (jsonObject.has("characters")) {
            if (!jsonObject.get("characters").isJsonObject()) {
                throw new JsonParseException("Invalid font->characters: expected object, was " + jsonObject.get("characters"));
            }
            \u2603 = jsonObject.getAsJsonObject("characters");
            if (\u2603.has("default")) {
                if (!\u2603.get("default").isJsonObject()) {
                    throw new JsonParseException("Invalid font->characters->default: expected object, was " + \u2603.get("default"));
                }
                \u2603 = \u2603.getAsJsonObject("default");
                \u26035 = ni.a(\u2603, "width", \u26035);
                Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)\u26035, (String)"Invalid default width");
                \u26036 = ni.a(\u2603, "spacing", \u26036);
                Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)\u26036, (String)"Invalid default spacing");
                \u26037 = ni.a(\u2603, "left", \u26036);
                Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)\u26037, (String)"Invalid default left");
            }
            for (int i = 0; i < 256; ++i) {
                JsonElement jsonElement2 = \u2603.get(Integer.toString((int)i));
                float \u26038 = \u26035;
                float \u26039 = \u26036;
                float \u260310 = \u26037;
                if (jsonElement2 != null) {
                    JsonObject jsonObject2 = ni.l(jsonElement2, "characters[" + i + "]");
                    \u26038 = ni.a(jsonObject2, "width", \u26035);
                    Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)\u26038, (String)"Invalid width");
                    \u26039 = ni.a(jsonObject2, "spacing", \u26036);
                    Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)\u26039, (String)"Invalid spacing");
                    \u260310 = ni.a(jsonObject2, "left", \u26037);
                    Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)\u260310, (String)"Invalid left");
                }
                \u26032[i] = \u26038;
                \u26033[i] = \u26039;
                \u26034[i] = \u260310;
            }
        }
        return new bod(\u26032, \u26034, \u26033);
    }

    @Override
    public String a() {
        return "font";
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}
