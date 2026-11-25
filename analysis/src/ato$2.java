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

class ato.2
implements Callable<String> {
    ato.2() {
    }

    public String a() throws Exception {
        return String.format((String)"ID %02d - %s, ver %d. Features enabled: %b", (Object[])new Object[]{ato.this.c.g(), ato.this.c.a(), ato.this.c.d(), ato.this.v});
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
