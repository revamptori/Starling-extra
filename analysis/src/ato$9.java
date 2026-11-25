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

class ato.9
implements Callable<String> {
    ato.9() {
    }

    public String a() throws Exception {
        return String.format((String)"Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", (Object[])new Object[]{ato.this.u.b(), ato.this.u.a(), ato.this.w, ato.this.x});
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
