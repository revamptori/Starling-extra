/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.EnumSet
 *  java.util.Set
 */
import java.io.IOException;
import java.util.EnumSet;
import java.util.Set;

public class fi
implements ff<fj> {
    private double a;
    private double b;
    private double c;
    private float d;
    private float e;
    private Set<a> f;

    public fi() {
    }

    public fi(double d, double d2, double d3, float f, float f2, Set<a> set) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = f;
        this.e = f2;
        this.f = set;
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.readDouble();
        this.b = em2.readDouble();
        this.c = em2.readDouble();
        this.d = em2.readFloat();
        this.e = em2.readFloat();
        this.f = fi$a.a(em2.readUnsignedByte());
    }

    @Override
    public void b(em em2) throws IOException {
        em2.writeDouble(this.a);
        em2.writeDouble(this.b);
        em2.writeDouble(this.c);
        em2.writeFloat(this.d);
        em2.writeFloat(this.e);
        em2.writeByte(fi$a.a(this.f));
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    public double a() {
        return this.a;
    }

    public double b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public float e() {
        return this.e;
    }

    public Set<a> f() {
        return this.f;
    }

    public static enum a {
        a(0),
        b(1),
        c(2),
        d(3),
        e(4);

        private int f;

        private a(int n2) {
            this.f = n2;
        }

        private int a() {
            return 1 << this.f;
        }

        private boolean b(int n) {
            return (n & this.a()) == this.a();
        }

        public static Set<a> a(int n) {
            EnumSet enumSet = EnumSet.noneOf(a.class);
            for (a a2 : fi$a.values()) {
                if (!a2.b(n)) continue;
                enumSet.add((Object)a2);
            }
            return enumSet;
        }

        public static int a(Set<a> set) {
            int n = 0;
            for (a a2 : set) {
                n |= a2.a();
            }
            return n;
        }
    }
}
