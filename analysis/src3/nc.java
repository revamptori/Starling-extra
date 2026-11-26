/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ForwardingSet
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.Set
 */
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Iterator;
import java.util.Set;

public class nc
extends ForwardingSet<String>
implements mz {
    private final Set<String> a = Sets.newHashSet();

    @Override
    public void a(JsonElement jsonElement) {
        if (jsonElement.isJsonArray()) {
            for (JsonElement jsonElement2 : jsonElement.getAsJsonArray()) {
                this.add(jsonElement2.getAsString());
            }
        }
    }

    @Override
    public JsonElement a() {
        JsonArray jsonArray = new JsonArray();
        Iterator \u26032 = this.iterator();
        while (\u26032.hasNext()) {
            String string = (String)\u26032.next();
            jsonArray.add((JsonElement)new JsonPrimitive(string));
        }
        return jsonArray;
    }

    protected Set<String> delegate() {
        return this.a;
    }
}
