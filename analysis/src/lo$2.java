/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.math.BigInteger
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import java.math.BigInteger;

class lo.2
extends Thread {
    lo.2(String string) {
        super(string);
    }

    public void run() {
        GameProfile gameProfile = lo.this.i;
        try {
            String string = new BigInteger(ng.a(lo.this.j, lo.this.f.Q().getPublic(), lo.this.k)).toString(16);
            lo.this.i = lo.this.f.aD().hasJoinedServer(new GameProfile(null, gameProfile.getName()), string);
            if (lo.this.i != null) {
                c.info("UUID of player " + lo.this.i.getName() + " is " + lo.this.i.getId());
                lo.this.g = lo.a.d;
            } else if (lo.this.f.T()) {
                c.warn("Failed to verify username but will let them in anyway!");
                lo.this.i = lo.this.a(gameProfile);
                lo.this.g = lo.a.d;
            } else {
                lo.this.a("Failed to verify username!");
                c.error("Username '" + lo.this.i.getName() + "' tried to join with an invalid session");
            }
        }
        catch (AuthenticationUnavailableException authenticationUnavailableException) {
            if (lo.this.f.T()) {
                c.warn("Authentication servers are down but will let them in anyway!");
                lo.this.i = lo.this.a(gameProfile);
                lo.this.g = lo.a.d;
            }
            lo.this.a("Authentication servers are down. Please try again later, sorry!");
            c.error("Couldn't verify username because servers are unavailable");
        }
    }
}
