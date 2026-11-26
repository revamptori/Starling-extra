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

class bdb.4
implements Callable<String> {
    bdb.4() {
    }

    public String a() throws Exception {
        return bdb.this.I.G() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server";
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
