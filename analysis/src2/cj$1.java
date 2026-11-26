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

static final class cj.1
implements Iterable<cj> {
    final /* synthetic */ cj a;
    final /* synthetic */ cj b;

    cj.1(cj cj2, cj cj3) {
        this.a = cj2;
        this.b = cj3;
    }

    public Iterator<cj> iterator() {
        return new AbstractIterator<cj>(){
            private cj b = null;

            protected cj a() {
                if (this.b == null) {
                    this.b = a;
                    return this.b;
                }
                if (this.b.equals(b)) {
                    return (cj)this.endOfData();
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
                this.b = new cj(n, \u2603, \u2603);
                return this.b;
            }

            protected /* synthetic */ Object computeNext() {
                return this.a();
            }
        };
    }
}
