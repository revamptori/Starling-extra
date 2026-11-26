/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.management.ManagementFactory
 *  java.lang.management.RuntimeMXBean
 *  java.util.List
 *  java.util.concurrent.Callable
 */
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;
import java.util.concurrent.Callable;

class b.6
implements Callable<String> {
    b.6() {
    }

    public String a() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        List \u26032 = runtimeMXBean.getInputArguments();
        int \u26033 = 0;
        StringBuilder \u26034 = new StringBuilder();
        for (String string : \u26032) {
            if (!string.startsWith("-X")) continue;
            if (\u26033++ > 0) {
                \u26034.append(" ");
            }
            \u26034.append(string);
        }
        return String.format((String)"%d total; %s", (Object[])new Object[]{\u26033, \u26034.toString()});
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
