/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public class fz
implements ff<fj> {
    private adg a;
    private a[] b;

    public fz() {
    }

    public fz(int n, short[] sArray, amy amy2) {
        this.a = new adg(amy2.a, amy2.b);
        this.b = new a[n];
        for (int i = 0; i < this.b.length; ++i) {
            this.b[i] = new a(sArray[i], amy2);
        }
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = new adg(em2.readInt(), em2.readInt());
        this.b = new a[em2.e()];
        for (int i = 0; i < this.b.length; ++i) {
            this.b[i] = new a(em2.readShort(), afh.d.a(em2.e()));
        }
    }

    @Override
    public void b(em em2) throws IOException {
        em2.writeInt(this.a.a);
        em2.writeInt(this.a.b);
        em2.b(this.b.length);
        for (a a2 : this.b) {
            em2.writeShort(a2.b());
            em2.b(afh.d.b(a2.c()));
        }
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    public a[] a() {
        return this.b;
    }

    public class a {
        private final short b;
        private final alz c;

        public a(short s, alz alz2) {
            this.b = s;
            this.c = alz2;
        }

        public a(short s, amy amy2) {
            this.b = s;
            this.c = amy2.g(this.a());
        }

        public cj a() {
            return new cj(fz.this.a.a(this.b >> 12 & 0xF, this.b & 0xFF, this.b >> 8 & 0xF));
        }

        public short b() {
            return this.b;
        }

        public alz c() {
            return this.c;
        }
    }
}
