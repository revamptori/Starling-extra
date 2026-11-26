/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  org.lwjgl.util.vector.Vector3f
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.lwjgl.util.vector.Vector3f;

public class bgp {
    public static final List<String> a = Lists.newArrayList((Object[])new String[]{"layer0", "layer1", "layer2", "layer3", "layer4"});

    public bgl a(bmh bmh2, bgl bgl2) {
        HashMap hashMap = Maps.newHashMap();
        ArrayList \u26032 = Lists.newArrayList();
        for (int i = 0; i < a.size() && bgl2.b(\u2603 = (String)a.get(i)); ++i) {
            String string = bgl2.c(\u2603);
            hashMap.put((Object)\u2603, (Object)string);
            bmi \u26033 = bmh2.a(new jy(string).toString());
            \u26032.addAll(this.a(i, \u2603, \u26033));
        }
        if (\u26032.isEmpty()) {
            return null;
        }
        hashMap.put((Object)"particle", (Object)(bgl2.b("particle") ? bgl2.c("particle") : (String)hashMap.get((Object)"layer0")));
        return new bgl((List<bgh>)\u26032, (Map<String, String>)hashMap, false, false, bgl2.g());
    }

    private List<bgh> a(int n, String string, bmi bmi2) {
        HashMap hashMap = Maps.newHashMap();
        hashMap.put((Object)cq.d, (Object)new bgi(null, n, string, new bgk(new float[]{0.0f, 0.0f, 16.0f, 16.0f}, 0)));
        hashMap.put((Object)cq.c, (Object)new bgi(null, n, string, new bgk(new float[]{16.0f, 0.0f, 0.0f, 16.0f}, 0)));
        ArrayList \u26032 = Lists.newArrayList();
        \u26032.add((Object)new bgh(new Vector3f(0.0f, 0.0f, 7.5f), new Vector3f(16.0f, 16.0f, 8.5f), (Map<cq, bgi>)hashMap, null, true));
        \u26032.addAll(this.a(bmi2, string, n));
        return \u26032;
    }

    private List<bgh> a(bmi bmi2, String string, int n) {
        float f = bmi2.c();
        \u2603 = bmi2.d();
        ArrayList \u26032 = Lists.newArrayList();
        for (a a2 : this.a(bmi2)) {
            float f2 = 0.0f;
            \u2603 = 0.0f;
            \u2603 = 0.0f;
            \u2603 = 0.0f;
            \u2603 = 0.0f;
            \u2603 = 0.0f;
            \u2603 = 0.0f;
            \u2603 = 0.0f;
            \u2603 = 0.0f;
            \u2603 = 0.0f;
            \u2603 = a2.b();
            \u2603 = a2.c();
            \u2603 = a2.d();
            b \u26033 = a2.a();
            switch (\u26033) {
                case a: {
                    f2 = \u2603 = \u2603;
                    \u2603 = \u2603 = \u2603 + 1.0f;
                    \u2603 = \u2603 = \u2603;
                    \u2603 = \u2603 = \u2603;
                    \u2603 = 16.0f / f;
                    \u2603 = 16.0f / (\u2603 - 1.0f);
                    break;
                }
                case b: {
                    \u2603 = \u2603 = \u2603;
                    f2 = \u2603 = \u2603;
                    \u2603 = \u2603 = \u2603 + 1.0f;
                    \u2603 = \u2603 + 1.0f;
                    \u2603 = \u2603 + 1.0f;
                    \u2603 = 16.0f / f;
                    \u2603 = 16.0f / (\u2603 - 1.0f);
                    break;
                }
                case c: {
                    f2 = \u2603 = \u2603;
                    \u2603 = \u2603 = \u2603;
                    \u2603 = \u2603 = \u2603;
                    \u2603 = \u2603 = \u2603 + 1.0f;
                    \u2603 = 16.0f / (f - 1.0f);
                    \u2603 = 16.0f / \u2603;
                    break;
                }
                case d: {
                    \u2603 = \u2603 = \u2603;
                    f2 = \u2603 + 1.0f;
                    \u2603 = \u2603 + 1.0f;
                    \u2603 = \u2603 = \u2603;
                    \u2603 = \u2603 = \u2603 + 1.0f;
                    \u2603 = 16.0f / (f - 1.0f);
                    \u2603 = 16.0f / \u2603;
                }
            }
            \u2603 = 16.0f / f;
            \u2603 = 16.0f / \u2603;
            f2 *= \u2603;
            \u2603 *= \u2603;
            \u2603 *= \u2603;
            \u2603 *= \u2603;
            \u2603 = 16.0f - \u2603;
            \u2603 = 16.0f - \u2603;
            HashMap \u26034 = Maps.newHashMap();
            \u26034.put((Object)\u26033.a(), (Object)new bgi(null, n, string, new bgk(new float[]{\u2603 *= \u2603, \u2603 *= \u2603, \u2603 *= \u2603, \u2603 *= \u2603}, 0)));
            switch (\u26033) {
                case a: {
                    \u26032.add((Object)new bgh(new Vector3f(f2, \u2603, 7.5f), new Vector3f(\u2603, \u2603, 8.5f), (Map<cq, bgi>)\u26034, null, true));
                    break;
                }
                case b: {
                    \u26032.add((Object)new bgh(new Vector3f(f2, \u2603, 7.5f), new Vector3f(\u2603, \u2603, 8.5f), (Map<cq, bgi>)\u26034, null, true));
                    break;
                }
                case c: {
                    \u26032.add((Object)new bgh(new Vector3f(f2, \u2603, 7.5f), new Vector3f(f2, \u2603, 8.5f), (Map<cq, bgi>)\u26034, null, true));
                    break;
                }
                case d: {
                    \u26032.add((Object)new bgh(new Vector3f(\u2603, \u2603, 7.5f), new Vector3f(\u2603, \u2603, 8.5f), (Map<cq, bgi>)\u26034, null, true));
                }
            }
        }
        return \u26032;
    }

