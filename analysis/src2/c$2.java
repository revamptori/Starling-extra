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

static final class c.2
implements Callable<String> {
    final /* synthetic */ int a;

    c.2(int n) {
        this.a = n;
    }

    public String a() throws Exception {
        if (this.a < 0) {
            return "Unknown? (Got " + this.a + ")";
        }
        String string = String.format((String)"%4s", (Object[])new Object[]{Integer.toBinaryString((int)this.a)}).replace((CharSequence)" ", (CharSequence)"0");
        return String.format((String)"%1$d / 0x%1$X / 0b%2$s", (Object[])new Object[]{this.a, string});
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
