/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Map$Entry
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public static class bgm.a
implements JsonDeserializer<bgm> {
    public bgm a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        List<bgm.d> \u26032 = this.a(jsonDeserializationContext, jsonObject);
        return new bgm((Collection<bgm.d>)\u26032);
    }

    protected List<bgm.d> a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        \u2603 = ni.s(jsonObject, "variants");
        ArrayList arrayList = Lists.newArrayList();
        for (Map.Entry entry : \u2603.entrySet()) {
            arrayList.add((Object)this.a(jsonDeserializationContext, (Map.Entry<String, JsonElement>)entry));
        }
        return arrayList;
    }

    protected bgm.d a(JsonDeserializationContext jsonDeserializationContext2, Map.Entry<String, JsonElement> entry) {
        String string = (String)entry.getKey();
        ArrayList \u26032 = Lists.newArrayList();
        JsonElement \u26033 = (JsonElement)entry.getValue();
        if (\u26033.isJsonArray()) {
            for (JsonElement jsonElement : \u26033.getAsJsonArray()) {
                \u26032.add((Object)((bgm.c)jsonDeserializationContext2.deserialize(jsonElement, bgm.c.class)));
            }
        } else {
            JsonDeserializationContext jsonDeserializationContext2;
            \u26032.add((Object)((bgm.c)jsonDeserializationContext2.deserialize(\u26033, bgm.c.class)));
        }
        return new bgm.d(string, (List<bgm.c>)\u26032);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}
