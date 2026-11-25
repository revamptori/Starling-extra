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

static final class ase.1
implements Callable<String> {
    final /* synthetic */ ady a;

    ase.1(ady ady2) {
        this.a = ady2;
    }

    public String a() throws Exception {
        return String.valueOf((Object)this.a);
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
