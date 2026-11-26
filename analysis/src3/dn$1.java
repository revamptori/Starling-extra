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

class dn.1
implements Callable<String> {
    final /* synthetic */ String a;

    dn.1(String string) {
        this.a = string;
    }

    public String a() throws Exception {
        return eb.a[((eb)dn.this.b.get((Object)this.a)).a()];
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
