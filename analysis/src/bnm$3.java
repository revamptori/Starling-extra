/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.SettableFuture
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Throwable
 */
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;

class bnm.3
implements FutureCallback<Object> {
    final /* synthetic */ File a;
    final /* synthetic */ SettableFuture b;

    bnm.3(File file, SettableFuture settableFuture) {
        this.a = file;
        this.b = settableFuture;
    }

    public void onSuccess(Object object) {
        bnm.this.a(this.a);
        this.b.set(null);
    }

    public void onFailure(Throwable throwable) {
        this.b.setException(throwable);
    }
}
