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

class aqq.2
implements Callable<String> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    aqq.2(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public String a() throws Exception {
        return String.valueOf((long)adg.a(this.a, this.b));
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
