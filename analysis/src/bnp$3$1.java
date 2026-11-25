/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.Map
 */
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.Map;

class bnp.1
implements Runnable {
    final /* synthetic */ Map a;

    bnp.1(Map map) {
        this.a = map;
    }

    public void run() {
        if (this.a.containsKey((Object)MinecraftProfileTexture.Type.SKIN)) {
            d.a((MinecraftProfileTexture)this.a.get((Object)MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN, c);
        }
        if (this.a.containsKey((Object)MinecraftProfileTexture.Type.CAPE)) {
            d.a((MinecraftProfileTexture)this.a.get((Object)MinecraftProfileTexture.Type.CAPE), MinecraftProfileTexture.Type.CAPE, c);
        }
    }
}
