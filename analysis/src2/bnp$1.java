/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  java.lang.Exception
 *  java.lang.Object
 *  java.util.Map
 */
import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.Map;

class bnp.1
extends CacheLoader<GameProfile, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>> {
    bnp.1() {
    }

    public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> a(GameProfile gameProfile) throws Exception {
        return ave.A().aa().getTextures(gameProfile, false);
    }

    public /* synthetic */ Object load(Object object) throws Exception {
        return this.a((GameProfile)object);
    }
}
