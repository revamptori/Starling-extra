/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public class bcr {
    private bcg[] h;
    private bbs[] i;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public String g;

    public bcr(bct bct2, int n, int n2, float f, float f2, float f3, int n3, int n4, int n5, float f4) {
        this(bct2, n, n2, f, f2, f3, n3, n4, n5, f4, bct2.i);
    }

    public bcr(bct bct2, int n, int n2, float f, float f2, float f3, int n3, int n4, int n5, float f4, boolean bl) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f + (float)n3;
        this.e = f2 + (float)n4;
        this.f = f3 + (float)n5;
        this.h = new bcg[8];
        this.i = new bbs[6];
        float f5 = f + (float)n3;
        \u2603 = f2 + (float)n4;
        \u2603 = f3 + (float)n5;
        f -= f4;
        f2 -= f4;
        f3 -= f4;
        f5 += f4;
        \u2603 += f4;
        \u2603 += f4;
        if (bl) {
            \u2603 = f5;
            f5 = f;
            f = \u2603;
        }
        bcg \u26032 = new bcg(f, f2, f3, 0.0f, 0.0f);
        bcg \u26033 = new bcg(f5, f2, f3, 0.0f, 8.0f);
        bcg \u26034 = new bcg(f5, \u2603, f3, 8.0f, 8.0f);
        bcg \u26035 = new bcg(f, \u2603, f3, 8.0f, 0.0f);
        bcg \u26036 = new bcg(f, f2, \u2603, 0.0f, 0.0f);
        bcg \u26037 = new bcg(f5, f2, \u2603, 0.0f, 8.0f);
        bcg \u26038 = new bcg(f5, \u2603, \u2603, 8.0f, 8.0f);
        bcg \u26039 = new bcg(f, \u2603, \u2603, 8.0f, 0.0f);
        this.h[0] = \u26032;
        this.h[1] = \u26033;
        this.h[2] = \u26034;
        this.h[3] = \u26035;
        this.h[4] = \u26036;
        this.h[5] = \u26037;
        this.h[6] = \u26038;
        this.h[7] = \u26039;
        this.i[0] = new bbs(new bcg[]{\u26037, \u26033, \u26034, \u26038}, n + n5 + n3, n2 + n5, n + n5 + n3 + n5, n2 + n5 + n4, bct2.a, bct2.b);
        this.i[1] = new bbs(new bcg[]{\u26032, \u26036, \u26039, \u26035}, n, n2 + n5, n + n5, n2 + n5 + n4, bct2.a, bct2.b);
        this.i[2] = new bbs(new bcg[]{\u26037, \u26036, \u26032, \u26033}, n + n5, n2, n + n5 + n3, n2 + n5, bct2.a, bct2.b);
        this.i[3] = new bbs(new bcg[]{\u26034, \u26035, \u26039, \u26038}, n + n5 + n3, n2 + n5, n + n5 + n3 + n3, n2, bct2.a, bct2.b);
        this.i[4] = new bbs(new bcg[]{\u26033, \u26032, \u26035, \u26034}, n + n5, n2 + n5, n + n5 + n3, n2 + n5 + n4, bct2.a, bct2.b);
        this.i[5] = new bbs(new bcg[]{\u26036, \u26037, \u26038, \u26039}, n + n5 + n3 + n5, n2 + n5, n + n5 + n3 + n5 + n3, n2 + n5 + n4, bct2.a, bct2.b);
        if (bl) {
            for (int i = 0; i < this.i.length; ++i) {
                this.i[i].a();
            }
        }
    }

    public void a(bfd bfd2, float f) {
        for (int i = 0; i < this.i.length; ++i) {
            this.i[i].a(bfd2, f);
        }
    }

    public bcr a(String string) {
        this.g = string;
        return this;
    }
}
