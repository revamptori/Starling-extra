/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
import java.util.concurrent.Callable;

class akw.3
implements Callable<String> {
    akw.3() {
    }

    public String a() throws Exception {
        alz alz2 = akw.this.b.p(akw.this.c);
        int \u26032 = alz2.c().c(alz2);
        if (\u26032 < 0) {
            return "Unknown? (Got " + \u26032 + ")";
        }
        String \u26033 = String.format((String)"%4s", (Object[])new Object[]{Integer.toBinaryString((int)\u26032)}).replace((CharSequence)" ", (CharSequence)"0");
        return String.format((String)"%1$d / 0x%1$X / 0b%2$s", (Object[])new Object[]{\u26032, \u26033});
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
