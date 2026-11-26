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

class ll.6
implements Callable<String> {
    final /* synthetic */ ek a;

    ll.6(ek ek2) {
        this.a = ek2;
    }

    public String a() throws Exception {
        return this.a.toString();
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
