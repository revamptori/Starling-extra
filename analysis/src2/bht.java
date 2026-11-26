/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  java.lang.Enum
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.nio.FloatBuffer
 *  java.util.Collection
 *  java.util.EnumMap
 *  java.util.HashSet
 *  java.util.Set
 *  java.util.concurrent.locks.ReentrantLock
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.nio.FloatBuffer;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public class bht {
    private adm d;
    private final bfr e;
    public static int a;
    private cj f;
    public bhq b = bhq.a;
    private final ReentrantLock g = new ReentrantLock();
    private final ReentrantLock h = new ReentrantLock();
    private bhn i = null;
    private final Set<akw> j = Sets.newHashSet();
    private final int k;
    private final FloatBuffer l = avd.h(16);
    private final bmt[] m = new bmt[adf.values().length];
    public aug c;
    private int n = -1;
    private boolean o = true;
    private EnumMap<cq, cj> p = Maps.newEnumMap(cq.class);

    public bht(adm adm2, bfr bfr2, cj cj2, int n) {
        this.d = adm2;
        this.e = bfr2;
        this.k = n;
        if (!cj2.equals(this.j())) {
            this.a(cj2);
        }
        if (bqs.f()) {
            for (\u2603 = 0; \u2603 < adf.values().length; ++\u2603) {
                this.m[\u2603] = new bmt(bms.a);
            }
        }
    }

    public boolean a(int n) {
        if (this.n == n) {
            return false;
        }
        this.n = n;
        return true;
    }

    public bmt b(int n) {
        return this.m[n];
    }

    public void a(cj cj2) {
        this.h();
        this.f = cj2;
        this.c = new aug(cj2, cj2.a(16, 16, 16));
        for (cq cq2 : cq.values()) {
            this.p.put((Enum)cq2, (Object)cj2.a(cq2, 16));
        }
        this.m();
    }

    public void a(float f, float f2, float f3, bhn bhn2) {
        bhq bhq2 = bhn2.c();
        if (bhq2.c() == null || bhq2.b(adf.d)) {
            return;
        }
        this.a(bhn2.d().a(adf.d), this.f);
        bhn2.d().a(adf.d).a(bhq2.c());
        this.a(adf.d, f, f2, f3, bhn2.d().a(adf.d), bhq2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(float f, float f2, float f3, bhn bhn22) {
        bgd \u26036;
        Object object;
        bhq bhq2 = new bhq();
        boolean \u26032 = true;
        cj \u26033 = this.f;
        cj \u26034 = \u26033.a(15, 15, 15);
        bhn22.f().lock();
        try {
            if (bhn22.a() != bhn.a.b) {
                return;
            }
            bff bff2 = new bff(this.d, \u26033.a(-1, -1, -1), \u26034.a(1, 1, 1), 1);
            bhn22.a(bhq2);
        }
        finally {
            bhn bhn22;
            bhn22.f().unlock();
        }
        bhw bhw2 = new bhw();
        HashSet \u26035 = Sets.newHashSet();
        if (!bff2.W()) {
            ++a;
            object = new boolean[adf.values().length];
            \u26036 = ave.A().ae();
            for (cj.a a2 : cj.b(\u26033, \u26034)) {
                alz alz2 = bff2.p(a2);
                Object \u26037 = alz2.c();
                if (\u26037.c()) {
                    bhw2.a(a2);
                }
                if (\u26037.z()) {
                    Object object2 = bff2.s(new cj(a2));
                    bhd \u26038 = bhc.a.b((akw)object2);
                    if (object2 != null && \u26038 != null) {
                        bhq2.a((akw)object2);
                        if (\u26038.a()) {
                            \u26035.add(object2);
                        }
                    }
                }
                object2 = \u26037.m();
                int n = object2.ordinal();
                if (\u26037.b() == -1) continue;
                bfd \u26039 = bhn22.d().a(n);
                if (!bhq2.d((adf)((Object)object2))) {
                    bhq2.c((adf)((Object)object2));
                    this.a(\u26039, \u26033);
                }
                int n2 = n;
                object[n2] = object[n2] | \u26036.a(alz2, (cj)a2, bff2, \u26039);
            }
            for (Object \u26037 : adf.values()) {
                if (object[\u26037.ordinal()]) {
                    bhq2.a((adf)((Object)\u26037));
                }
                if (!bhq2.d((adf)((Object)\u26037))) continue;
                this.a((adf)((Object)\u26037), f, f2, f3, bhn22.d().a((adf)((Object)\u26037)), bhq2);
            }
        }
        bhq2.a(bhw2.a());
        this.g.lock();
        try {
            object = Sets.newHashSet((Iterable)\u26035);
            \u26036 = Sets.newHashSet(this.j);
            object.removeAll(this.j);
            \u26036.removeAll((Collection)\u26035);
            this.j.clear();
            this.j.addAll((Collection)\u26035);
            this.e.a((Collection<akw>)\u26036, (Collection<akw>)object);
        }
        finally {
            this.g.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void b() {
        this.g.lock();
        try {
            if (this.i != null && this.i.a() != bhn.a.d) {
                this.i.e();
                this.i = null;
            }
        }
        finally {
            this.g.unlock();
        }
    }

    public ReentrantLock c() {
        return this.g;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public bhn d() {
        this.g.lock();
        try {
            this.b();
            bhn bhn2 = this.i = new bhn(this, bhn.b.a);
            return bhn2;
        }
        finally {
            this.g.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public bhn e() {
        this.g.lock();
        try {
            if (this.i != null && this.i.a() == bhn.a.a) {
                bhn bhn2 = null;
                return bhn2;
            }
            if (this.i != null && this.i.a() != bhn.a.d) {
                this.i.e();
                this.i = null;
            }
            this.i = new bhn(this, bhn.b.b);
            this.i.a(this.b);
            bhn bhn3 = this.i;
            return bhn3;
        }
        finally {
            this.g.unlock();
        }
    }

    private void a(bfd bfd2, cj cj2) {
        bfd2.a(7, bms.a);
        bfd2.c((double)(-cj2.n()), (double)(-cj2.o()), (double)(-cj2.p()));
    }

    private void a(adf adf2, float f, float f2, float f3, bfd bfd2, bhq bhq2) {
        if (adf2 == adf.d && !bhq2.b(adf2)) {
            bfd2.a(f, f2, f3);
            bhq2.a(bfd2.a());
        }
        bfd2.e();
    }

    private void m() {
        bfl.E();
        bfl.D();
        float f2 = 1.000001f;
        bfl.b(-8.0f, -8.0f, -8.0f);
        bfl.a(f2, f2, f2);
        bfl.b(8.0f, 8.0f, 8.0f);
        bfl.a(2982, this.l);
        bfl.F();
    }

    public void f() {
        bfl.a(this.l);
    }

    public bhq g() {
        return this.b;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(bhq bhq2) {
        this.h.lock();
        try {
            this.b = bhq2;
        }
        finally {
            this.h.unlock();
        }
    }

    public void h() {
        this.b();
        this.b = bhq.a;
    }

    public void a() {
        this.h();
        this.d = null;
        for (int i2 = 0; i2 < adf.values().length; ++i2) {
            if (this.m[i2] == null) continue;
            this.m[i2].c();
        }
    }

    public cj j() {
        return this.f;
    }

    public void a(boolean bl) {
        this.o = bl;
    }

    public boolean l() {
        return this.o;
    }

    public cj a(cq cq2) {
        return (cj)this.p.get((Object)cq2);
    }
}
