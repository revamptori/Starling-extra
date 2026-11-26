/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.reflect.Type
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Map$Entry
 */
import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

public class boh
extends bnv<bog> {
    public bog a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        HashSet \u26032 = Sets.newHashSet();
        for (Map.Entry entry : jsonObject.entrySet()) {
            String string = (String)entry.getKey();
            JsonObject \u26033 = ni.l((JsonElement)entry.getValue(), "language");
            \u2603 = ni.h(\u26033, "region");
            \u2603 = ni.h(\u26033, "name");
            boolean \u26034 = ni.a(\u26033, "bidirectional", false);
            if (\u2603.isEmpty()) {
                throw new JsonParseException("Invalid language->'" + string + "'->region: empty value");
            }
            if (\u2603.isEmpty()) {
                throw new JsonParseException("Invalid language->'" + string + "'->name: empty value");
            }
            if (\u26032.add((Object)new bnr(string, \u2603, \u2603, \u26034))) continue;
            throw new JsonParseException("Duplicate language->'" + string + "' defined");
        }
        return new bog((Collection<bnr>)\u26032);
    }

    @Override
    public String a() {
        return "language";
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}
