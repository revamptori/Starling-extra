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

class bfr.1
implements Callable<String> {
    final /* synthetic */ double a;
    final /* synthetic */ double b;
    final /* synthetic */ double c;

    bfr.1(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public String a() throws Exception {
        return c.a(this.a, this.b, this.c);
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
