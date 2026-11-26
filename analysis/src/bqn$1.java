/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.mojang.authlib.properties.Property
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.URL
 *  java.net.URLEncoder
 *  tv.twitch.AuthToken
 */
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.properties.Property;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import tv.twitch.AuthToken;

class bqn.1
extends Thread {
    final /* synthetic */ Property a;

    bqn.1(String string, Property property) {
        this.a = property;
        super(string);
    }

    public void run() {
        try {
            URL uRL = new URL("https://api.twitch.tv/kraken?oauth_token=" + URLEncoder.encode((String)this.a.getValue(), (String)"UTF-8"));
            String \u26032 = nj.a(uRL);
            JsonObject \u26033 = ni.l(new JsonParser().parse(\u26032), "Response");
            JsonObject \u26034 = ni.s(\u26033, "token");
            if (ni.i(\u26034, "valid")) {
                String string = ni.h(\u26034, "user_name");
                b.debug(a, "Authenticated with twitch; username is {}", new Object[]{string});
                AuthToken \u26035 = new AuthToken();
                \u26035.data = this.a.getValue();
                bqn.this.c.a(string, \u26035);
                bqn.this.d.c(string);
                bqn.this.d.a(\u26035);
                Runtime.getRuntime().addShutdownHook(new Thread("Twitch shutdown hook"){

                    public void run() {
                        bqn.this.f();
                    }
                });
                bqn.this.c.C();
                bqn.this.d.n();
            } else {
                bqn.this.q = bqm.a.b;
                b.error(a, "Given twitch access token is invalid");
            }
        }
        catch (IOException iOException) {
            bqn.this.q = bqm.a.a;
            b.error(a, "Could not authenticate with twitch", (Throwable)iOException);
        }
    }
}
