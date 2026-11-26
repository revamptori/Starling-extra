/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.Futures
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;

class bcy.3
implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    bcy.3(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public void run() {
        bcy.this.f.a(new awy(new awx(){

            @Override
            public void a(boolean bl, int n) {
                bcy.this.f = ave.A();
                if (bl) {
                    if (bcy.this.f.D() != null) {
                        bcy.this.f.D().a(bde.a.a);
                    }
                    bcy.this.c.a(new iu(a, iu.a.d));
                    Futures.addCallback(bcy.this.f.R().a(b, a), (FutureCallback)new FutureCallback<Object>(){

                        public void onSuccess(Object object) {
                            bcy.this.c.a(new iu(a, iu.a.a));
                        }

                        public void onFailure(Throwable throwable) {
                            bcy.this.c.a(new iu(a, iu.a.c));
                        }
                    });
                } else {
                    if (bcy.this.f.D() != null) {
                        bcy.this.f.D().a(bde.a.b);
                    }
                    bcy.this.c.a(new iu(a, iu.a.b));
                }
                bdf.b(bcy.this.f.D());
                bcy.this.f.a((axu)null);
            }
        }, bnq.a("multiplayer.texturePrompt.line1", new Object[0]), bnq.a("multiplayer.texturePrompt.line2", new Object[0]), 0));
    }
}
