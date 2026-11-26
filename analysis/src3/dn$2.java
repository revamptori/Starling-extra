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

class dn.2
implements Callable<String> {
    final /* synthetic */ int a;

    dn.2(int n) {
        this.a = n;
    }

    public String a() throws Exception {
        return eb.a[this.a];
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
