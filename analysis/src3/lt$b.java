/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.mojang.authlib.GameProfile
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Type
 *  java.text.ParseException
 *  java.util.Date
 *  java.util.UUID
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.Date;
import java.util.UUID;

class lt.b
implements JsonDeserializer<lt.a>,
JsonSerializer<lt.a> {
    private lt.b() {
    }

    public JsonElement a(lt.a a2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", a2.a().getName());
        UUID \u26032 = a2.a().getId();
        jsonObject.addProperty("uuid", \u26032 == null ? "" : \u26032.toString());
        jsonObject.addProperty("expiresOn", a.format(a2.b()));
        return jsonObject;
    }

    public lt.a a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            JsonElement \u26032 = jsonObject.get("name");
            JsonElement \u26033 = jsonObject.get("uuid");
            JsonElement \u26034 = jsonObject.get("expiresOn");
            if (\u26032 == null || \u26033 == null) {
                return null;
            }
            String \u26035 = \u26033.getAsString();
            String \u26036 = \u26032.getAsString();
            Date \u26037 = null;
            if (\u26034 != null) {
                try {
                    \u26037 = a.parse(\u26034.getAsString());
                }
                catch (ParseException parseException) {
                    \u26037 = null;
                }
            }
            if (\u26036 == null || \u26035 == null) {
                return null;
            }
            try {
                UUID uUID = UUID.fromString((String)\u26035);
            }
            catch (Throwable throwable) {
                return null;
            }
            lt.a a2 = new lt.a(lt.this, new GameProfile(uUID, \u26036), \u26037, null);
            return a2;
        }
        return null;
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((lt.a)object, type, jsonSerializationContext);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}
