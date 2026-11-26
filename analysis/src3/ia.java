/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.UUID
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class ia
implements ff<fj> {
    private int a;
    private final List<a> b = Lists.newArrayList();

    public ia() {
    }

    public ia(int n, Collection<qc> collection) {
        this.a = n;
        for (qc qc2 : collection) {
            this.b.add((Object)new a(qc2.a().a(), qc2.b(), qc2.c()));
        }
    }

    @Override
    public void a(em em2) throws IOException {
        this.a = em2.e();
        int n = em2.readInt();
        for (\u2603 = 0; \u2603 < n; ++\u2603) {
            String string = em2.c(64);
            double \u26032 = em2.readDouble();
            ArrayList \u26033 = Lists.newArrayList();
            int \u26034 = em2.e();
            for (int i = 0; i < \u26034; ++i) {
                UUID uUID = em2.g();
                \u26033.add((Object)new qd(uUID, "Unknown synced attribute modifier", em2.readDouble(), em2.readByte()));
            }
            this.b.add((Object)new a(string, \u26032, (Collection<qd>)\u26033));
        }
    }

    @Override
    public void b(em em2) throws IOException {
        em2.b(this.a);
        em2.writeInt(this.b.size());
        for (a a2 : this.b) {
            em2.a(a2.a());
            em2.writeDouble(a2.b());
            em2.b(a2.c().size());
            for (qd qd2 : a2.c()) {
                em2.a(qd2.a());
                em2.writeDouble(qd2.d());
                em2.writeByte(qd2.c());
            }
        }
    }

    @Override
    public void a(fj fj2) {
        fj2.a(this);
    }

    public int a() {
        return this.a;
    }

    public List<a> b() {
        return this.b;
    }

    public class a {
        private final String b;
        private final double c;
        private final Collection<qd> d;

        public a(String string, double d, Collection<qd> collection) {
            this.b = string;
            this.c = d;
            this.d = collection;
        }

        public String a() {
            return this.b;
        }

        public double b() {
            return this.c;
        }

        public Collection<qd> c() {
            return this.d;
        }
    }
}
