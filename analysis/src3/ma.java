/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  java.lang.Object
 */
import com.google.gson.JsonObject;

public class ma<T> {
    private final T a;

    public ma(T t) {
        this.a = t;
    }

    protected ma(T t, JsonObject jsonObject) {
        this.a = t;
    }

    T f() {
        return this.a;
    }

    boolean e() {
        return false;
    }

    protected void a(JsonObject jsonObject) {
    }
}
