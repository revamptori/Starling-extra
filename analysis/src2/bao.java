/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.properties.PropertyMap
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.net.Proxy
 */
import com.mojang.authlib.properties.PropertyMap;
import java.io.File;
import java.net.Proxy;

public class bao {
    public final e a;
    public final a b;
    public final b c;
    public final c d;
    public final d e;

    public bao(e e2, a a2, b b2, c c2, d d2) {
        this.a = e2;
        this.b = a2;
        this.c = b2;
        this.d = c2;
        this.e = d2;
    }

    public static class d {
        public final String a;
        public final int b;

        public d(String string, int n) {
            this.a = string;
            this.b = n;
        }
    }

    public static class b {
        public final File a;
        public final File b;
        public final File c;
        public final String d;

        public b(File file, File file2, File file3, String string) {
            this.a = file;
            this.b = file2;
            this.c = file3;
            this.d = string;
        }
    }

    public static class a {
        public final int a;
        public final int b;
        public final boolean c;
        public final boolean d;

        public a(int n, int n2, boolean bl, boolean bl2) {
            this.a = n;
            this.b = n2;
            this.c = bl;
            this.d = bl2;
        }
    }

    public static class e {
        public final avm a;
        public final PropertyMap b;
        public final PropertyMap c;
        public final Proxy d;

        public e(avm avm2, PropertyMap propertyMap, PropertyMap propertyMap2, Proxy proxy) {
            this.a = avm2;
            this.b = propertyMap;
            this.c = propertyMap2;
            this.d = proxy;
        }
    }

    public static class c {
        public final boolean a;
        public final String b;

        public c(boolean bl, String string) {
            this.a = bl;
            this.b = string;
        }
    }
}
