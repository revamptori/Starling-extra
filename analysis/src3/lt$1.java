/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 *  java.lang.Exception
 *  java.lang.Object
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;

static final class lt.1
implements ProfileLookupCallback {
    final /* synthetic */ GameProfile[] a;

    lt.1(GameProfile[] gameProfileArray) {
        this.a = gameProfileArray;
    }

    public void onProfileLookupSucceeded(GameProfile gameProfile) {
        this.a[0] = gameProfile;
    }

    public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
        this.a[0] = null;
    }
}
