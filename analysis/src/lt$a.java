/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  java.lang.Object
 *  java.util.Date
 */
import com.mojang.authlib.GameProfile;
import java.util.Date;

class lt.a {
    private final GameProfile b;
    private final Date c;

    private lt.a(GameProfile gameProfile, Date date) {
        this.b = gameProfile;
        this.c = date;
    }

    public GameProfile a() {
        return this.b;
    }

    public Date b() {
        return this.c;
    }

    static /* synthetic */ Date a(lt.a a2) {
        return a2.c;
    }
}
