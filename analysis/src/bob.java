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
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  java.lang.ClassCastException
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  java.util.List
 *  org.apache.commons.lang3.Validate
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.Validate;

public class bob
extends bnv<boa>
implements JsonSerializer<boa> {
    public boa a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        ArrayList arrayList = Lists.newArrayList();
        JsonObject \u26032 = ni.l(jsonElement, "metadata section");
        int \u26033 = ni.a(\u26032, "frametime", 1);
        if (\u26033 != 1) {
            Validate.inclusiveBetween((long)1L, (long)Integer.MAX_VALUE, (long)\u26033, (String)"Invalid default frame time");
        }
        if (\u26032.has("frames")) {
            try {
                JsonArray jsonArray = ni.t(\u26032, "frames");
                for (int i = 0; i < jsonArray.size(); ++i) {
                    JsonElement jsonElement2 = jsonArray.get(i);
                    bnz \u26034 = this.a(i, jsonElement2);
                    if (\u26034 == null) continue;
                    arrayList.add((Object)\u26034);
                }
            }
            catch (ClassCastException classCastException) {
                throw new JsonParseException("Invalid animation->frames: expected array, was " + \u26032.get("frames"), (Throwable)classCastException);
            }
        }
        int n = ni.a(\u26032, "width", -1);
        i = ni.a(\u26032, "height", -1);
        if (n != -1) {
            Validate.inclusiveBetween((long)1L, (long)Integer.MAX_VALUE, (long)n, (String)"Invalid width");
        }
        if (i != -1) {
            Validate.inclusiveBetween((long)1L, (long)Integer.MAX_VALUE, (long)i, (String)"Invalid height");
        }
        boolean \u26035 = ni.a(\u26032, "interpolate", false);
        return new boa((List<bnz>)arrayList, n, i, \u26033, \u26035);
    }

    private bnz a(int n, JsonElement jsonElement) {
        if (jsonElement.isJsonPrimitive()) {
            return new bnz(ni.f(jsonElement, "frames[" + n + "]"));
        }
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = ni.l(jsonElement, "frames[" + n + "]");
            int \u26032 = ni.a(jsonObject, "time", -1);
            if (jsonObject.has("time")) {
                Validate.inclusiveBetween((long)1L, (long)Integer.MAX_VALUE, (long)\u26032, (String)"Invalid frame time");
            }
            int \u26033 = ni.m(jsonObject, "index");
            Validate.inclusiveBetween((long)0L, (long)Integer.MAX_VALUE, (long)\u26033, (String)"Invalid frame index");
            return new bnz(\u26033, \u26032);
        }
        return null;
    }

    public JsonElement a(boa boa2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("frametime", (Number)Integer.valueOf((int)boa2.d()));
        if (boa2.b() != -1) {
            jsonObject.addProperty("width", (Number)Integer.valueOf((int)boa2.b()));
        }
        if (boa2.a() != -1) {
            jsonObject.addProperty("height", (Number)Integer.valueOf((int)boa2.a()));
        }
        if (boa2.c() > 0) {
            JsonArray jsonArray = new JsonArray();
            for (int i = 0; i < boa2.c(); ++i) {
                if (boa2.b(i)) {
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("index", (Number)Integer.valueOf((int)boa2.c(i)));
                    jsonObject2.addProperty("time", (Number)Integer.valueOf((int)boa2.a(i)));
                    jsonArray.add((JsonElement)jsonObject2);
                    continue;
                }
                jsonArray.add((JsonElement)new JsonPrimitive((Number)Integer.valueOf((int)boa2.c(i))));
            }
            jsonObject.add("frames", (JsonElement)jsonArray);
        }
        return jsonObject;
    }

    @Override
    public String a() {
        return "animation";
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((boa)object, type, jsonSerializationContext);
    }
}
