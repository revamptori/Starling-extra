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

class amy.1
implements Callable<String> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    amy.1(int n, int n2, int n3) {
        this.a = n;
        this.b = n2;
        this.c = n3;
    }

    public String a() throws Exception {
        return c.a(new cj(amy.this.a * 16 + this.a, this.b, amy.this.b * 16 + this.c));
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
