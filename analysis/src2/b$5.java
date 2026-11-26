/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
import java.util.concurrent.Callable;

class b.5
implements Callable<String> {
    b.5() {
    }

    public String a() {
        Runtime runtime = Runtime.getRuntime();
        long \u26032 = runtime.maxMemory();
        long \u26033 = runtime.totalMemory();
        long \u26034 = runtime.freeMemory();
        long \u26035 = \u26032 / 1024L / 1024L;
        long \u26036 = \u26033 / 1024L / 1024L;
        long \u26037 = \u26034 / 1024L / 1024L;
        return \u26034 + " bytes (" + \u26037 + " MB) / " + \u26033 + " bytes (" + \u26036 + " MB) up to " + \u26032 + " bytes (" + \u26035 + " MB)";
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
