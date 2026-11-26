/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
import java.util.concurrent.Callable;

class la.1
implements Callable<String> {
    final /* synthetic */ int a;

    la.1(int n) {
        this.a = n;
    }

    public String a() throws Exception {
        String string = "Once per " + this.a + " ticks";
        if (this.a == Integer.MAX_VALUE) {
            string = "Maximum (" + string + ")";
        }
        return string;
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
