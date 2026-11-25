/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 *  org.lwjgl.Sys
 */
import java.util.concurrent.Callable;
import org.lwjgl.Sys;

class ave.15
implements Callable<String> {
    ave.15() {
    }

    public String a() {
        return Sys.getVersion();
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
