/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class all
extends akw
implements km {
    private final add a = new add(){

        @Override
        public void a(int n) {
            all.this.b.c(all.this.c, afi.ac, n, 0);
        }

        @Override
        public adm a() {
            return all.this.b;
        }

        @Override
        public cj b() {
            return all.this.c;
        }

        @Override
        public void a(add.a a2) {
            super.a(a2);
            if (this.a() != null) {
                this.a().h(all.this.c);
            }
        }
    };

    @Override
    public void a(dn dn2) {
        super.a(dn2);
        this.a.a(dn2);
    }

    @Override
    public void b(dn dn2) {
        super.b(dn2);
        this.a.b(dn2);
    }

    @Override
    public void c() {
        this.a.c();
    }

    @Override
    public ff y_() {
        dn dn2 = new dn();
        this.b(dn2);
        dn2.o("SpawnPotentials");
        return new ft(this.c, 1, dn2);
    }

    @Override
    public boolean c(int n, int n2) {
        if (this.a.b(n)) {
            return true;
        }
        return super.c(n, n2);
    }

    @Override
    public boolean F() {
        return true;
    }

    public add b() {
        return this.a;
    }
}
