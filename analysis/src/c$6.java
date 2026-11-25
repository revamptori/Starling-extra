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

static final class c.6
implements Callable<String> {
    final /* synthetic */ alz a;

    c.6(alz alz2) {
        this.a = alz2;
    }

    public String a() throws Exception {
        return this.a.toString();
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
