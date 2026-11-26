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

class ave.13
implements Callable<String> {
    ave.13() {
    }

    public String a() throws Exception {
        return ave.this.m.getClass().getCanonicalName();
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
