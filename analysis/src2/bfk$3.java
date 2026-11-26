/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 *  org.lwjgl.input.Mouse
 */
import java.util.concurrent.Callable;
import org.lwjgl.input.Mouse;

class bfk.3
implements Callable<String> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;

    bfk.3(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public String a() throws Exception {
        return String.format((String)"Scaled: (%d, %d). Absolute: (%d, %d)", (Object[])new Object[]{this.a, this.b, Mouse.getX(), Mouse.getY()});
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
