/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bmu {
    private static final Logger a = LogManager.getLogger();
    private final List<bmv> b = Lists.newArrayList();
    private final List<Integer> c = Lists.newArrayList();
    private int d = 0;
    private int e = -1;
    private List<Integer> f = Lists.newArrayList();
    private int g = -1;

    public bmu(bmu bmu22) {
        this();
        bmu bmu22;
        for (int i = 0; i < bmu22.i(); ++i) {
            this.a(bmu22.c(i));
        }
        this.d = bmu22.g();
    }

    public bmu() {
    }

    public void a() {
        this.b.clear();
        this.c.clear();
        this.e = -1;
        this.f.clear();
        this.g = -1;
        this.d = 0;
    }

    public bmu a(bmv bmv2) {
        if (bmv2.f() && this.j()) {
            a.warn("VertexFormat error: Trying to add a position VertexFormatElement when one already exists, ignoring.");
            return this;
        }
        this.b.add((Object)bmv2);
        this.c.add((Object)this.d);
        switch (bmv2.b()) {
            case b: {
                this.g = this.d;
                break;
            }
            case c: {
                this.e = this.d;
                break;
            }
            case d: {
                this.f.add(bmv2.d(), (Object)this.d);
                break;
            }
        }
        this.d += bmv2.e();
        return this;
    }

    public boolean b() {
        return this.g >= 0;
    }

    public int c() {
        return this.g;
    }

    public boolean d() {
        return this.e >= 0;
    }

    public int e() {
        return this.e;
    }

    public boolean a(int n) {
        return this.f.size() - 1 >= n;
    }

    public int b(int n) {
        return (Integer)this.f.get(n);
    }

    public String toString() {
        String string = "format: " + this.b.size() + " elements: ";
        for (int i = 0; i < this.b.size(); ++i) {
            string = string + ((bmv)this.b.get(i)).toString();
            if (i == this.b.size() - 1) continue;
            string = string + " ";
        }
        return string;
    }

    private boolean j() {
        int n = this.b.size();
        for (\u2603 = 0; \u2603 < n; ++\u2603) {
            bmv bmv2 = (bmv)this.b.get(\u2603);
            if (!bmv2.f()) continue;
            return true;
        }
        return false;
    }

    public int f() {
        return this.g() / 4;
    }

    public int g() {
        return this.d;
    }

    public List<bmv> h() {
        return this.b;
    }

    public int i() {
        return this.b.size();
    }

    public bmv c(int n) {
        return (bmv)this.b.get(n);
    }

    public int d(int n) {
        return (Integer)this.c.get(n);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bmu bmu2 = (bmu)object;
        if (this.d != bmu2.d) {
            return false;
        }
        if (!this.b.equals(bmu2.b)) {
            return false;
        }
        return this.c.equals(bmu2.c);
    }

    public int hashCode() {
        int n = this.b.hashCode();
        n = 31 * n + this.c.hashCode();
        n = 31 * n + this.d;
        return n;
    }
}
