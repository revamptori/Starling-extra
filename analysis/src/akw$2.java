/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.Callable
 */
import java.util.concurrent.Callable;

class akw.2
implements Callable<String> {
    akw.2() {
    }

    public String a() throws Exception {
        int n = afh.a(akw.this.b.p(akw.this.c).c());
        try {
            return String.format((String)"ID #%d (%s // %s)", (Object[])new Object[]{n, afh.c(n).a(), afh.c(n).getClass().getCanonicalName()});
        }
        catch (Throwable \u26032) {
            return "ID #" + n;
        }
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
