/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class aaz
extends yo {
    private final afh b;
    private String[] c;

    public aaz(afh afh2, boolean bl) {
        super(afh2);
        this.b = afh2;
        if (bl) {
            this.d(0);
            this.a(true);
        }
    }

    @Override
    public int a(zx zx2, int n) {
        return this.b.h(this.b.a(zx2.i()));
    }

    @Override
    public int a(int n) {
        return n;
    }

    public aaz a(String[] stringArray) {
        this.c = stringArray;
        return this;
    }

    @Override
    public String e_(zx zx2) {
        if (this.c == null) {
            return super.e_(zx2);
        }
        int n = zx2.i();
        if (n >= 0 && n < this.c.length) {
            return super.e_(zx2) + "." + this.c[n];
        }
        return super.e_(zx2);
    }
}
