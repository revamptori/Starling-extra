/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.InsecureTextureException
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.HashMap
 *  java.util.Map
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecureTextureException;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.HashMap;
import java.util.Map;

class bnp.3
implements Runnable {
    final /* synthetic */ GameProfile a;
    final /* synthetic */ boolean b;
    final /* synthetic */ bnp.a c;

    bnp.3(GameProfile gameProfile, boolean bl, bnp.a a2) {
        this.a = gameProfile;
        this.b = bl;
        this.c = a2;
    }

    public void run() {
        HashMap hashMap = Maps.newHashMap();
        try {
            hashMap.putAll(bnp.this.d.getTextures(this.a, this.b));
        }
        catch (InsecureTextureException insecureTextureException) {
            // empty catch block
        }
        if (hashMap.isEmpty() && this.a.getId().equals((Object)ave.A().L().e().getId())) {
            this.a.getProperties().clear();
            this.a.getProperties().putAll((Multimap)ave.A().N());
            hashMap.putAll(bnp.this.d.getTextures(this.a, false));
        }
        ave.A().a(new Runnable((Map)hashMap){
            final /* synthetic */ Map a;
            {
                this.a = map;
            }

            public void run() {
                if (this.a.containsKey((Object)MinecraftProfileTexture.Type.SKIN)) {
                    bnp.this.a((MinecraftProfileTexture)this.a.get((Object)MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN, c);
                }
                if (this.a.containsKey((Object)MinecraftProfileTexture.Type.CAPE)) {
                    bnp.this.a((MinecraftProfileTexture)this.a.get((Object)MinecraftProfileTexture.Type.CAPE), MinecraftProfileTexture.Type.CAPE, c);
                }
            }
        });
    }
}
