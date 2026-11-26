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
import com.mojang.authlib.GameProfile;
import org.apache.commons.lang3.ArrayUtils;

class bdg.1
implements jp {
    private boolean d = false;
    private boolean e = false;
    private long f = 0L;
    final /* synthetic */ ek a;
    final /* synthetic */ bde b;

    bdg.1(ek ek2, bde bde2) {
        this.a = ek2;
        this.b = bde2;
    }

    @Override
    public void a(jr jr2) {
        String string;
        if (this.e) {
            this.a.a(new fa("Received unrequested status"));
            return;
        }
        this.e = true;
        js js2 = jr2.a();
        this.b.d = js2.a() != null ? js2.a().d() : "";
        if (js2.c() != null) {
            this.b.g = js2.c().a();
            this.b.f = js2.c().b();
        } else {
            this.b.g = "Old";
            this.b.f = 0;
        }
        if (js2.b() != null) {
            this.b.c = (Object)((Object)a.h) + "" + js2.b().b() + "" + (Object)((Object)a.i) + "/" + (Object)((Object)a.h) + js2.b().a();
            if (ArrayUtils.isNotEmpty((Object[])js2.b().c())) {
                string = new StringBuilder();
                for (GameProfile gameProfile : js2.b().c()) {
                    if (string.length() > 0) {
                        string.append("\n");
                    }
                    string.append(gameProfile.getName());
                }
                if (js2.b().c().length < js2.b().b()) {
                    if (string.length() > 0) {
                        string.append("\n");
                    }
                    string.append("... and ").append(js2.b().b() - js2.b().c().length).append(" more ...");
                }
                this.b.i = string.toString();
            }
        } else {
            this.b.c = (Object)((Object)a.i) + "???";
        }
        if (js2.d() != null) {
            string = js2.d();
            if (string.startsWith("data:image/png;base64,")) {
                this.b.a(string.substring("data:image/png;base64,".length()));
            } else {
                b.error("Invalid server icon (unknown format)");
            }
        } else {
            this.b.a((String)null);
        }
        this.f = ave.J();
        this.a.a(new ju(this.f));
        this.d = true;
    }

    @Override
    public void a(jq jq2) {
        long l = this.f;
        \u2603 = ave.J();
        this.b.e = \u2603 - l;
        this.a.a(new fa("Finished"));
    }

    @Override
    public void a(eu eu2) {
        if (!this.d) {
            b.error("Can't ping " + this.b.b + ": " + eu2.c());
            this.b.d = (Object)((Object)a.e) + "Can't connect to server.";
            this.b.c = "";
            bdg.this.b(this.b);
        }
    }
}
