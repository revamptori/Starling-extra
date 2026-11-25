/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  java.lang.Object
 *  java.lang.String
 *  org.lwjgl.opengl.GL14
 */
import com.google.gson.JsonObject;
import org.lwjgl.opengl.GL14;

public class blo {
    private static blo a = null;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private final boolean h;

    private blo(boolean bl, boolean bl2, int n, int n2, int n3, int n4, int n5) {
        this.g = bl;
        this.b = n;
        this.d = n2;
        this.c = n3;
        this.e = n4;
        this.h = bl2;
        this.f = n5;
    }

    public blo() {
        this(false, true, 1, 0, 1, 0, 32774);
    }

    public blo(int n, int n2, int n3) {
        this(false, false, n, n2, n, n2, n3);
    }

    public blo(int n, int n2, int n3, int n4, int n5) {
        this(true, false, n, n2, n3, n4, n5);
    }

    public void a() {
        if (this.equals(a)) {
            return;
        }
        if (a == null || this.h != a.b()) {
            a = this;
            if (this.h) {
                bfl.k();
                return;
            }
            bfl.l();
        }
        GL14.glBlendEquation((int)this.f);
        if (this.g) {
            bfl.a(this.b, this.d, this.c, this.e);
        } else {
            bfl.b(this.b, this.d);
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof blo)) {
            return false;
        }
        blo blo2 = (blo)object;
        if (this.f != blo2.f) {
            return false;
        }
        if (this.e != blo2.e) {
            return false;
        }
        if (this.d != blo2.d) {
            return false;
        }
        if (this.h != blo2.h) {
            return false;
        }
        if (this.g != blo2.g) {
            return false;
        }
        if (this.c != blo2.c) {
            return false;
        }
        return this.b == blo2.b;
    }

    public int hashCode() {
        int n2 = this.b;
        n2 = 31 * n2 + this.c;
        n2 = 31 * n2 + this.d;
        n2 = 31 * n2 + this.e;
        n2 = 31 * n2 + this.f;
        n2 = 31 * n2 + (this.g ? 1 : 0);
        n2 = 31 * n2 + (this.h ? 1 : 0);
        return n2;
    }

    public boolean b() {
        return this.h;
    }

    public static blo a(JsonObject jsonObject) {
        if (jsonObject == null) {
            return new blo();
        }
        int n2 = 32774;
        \u2603 = 1;
        \u2603 = 0;
        \u2603 = 1;
        \u2603 = 0;
        boolean \u26032 = true;
        boolean \u26033 = false;
        if (ni.a(jsonObject, "func") && (n2 = blo.a(jsonObject.get("func").getAsString())) != 32774) {
            \u26032 = false;
        }
        if (ni.a(jsonObject, "srcrgb") && (\u2603 = blo.b(jsonObject.get("srcrgb").getAsString())) != 1) {
            \u26032 = false;
        }
        if (ni.a(jsonObject, "dstrgb") && (\u2603 = blo.b(jsonObject.get("dstrgb").getAsString())) != 0) {
            \u26032 = false;
        }
        if (ni.a(jsonObject, "srcalpha")) {
            \u2603 = blo.b(jsonObject.get("srcalpha").getAsString());
            if (\u2603 != 1) {
                \u26032 = false;
            }
            \u26033 = true;
        }
        if (ni.a(jsonObject, "dstalpha")) {
            \u2603 = blo.b(jsonObject.get("dstalpha").getAsString());
            if (\u2603 != 0) {
                \u26032 = false;
            }
            \u26033 = true;
        }
        if (\u26032) {
            return new blo();
        }
        if (\u26033) {
            return new blo(\u2603, \u2603, \u2603, \u2603, n2);
        }
        return new blo(\u2603, \u2603, n2);
    }

    private static int a(String string) {
        \u2603 = string.trim().toLowerCase();
        if (\u2603.equals((Object)"add")) {
            return 32774;
        }
        if (\u2603.equals((Object)"subtract")) {
            return 32778;
        }
        if (\u2603.equals((Object)"reversesubtract")) {
            return 32779;
        }
        if (\u2603.equals((Object)"reverse_subtract")) {
            return 32779;
        }
        if (\u2603.equals((Object)"min")) {
            return 32775;
        }
        if (\u2603.equals((Object)"max")) {
            return 32776;
        }
        return 32774;
    }

    private static int b(String string) {
        \u2603 = string.trim().toLowerCase();
        \u2603 = \u2603.replaceAll("_", "");
        \u2603 = \u2603.replaceAll("one", "1");
        \u2603 = \u2603.replaceAll("zero", "0");
        if ((\u2603 = \u2603.replaceAll("minus", "-")).equals((Object)"0")) {
            return 0;
        }
        if (\u2603.equals((Object)"1")) {
            return 1;
        }
        if (\u2603.equals((Object)"srccolor")) {
            return 768;
        }
        if (\u2603.equals((Object)"1-srccolor")) {
            return 769;
        }
        if (\u2603.equals((Object)"dstcolor")) {
            return 774;
        }
        if (\u2603.equals((Object)"1-dstcolor")) {
            return 775;
        }
        if (\u2603.equals((Object)"srcalpha")) {
            return 770;
        }
        if (\u2603.equals((Object)"1-srcalpha")) {
            return 771;
        }
        if (\u2603.equals((Object)"dstalpha")) {
            return 772;
        }
        if (\u2603.equals((Object)"1-dstalpha")) {
            return 773;
        }
        return -1;
    }
}
