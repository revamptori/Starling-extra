/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class alw {
    private final adm a;
    private final cj b;
    private final cj c;
    private final cq d;
    private final List<cj> e = Lists.newArrayList();
    private final List<cj> f = Lists.newArrayList();

    public alw(adm adm2, cj cj2, cq cq2, boolean bl) {
        this.a = adm2;
        this.b = cj2;
        if (bl) {
            this.d = cq2;
            this.c = cj2.a(cq2);
        } else {
            this.d = cq2.d();
            this.c = cj2.a(cq2, 2);
        }
    }

    public boolean a() {
        this.e.clear();
        this.f.clear();
        afh afh2 = this.a.p(this.c).c();
        if (!als.a(afh2, this.a, this.c, this.d, false)) {
            if (afh2.k() != 1) {
                return false;
            }
            this.f.add((Object)this.c);
            return true;
        }
        if (!this.a(this.c)) {
            return false;
        }
        for (int i = 0; i < this.e.size(); ++i) {
            cj cj2 = (cj)this.e.get(i);
            if (this.a.p(cj2).c() != afi.cE || this.b(cj2)) continue;
            return false;
        }
        return true;
    }

    private boolean a(cj cj2) {
        int n;
        afh \u26034 = this.a.p(cj2).c();
        if (\u26034.t() == arm.a) {
            return true;
        }
        if (!als.a(\u26034, this.a, cj2, this.d, false)) {
            return true;
        }
        if (cj2.equals(this.b)) {
            return true;
        }
        if (this.e.contains((Object)cj2)) {
            return true;
        }
        int \u26032 = 1;
        if (\u26032 + this.e.size() > 12) {
            return false;
        }
        while (\u26034 == afi.cE && (\u26034 = this.a.p(\u2603 = cj2.a(this.d.d(), \u26032)).c()).t() != arm.a && als.a(\u26034, this.a, \u2603, this.d, false) && !\u2603.equals(this.b)) {
            if (++\u26032 + this.e.size() <= 12) continue;
            return false;
        }
        int \u26033 = 0;
        for (n = \u26032 - 1; n >= 0; --n) {
            this.e.add((Object)cj2.a(this.d.d(), n));
            ++\u26033;
        }
        n = 1;
        while (true) {
            cj cj3;
            if ((\u2603 = this.e.indexOf((Object)(cj3 = cj2.a(this.d, n)))) > -1) {
                this.a(\u26033, \u2603);
                for (\u2603 = 0; \u2603 <= \u2603 + \u26033; ++\u2603) {
                    cj cj4 = (cj)this.e.get(\u2603);
                    if (this.a.p(cj4).c() != afi.cE || this.b(cj4)) continue;
                    return false;
                }
                return true;
            }
            \u26034 = this.a.p(cj3).c();
            if (\u26034.t() == arm.a) {
                return true;
            }
            if (!als.a(\u26034, this.a, cj3, this.d, true) || cj3.equals(this.b)) {
                return false;
            }
            if (\u26034.k() == 1) {
                this.f.add((Object)cj3);
                return true;
            }
            if (this.e.size() >= 12) {
                return false;
            }
            this.e.add((Object)cj3);
            ++\u26033;
            ++n;
        }
    }

    private void a(int n, int n2) {
        ArrayList arrayList = Lists.newArrayList();
        \u2603 = Lists.newArrayList();
        \u2603 = Lists.newArrayList();
        arrayList.addAll((Collection)this.e.subList(0, n2));
        \u2603.addAll((Collection)this.e.subList(this.e.size() - n, this.e.size()));
        \u2603.addAll((Collection)this.e.subList(n2, this.e.size() - n));
        this.e.clear();
        this.e.addAll((Collection)arrayList);
        this.e.addAll((Collection)\u2603);
        this.e.addAll((Collection)\u2603);
    }

    private boolean b(cj cj2) {
        for (cq cq2 : cq.values()) {
            if (cq2.k() == this.d.k() || this.a(cj2.a(cq2))) continue;
            return false;
        }
        return true;
    }

    public List<cj> c() {
        return this.e;
    }

    public List<cj> d() {
        return this.f;
    }
}
