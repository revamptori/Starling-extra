/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
public class e
extends RuntimeException {
    private final b a;

    public e(b b2) {
        this.a = b2;
    }

    public b a() {
        return this.a;
    }

    public Throwable getCause() {
        return this.a.b();
    }

    public String getMessage() {
        return this.a.a();
    }
}
