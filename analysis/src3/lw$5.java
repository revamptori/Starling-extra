/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.List
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.util.List;
import net.minecraft.server.MinecraftServer;

static final class lw.5
implements ProfileLookupCallback {
    final /* synthetic */ MinecraftServer a;
    final /* synthetic */ List b;

    lw.5(MinecraftServer minecraftServer, List list) {
        this.a = minecraftServer;
        this.b = list;
    }

    public void onProfileLookupSucceeded(GameProfile gameProfile) {
        this.a.aF().a(gameProfile);
        this.b.add((Object)gameProfile);
    }

    public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
        e.warn("Could not lookup user whitelist entry for " + gameProfile.getName(), (Throwable)exception);
    }
}
