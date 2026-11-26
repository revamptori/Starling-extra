/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.LinkedList
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class u
extends i {
    @Override
    public String c() {
        return "clone";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(m m2) {
        return "commands.clone.usage";
    }

    @Override
    public void a(m m22, String[] stringArray) throws bz {
        m m22;
        if (stringArray.length < 9) {
            throw new cf("commands.clone.usage", new Object[0]);
        }
        m22.a(n.a.b, 0);
        cj cj2 = u.a(m22, stringArray, 0, false);
        \u2603 = u.a(m22, stringArray, 3, false);
        \u2603 = u.a(m22, stringArray, 6, false);
        aqe \u26032 = new aqe(cj2, \u2603);
        aqe \u26033 = new aqe(\u2603, \u2603.a(\u26032.b()));
        int \u26034 = \u26032.c() * \u26032.d() * \u26032.e();
        if (\u26034 > 32768) {
            throw new bz("commands.clone.tooManyBlocks", \u26034, 32768);
        }
        boolean \u26035 = false;
        afh \u26036 = null;
        int \u26037 = -1;
        if ((stringArray.length < 11 || !stringArray[10].equals((Object)"force") && !stringArray[10].equals((Object)"move")) && \u26032.a(\u26033)) {
            throw new bz("commands.clone.noOverlap", new Object[0]);
        }
        if (stringArray.length >= 11 && stringArray[10].equals((Object)"move")) {
            \u26035 = true;
        }
        if (\u26032.b < 0 || \u26032.e >= 256 || \u26033.b < 0 || \u26033.e >= 256) {
            throw new bz("commands.clone.outOfWorld", new Object[0]);
        }
        adm \u26038 = m22.e();
        if (!\u26038.a(\u26032) || !\u26038.a(\u26033)) {
            throw new bz("commands.clone.outOfWorld", new Object[0]);
        }
        boolean \u26039 = false;
        if (stringArray.length >= 10) {
            if (stringArray[9].equals((Object)"masked")) {
                \u26039 = true;
            } else if (stringArray[9].equals((Object)"filtered")) {
                if (stringArray.length < 12) {
                    throw new cf("commands.clone.usage", new Object[0]);
                }
                \u26036 = u.g(m22, stringArray[11]);
                if (stringArray.length >= 13) {
                    \u26037 = u.a(stringArray[12], 0, 15);
                }
            }
        }
        ArrayList \u260310 = Lists.newArrayList();
        ArrayList \u260311 = Lists.newArrayList();
        ArrayList \u260312 = Lists.newArrayList();
        LinkedList \u260313 = Lists.newLinkedList();
        \u2603 = new cj(\u26033.a - \u26032.a, \u26033.b - \u26032.b, \u26033.c - \u26032.c);
        for (int j = \u26032.c; j <= \u26032.f; ++j) {
            for (\u2603 = \u26032.b; \u2603 <= \u26032.e; ++\u2603) {
                for (\u2603 = \u26032.a; \u2603 <= \u26032.d; ++\u2603) {
                    Object object;
                    Object \u260316 = new cj(\u2603, \u2603, j);
                    object = ((cj)\u260316).a(\u2603);
                    object = \u26038.p((cj)\u260316);
                    if (\u26039 && object.c() == afi.a || \u26036 != null && (object.c() != \u26036 || \u26037 >= 0 && object.c().c((alz)object) != \u26037)) continue;
                    akw \u260314 = \u26038.s((cj)\u260316);
                    if (\u260314 != null) {
                        dn dn2 = new dn();
                        \u260314.b(dn2);
                        \u260311.add((Object)new a((cj)object, (alz)object, dn2));
                        \u260313.addLast(\u260316);
                        continue;
                    }
                    if (object.c().o() || object.c().d()) {
                        \u260310.add((Object)new a((cj)object, (alz)object, null));
                        \u260313.addLast(\u260316);
                        continue;
                    }
                    \u260312.add((Object)new a((cj)object, (alz)object, null));
                    \u260313.addFirst(\u260316);
                }
            }
        }
        if (\u26035) {
            for (cj cj3 : \u260313) {
                akw akw2 = \u26038.s(cj3);
                if (akw2 instanceof og) {
                    ((og)((Object)akw2)).l();
                }
                \u26038.a(cj3, afi.cv.Q(), 2);
            }
            for (cj cj4 : \u260313) {
                \u26038.a(cj4, afi.a.Q(), 3);
            }
        }
        ArrayList arrayList = Lists.newArrayList();
        arrayList.addAll((Collection)\u260310);
        arrayList.addAll((Collection)\u260311);
        arrayList.addAll((Collection)\u260312);
        List \u260315 = Lists.reverse((List)arrayList);
        for (Object \u260316 : \u260315) {
            object = \u26038.s(((a)\u260316).a);
            if (object instanceof og) {
                ((og)object).l();
            }
            \u26038.a(((a)\u260316).a, afi.cv.Q(), 2);
        }
        \u26034 = 0;
        for (Object \u260316 : arrayList) {
            if (!\u26038.a(((a)\u260316).a, ((a)\u260316).b, 2)) continue;
            ++\u26034;
        }
        for (Object \u260316 : \u260311) {
            Object object = \u26038.s(((a)\u260316).a);
            if (((a)\u260316).c != null && object != null) {
                ((a)\u260316).c.a("x", ((a)\u260316).a.n());
                ((a)\u260316).c.a("y", ((a)\u260316).a.o());
                ((a)\u260316).c.a("z", ((a)\u260316).a.p());
                ((akw)object).a(((a)\u260316).c);
                ((akw)object).p_();
            }
            \u26038.a(((a)\u260316).a, ((a)\u260316).b, 2);
        }
        for (Object \u260316 : \u260315) {
            \u26038.b(((a)\u260316).a, ((a)\u260316).b.c());
        }
        List<adw> list = \u26038.a(\u26032, false);
        if (list != null) {
            for (Object object : list) {
                if (!\u26032.b(((adw)object).a)) continue;
                object = ((adw)object).a.a(\u2603);
                \u26038.b((cj)object, ((adw)object).a(), (int)(((adw)object).b - \u26038.P().f()), ((adw)object).c);
            }
        }
        if (\u26034 <= 0) {
            throw new bz("commands.clone.failed", new Object[0]);
        }
        m22.a(n.a.b, \u26034);
        u.a(m22, (k)this, "commands.clone.success", \u26034);
    }

    @Override
    public List<String> a(m m2, String[] stringArray, cj cj2) {
        if (stringArray.length > 0 && stringArray.length <= 3) {
            return u.a(stringArray, 0, cj2);
        }
        if (stringArray.length > 3 && stringArray.length <= 6) {
            return u.a(stringArray, 3, cj2);
        }
        if (stringArray.length > 6 && stringArray.length <= 9) {
            return u.a(stringArray, 6, cj2);
        }
        if (stringArray.length == 10) {
            return u.a(stringArray, "replace", "masked", "filtered");
        }
        if (stringArray.length == 11) {
            return u.a(stringArray, "normal", "force", "move");
        }
        if (stringArray.length == 12 && "filtered".equals((Object)stringArray[9])) {
            return u.a(stringArray, afh.c.c());
        }
        return null;
    }

    static class a {
        public final cj a;
        public final alz b;
        public final dn c;

        public a(cj cj2, alz alz2, dn dn2) {
            this.a = cj2;
            this.b = alz2;
            this.c = dn2;
        }
    }
}
