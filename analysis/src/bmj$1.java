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

class bmj.1
implements Callable<String> {
    final /* synthetic */ bmk a;

    bmj.1(bmk bmk2) {
        this.a = bmk2;
    }

    public String a() throws Exception {
        return this.a.getClass().getName();
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
