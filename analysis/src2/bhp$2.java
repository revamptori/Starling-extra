/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.concurrent.CancellationException
 */
import com.google.common.util.concurrent.FutureCallback;
import java.util.List;
import java.util.concurrent.CancellationException;

class bhp.2
implements FutureCallback<List<Object>> {
    final /* synthetic */ bhn a;
    final /* synthetic */ bhq b;

    bhp.2(bhn bhn2, bhq bhq2) {
        this.a = bhn2;
        this.b = bhq2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(List<Object> list) {
        bhp.this.b(this.a);
        this.a.f().lock();
        try {
            if (this.a.a() != bhn.a.c) {
                if (!this.a.h()) {
                    a.warn("Chunk render task was " + (Object)((Object)this.a.a()) + " when I expected it to be uploading; aborting task");
                }
                return;
            }
            this.a.a(bhn.a.d);
        }
        finally {
            this.a.f().unlock();
        }
        this.a.b().a(this.b);
    }

    public void onFailure(Throwable throwable) {
        bhp.this.b(this.a);
        if (!(throwable instanceof CancellationException) && !(throwable instanceof InterruptedException)) {
            ave.A().a(b.a(throwable, "Rendering chunk"));
        }
    }

    public /* synthetic */ void onSuccess(Object object) {
        this.a((List<Object>)((List)object));
    }
}
