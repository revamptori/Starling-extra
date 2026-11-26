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

static final class c.1
implements Callable<String> {
    final /* synthetic */ int a;
    final /* synthetic */ afh b;

    c.1(int n, afh afh2) {
        this.a = n;
        this.b = afh2;
    }

    public String a() throws Exception {
        try {
            return String.format((String)"ID #%d (%s // %s)", (Object[])new Object[]{this.a, this.b.a(), this.b.getClass().getCanonicalName()});
        }
        catch (Throwable throwable) {
            return "ID #" + this.a;
        }
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
