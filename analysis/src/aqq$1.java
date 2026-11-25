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

class aqq.1
implements Callable<String> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    aqq.1(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public String a() throws Exception {
        return aqq.this.a(this.a, this.b) ? "True" : "False";
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
