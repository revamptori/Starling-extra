/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Floats
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Short
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.nio.FloatBuffer
 *  java.nio.IntBuffer
 *  java.nio.ShortBuffer
 *  java.util.Arrays
 *  java.util.BitSet
 *  java.util.Comparator
 *  org.apache.logging.log4j.LogManager
 */
import com.google.common.primitives.Floats;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import org.apache.logging.log4j.LogManager;

public class bfd {
    private ByteBuffer a;
    private IntBuffer b;
    private ShortBuffer c;
    private FloatBuffer d;
    private int e;
    private bmv f;
    private int g;
    private boolean h;
    private int i;
    private double j;
    private double k;
    private double l;
    private bmu m;
    private boolean n;

    public bfd(int n) {
        this.a = avd.c(n * 4);
        this.b = this.a.asIntBuffer();
        this.c = this.a.asShortBuffer();
        this.d = this.a.asFloatBuffer();
    }

    private void b(int n) {
        if (n <= this.b.remaining()) {
            return;
        }
        \u2603 = this.a.capacity();
        \u2603 = \u2603 % 0x200000;
        \u2603 = \u2603 + (((this.b.position() + n) * 4 - \u2603) / 0x200000 + 1) * 0x200000;
        LogManager.getLogger().warn("Needed to grow BufferBuilder buffer: Old size " + \u2603 + " bytes, new size " + \u2603 + " bytes.");
        \u2603 = this.b.position();
        ByteBuffer byteBuffer = avd.c(\u2603);
        this.a.position(0);
        byteBuffer.put(this.a);
        byteBuffer.rewind();
        this.a = byteBuffer;
        this.d = this.a.asFloatBuffer().asReadOnlyBuffer();
        this.b = this.a.asIntBuffer();
        this.b.position(\u2603);
        this.c = this.a.asShortBuffer();
        this.c.position(\u2603 << 1);
    }

    public void a(float f, float f2, float f3) {
        int n = this.e / 4;
        final float[] \u26032 = new float[n];
        for (\u2603 = 0; \u2603 < n; ++\u2603) {
            \u26032[\u2603] = bfd.a(this.d, (float)((double)f + this.j), (float)((double)f2 + this.k), (float)((double)f3 + this.l), this.m.f(), \u2603 * this.m.g());
        }
        Object[] \u26033 = new Integer[n];
        for (\u2603 = 0; \u2603 < \u26033.length; ++\u2603) {
            \u26033[\u2603] = \u2603;
        }
        Arrays.sort((Object[])\u26033, (Comparator)new Comparator<Integer>(){

            public int a(Integer n, Integer n2) {
                return Floats.compare((float)\u26032[n2], (float)\u26032[n]);
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((Integer)object, (Integer)object2);
            }
        });
        BitSet \u26034 = new BitSet();
        \u2603 = this.m.g();
        int[] \u26035 = new int[\u2603];
        \u2603 = 0;
        while ((\u2603 = \u26034.nextClearBit(\u2603)) < \u26033.length) {
            \u2603 = \u26033[\u2603].intValue();
            if (\u2603 != \u2603) {
                this.b.limit(\u2603 * \u2603 + \u2603);
                this.b.position(\u2603 * \u2603);
                this.b.get(\u26035);
                \u26036 = \u2603;
                \u26037 = \u26033[\u26036].intValue();
                while (\u26036 != \u2603) {
                    this.b.limit(\u26037 * \u2603 + \u2603);
                    this.b.position(\u26037 * \u2603);
                    IntBuffer intBuffer = this.b.slice();
                    this.b.limit(\u26036 * \u2603 + \u2603);
                    this.b.position(\u26036 * \u2603);
                    this.b.put(intBuffer);
                    \u26034.set(\u26036);
                    int \u26036 = \u26037;
                    int \u26037 = \u26033[\u26036].intValue();
                }
                this.b.limit(\u2603 * \u2603 + \u2603);
                this.b.position(\u2603 * \u2603);
                this.b.put(\u26035);
            }
            \u26034.set(\u2603);
            ++\u2603;
        }
    }

    public a a() {
        this.b.rewind();
        int n = this.j();
        this.b.limit(n);
        int[] \u26032 = new int[n];
        this.b.get(\u26032);
        this.b.limit(this.b.capacity());
        this.b.position(n);
        return new a(\u26032, new bmu(this.m));
    }

    private int j() {
        return this.e * this.m.f();
    }

