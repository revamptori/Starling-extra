/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  java.io.IOException
 *  java.lang.Byte
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.locks.ReadWriteLock
 *  java.util.concurrent.locks.ReentrantReadWriteLock
 *  org.apache.commons.lang3.ObjectUtils
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.commons.lang3.ObjectUtils;

public class pz {
    private final pk a;
    private boolean b = true;
    private static final Map<Class<?>, Integer> c = Maps.newHashMap();
    private final Map<Integer, a> d = Maps.newHashMap();
    private boolean e;
    private ReadWriteLock f = new ReentrantReadWriteLock();

    public pz(pk pk2) {
        this.a = pk2;
    }

    public <T> void a(int n, T t) {
        Integer n2 = (Integer)c.get((Object)t.getClass());
        if (n2 == null) {
            throw new IllegalArgumentException("Unknown data type: " + t.getClass());
        }
        if (n > 31) {
            throw new IllegalArgumentException("Data value id is too big with " + n + "! (Max is " + 31 + ")");
        }
        if (this.d.containsKey((Object)n)) {
            throw new IllegalArgumentException("Duplicate id value for " + n + "!");
        }
        a \u26032 = new a(n2, n, t);
        this.f.writeLock().lock();
        this.d.put((Object)n, (Object)\u26032);
        this.f.writeLock().unlock();
        this.b = false;
    }

    public void a(int n, int n2) {
        a a2 = new a(n2, n, null);
        this.f.writeLock().lock();
        this.d.put((Object)n, (Object)a2);
        this.f.writeLock().unlock();
        this.b = false;
    }

    public byte a(int n) {
        return (Byte)this.j(n).b();
    }

    public short b(int n) {
        return (Short)this.j(n).b();
    }

    public int c(int n) {
        return (Integer)this.j(n).b();
    }

    public float d(int n) {
        return ((Float)this.j(n).b()).floatValue();
    }

    public String e(int n) {
        return (String)this.j(n).b();
    }

    public zx f(int n) {
        return (zx)this.j(n).b();
    }

    private a j(int n) {
        this.f.readLock().lock();
        try {
            a a2 = (a)this.d.get((Object)n);
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Getting synched entity data");
            c \u26032 = b2.a("Synched entity data");
            \u26032.a("Data ID", n);
            throw new e(b2);
        }
        this.f.readLock().unlock();
        return a2;
    }

    public dc h(int n) {
        return (dc)this.j(n).b();
    }

    public <T> void b(int n2, T t) {
        a a2 = this.j(n2);
        if (ObjectUtils.notEqual(t, (Object)a2.b())) {
            a2.a(t);
            this.a.i(n2);
            a2.a(true);
            this.e = true;
        }
    }

    public void i(int n2) {
        this.j(n2).d = true;
        this.e = true;
    }

    public boolean a() {
        return this.e;
    }

    public static void a(List<a> list, em em22) throws IOException {
        em em22;
        if (list != null) {
            for (a a2 : list) {
                pz.a(em22, a2);
            }
        }
        em22.writeByte(127);
    }

    public List<a> b() {
        ArrayList arrayList = null;
        if (this.e) {
            this.f.readLock().lock();
            for (a a2 : this.d.values()) {
                if (!a2.d()) continue;
                a2.a(false);
                if (arrayList == null) {
                    arrayList = Lists.newArrayList();
                }
                arrayList.add((Object)a2);
            }
            this.f.readLock().unlock();
        }
        this.e = false;
        return arrayList;
    }

    public void a(em em22) throws IOException {
        em em22;
        this.f.readLock().lock();
        for (a a2 : this.d.values()) {
            pz.a(em22, a2);
        }
        this.f.readLock().unlock();
        em22.writeByte(127);
    }

    public List<a> c() {
        ArrayList arrayList = null;
        this.f.readLock().lock();
        for (a a2 : this.d.values()) {
            if (arrayList == null) {
                arrayList = Lists.newArrayList();
            }
            arrayList.add((Object)a2);
        }
        this.f.readLock().unlock();
        return arrayList;
    }

