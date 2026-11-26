/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.text.DecimalFormat
 *  java.text.NumberFormat
 *  java.util.Locale
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class mw {
    public final String e;
    private final eu a;
    public boolean f;
    private final mx b;
    private final auu c;
    private Class<? extends mz> d;
    private static NumberFormat k = NumberFormat.getIntegerInstance((Locale)Locale.US);
    public static mx g = new mx(){

        @Override
        public String a(int n) {
            return k.format((long)n);
        }
    };
    private static DecimalFormat l = new DecimalFormat("########0.00");
    public static mx h = new mx(){

        @Override
        public String a(int n) {
            double d = (double)n / 20.0;
            \u2603 = d / 60.0;
            \u2603 = \u2603 / 60.0;
            \u2603 = \u2603 / 24.0;
            \u2603 = \u2603 / 365.0;
            if (\u2603 > 0.5) {
                return l.format(\u2603) + " y";
            }
            if (\u2603 > 0.5) {
                return l.format(\u2603) + " d";
            }
            if (\u2603 > 0.5) {
                return l.format(\u2603) + " h";
            }
            if (\u2603 > 0.5) {
                return l.format(\u2603) + " m";
            }
            return d + " s";
        }
    };
    public static mx i = new mx(){

        @Override
        public String a(int n) {
            double d = (double)n / 100.0;
            \u2603 = d / 1000.0;
            if (\u2603 > 0.5) {
                return l.format(\u2603) + " km";
            }
            if (d > 0.5) {
                return l.format(d) + " m";
            }
            return n + " cm";
        }
    };
    public static mx j = new mx(){

        @Override
        public String a(int n) {
            return l.format((double)n * 0.1);
        }
    };

    public mw(String string, eu eu2, mx mx2) {
        this.e = string;
        this.a = eu2;
        this.b = mx2;
        this.c = new auv(this);
        auu.a.put((Object)this.c.a(), (Object)this.c);
    }

    public mw(String string, eu eu2) {
        this(string, eu2, g);
    }

    public mw i() {
        this.f = true;
        return this;
    }

    public mw h() {
        if (na.a.containsKey((Object)this.e)) {
            throw new RuntimeException("Duplicate stat id: \"" + ((mw)na.a.get((Object)this.e)).a + "\" and \"" + this.a + "\" at id " + this.e);
        }
        na.b.add((Object)this);
        na.a.put((Object)this.e, (Object)this);
        return this;
    }

    public boolean d() {
        return false;
    }

    public String a(int n) {
        return this.b.a(n);
    }

    public eu e() {
        eu eu2 = this.a.f();
        eu2.b().a(a.h);
        eu2.b().a(new ew(ew.a.b, new fa(this.e)));
        return eu2;
    }

    public eu j() {
        eu eu2 = this.e();
        \u2603 = new fa("[").a(eu2).a("]");
        \u2603.a(eu2.b());
        return \u2603;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        mw mw2 = (mw)object;
        return this.e.equals((Object)mw2.e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        return "Stat{id=" + this.e + ", nameId=" + this.a + ", awardLocallyOnly=" + this.f + ", formatter=" + this.b + ", objectiveCriteria=" + this.c + '}';
    }

    public auu k() {
        return this.c;
    }

    public Class<? extends mz> l() {
        return this.d;
    }

    public mw b(Class<? extends mz> clazz) {
        this.d = clazz;
        return this;
    }
}
