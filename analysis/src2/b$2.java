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

class b.2
implements Callable<String> {
    b.2() {
    }

    public String a() {
        return System.getProperty((String)"os.name") + " (" + System.getProperty((String)"os.arch") + ") version " + System.getProperty((String)"os.version");
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
