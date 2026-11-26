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

class bfk.4
implements Callable<String> {
    final /* synthetic */ avr a;

    bfk.4(avr avr2) {
        this.a = avr2;
    }

    public String a() throws Exception {
        return String.format((String)"Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", (Object[])new Object[]{this.a.a(), this.a.b(), ((bfk)bfk.this).h.d, ((bfk)bfk.this).h.e, this.a.e()});
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
