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
 *  org.apache.commons.lang3.Validate
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.apache.commons.lang3.Validate;

public class bpi
implements JsonDeserializer<bph> {
    public bph a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = ni.l(jsonElement, "entry");
        bph \u26032 = new bph();
        \u26032.a(ni.a(jsonObject, "replace", false));
        bpg \u26033 = bpg.a(ni.a(jsonObject, "category", bpg.a.a()));
        \u26032.a(\u26033);
        Validate.notNull((Object)((Object)\u26033), (String)"Invalid category", (Object[])new Object[0]);
        if (jsonObject.has("sounds")) {
            JsonArray jsonArray = ni.t(jsonObject, "sounds");
            for (int i = 0; i < jsonArray.size(); ++i) {
                JsonElement jsonElement2 = jsonArray.get(i);
                bph.a \u26034 = new bph.a();
                if (ni.a(jsonElement2)) {
                    \u26034.a(ni.a(jsonElement2, "sound"));
                } else {
                    JsonObject jsonObject2 = ni.l(jsonElement2, "sound");
                    \u26034.a(ni.h(jsonObject2, "name"));
                    if (jsonObject2.has("type")) {
                        bph.a.a a2 = bph.a.a.a(ni.h(jsonObject2, "type"));
                        Validate.notNull((Object)((Object)a2), (String)"Invalid type", (Object[])new Object[0]);
                        \u26034.a(a2);
                    }
                    if (jsonObject2.has("volume")) {
                        float f = ni.k(jsonObject2, "volume");
                        Validate.isTrue((f > 0.0f ? 1 : 0) != 0, (String)"Invalid volume", (Object[])new Object[0]);
                        \u26034.a(f);
                    }
                    if (jsonObject2.has("pitch")) {
                        float f = ni.k(jsonObject2, "pitch");
                        Validate.isTrue((f > 0.0f ? 1 : 0) != 0, (String)"Invalid pitch", (Object[])new Object[0]);
                        \u26034.b(f);
                    }
                    if (jsonObject2.has("weight")) {
                        int n = ni.m(jsonObject2, "weight");
                        Validate.isTrue((n > 0 ? 1 : 0) != 0, (String)"Invalid weight", (Object[])new Object[0]);
                        \u26034.a(n);
                    }
                    if (jsonObject2.has("stream")) {
                        \u26034.a(ni.i(jsonObject2, "stream"));
                    }
                }
                \u26032.a().add((Object)\u26034);
            }
        }
        return \u26032;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}
