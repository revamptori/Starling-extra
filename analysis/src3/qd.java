/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.internal.ThreadLocalRandom
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Random
 *  java.util.UUID
 *  org.apache.commons.lang3.Validate
 */
import io.netty.util.internal.ThreadLocalRandom;
import java.util.Random;
import java.util.UUID;
import org.apache.commons.lang3.Validate;

public class qd {
    private final double a;
    private final int b;
    private final String c;
    private final UUID d;
    private boolean e = true;

    public qd(String string, double d, int n) {
        this(ns.a((Random)ThreadLocalRandom.current()), string, d, n);
    }

    public qd(UUID uUID, String string, double d, int n) {
        this.d = uUID;
        this.c = string;
        this.a = d;
        this.b = n;
        Validate.notEmpty((CharSequence)string, (String)"Modifier name cannot be empty", (Object[])new Object[0]);
        Validate.inclusiveBetween((long)0L, (long)2L, (long)n, (String)"Invalid operation");
    }

    public UUID a() {
        return this.d;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public double d() {
        return this.a;
    }

    public boolean e() {
        return this.e;
    }

    public qd a(boolean bl) {
        this.e = bl;
        return this;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        qd qd2 = (qd)object;
        return !(this.d != null ? !this.d.equals((Object)qd2.d) : qd2.d != null);
    }

    public int hashCode() {
        return this.d != null ? this.d.hashCode() : 0;
    }

    public String toString() {
        return "AttributeModifier{amount=" + this.a + ", operation=" + this.b + ", name='" + this.c + '\'' + ", id=" + this.d + ", serialize=" + this.e + '}';
    }
}
