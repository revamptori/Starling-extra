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

class b.4
implements Callable<String> {
    b.4() {
    }

    public String a() {
        return System.getProperty((String)"java.vm.name") + " (" + System.getProperty((String)"java.vm.info") + "), " + System.getProperty((String)"java.vm.vendor");
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
