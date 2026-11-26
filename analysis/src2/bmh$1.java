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

class bmh.1
implements Callable<String> {
    final /* synthetic */ bmi a;

    bmh.1(bmi bmi2) {
        this.a = bmi2;
    }

    public String a() throws Exception {
        return this.a.i();
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
