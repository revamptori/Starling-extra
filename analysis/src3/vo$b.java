/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 */
import com.google.common.base.Predicate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

static class vo.b
extends sp {
    private wn g;
    private int h;
    private int i;
    private vo j;

    public vo.b(vo vo2) {
        super((py)vo2, wn.class, true);
        this.j = vo2;
    }

    @Override
    public boolean a() {
        double d = this.f();
        Predicate \u26032 = this.e.o.a(wn.class, this.e.aR().b(d, 4.0, d), this.c);
        Collections.sort((List)\u26032, (Comparator)this.b);
        if (\u26032.isEmpty()) {
            return false;
        }
        this.g = (wn)\u26032.get(0);
        return true;
    }

    @Override
    public void c() {
        this.h = 5;
        this.i = 0;
    }

    @Override
    public void d() {
        this.g = null;
        this.j.a(false);
        qc qc2 = this.j.a(vy.d);
        qc2.c(b);
        super.d();
    }

    @Override
    public boolean b() {
        if (this.g != null) {
            if (!this.j.c(this.g)) {
                return false;
            }
            this.j.bm = true;
            this.j.a(this.g, 10.0f, 10.0f);
            return true;
        }
        return super.b();
    }

    @Override
    public void e() {
        if (this.g != null) {
            if (--this.h <= 0) {
                this.d = this.g;
                this.g = null;
                super.c();
                this.j.a("mob.endermen.stare", 1.0f, 1.0f);
                this.j.a(true);
                qc qc2 = this.j.a(vy.d);
                qc2.b(b);
            }
        } else {
            if (this.d != null) {
                if (this.d instanceof wn && this.j.c((wn)this.d)) {
                    if (this.d.h(this.j) < 16.0) {
                        this.j.n();
                    }
                    this.i = 0;
                } else if (this.d.h(this.j) > 256.0 && this.i++ >= 30 && this.j.b((pk)this.d)) {
                    this.i = 0;
                }
            }
            super.e();
        }
    }
}
