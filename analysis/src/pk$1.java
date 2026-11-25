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

class pk.1
implements Callable<String> {
    pk.1() {
    }

    public String a() throws Exception {
        return pm.b(pk.this) + " (" + pk.this.getClass().getCanonicalName() + ")";
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
