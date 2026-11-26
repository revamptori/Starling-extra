/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  java.lang.Object
 *  java.lang.Override
 */
import com.mojang.authlib.minecraft.MinecraftProfileTexture;

class bdc.1
implements bnp.a {
    bdc.1() {
    }

    @Override
    public void a(MinecraftProfileTexture.Type type, jy jy2, MinecraftProfileTexture minecraftProfileTexture) {
        switch (type) {
            case SKIN: {
                bdc.this.e = jy2;
                bdc.this.g = minecraftProfileTexture.getMetadata("model");
                if (bdc.this.g != null) break;
                bdc.this.g = "default";
                break;
            }
            case CAPE: {
                bdc.this.f = jy2;
            }
        }
    }
}