    private static float a(FloatBuffer floatBuffer, float f, float f2, float f3, int n, int n2) {
        float f4 = floatBuffer.get(n2 + n * 0 + 0);
        \u2603 = floatBuffer.get(n2 + n * 0 + 1);
        \u2603 = floatBuffer.get(n2 + n * 0 + 2);
        \u2603 = floatBuffer.get(n2 + n * 1 + 0);
        \u2603 = floatBuffer.get(n2 + n * 1 + 1);
        \u2603 = floatBuffer.get(n2 + n * 1 + 2);
        \u2603 = floatBuffer.get(n2 + n * 2 + 0);
        \u2603 = floatBuffer.get(n2 + n * 2 + 1);
        \u2603 = floatBuffer.get(n2 + n * 2 + 2);
        \u2603 = floatBuffer.get(n2 + n * 3 + 0);
        \u2603 = floatBuffer.get(n2 + n * 3 + 1);
        \u2603 = floatBuffer.get(n2 + n * 3 + 2);
        \u2603 = (f4 + \u2603 + \u2603 + \u2603) * 0.25f - f;
        \u2603 = (\u2603 + \u2603 + \u2603 + \u2603) * 0.25f - f2;
        \u2603 = (\u2603 + \u2603 + \u2603 + \u2603) * 0.25f - f3;
        return \u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603;
    }

    public void a(a a2) {
        this.b.clear();
        this.b(a2.a().length);
        this.b.put(a2.a());
        this.e = a2.b();
        this.m = new bmu(a2.c());
    }

    public void b() {
        this.e = 0;
        this.f = null;
        this.g = 0;
    }

    public void a(int n, bmu bmu2) {
        if (this.n) {
            throw new IllegalStateException("Already building!");
        }
        this.n = true;
        this.b();
        this.i = n;
        this.m = bmu2;
        this.f = bmu2.c(this.g);
        this.h = false;
        this.a.limit(this.a.capacity());
    }

    public bfd a(double d, double d2) {
        int n = this.e * this.m.g() + this.m.d(this.g);
        switch (this.f.a()) {
            case a: {
                this.a.putFloat(n, (float)d);
                this.a.putFloat(n + 4, (float)d2);
                break;
            }
            case f: 
            case g: {
                this.a.putInt(n, (int)d);
                this.a.putInt(n + 4, (int)d2);
                break;
            }
            case d: 
            case e: {
                this.a.putShort(n, (short)d2);
                this.a.putShort(n + 2, (short)d);
                break;
            }
            case b: 
            case c: {
                this.a.put(n, (byte)d2);
                this.a.put(n + 1, (byte)d);
            }
        }
        this.k();
        return this;
    }

    public bfd a(int n, int n2) {
        \u2603 = this.e * this.m.g() + this.m.d(this.g);
        switch (this.f.a()) {
            case a: {
                this.a.putFloat(\u2603, (float)n);
                this.a.putFloat(\u2603 + 4, (float)n2);
                break;
            }
            case f: 
            case g: {
                this.a.putInt(\u2603, n);
                this.a.putInt(\u2603 + 4, n2);
                break;
            }
            case d: 
            case e: {
                this.a.putShort(\u2603, (short)n2);
                this.a.putShort(\u2603 + 2, (short)n);
                break;
            }
            case b: 
            case c: {
                this.a.put(\u2603, (byte)n2);
                this.a.put(\u2603 + 1, (byte)n);
            }
        }
        this.k();
        return this;
    }

    public void a(int n, int n2, int n3, int n4) {
        \u2603 = (this.e - 4) * this.m.f() + this.m.b(1) / 4;
        \u2603 = this.m.g() >> 2;
        this.b.put(\u2603, n);
        this.b.put(\u2603 + \u2603, n2);
        this.b.put(\u2603 + \u2603 * 2, n3);
        this.b.put(\u2603 + \u2603 * 3, n4);
    }

    public void a(double d, double d2, double d3) {
        int n = this.m.f();
        \u2603 = (this.e - 4) * n;
        for (\u2603 = 0; \u2603 < 4; ++\u2603) {
            \u2603 = \u2603 + \u2603 * n;
            \u2603 = \u2603 + 1;
            \u2603 = \u2603 + 1;
            this.b.put(\u2603, Float.floatToRawIntBits((float)((float)(d + this.j) + Float.intBitsToFloat((int)this.b.get(\u2603)))));
            this.b.put(\u2603, Float.floatToRawIntBits((float)((float)(d2 + this.k) + Float.intBitsToFloat((int)this.b.get(\u2603)))));
            this.b.put(\u2603, Float.floatToRawIntBits((float)((float)(d3 + this.l) + Float.intBitsToFloat((int)this.b.get(\u2603)))));
        }
    }

