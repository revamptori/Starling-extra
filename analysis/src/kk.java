/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.List
 *  java.util.Set
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

public class kk
extends auo {
    private final MinecraftServer a;
    private final Set<auk> b = Sets.newHashSet();
    private aup c;

    public kk(MinecraftServer minecraftServer) {
        this.a = minecraftServer;
    }

    @Override
    public void a(aum aum2) {
        super.a(aum2);
        if (this.b.contains((Object)aum2.d())) {
            this.a.ap().a(new hs(aum2));
        }
        this.b();
    }

    @Override
    public void a(String string) {
        super.a(string);
        this.a.ap().a(new hs(string));
        this.b();
    }

    @Override
    public void a(String string, auk auk2) {
        super.a(string, auk2);
        this.a.ap().a(new hs(string, auk2));
        this.b();
    }

    @Override
    public void a(int n2, auk auk2) {
        \u2603 = this.a(n2);
        super.a(n2, auk2);
        if (\u2603 != auk2 && \u2603 != null) {
            if (this.h(\u2603) > 0) {
                this.a.ap().a(new hj(n2, auk2));
            } else {
                this.g(\u2603);
            }
        }
        if (auk2 != null) {
            if (this.b.contains((Object)auk2)) {
                this.a.ap().a(new hj(n2, auk2));
            } else {
                this.e(auk2);
            }
        }
        this.b();
    }

    @Override
    public boolean a(String string, String string2) {
        if (super.a(string, string2)) {
            aul aul2 = this.d(string2);
            this.a.ap().a(new hr(aul2, (Collection<String>)Arrays.asList((Object[])new String[]{string}), 3));
            this.b();
            return true;
        }
        return false;
    }

    @Override
    public void a(String string, aul aul2) {
        super.a(string, aul2);
        this.a.ap().a(new hr(aul2, (Collection<String>)Arrays.asList((Object[])new String[]{string}), 4));
        this.b();
    }

    @Override
    public void a(auk auk2) {
        super.a(auk2);
        this.b();
    }

    @Override
    public void b(auk auk2) {
        super.b(auk2);
        if (this.b.contains((Object)auk2)) {
            this.a.ap().a(new hq(auk2, 2));
        }
        this.b();
    }

    @Override
    public void c(auk auk2) {
        super.c(auk2);
        if (this.b.contains((Object)auk2)) {
            this.g(auk2);
        }
        this.b();
    }

    @Override
    public void a(aul aul2) {
        super.a(aul2);
        this.a.ap().a(new hr(aul2, 0));
        this.b();
    }

    @Override
    public void b(aul aul2) {
        super.b(aul2);
        this.a.ap().a(new hr(aul2, 2));
        this.b();
    }

    @Override
    public void c(aul aul2) {
        super.c(aul2);
        this.a.ap().a(new hr(aul2, 1));
        this.b();
    }

    public void a(aup aup2) {
        this.c = aup2;
    }

    protected void b() {
        if (this.c != null) {
            this.c.c();
        }
    }

    public List<ff> d(auk auk22) {
        auk auk22;
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add((Object)new hq(auk22, 0));
        for (int i = 0; i < 19; ++i) {
            if (this.a(i) != auk22) continue;
            arrayList.add((Object)new hj(i, auk22));
        }
        for (aum \u26032 : this.i(auk22)) {
            arrayList.add((Object)new hs(\u26032));
        }
        return arrayList;
    }

    public void e(auk auk22) {
        auk auk22;
        List<ff> list = this.d(auk22);
        for (lf lf2 : this.a.ap().v()) {
            for (ff ff2 : list) {
                lf2.a.a(ff2);
            }
        }
        this.b.add((Object)auk22);
    }

    public List<ff> f(auk auk2) {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add((Object)new hq(auk2, 1));
        for (int i = 0; i < 19; ++i) {
            if (this.a(i) != auk2) continue;
            arrayList.add((Object)new hj(i, auk2));
        }
        return arrayList;
    }

    public void g(auk auk22) {
        auk auk22;
        List<ff> list = this.f(auk22);
        for (lf lf2 : this.a.ap().v()) {
            for (ff ff2 : list) {
                lf2.a.a(ff2);
            }
        }
        this.b.remove((Object)auk22);
    }

    public int h(auk auk2) {
        int n2 = 0;
        for (\u2603 = 0; \u2603 < 19; ++\u2603) {
            if (this.a(\u2603) != auk2) continue;
            ++n2;
        }
        return n2;
    }
}
