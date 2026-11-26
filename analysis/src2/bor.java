/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.Map
 *  org.lwjgl.util.vector.Matrix4f
 *  org.lwjgl.util.vector.Vector3f
 */
import com.google.common.collect.Maps;
import java.util.Map;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

public enum bor {
    a(0, 0),
    b(0, 90),
    c(0, 180),
    d(0, 270),
    e(90, 0),
    f(90, 90),
    g(90, 180),
    h(90, 270),
    i(180, 0),
    j(180, 90),
    k(180, 180),
    l(180, 270),
    m(270, 0),
    n(270, 90),
    o(270, 180),
    p(270, 270);

    private static final Map<Integer, bor> q;
    private final int r;
    private final Matrix4f s;
    private final int t;
    private final int u;

    private static int b(int n, int n2) {
        return n * 360 + n2;
    }

    private bor(int n2, int n3) {
        this.r = bor.b(n2, n3);
        this.s = new Matrix4f();
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.setIdentity();
        Matrix4f.rotate((float)((float)(-n2) * ((float)Math.PI / 180)), (Vector3f)new Vector3f(1.0f, 0.0f, 0.0f), (Matrix4f)matrix4f, (Matrix4f)matrix4f);
        this.t = ns.a(n2 / 90);
        \u2603 = new Matrix4f();
        \u2603.setIdentity();
        Matrix4f.rotate((float)((float)(-n3) * ((float)Math.PI / 180)), (Vector3f)new Vector3f(0.0f, 1.0f, 0.0f), (Matrix4f)\u2603, (Matrix4f)\u2603);
        this.u = ns.a(n3 / 90);
        Matrix4f.mul((Matrix4f)\u2603, (Matrix4f)matrix4f, (Matrix4f)this.s);
    }

    public Matrix4f a() {
        return this.s;
    }

    public cq a(cq cq2) {
        cq cq3;
        int n;
        cq3 = cq2;
        for (n = 0; n < this.t; ++n) {
            cq3 = cq3.a(cq.a.a);
        }
        if (cq3.k() != cq.a.b) {
            for (n = 0; n < this.u; ++n) {
                cq3 = cq3.a(cq.a.b);
            }
        }
        return cq3;
    }

    public int a(cq cq2, int n) {
        int n2;
        n2 = n;
        if (cq2.k() == cq.a.a) {
            n2 = (n2 + this.t) % 4;
        }
        cq cq3 = cq2;
        for (int i = 0; i < this.t; ++i) {
            cq3 = cq3.a(cq.a.a);
        }
        if (cq3.k() == cq.a.b) {
            n2 = (n2 + this.u) % 4;
        }
        return n2;
    }

    public static bor a(int n, int n2) {
        return (bor)((Object)q.get((Object)bor.b(ns.b(n, 360), ns.b(n2, 360))));
    }

    static {
        q = Maps.newHashMap();
        for (bor bor2 : bor.values()) {
            q.put((Object)bor2.r, (Object)bor2);
        }
    }
}
