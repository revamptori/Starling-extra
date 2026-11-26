/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public abstract class no<T> {
    private T a;
    private boolean b = false;

    public T c() {
        if (!this.b) {
            this.b = true;
            this.a = this.b();
        }
        return this.a;
    }

    protected abstract T b();
}
