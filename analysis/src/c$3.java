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

static final class c.3
implements Callable<String> {
    final /* synthetic */ cj a;

    c.3(cj cj2) {
        this.a = cj2;
    }

    public String a() throws Exception {
        return c.a(this.a);
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
