/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.UUID
 */
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class lz
extends ma<GameProfile> {
    private final int a;
    private final boolean b;

    public lz(GameProfile gameProfile, int n, boolean bl) {
        super(gameProfile);
        this.a = n;
        this.b = bl;
    }

    public lz(JsonObject jsonObject) {
        super(lz.b(jsonObject), jsonObject);
        this.a = jsonObject.has("level") ? jsonObject.get("level").getAsInt() : 0;
        this.b = jsonObject.has("bypassesPlayerLimit") && jsonObject.get("bypassesPlayerLimit").getAsBoolean();
    }

    public int a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    @Override
    protected void a(JsonObject jsonObject) {
        if (this.f() == null) {
            return;
        }
        jsonObject.addProperty("uuid", ((GameProfile)this.f()).getId() == null ? "" : ((GameProfile)this.f()).getId().toString());
        jsonObject.addProperty("name", ((GameProfile)this.f()).getName());
        super.a(jsonObject);
        jsonObject.addProperty("level", (Number)Integer.valueOf((int)this.a));
        jsonObject.addProperty("bypassesPlayerLimit", Boolean.valueOf((boolean)this.b));
    }

    private static GameProfile b(JsonObject jsonObject) {
        if (!jsonObject.has("uuid") || !jsonObject.has("name")) {
            return null;
        }
        String string = jsonObject.get("uuid").getAsString();
        try {
            UUID uUID = UUID.fromString((String)string);
        }
        catch (Throwable throwable) {
            return null;
        }
        return new GameProfile(uUID, jsonObject.get("name").getAsString());
    }
}
