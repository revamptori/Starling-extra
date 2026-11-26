/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.concurrent.Callable
 */
import java.util.concurrent.Callable;

class b.3
implements Callable<String> {
    b.3() {
    }

    public String a() {
        return System.getProperty((String)"java.version") + ", " + System.getProperty((String)"java.vendor");
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
