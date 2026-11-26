/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Iterator
 */
import com.google.common.collect.AbstractIterator;
import java.util.Iterator;

static final class cj.2
implements Iterable<cj.a> {
    final /* synthetic */ cj a;
    final /* synthetic */ cj b;

    cj.2(cj cj2, cj cj3) {
        this.a = cj2;
        this.b = cj3;
    }

    public Iterator<cj.a> iterator() {
        return new AbstractIterator<cj.a>(){
            private cj.a b = null;

            protected cj.a a() {
                if (this.b == null) {
                    this.b = new cj.a(a.n(), a.o(), a.p());
                    return this.b;
                }
                if (this.b.equals(b)) {
                    return (cj.a)this.endOfData();
                }
                int n = this.b.n();
                \u2603 = this.b.o();
                \u2603 = this.b.p();
                if (n < b.n()) {
                    ++n;
                } else if (\u2603 < b.o()) {
                    n = a.n();
                    ++\u2603;
                } else if (\u2603 < b.p()) {
                    n = a.n();
                    \u2603 = a.o();
                    ++\u2603;
                }
                this.b.c = n;
                this.b.d = \u2603;
                this.b.e = \u2603;
                return this.b;
            }

            protected /* synthetic */ Object computeNext() {
                return this.a();
            }
        };
    }
}
