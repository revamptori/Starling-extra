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

class bmh.3
implements Callable<String> {
    final /* synthetic */ bmi a;

    bmh.3(bmi bmi2) {
        this.a = bmi2;
    }

    public String a() throws Exception {
        return this.a.k() + " frames";
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
