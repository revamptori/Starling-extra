/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.io.DataInput
 *  java.io.DataOutput
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class du
extends eb {
    private static final Logger b = LogManager.getLogger();
    private List<eb> c = Lists.newArrayList();
    private byte d = 0;

    @Override
    void a(DataOutput dataOutput) throws IOException {
        this.d = !this.c.isEmpty() ? ((eb)this.c.get(0)).a() : (byte)0;
        dataOutput.writeByte((int)this.d);
        dataOutput.writeInt(this.c.size());
        for (int i = 0; i < this.c.size(); ++i) {
            ((eb)this.c.get(i)).a(dataOutput);
        }
    }

    @Override
    void a(DataInput dataInput, int n, dw dw2) throws IOException {
        dw2.a(296L);
        if (n > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        this.d = dataInput.readByte();
        int n2 = dataInput.readInt();
        if (this.d == 0 && n2 > 0) {
            throw new RuntimeException("Missing type on ListTag");
        }
        dw2.a(32L * (long)n2);
        this.c = Lists.newArrayListWithCapacity((int)n2);
        for (\u2603 = 0; \u2603 < n2; ++\u2603) {
            eb eb2 = eb.a(this.d);
            eb2.a(dataInput, n + 1, dw2);
            this.c.add((Object)eb2);
        }
    }

    @Override
    public byte a() {
        return 9;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < this.c.size(); ++i) {
            if (i != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(i).append(':').append(this.c.get(i));
        }
        return stringBuilder.append(']').toString();
    }

    public void a(eb eb2) {
        if (eb2.a() == 0) {
            b.warn("Invalid TagEnd added to ListTag");
            return;
        }
        if (this.d == 0) {
            this.d = eb2.a();
        } else if (this.d != eb2.a()) {
            b.warn("Adding mismatching tag types to tag list");
            return;
        }
        this.c.add((Object)eb2);
    }

    public void a(int n, eb eb2) {
        if (eb2.a() == 0) {
            b.warn("Invalid TagEnd added to ListTag");
            return;
        }
        if (n < 0 || n >= this.c.size()) {
            b.warn("index out of bounds to set tag in tag list");
            return;
        }
        if (this.d == 0) {
            this.d = eb2.a();
        } else if (this.d != eb2.a()) {
            b.warn("Adding mismatching tag types to tag list");
            return;
        }
        this.c.set(n, (Object)eb2);
    }

    public eb a(int n) {
        return (eb)this.c.remove(n);
    }

    @Override
    public boolean c_() {
        return this.c.isEmpty();
    }

    public dn b(int n) {
        if (n < 0 || n >= this.c.size()) {
            return new dn();
        }
        eb eb2 = (eb)this.c.get(n);
        if (eb2.a() == 10) {
            return (dn)eb2;
        }
        return new dn();
    }

    public int[] c(int n) {
        if (n < 0 || n >= this.c.size()) {
            return new int[0];
        }
        eb eb2 = (eb)this.c.get(n);
        if (eb2.a() == 11) {
            return ((ds)eb2).c();
        }
        return new int[0];
    }

    public double d(int n) {
        if (n < 0 || n >= this.c.size()) {
            return 0.0;
        }
        eb eb2 = (eb)this.c.get(n);
        if (eb2.a() == 6) {
            return ((dp)eb2).g();
        }
        return 0.0;
    }

    public float e(int n) {
        if (n < 0 || n >= this.c.size()) {
            return 0.0f;
        }
        eb eb2 = (eb)this.c.get(n);
        if (eb2.a() == 5) {
            return ((dr)eb2).h();
        }
        return 0.0f;
    }

    public String f(int n) {
        if (n < 0 || n >= this.c.size()) {
            return "";
        }
        eb eb2 = (eb)this.c.get(n);
        if (eb2.a() == 8) {
            return eb2.a_();
        }
        return eb2.toString();
    }

    public eb g(int n) {
        if (n < 0 || n >= this.c.size()) {
            return new dq();
        }
        return (eb)this.c.get(n);
    }

    public int c() {
        return this.c.size();
    }

    @Override
    public eb b() {
        du du2 = new du();
        du2.d = this.d;
        for (eb eb2 : this.c) {
            \u2603 = eb2.b();
            du2.c.add((Object)\u2603);
        }
        return du2;
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            du du2 = (du)object;
            if (this.d == du2.d) {
                return this.c.equals(du2.c);
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.c.hashCode();
    }

    public int f() {
        return this.d;
    }
}
