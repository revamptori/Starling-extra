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

class adm.3
implements Callable<String> {
    adm.3() {
    }

    public String a() {
        return adm.this.j.size() + " total; " + adm.this.j.toString();
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
