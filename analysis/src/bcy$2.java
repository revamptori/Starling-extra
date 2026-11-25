/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
import com.google.common.util.concurrent.FutureCallback;

class bcy.2
implements FutureCallback<Object> {
    final /* synthetic */ String a;

    bcy.2(String string) {
        this.a = string;
    }

    public void onSuccess(Object object) {
        bcy.this.c.a(new iu(this.a, iu.a.a));
    }

    public void onFailure(Throwable throwable) {
        bcy.this.c.a(new iu(this.a, iu.a.c));
    }
}
