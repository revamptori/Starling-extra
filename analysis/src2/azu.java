/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
import java.util.List;

public abstract class azu
extends awd {
    protected final ave u;
    protected final List<azp> v;

    public azu(ave ave2, int n, int n2, List<azp> list) {
        super(ave2, n, n2, 32, n2 - 55 + 4, 36);
        this.u = ave2;
        this.v = list;
        this.k = false;
        this.a(true, (int)((float)ave2.k.a * 1.5f));
    }

    @Override
    protected void a(int n, int n2, bfx bfx2) {
        String string = (Object)((Object)a.t) + "" + (Object)((Object)a.r) + this.e();
        this.u.k.a(string, n + this.b / 2 - this.u.k.a(string) / 2, Math.min((int)(this.d + 3), (int)n2), 0xFFFFFF);
    }

    protected abstract String e();

    public List<azp> f() {
        return this.v;
    }

    @Override
    protected int b() {
        return this.f().size();
    }

    public azp c(int n) {
        return (azp)this.f().get(n);
    }

    @Override
    public int c() {
        return this.b;
    }

    @Override
    protected int d() {
        return this.f - 6;
    }

    @Override
    public /* synthetic */ awd.a b(int n) {
        return this.c(n);
    }
}