    private List<a> a(bmi bmi2) {
        int n = bmi2.c();
        \u2603 = bmi2.d();
        ArrayList \u26032 = Lists.newArrayList();
        for (\u2603 = 0; \u2603 < bmi2.k(); ++\u2603) {
            int[] nArray = bmi2.a(\u2603)[0];
            for (int i = 0; i < \u2603; ++i) {
                for (\u2603 = 0; \u2603 < n; ++\u2603) {
                    boolean bl = !this.a(nArray, \u2603, i, n, \u2603);
                    this.a(b.a, (List<a>)\u26032, nArray, \u2603, i, n, \u2603, bl);
                    this.a(b.b, (List<a>)\u26032, nArray, \u2603, i, n, \u2603, bl);
                    this.a(b.c, (List<a>)\u26032, nArray, \u2603, i, n, \u2603, bl);
                    this.a(b.d, (List<a>)\u26032, nArray, \u2603, i, n, \u2603, bl);
                }
            }
        }
        return \u26032;
    }

    private void a(b b2, List<a> list, int[] nArray, int n, int n2, int n3, int n4, boolean bl) {
        boolean bl2 = \u2603 = this.a(nArray, n + b2.b(), n2 + b2.c(), n3, n4) && bl;
        if (\u2603) {
            this.a(list, b2, n, n2);
        }
    }

    private void a(List<a> list, b b2, int n, int n2) {
        a a2 = null;
        for (a a3 : list) {
            if (a3.a() != b2) continue;
            int n3 = \u2603 = b2.d() ? n2 : n;
            if (a3.d() != \u2603) continue;
            a2 = a3;
            break;
        }
        int \u26032 = b2.d() ? n2 : n;
        int n4 = \u2603 = b2.d() ? n : n2;
        if (a2 == null) {
            list.add((Object)new a(b2, \u2603, \u26032));
        } else {
            a2.a(\u2603);
        }
    }

    private boolean a(int[] nArray, int n, int n2, int n3, int n4) {
        if (n < 0 || n2 < 0 || n >= n3 || n2 >= n4) {
            return true;
        }
        return (nArray[n2 * n3 + n] >> 24 & 0xFF) == 0;
    }

    static class a {
        private final b a;
        private int b;
        private int c;
        private final int d;

        public a(b b2, int n, int n2) {
            this.a = b2;
            this.b = n;
            this.c = n;
            this.d = n2;
        }

        public void a(int n) {
            if (n < this.b) {
                this.b = n;
            } else if (n > this.c) {
                this.c = n;
            }
        }

        public b a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public int d() {
            return this.d;
        }
    }

    static enum b {
        a(cq.b, 0, -1),
        b(cq.a, 0, 1),
        c(cq.f, -1, 0),
        d(cq.e, 1, 0);

        private final cq e;
        private final int f;
        private final int g;

        private b(cq cq2, int n2, int n3) {
            this.e = cq2;
            this.f = n2;
            this.g = n3;
        }

        public cq a() {
            return this.e;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.g;
        }

        private boolean d() {
            return this == b || this == a;
        }
    }
}