    private static void a(em em2, a a22) throws IOException {
        int n2 = (a22.c() << 5 | a22.a() & 0x1F) & 0xFF;
        em2.writeByte(n2);
        switch (a22.c()) {
            case 0: {
                em2.writeByte(((Byte)a22.b()).byteValue());
                break;
            }
            case 1: {
                em2.writeShort(((Short)a22.b()).shortValue());
                break;
            }
            case 2: {
                em2.writeInt((Integer)a22.b());
                break;
            }
            case 3: {
                em2.writeFloat(((Float)a22.b()).floatValue());
                break;
            }
            case 4: {
                em2.a((String)a22.b());
                break;
            }
            case 5: {
                zx zx2 = (zx)a22.b();
                em2.a(zx2);
                break;
            }
            case 6: {
                a a22;
                cj \u26032 = (cj)a22.b();
                em2.writeInt(\u26032.n());
                em2.writeInt(\u26032.o());
                em2.writeInt(\u26032.p());
                break;
            }
            case 7: {
                dc \u26033 = (dc)a22.b();
                em2.writeFloat(\u26033.b());
                em2.writeFloat(\u26033.c());
                em2.writeFloat(\u26033.d());
            }
        }
    }

    public static List<a> b(em em2) throws IOException {
        ArrayList arrayList = null;
        byte \u26032 = em2.readByte();
        while (\u26032 != 127) {
            if (arrayList == null) {
                arrayList = Lists.newArrayList();
            }
            int n2 = (\u26032 & 0xE0) >> 5;
            \u2603 = \u26032 & 0x1F;
            a \u26033 = null;
            switch (n2) {
                case 0: {
                    \u26033 = new a(n2, \u2603, em2.readByte());
                    break;
                }
                case 1: {
                    \u26033 = new a(n2, \u2603, em2.readShort());
                    break;
                }
                case 2: {
                    \u26033 = new a(n2, \u2603, em2.readInt());
                    break;
                }
                case 3: {
                    \u26033 = new a(n2, \u2603, Float.valueOf((float)em2.readFloat()));
                    break;
                }
                case 4: {
                    \u26033 = new a(n2, \u2603, em2.c(Short.MAX_VALUE));
                    break;
                }
                case 5: {
                    \u26033 = new a(n2, \u2603, em2.i());
                    break;
                }
                case 6: {
                    \u2603 = em2.readInt();
                    \u2603 = em2.readInt();
                    \u2603 = em2.readInt();
                    \u26033 = new a(n2, \u2603, new cj(\u2603, \u2603, \u2603));
                    break;
                }
                case 7: {
                    float f = em2.readFloat();
                    \u2603 = em2.readFloat();
                    \u2603 = em2.readFloat();
                    \u26033 = new a(n2, \u2603, new dc(f, \u2603, \u2603));
                }
            }
            arrayList.add(\u26033);
            \u26032 = em2.readByte();
        }
        return arrayList;
    }

    public void a(List<a> list) {
        this.f.writeLock().lock();
        for (a a2 : list) {
            \u2603 = (a)this.d.get((Object)a2.a());
            if (\u2603 == null) continue;
            \u2603.a(a2.b());
            this.a.i(a2.a());
        }
        this.f.writeLock().unlock();
        this.e = true;
    }

    public boolean d() {
        return this.b;
    }

    public void e() {
        this.e = false;
    }

    static {
        c.put(Byte.class, (Object)0);
        c.put(Short.class, (Object)1);
        c.put(Integer.class, (Object)2);
        c.put(Float.class, (Object)3);
        c.put(String.class, (Object)4);
        c.put(zx.class, (Object)5);
        c.put(cj.class, (Object)6);
        c.put(dc.class, (Object)7);
    }

    public static class a {
        private final int a;
        private final int b;
        private Object c;
        private boolean d;

        public a(int n, int n2, Object object) {
            this.b = n2;
            this.c = object;
            this.a = n;
            this.d = true;
        }

        public int a() {
            return this.b;
        }

        public void a(Object object) {
            this.c = object;
        }

        public Object b() {
            return this.c;
        }

        public int c() {
            return this.a;
        }

        public boolean d() {
            return this.d;
        }

        public void a(boolean bl) {
            this.d = bl;
        }
    }
}
