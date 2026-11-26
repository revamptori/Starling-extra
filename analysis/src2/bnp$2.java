/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  java.awt.image.BufferedImage
 *  java.lang.Object
 *  java.lang.Override
 */
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.awt.image.BufferedImage;

class bnp.2
implements bfm {
    final /* synthetic */ bfm a;
    final /* synthetic */ bnp.a b;
    final /* synthetic */ MinecraftProfileTexture.Type c;
    final /* synthetic */ jy d;
    final /* synthetic */ MinecraftProfileTexture e;

    bnp.2(bfm bfm2, bnp.a a2, MinecraftProfileTexture.Type type, jy jy2, MinecraftProfileTexture minecraftProfileTexture) {
        this.a = bfm2;
        this.b = a2;
        this.c = type;
        this.d = jy2;
        this.e = minecraftProfileTexture;
    }

    @Override
    public BufferedImage a(BufferedImage bufferedImage) {
        if (this.a != null) {
            bufferedImage = this.a.a(bufferedImage);
        }
        return bufferedImage;
    }

    @Override
    public void a() {
        if (this.a != null) {
            this.a.a();
        }
        if (this.b != null) {
            this.b.a(this.c, this.d, this.e);
        }
    }
}
