/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.Futures
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 */
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;

class bcy.1
implements awx {
    bcy.1() {
    }

    @Override
    public void a(boolean bl, int n) {
        c.f = ave.A();
        if (bl) {
            if (c.f.D() != null) {
                c.f.D().a(bde.a.a);
            }
            c.c.a(new iu(a, iu.a.d));
            Futures.addCallback(c.f.R().a(b, a), (FutureCallback)new FutureCallback<Object>(){

                public void onSuccess(Object object) {
                    c.c.a(new iu(a, iu.a.a));
                }

                public void onFailure(Throwable throwable) {
                    c.c.a(new iu(a, iu.a.c));
                }
            });
        } else {
            if (c.f.D() != null) {
                c.f.D().a(bde.a.b);
            }
            c.c.a(new iu(a, iu.a.b));
        }
        bdf.b(c.f.D());
        c.f.a((axu)null);
    }
}