    private int c(int n) {
        return ((this.e - n) * this.m.g() + this.m.e()) / 4;
    }

    public void a(float f, float f2, float f3, int n) {
        \u2603 = this.c(n);
        \u2603 = -1;
        if (!this.h) {
            \u2603 = this.b.get(\u2603);
            if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                \u2603 = (int)((float)(\u2603 & 0xFF) * f);
                \u2603 = (int)((float)(\u2603 >> 8 & 0xFF) * f2);
                \u2603 = (int)((float)(\u2603 >> 16 & 0xFF) * f3);
                \u2603 &= 0xFF000000;
                \u2603 |= \u2603 << 16 | \u2603 << 8 | \u2603;
            } else {
                \u2603 = (int)((float)(\u2603 >> 24 & 0xFF) * f);
                \u2603 = (int)((float)(\u2603 >> 16 & 0xFF) * f2);
                \u2603 = (int)((float)(\u2603 >> 8 & 0xFF) * f3);
                \u2603 &= 0xFF;
                \u2603 |= \u2603 << 24 | \u2603 << 16 | \u2603 << 8;
            }
        }
        this.b.put(\u2603, \u2603);
    }

    private void b(int n, int n2) {
        \u2603 = this.c(n2);
        \u2603 = n >> 16 & 0xFF;
        \u2603 = n >> 8 & 0xFF;
        \u2603 = n & 0xFF;
        \u2603 = n >> 24 & 0xFF;
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603);
    }

    public void b(float f, float f2, float f3, int n) {
        \u2603 = this.c(n);
        \u2603 = ns.a((int)(f * 255.0f), 0, 255);
        \u2603 = ns.a((int)(f2 * 255.0f), 0, 255);
        \u2603 = ns.a((int)(f3 * 255.0f), 0, 255);
        this.a(\u2603, \u2603, \u2603, \u2603, 255);
    }

    private void a(int n, int n2, int n3, int n4, int n5) {
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            this.b.put(n, n5 << 24 | n4 << 16 | n3 << 8 | n2);
        } else {
            this.b.put(n, n2 << 24 | n3 << 16 | n4 << 8 | n5);
        }
    }

    public void c() {
        this.h = true;
    }

    public bfd a(float f, float f2, float f3, float f4) {
        return this.b((int)(f * 255.0f), (int)(f2 * 255.0f), (int)(f3 * 255.0f), (int)(f4 * 255.0f));
    }

    public bfd b(int n, int n2, int n3, int n4) {
        if (this.h) {
            return this;
        }
        \u2603 = this.e * this.m.g() + this.m.d(this.g);
        switch (this.f.a()) {
            case a: {
                this.a.putFloat(\u2603, (float)n / 255.0f);
                this.a.putFloat(\u2603 + 4, (float)n2 / 255.0f);
                this.a.putFloat(\u2603 + 8, (float)n3 / 255.0f);
                this.a.putFloat(\u2603 + 12, (float)n4 / 255.0f);
                break;
            }
            case f: 
            case g: {
                this.a.putFloat(\u2603, (float)n);
                this.a.putFloat(\u2603 + 4, (float)n2);
                this.a.putFloat(\u2603 + 8, (float)n3);
                this.a.putFloat(\u2603 + 12, (float)n4);
                break;
            }
            case d: 
            case e: {
                this.a.putShort(\u2603, (short)n);
                this.a.putShort(\u2603 + 2, (short)n2);
                this.a.putShort(\u2603 + 4, (short)n3);
                this.a.putShort(\u2603 + 6, (short)n4);
                break;
            }
            case b: 
            case c: {
                if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                    this.a.put(\u2603, (byte)n);
                    this.a.put(\u2603 + 1, (byte)n2);
                    this.a.put(\u2603 + 2, (byte)n3);
                    this.a.put(\u2603 + 3, (byte)n4);
                    break;
                }
                this.a.put(\u2603, (byte)n4);
                this.a.put(\u2603 + 1, (byte)n3);
                this.a.put(\u2603 + 2, (byte)n2);
                this.a.put(\u2603 + 3, (byte)n);
            }
        }
        this.k();
        return this;
    }

    public void a(int[] nArray) {
        this.b(nArray.length);
        this.b.position(this.j());
        this.b.put(nArray);
        this.e += nArray.length / this.m.f();
    }

    public void d() {
        ++this.e;
        this.b(this.m.f());
    }

    public bfd b(double d, double d2, double d3) {
        int n = this.e * this.m.g() + this.m.d(this.g);
        switch (this.f.a()) {
            case a: {
                this.a.putFloat(n, (float)(d + this.j));
                this.a.putFloat(n + 4, (float)(d2 + this.k));
                this.a.putFloat(n + 8, (float)(d3 + this.l));
                break;
            }
            case f: 
            case g: {
                this.a.putInt(n, Float.floatToRawIntBits((float)((float)(d + this.j))));
                this.a.putInt(n + 4, Float.floatToRawIntBits((float)((float)(d2 + this.k))));
                this.a.putInt(n + 8, Float.floatToRawIntBits((float)((float)(d3 + this.l))));
                break;
            }
            case d: 
            case e: {
                this.a.putShort(n, (short)(d + this.j));
                this.a.putShort(n + 2, (short)(d2 + this.k));
                this.a.putShort(n + 4, (short)(d3 + this.l));
                break;
            }
            case b: 
            case c: {
                this.a.put(n, (byte)(d + this.j));
                this.a.put(n + 1, (byte)(d2 + this.k));
                this.a.put(n + 2, (byte)(d3 + this.l));
            }
        }
        this.k();
        return this;
    }

    public void b(float f, float f2, float f3) {
        int n = (byte)(f * 127.0f) & 0xFF;
        \u2603 = (byte)(f2 * 127.0f) & 0xFF;
        \u2603 = (byte)(f3 * 127.0f) & 0xFF;
        \u2603 = n | \u2603 << 8 | \u2603 << 16;
        \u2603 = this.m.g() >> 2;
        \u2603 = (this.e - 4) * \u2603 + this.m.c() / 4;
        this.b.put(\u2603, \u2603);
        this.b.put(\u2603 + \u2603, \u2603);
        this.b.put(\u2603 + \u2603 * 2, \u2603);
        this.b.put(\u2603 + \u2603 * 3, \u2603);
    }

    private void k() {
        ++this.g;
        this.g %= this.m.i();
        this.f = this.m.c(this.g);
        if (this.f.b() == bmv.b.g) {
            this.k();
        }
    }

    public bfd c(float f, float f2, float f3) {
        int n = this.e * this.m.g() + this.m.d(this.g);
        switch (this.f.a()) {
            case a: {
                this.a.putFloat(n, f);
                this.a.putFloat(n + 4, f2);
                this.a.putFloat(n + 8, f3);
                break;
            }
            case f: 
            case g: {
                this.a.putInt(n, (int)f);
                this.a.putInt(n + 4, (int)f2);
                this.a.putInt(n + 8, (int)f3);
                break;
            }
            case d: 
            case e: {
                this.a.putShort(n, (short)((int)f * Short.MAX_VALUE & 0xFFFF));
                this.a.putShort(n + 2, (short)((int)f2 * Short.MAX_VALUE & 0xFFFF));
                this.a.putShort(n + 4, (short)((int)f3 * Short.MAX_VALUE & 0xFFFF));
                break;
            }
            case b: 
            case c: {
                this.a.put(n, (byte)((int)f * 127 & 0xFF));
                this.a.put(n + 1, (byte)((int)f2 * 127 & 0xFF));
                this.a.put(n + 2, (byte)((int)f3 * 127 & 0xFF));
            }
        }
        this.k();
        return this;
    }

    public void c(double d, double d2, double d3) {
        this.j = d;
        this.k = d2;
        this.l = d3;
    }

    public void e() {
        if (!this.n) {
            throw new IllegalStateException("Not building!");
        }
        this.n = false;
        this.a.position(0);
        this.a.limit(this.j() * 4);
    }

    public ByteBuffer f() {
        return this.a;
    }

    public bmu g() {
        return this.m;
    }

    public int h() {
        return this.e;
    }

    public int i() {
        return this.i;
    }

    public void a(int n) {
        for (\u2603 = 0; \u2603 < 4; ++\u2603) {
            this.b(n, \u2603 + 1);
        }
    }

    public void d(float f, float f2, float f3) {
        for (int i = 0; i < 4; ++i) {
            this.b(f, f2, f3, i + 1);
        }
    }

    public class a {
        private final int[] b;
        private final bmu c;

        public a(int[] nArray, bmu bmu2) {
            this.b = nArray;
            this.c = bmu2;
        }

        public int[] a() {
            return this.b;
        }

        public int b() {
            return this.b.length / this.c.f();
        }

        public bmu c() {
            return this.c;
        }
    }
}
