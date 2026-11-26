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
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.mojang.authlib.GameProfile
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Type
 *  java.util.UUID
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.util.UUID;

public static class js.a {
    private final int a;
    private final int b;
    private GameProfile[] c;

    public js.a(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public GameProfile[] c() {
        return this.c;
    }

    public void a(GameProfile[] gameProfileArray) {
        this.c = gameProfileArray;
    }

    public static class a
    implements JsonDeserializer<js.a>,
    JsonSerializer<js.a> {
        public js.a a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonObject jsonObject = ni.l(jsonElement, "players");
            js.a \u26032 = new js.a(ni.m(jsonObject, "max"), ni.m(jsonObject, "online"));
            if (ni.d(jsonObject, "sample") && (\u2603 = ni.t(jsonObject, "sample")).size() > 0) {
                GameProfile[] gameProfileArray = new GameProfile[\u2603.size()];
                for (int i = 0; i < gameProfileArray.length; ++i) {
                    JsonObject jsonObject2 = ni.l(\u2603.get(i), "player[" + i + "]");
                    String \u26033 = ni.h(jsonObject2, "id");
                    gameProfileArray[i] = new GameProfile(UUID.fromString((String)\u26033), ni.h(jsonObject2, "name"));
                }
                \u26032.a(gameProfileArray);
            }
            return \u26032;
        }

        public JsonElement a(js.a a2, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("max", (Number)Integer.valueOf((int)a2.a()));
            jsonObject.addProperty("online", (Number)Integer.valueOf((int)a2.b()));
            if (a2.c() != null && a2.c().length > 0) {
                JsonArray jsonArray = new JsonArray();
                for (int i = 0; i < a2.c().length; ++i) {
                    JsonObject jsonObject2 = new JsonObject();
                    UUID \u26032 = a2.c()[i].getId();
                    jsonObject2.addProperty("id", \u26032 == null ? "" : \u26032.toString());
                    jsonObject2.addProperty("name", a2.c()[i].getName());
                    jsonArray.add((JsonElement)jsonObject2);
                }
                jsonObject.add("sample", (JsonElement)jsonArray);
            }
            return jsonObject;
        }

        public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
            return this.a((js.a)object, type, jsonSerializationContext);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}
