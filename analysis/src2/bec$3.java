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

class bec.3
implements Callable<String> {
    final /* synthetic */ beb a;

    bec.3(beb beb2) {
        this.a = beb2;
    }

    public String a() throws Exception {
        return this.a.toString();
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
