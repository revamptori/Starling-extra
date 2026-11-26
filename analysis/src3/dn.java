/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.io.DataInput
 *  java.io.DataOutput
 *  java.io.IOException
 *  java.lang.ClassCastException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.Callable
 */
import com.google.common.collect.Maps;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

public class dn
extends eb {
    private Map<String, eb> b = Maps.newHashMap();

    @Override
    void a(DataOutput dataOutput2) throws IOException {
        DataOutput dataOutput2;
        for (String string : this.b.keySet()) {
            eb eb2 = (eb)this.b.get((Object)string);
            dn.a(string, eb2, dataOutput2);
        }
        dataOutput2.writeByte(0);
    }

    @Override
    void a(DataInput dataInput, int n, dw dw2) throws IOException {
        dw2.a(384L);
        if (n > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        this.b.clear();
        while ((\u2603 = dn.a(dataInput, dw2)) != 0) {
            String string = dn.b(dataInput, dw2);
            dw2.a(224 + 16 * string.length());
            eb \u26032 = dn.a(\u2603, string, dataInput, n + 1, dw2);
            if (this.b.put((Object)string, (Object)\u26032) == null) continue;
            dw2.a(288L);
        }
    }

    public Set<String> c() {
        return this.b.keySet();
    }

    @Override
    public byte a() {
        return 10;
    }

    public void a(String string, eb eb2) {
        this.b.put((Object)string, (Object)eb2);
    }

    public void a(String string, byte by) {
        this.b.put((Object)string, (Object)new dm(by));
    }

    public void a(String string, short s) {
        this.b.put((Object)string, (Object)new dz(s));
    }

    public void a(String string, int n) {
        this.b.put((Object)string, (Object)new dt(n));
    }

    public void a(String string, long l) {
        this.b.put((Object)string, (Object)new dv(l));
    }

    public void a(String string, float f) {
        this.b.put((Object)string, (Object)new dr(f));
    }

    public void a(String string, double d) {
        this.b.put((Object)string, (Object)new dp(d));
    }

    public void a(String string, String string2) {
        this.b.put((Object)string, (Object)new ea(string2));
    }

    public void a(String string, byte[] byArray) {
        this.b.put((Object)string, (Object)new dl(byArray));
    }

    public void a(String string, int[] nArray) {
        this.b.put((Object)string, (Object)new ds(nArray));
    }

    public void a(String string, boolean bl) {
        this.a(string, bl ? (byte)1 : 0);
    }

    public eb a(String string) {
        return (eb)this.b.get((Object)string);
    }

    public byte b(String string) {
        eb eb2 = (eb)this.b.get((Object)string);
        if (eb2 != null) {
            return eb2.a();
        }
        return 0;
    }

    public boolean c(String string) {
        return this.b.containsKey((Object)string);
    }

    public boolean b(String string, int n) {
        byte by = this.b(string);
        if (by == n) {
            return true;
        }
        if (n == 99) {
            return by == 1 || by == 2 || by == 3 || by == 4 || by == 5 || by == 6;
        }
        if (by > 0) {
            // empty if block
        }
        return false;
    }

    public byte d(String string) {
        try {
            if (!this.b(string, 99)) {
                return 0;
            }
            return ((eb.a)this.b.get((Object)string)).f();
        }
        catch (ClassCastException classCastException) {
            return 0;
        }
    }

    public short e(String string) {
        try {
            if (!this.b(string, 99)) {
                return 0;
            }
            return ((eb.a)this.b.get((Object)string)).e();
        }
        catch (ClassCastException classCastException) {
            return 0;
        }
    }

    public int f(String string) {
        try {
            if (!this.b(string, 99)) {
                return 0;
            }
            return ((eb.a)this.b.get((Object)string)).d();
        }
        catch (ClassCastException classCastException) {
            return 0;
        }
    }

    public long g(String string) {
        try {
            if (!this.b(string, 99)) {
                return 0L;
            }
            return ((eb.a)this.b.get((Object)string)).c();
        }
        catch (ClassCastException classCastException) {
            return 0L;
        }
    }

    public float h(String string) {
        try {
            if (!this.b(string, 99)) {
                return 0.0f;
            }
            return ((eb.a)this.b.get((Object)string)).h();
        }
        catch (ClassCastException classCastException) {
            return 0.0f;
        }
    }

    public double i(String string) {
        try {
            if (!this.b(string, 99)) {
                return 0.0;
            }
            return ((eb.a)this.b.get((Object)string)).g();
        }
        catch (ClassCastException classCastException) {
            return 0.0;
        }
    }

    public String j(String string) {
        try {
            if (!this.b(string, 8)) {
                return "";
            }
            return ((eb)this.b.get((Object)string)).a_();
        }
        catch (ClassCastException classCastException) {
            return "";
        }
    }

    public byte[] k(String string) {
        try {
            if (!this.b(string, 7)) {
                return new byte[0];
            }
            return ((dl)this.b.get((Object)string)).c();
        }
        catch (ClassCastException classCastException) {
            throw new e(this.a(string, 7, classCastException));
        }
    }

    public int[] l(String string) {
        try {
            if (!this.b(string, 11)) {
                return new int[0];
            }
            return ((ds)this.b.get((Object)string)).c();
        }
        catch (ClassCastException classCastException) {
            throw new e(this.a(string, 11, classCastException));
        }
    }

    public dn m(String string) {
        try {
            if (!this.b(string, 10)) {
                return new dn();
            }
            return (dn)this.b.get((Object)string);
        }
        catch (ClassCastException classCastException) {
            throw new e(this.a(string, 10, classCastException));
        }
    }

    public du c(String string, int n) {
        try {
            if (this.b(string) != 9) {
                return new du();
            }
            du du2 = (du)this.b.get((Object)string);
            if (du2.c() > 0 && du2.f() != n) {
                return new du();
            }
            return du2;
        }
        catch (ClassCastException classCastException) {
            throw new e(this.a(string, 9, classCastException));
        }
    }

    public boolean n(String string) {
        return this.d(string) != 0;
    }

    public void o(String string) {
        this.b.remove((Object)string);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (Map.Entry entry : this.b.entrySet()) {
            if (stringBuilder.length() != 1) {
                stringBuilder.append(',');
            }
            stringBuilder.append((String)entry.getKey()).append(':').append(entry.getValue());
        }
        return stringBuilder.append('}').toString();
    }

    @Override
    public boolean c_() {
        return this.b.isEmpty();
    }

    private b a(final String string, final int n, ClassCastException classCastException) {
        b b2 = b.a(classCastException, "Reading NBT data");
        c \u26032 = b2.a("Corrupt NBT tag", 1);
        \u26032.a("Tag type found", new Callable<String>(){

            public String a() throws Exception {
                return eb.a[((eb)dn.this.b.get((Object)string)).a()];
            }

            public /* synthetic */ Object call() throws Exception {
                return this.a();
            }
        });
        \u26032.a("Tag type expected", new Callable<String>(){

            public String a() throws Exception {
                return eb.a[n];
            }

            public /* synthetic */ Object call() throws Exception {
                return this.a();
            }
        });
        \u26032.a("Tag name", string);
        return b2;
    }

    @Override
    public eb b() {
        dn dn2 = new dn();
        for (String string : this.b.keySet()) {
            dn2.a(string, ((eb)this.b.get((Object)string)).b());
        }
        return dn2;
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            dn dn2 = (dn)object;
            return this.b.entrySet().equals((Object)dn2.b.entrySet());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.b.hashCode();
    }

    private static void a(String string, eb eb2, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte((int)eb2.a());
        if (eb2.a() == 0) {
            return;
        }
        dataOutput.writeUTF(string);
        eb2.a(dataOutput);
    }

    private static byte a(DataInput dataInput, dw dw2) throws IOException {
        return dataInput.readByte();
    }

    private static String b(DataInput dataInput, dw dw2) throws IOException {
        return dataInput.readUTF();
    }

    static eb a(byte by, String string, DataInput dataInput, int n, dw dw2) throws IOException {
        eb eb2 = eb.a(by);
        try {
            eb2.a(dataInput, n, dw2);
        }
        catch (IOException \u26032) {
            b b2 = b.a(\u26032, "Loading NBT data");
            c \u26033 = b2.a("NBT Tag");
            \u26033.a("Tag name", string);
            \u26033.a("Tag type", by);
            throw new e(b2);
        }
        return eb2;
    }

    public void a(dn dn2) {
        for (String string2 : dn2.b.keySet()) {
            String string2;
            eb eb2 = (eb)dn2.b.get((Object)string2);
            if (eb2.a() == 10) {
                if (this.b(string2, 10)) {
                    dn dn3 = this.m(string2);
                    dn3.a((dn)eb2);
                    continue;
                }
                this.a(string2, eb2.b());
                continue;
            }
            this.a(string2, eb2.b());
        }
    }
}
