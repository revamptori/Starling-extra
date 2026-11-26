/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  org.apache.commons.lang3.StringUtils
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

public static class bgl.b
implements JsonDeserializer<bgl> {
    public bgl a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        List<bgh> \u26032 = this.a(jsonDeserializationContext, jsonObject);
        String \u26033 = this.c(jsonObject);
        boolean \u26034 = StringUtils.isEmpty((CharSequence)\u26033);
        boolean \u26035 = \u26032.isEmpty();
        if (\u26035 && \u26034) {
            throw new JsonParseException("BlockModel requires either elements or parent, found neither");
        }
        if (!\u26034 && !\u26035) {
            throw new JsonParseException("BlockModel requires either elements or parent, found both");
        }
        Map<String, String> \u26036 = this.b(jsonObject);
        boolean \u26037 = this.a(jsonObject);
        bgr \u26038 = bgr.a;
        if (jsonObject.has("display")) {
            \u2603 = ni.s(jsonObject, "display");
            \u26038 = (bgr)jsonDeserializationContext.deserialize((JsonElement)\u2603, bgr.class);
        }
        if (\u26035) {
            return new bgl(new jy(\u26033), \u26036, \u26037, true, \u26038);
        }
        return new bgl(\u26032, \u26036, \u26037, true, \u26038);
    }

    private Map<String, String> b(JsonObject jsonObject) {
        HashMap hashMap = Maps.newHashMap();
        if (jsonObject.has("textures")) {
            JsonObject jsonObject2 = jsonObject.getAsJsonObject("textures");
            for (Map.Entry entry : jsonObject2.entrySet()) {
                hashMap.put(entry.getKey(), (Object)((JsonElement)entry.getValue()).getAsString());
            }
        }
        return hashMap;
    }

    private String c(JsonObject jsonObject) {
        return ni.a(jsonObject, "parent", "");
    }

    protected boolean a(JsonObject jsonObject) {
        return ni.a(jsonObject, "ambientocclusion", true);
    }

    protected List<bgh> a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        ArrayList arrayList = Lists.newArrayList();
        if (jsonObject.has("elements")) {
            for (JsonElement jsonElement : ni.t(jsonObject, "elements")) {
                arrayList.add((Object)((bgh)jsonDeserializationContext.deserialize(jsonElement, bgh.class)));
            }
        }
        return arrayList;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}
