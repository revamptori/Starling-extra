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

class ave.6
implements Callable<String> {
    ave.6() {
    }

    public String a() throws Exception {
        return ave.this.A.a ? ave.this.A.c() : "N/A (disabled)";
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
