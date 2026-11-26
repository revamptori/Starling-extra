/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 */
import com.mojang.authlib.minecraft.MinecraftProfileTexture;

static class bdc.2 {
    static final /* synthetic */ int[] a;

    static {
        a = new int[MinecraftProfileTexture.Type.values().length];
        try {
            bdc.2.a[MinecraftProfileTexture.Type.SKIN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bdc.2.a[MinecraftProfileTexture.Type.CAPE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
