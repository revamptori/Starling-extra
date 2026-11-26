/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
import java.util.concurrent.Callable;
import net.minecraft.client.ClientBrandRetriever;

class bpo.2
implements Callable<String> {
    bpo.2() {
    }

    public String a() throws Exception {
        String string = ClientBrandRetriever.getClientModName();
        if (!string.equals((Object)"vanilla")) {
            return "Definitely; Client brand changed to '" + string + "'";
        }
        string = bpo.this.getServerModName();
        if (!string.equals((Object)"vanilla")) {
            return "Definitely; Server brand changed to '" + string + "'";
        }
        if (ave.class.getSigners() == null) {
            return "Very likely; Jar signature invalidated";
        }
        return "Probably not. Jar signature remains and both client + server brands are untouched.";
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
