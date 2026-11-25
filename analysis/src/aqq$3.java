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

class aqq.3
implements Callable<String> {
    aqq.3() {
    }

    public String a() throws Exception {
        return aqq.this.getClass().getCanonicalName();
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
