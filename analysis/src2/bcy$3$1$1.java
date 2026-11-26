/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 *  java.lang.Object
 *  java.lang.Throwable
 */
import com.google.common.util.concurrent.FutureCallback;

class bcy.1
implements FutureCallback<Object> {
    bcy.1() {
    }

    public void onSuccess(Object object) {
        a.c.c.a(new iu(a.a, iu.a.a));
    }

    public void onFailure(Throwable throwable) {
        a.c.c.a(new iu(a.a, iu.a.c));
    }
}
