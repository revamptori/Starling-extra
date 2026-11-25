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

class ato.5
implements Callable<String> {
    ato.5() {
    }

    public String a() throws Exception {
        return String.format((String)"%d game time, %d day time", (Object[])new Object[]{ato.this.h, ato.this.i});
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
