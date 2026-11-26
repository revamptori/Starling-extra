/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.mojang.authlib.GameProfile
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.common.base.Objects;
import com.mojang.authlib.GameProfile;

public class gz.b {
    private final int b;
    private final adp.a c;
    private final GameProfile d;
    private final eu e;

    public gz.b(GameProfile gameProfile, int n, adp.a a2, eu eu2) {
        this.d = gameProfile;
        this.b = n;
        this.c = a2;
        this.e = eu2;
    }

    public GameProfile a() {
        return this.d;
    }

    public int b() {
        return this.b;
    }

    public adp.a c() {
        return this.c;
    }

    public eu d() {
        return this.e;
    }

    public String toString() {
        return Objects.toStringHelper((Object)this).add("latency", this.b).add("gameMode", (Object)this.c).add("profile", (Object)this.d).add("displayName", this.e == null ? null : eu.a.a(this.e)).toString();
    }
}
