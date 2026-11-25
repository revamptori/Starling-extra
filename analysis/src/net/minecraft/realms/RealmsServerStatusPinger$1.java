/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.apache.commons.lang3.ArrayUtils
 */
package net.minecraft.realms;

import com.mojang.authlib.GameProfile;
import net.minecraft.realms.Realms;
import net.minecraft.realms.RealmsServerPing;
import org.apache.commons.lang3.ArrayUtils;

class RealmsServerStatusPinger.1
implements jp {
    private boolean e = false;
    final /* synthetic */ RealmsServerPing a;
    final /* synthetic */ ek b;
    final /* synthetic */ String c;

    RealmsServerStatusPinger.1(RealmsServerPing realmsServerPing, ek ek2, String string) {
        this.a = realmsServerPing;
        this.b = ek2;
        this.c = string;
    }

    @Override
    public void a(jr jr2) {
        js js2 = jr2.a();
        if (js2.b() != null) {
            this.a.nrOfPlayers = String.valueOf((int)js2.b().b());
            if (ArrayUtils.isNotEmpty((Object[])js2.b().c())) {
                StringBuilder stringBuilder = new StringBuilder();
                for (GameProfile gameProfile : js2.b().c()) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append("\n");
                    }
                    stringBuilder.append(gameProfile.getName());
                }
                if (js2.b().c().length < js2.b().b()) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append("\n");
                    }
                    stringBuilder.append("... and ").append(js2.b().b() - js2.b().c().length).append(" more ...");
                }
                this.a.playerList = stringBuilder.toString();
            }
        } else {
            this.a.playerList = "";
        }
        this.b.a(new ju(Realms.currentTimeMillis()));
        this.e = true;
    }

    @Override
    public void a(jq jq2) {
        this.b.a(new fa("Finished"));
    }

    @Override
    public void a(eu eu2) {
        if (!this.e) {
            LOGGER.error("Can't ping " + this.c + ": " + eu2.c());
        }
    }
}
