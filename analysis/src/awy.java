/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.List;

public class awy
extends axu {
    protected awx a;
    protected String f;
    private String r;
    private final List<String> s = Lists.newArrayList();
    protected String g;
    protected String h;
    protected int i;
    private int t;

    public awy(awx awx2, String string, String string2, int n) {
        this.a = awx2;
        this.f = string;
        this.r = string2;
        this.i = n;
        this.g = bnq.a("gui.yes", new Object[0]);
        this.h = bnq.a("gui.no", new Object[0]);
    }

    public awy(awx awx2, String string, String string2, String string3, String string4, int n) {
        this.a = awx2;
        this.f = string;
        this.r = string2;
        this.g = string3;
        this.h = string4;
        this.i = n;
    }

    @Override
    public void b() {
        this.n.add((Object)new awe(0, this.l / 2 - 155, this.m / 6 + 96, this.g));
        this.n.add((Object)new awe(1, this.l / 2 - 155 + 160, this.m / 6 + 96, this.h));
        this.s.clear();
        this.s.addAll(this.q.c(this.r, this.l - 50));
    }

    @Override
    protected void a(avs avs2) {
        this.a.a(avs2.k == 0, this.i);
    }

    @Override
    public void a(int n3, int n2, float f) {
        int n3;
        this.c();
        this.a(this.q, this.f, this.l / 2, 70, 0xFFFFFF);
        int n4 = 90;
        for (String string : this.s) {
            this.a(this.q, string, this.l / 2, n4, 0xFFFFFF);
            n4 += this.q.a;
        }
        super.a(n3, n2, f);
    }

    public void b(int n) {
        this.t = n;
        for (avs avs2 : this.n) {
            avs2.l = false;
        }
    }

    @Override
    public void e() {
        super.e();
        if (--this.t == 0) {
            for (avs avs2 : this.n) {
                avs2.l = true;
            }
        }
    }
}
