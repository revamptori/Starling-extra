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

class ato.8
implements Callable<String> {
    ato.8() {
    }

    public String a() throws Exception {
        return String.format((String)"Rain time: %d (now: %b), thunder time: %d (now: %b)", (Object[])new Object[]{ato.this.r, ato.this.q, ato.this.t, ato.this.s});
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
