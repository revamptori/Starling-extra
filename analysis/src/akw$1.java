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

class akw.1
implements Callable<String> {
    akw.1() {
    }

    public String a() throws Exception {
        return (String)g.get((Object)akw.this.getClass()) + " // " + akw.this.getClass().getCanonicalName();
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
