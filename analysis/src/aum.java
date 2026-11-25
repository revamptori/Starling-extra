/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Comparator
 *  java.util.List
 */
import java.util.Comparator;
import java.util.List;

public class aum {
    public static final Comparator<aum> a = new Comparator<aum>(){

        public int a(aum aum2, aum aum3) {
            if (aum2.c() > aum3.c()) {
                return 1;
            }
            if (aum2.c() < aum3.c()) {
                return -1;
            }
            return aum3.e().compareToIgnoreCase(aum2.e());
        }

        public /* synthetic */ int compare(Object object, Object object2) {
            return this.a((aum)object, (aum)object2);
        }
    };
    private final auo b;
    private final auk c;
    private final String d;
    private int e;
    private boolean f;
    private boolean g;

    public aum(auo auo2, auk auk2, String string) {
        this.b = auo2;
        this.c = auk2;
        this.d = string;
        this.g = true;
    }

    public void a(int n) {
        if (this.c.c().b()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.c(this.c() + n);
    }

    public void b(int n) {
        if (this.c.c().b()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.c(this.c() - n);
    }

    public void a() {
        if (this.c.c().b()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.a(1);
    }

    public int c() {
        return this.e;
    }

    public void c(int n) {
        \u2603 = this.e;
        this.e = n;
        if (\u2603 != n || this.g) {
            this.g = false;
            this.f().a(this);
        }
    }

    public auk d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public auo f() {
        return this.b;
    }

    public boolean g() {
        return this.f;
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    public void a(List<wn> list) {
        this.c(this.c.c().a(list));
    }
}
