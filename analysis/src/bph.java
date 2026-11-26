/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.List;

public class bph {
    private final List<a> a = Lists.newArrayList();
    private boolean b;
    private bpg c;

    public List<a> a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public bpg c() {
        return this.c;
    }

    public void a(bpg bpg2) {
        this.c = bpg2;
    }

    public static class bph$a {
        private String a;
        private float b = 1.0f;
        private float c = 1.0f;
        private int d = 1;
        private a e = a.a;
        private boolean f = false;

        public String a() {
            return this.a;
        }

        public void a(String string) {
            this.a = string;
        }

        public float b() {
            return this.b;
        }

        public void a(float f) {
            this.b = f;
        }

        public float c() {
            return this.c;
        }

        public void b(float f) {
            this.c = f;
        }

        public int d() {
            return this.d;
        }

        public void a(int n) {
            this.d = n;
        }

        public a e() {
            return this.e;
        }

        public void a(a a2) {
            this.e = a2;
        }

        public boolean f() {
            return this.f;
        }

        public void a(boolean bl) {
            this.f = bl;
        }

        public static enum a {
            a("file"),
            b("event");

            private final String c;

            private a(String string2) {
                this.c = string2;
            }

            public static a a(String string) {
                for (a a2 : bph$a$a.values()) {
                    if (!a2.c.equals((Object)string)) continue;
                    return a2;
                }
                return null;
            }
        }
    }
}
