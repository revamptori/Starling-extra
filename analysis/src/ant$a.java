/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public static class ant.a {
    static final Gson a = new GsonBuilder().registerTypeAdapter(ant.a.class, (Object)new ant.b()).create();
    public float b = 684.412f;
    public float c = 684.412f;
    public float d = 512.0f;
    public float e = 512.0f;
    public float f = 200.0f;
    public float g = 200.0f;
    public float h = 0.5f;
    public float i = 80.0f;
    public float j = 160.0f;
    public float k = 80.0f;
    public float l = 8.5f;
    public float m = 12.0f;
    public float n = 1.0f;
    public float o = 0.0f;
    public float p = 1.0f;
    public float q = 0.0f;
    public int r = 63;
    public boolean s = true;
    public boolean t = true;
    public int u = 8;
    public boolean v = true;
    public boolean w = true;
    public boolean x = true;
    public boolean y = true;
    public boolean z = true;
    public boolean A = true;
    public boolean B = true;
    public int C = 4;
    public boolean D = true;
    public int E = 80;
    public boolean F = false;
    public int G = -1;
    public int H = 4;
    public int I = 4;
    public int J = 33;
    public int K = 10;
    public int L = 0;
    public int M = 256;
    public int N = 33;
    public int O = 8;
    public int P = 0;
    public int Q = 256;
    public int R = 33;
    public int S = 10;
    public int T = 0;
    public int U = 80;
    public int V = 33;
    public int W = 10;
    public int X = 0;
    public int Y = 80;
    public int Z = 33;
    public int aa = 10;
    public int ab = 0;
    public int ac = 80;
    public int ad = 17;
    public int ae = 20;
    public int af = 0;
    public int ag = 128;
    public int ah = 9;
    public int ai = 20;
    public int aj = 0;
    public int ak = 64;
    public int al = 9;
    public int am = 2;
    public int an = 0;
    public int ao = 32;
    public int ap = 8;
    public int aq = 8;
    public int ar = 0;
    public int as = 16;
    public int at = 8;
    public int au = 1;
    public int av = 0;
    public int aw = 16;
    public int ax = 7;
    public int ay = 1;
    public int az = 16;
    public int aA = 16;

    public static ant.a a(String string) {
        if (string.length() == 0) {
            return new ant.a();
        }
        try {
            return (ant.a)a.fromJson(string, ant.a.class);
        }
        catch (Exception exception) {
            return new ant.a();
        }
    }

    public String toString() {
        return a.toJson((Object)this);
    }

    public ant.a() {
        this.a();
    }

    public void a() {
        this.b = 684.412f;
        this.c = 684.412f;
        this.d = 512.0f;
        this.e = 512.0f;
        this.f = 200.0f;
        this.g = 200.0f;
        this.h = 0.5f;
        this.i = 80.0f;
        this.j = 160.0f;
        this.k = 80.0f;
        this.l = 8.5f;
        this.m = 12.0f;
        this.n = 1.0f;
        this.o = 0.0f;
        this.p = 1.0f;
        this.q = 0.0f;
        this.r = 63;
        this.s = true;
        this.t = true;
        this.u = 8;
        this.v = true;
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = 4;
        this.D = true;
        this.E = 80;
        this.F = false;
        this.G = -1;
        this.H = 4;
        this.I = 4;
        this.J = 33;
        this.K = 10;
        this.L = 0;
        this.M = 256;
        this.N = 33;
        this.O = 8;
        this.P = 0;
        this.Q = 256;
        this.R = 33;
        this.S = 10;
        this.T = 0;
        this.U = 80;
        this.V = 33;
        this.W = 10;
        this.X = 0;
        this.Y = 80;
        this.Z = 33;
        this.aa = 10;
        this.ab = 0;
        this.ac = 80;
        this.ad = 17;
        this.ae = 20;
        this.af = 0;
        this.ag = 128;
        this.ah = 9;
        this.ai = 20;
        this.aj = 0;
        this.ak = 64;
        this.al = 9;
        this.am = 2;
        this.an = 0;
        this.ao = 32;
        this.ap = 8;
        this.aq = 8;
        this.ar = 0;
        this.as = 16;
        this.at = 8;
        this.au = 1;
        this.av = 0;
        this.aw = 16;
        this.ax = 7;
        this.ay = 1;
        this.az = 16;
        this.aA = 16;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ant.a a2 = (ant.a)object;
        if (this.aa != a2.aa) {
            return false;
        }
        if (this.ac != a2.ac) {
            return false;
        }
        if (this.ab != a2.ab) {
            return false;
        }
        if (this.Z != a2.Z) {
            return false;
        }
        if (Float.compare((float)a2.l, (float)this.l) != 0) {
            return false;
        }
        if (Float.compare((float)a2.o, (float)this.o) != 0) {
            return false;
        }
        if (Float.compare((float)a2.n, (float)this.n) != 0) {
            return false;
        }
        if (Float.compare((float)a2.q, (float)this.q) != 0) {
            return false;
        }
        if (Float.compare((float)a2.p, (float)this.p) != 0) {
            return false;
        }
        if (this.H != a2.H) {
            return false;
        }
        if (this.ae != a2.ae) {
            return false;
        }
        if (this.ag != a2.ag) {
            return false;
        }
        if (this.af != a2.af) {
            return false;
        }
        if (this.ad != a2.ad) {
            return false;
        }
        if (Float.compare((float)a2.b, (float)this.b) != 0) {
            return false;
        }
        if (Float.compare((float)a2.h, (float)this.h) != 0) {
            return false;
        }
        if (Float.compare((float)a2.f, (float)this.f) != 0) {
            return false;
        }
        if (Float.compare((float)a2.g, (float)this.g) != 0) {
            return false;
        }
        if (this.au != a2.au) {
            return false;
        }
        if (this.aw != a2.aw) {
            return false;
        }
        if (this.av != a2.av) {
            return false;
        }
        if (this.at != a2.at) {
            return false;
        }
        if (this.W != a2.W) {
            return false;
        }
        if (this.Y != a2.Y) {
            return false;
        }
        if (this.X != a2.X) {
            return false;
        }
        if (this.V != a2.V) {
            return false;
        }
        if (this.K != a2.K) {
            return false;
        }
        if (this.M != a2.M) {
            return false;
        }
        if (this.L != a2.L) {
            return false;
        }
        if (this.J != a2.J) {
            return false;
        }
        if (this.u != a2.u) {
            return false;
        }
        if (this.G != a2.G) {
            return false;
        }
        if (this.am != a2.am) {
            return false;
        }
        if (this.ao != a2.ao) {
            return false;
        }
        if (this.an != a2.an) {
            return false;
        }
        if (this.al != a2.al) {
            return false;
        }
        if (this.S != a2.S) {
            return false;
        }
        if (this.U != a2.U) {
            return false;
        }
        if (this.T != a2.T) {
            return false;
        }
        if (this.R != a2.R) {
            return false;
        }
        if (this.O != a2.O) {
            return false;
        }
        if (this.Q != a2.Q) {
            return false;
        }
        if (this.P != a2.P) {
            return false;
        }
        if (this.N != a2.N) {
            return false;
        }
        if (Float.compare((float)a2.c, (float)this.c) != 0) {
            return false;
        }
        if (this.ai != a2.ai) {
            return false;
        }
        if (this.ak != a2.ak) {
            return false;
        }
        if (this.aj != a2.aj) {
            return false;
        }
        if (this.ah != a2.ah) {
            return false;
        }
        if (this.az != a2.az) {
            return false;
        }
        if (this.ay != a2.ay) {
            return false;
        }
        if (this.ax != a2.ax) {
            return false;
        }
        if (this.aA != a2.aA) {
            return false;
        }
        if (this.E != a2.E) {
            return false;
        }
        if (Float.compare((float)a2.e, (float)this.e) != 0) {
            return false;
        }
        if (Float.compare((float)a2.i, (float)this.i) != 0) {
            return false;
        }
        if (Float.compare((float)a2.j, (float)this.j) != 0) {
            return false;
        }
        if (Float.compare((float)a2.k, (float)this.k) != 0) {
            return false;
        }
        if (this.aq != a2.aq) {
            return false;
        }
        if (this.as != a2.as) {
            return false;
        }
        if (this.ar != a2.ar) {
            return false;
        }
        if (this.ap != a2.ap) {
            return false;
        }
        if (this.I != a2.I) {
            return false;
        }
        if (this.r != a2.r) {
            return false;
        }
        if (Float.compare((float)a2.m, (float)this.m) != 0) {
            return false;
        }
        if (Float.compare((float)a2.d, (float)this.d) != 0) {
            return false;
        }
        if (this.s != a2.s) {
            return false;
        }
        if (this.t != a2.t) {
            return false;
        }
        if (this.D != a2.D) {
            return false;
        }
        if (this.F != a2.F) {
            return false;
        }
        if (this.x != a2.x) {
            return false;
        }
        if (this.A != a2.A) {
            return false;
        }
        if (this.v != a2.v) {
            return false;
        }
        if (this.y != a2.y) {
            return false;
        }
        if (this.z != a2.z) {
            return false;
        }
        if (this.w != a2.w) {
            return false;
        }
        if (this.B != a2.B) {
            return false;
        }
        return this.C == a2.C;
    }

    public int hashCode() {
        int n = this.b != 0.0f ? Float.floatToIntBits((float)this.b) : 0;
        n = 31 * n + (this.c != 0.0f ? Float.floatToIntBits((float)this.c) : 0);
        n = 31 * n + (this.d != 0.0f ? Float.floatToIntBits((float)this.d) : 0);
        n = 31 * n + (this.e != 0.0f ? Float.floatToIntBits((float)this.e) : 0);
        n = 31 * n + (this.f != 0.0f ? Float.floatToIntBits((float)this.f) : 0);
        n = 31 * n + (this.g != 0.0f ? Float.floatToIntBits((float)this.g) : 0);
        n = 31 * n + (this.h != 0.0f ? Float.floatToIntBits((float)this.h) : 0);
        n = 31 * n + (this.i != 0.0f ? Float.floatToIntBits((float)this.i) : 0);
        n = 31 * n + (this.j != 0.0f ? Float.floatToIntBits((float)this.j) : 0);
        n = 31 * n + (this.k != 0.0f ? Float.floatToIntBits((float)this.k) : 0);
        n = 31 * n + (this.l != 0.0f ? Float.floatToIntBits((float)this.l) : 0);
        n = 31 * n + (this.m != 0.0f ? Float.floatToIntBits((float)this.m) : 0);
        n = 31 * n + (this.n != 0.0f ? Float.floatToIntBits((float)this.n) : 0);
        n = 31 * n + (this.o != 0.0f ? Float.floatToIntBits((float)this.o) : 0);
        n = 31 * n + (this.p != 0.0f ? Float.floatToIntBits((float)this.p) : 0);
        n = 31 * n + (this.q != 0.0f ? Float.floatToIntBits((float)this.q) : 0);
        n = 31 * n + this.r;
        n = 31 * n + (this.s ? 1 : 0);
        n = 31 * n + (this.t ? 1 : 0);
        n = 31 * n + this.u;
        n = 31 * n + (this.v ? 1 : 0);
        n = 31 * n + (this.w ? 1 : 0);
        n = 31 * n + (this.x ? 1 : 0);
        n = 31 * n + (this.y ? 1 : 0);
        n = 31 * n + (this.z ? 1 : 0);
        n = 31 * n + (this.A ? 1 : 0);
        n = 31 * n + (this.B ? 1 : 0);
        n = 31 * n + this.C;
        n = 31 * n + (this.D ? 1 : 0);
        n = 31 * n + this.E;
        n = 31 * n + (this.F ? 1 : 0);
        n = 31 * n + this.G;
        n = 31 * n + this.H;
        n = 31 * n + this.I;
        n = 31 * n + this.J;
        n = 31 * n + this.K;
        n = 31 * n + this.L;
        n = 31 * n + this.M;
        n = 31 * n + this.N;
        n = 31 * n + this.O;
        n = 31 * n + this.P;
        n = 31 * n + this.Q;
        n = 31 * n + this.R;
        n = 31 * n + this.S;
        n = 31 * n + this.T;
        n = 31 * n + this.U;
        n = 31 * n + this.V;
        n = 31 * n + this.W;
        n = 31 * n + this.X;
        n = 31 * n + this.Y;
        n = 31 * n + this.Z;
        n = 31 * n + this.aa;
        n = 31 * n + this.ab;
        n = 31 * n + this.ac;
        n = 31 * n + this.ad;
        n = 31 * n + this.ae;
        n = 31 * n + this.af;
        n = 31 * n + this.ag;
        n = 31 * n + this.ah;
        n = 31 * n + this.ai;
        n = 31 * n + this.aj;
        n = 31 * n + this.ak;
        n = 31 * n + this.al;
        n = 31 * n + this.am;
        n = 31 * n + this.an;
        n = 31 * n + this.ao;
        n = 31 * n + this.ap;
        n = 31 * n + this.aq;
        n = 31 * n + this.ar;
        n = 31 * n + this.as;
        n = 31 * n + this.at;
        n = 31 * n + this.au;
        n = 31 * n + this.av;
        n = 31 * n + this.aw;
        n = 31 * n + this.ax;
        n = 31 * n + this.ay;
        n = 31 * n + this.az;
        n = 31 * n + this.aA;
        return n;
    }

    public ant b() {
        return new ant(this, null);
    }
}
