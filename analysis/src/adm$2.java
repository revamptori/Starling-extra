/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.Callable
 */
import java.util.concurrent.Callable;

class adm.2
implements Callable<String> {
    final /* synthetic */ afh a;

    adm.2(afh afh2) {
        this.a = afh2;
    }

    public String a() throws Exception {
        try {
            return String.format((String)"ID #%d (%s // %s)", (Object[])new Object[]{afh.a(this.a), this.a.a(), this.a.getClass().getCanonicalName()});
        }
        catch (Throwable throwable) {
            return "ID #" + afh.a(this.a);
        }
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
