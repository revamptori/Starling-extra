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

class ato.1
implements Callable<String> {
    ato.1() {
    }

    public String a() throws Exception {
        return String.valueOf((long)ato.this.b());
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
