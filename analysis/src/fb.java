/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.IllegalFormatException
 *  java.util.Iterator
 *  java.util.List
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fb
extends es {
    private final String d;
    private final Object[] e;
    private final Object f = new Object();
    private long g = -1L;
    List<eu> b = Lists.newArrayList();
    public static final Pattern c = Pattern.compile((String)"%(?:(\\d+)\\$)?([A-Za-z%]|$)");

    public fb(String string, Object ... objectArray) {
        this.d = string;
        this.e = objectArray;
        for (Object object : objectArray) {
            if (!(object instanceof eu)) continue;
            ((eu)object).b().a(this.b());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    synchronized void g() {
        Object object = this.f;
        synchronized (object) {
            long l = di.a();
            if (l == this.g) {
                return;
            }
            this.g = l;
            this.b.clear();
        }
        try {
            this.b(di.a(this.d));
        }
        catch (fc fc2) {
            this.b.clear();
            try {
                this.b(di.b(this.d));
            }
            catch (fc fc3) {
                throw fc2;
            }
        }
    }

    protected void b(String string) {
        boolean bl = false;
        Matcher \u26032 = c.matcher((CharSequence)string);
        int \u26033 = 0;
        int \u26034 = 0;
        try {
            while (\u26032.find(\u26034)) {
                Object object;
                int n = \u26032.start();
                \u2603 = \u26032.end();
                if (n > \u26034) {
                    object = new fa(String.format((String)string.substring(\u26034, n), (Object[])new Object[0]));
                    ((es)object).b().a(this.b());
                    this.b.add(object);
                }
                object = \u26032.group(2);
                String \u26035 = string.substring(n, \u2603);
                if ("%".equals(object) && "%%".equals((Object)\u26035)) {
                    \u2603 = new fa("%");
                    ((es)\u2603).b().a(this.b());
                    this.b.add(\u2603);
                } else if ("s".equals(object)) {
                    \u2603 = \u26032.group(1);
                    int n2 = \u2603 = \u2603 != null ? Integer.parseInt((String)\u2603) - 1 : \u26033++;
                    if (\u2603 < this.e.length) {
                        this.b.add((Object)this.a(\u2603));
                    }
                } else {
                    throw new fc(this, "Unsupported format: '" + \u26035 + "'");
                }
                \u26034 = \u2603;
            }
            if (\u26034 < string.length()) {
                fa \u26036 = new fa(String.format((String)string.substring(\u26034), (Object[])new Object[0]));
                \u26036.b().a(this.b());
                this.b.add((Object)\u26036);
            }
        }
        catch (IllegalFormatException illegalFormatException) {
            throw new fc(this, illegalFormatException);
        }
    }

    private eu a(int n) {
        eu \u26032;
        if (n >= this.e.length) {
            throw new fc(this, n);
        }
        Object object = this.e[n];
        if (object instanceof eu) {
            \u26032 = (eu)object;
        } else {
            \u26032 = new fa(object == null ? "null" : object.toString());
            \u26032.b().a(this.b());
        }
        return \u26032;
    }

    @Override
    public eu a(ez ez2) {
        super.a(ez2);
        for (Object object : this.e) {
            if (!(object instanceof eu)) continue;
            ((eu)object).b().a(this.b());
        }
        if (this.g > -1L) {
            for (eu eu2 : this.b) {
                eu2.b().a(ez2);
            }
        }
        return this;
    }

    @Override
    public Iterator<eu> iterator() {
        this.g();
        return Iterators.concat(fb.a(this.b), fb.a((Iterable<eu>)this.a));
    }

    @Override
    public String e() {
        this.g();
        StringBuilder stringBuilder = new StringBuilder();
        for (eu eu2 : this.b) {
            stringBuilder.append(eu2.e());
        }
        return stringBuilder.toString();
    }

    public fb h() {
        Object[] objectArray = new Object[this.e.length];
        for (int i = 0; i < this.e.length; ++i) {
            objectArray[i] = this.e[i] instanceof eu ? ((eu)this.e[i]).f() : this.e[i];
        }
        fb \u26032 = new fb(this.d, objectArray);
        \u26032.a(this.b().m());
        for (eu eu2 : this.a()) {
            \u26032.a(eu2.f());
        }
        return \u26032;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof fb) {
            fb fb2 = (fb)object;
            return Arrays.equals((Object[])this.e, (Object[])fb2.e) && this.d.equals((Object)fb2.d) && super.equals(object);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + this.d.hashCode();
        n = 31 * n + Arrays.hashCode((Object[])this.e);
        return n;
    }

    @Override
    public String toString() {
        return "TranslatableComponent{key='" + this.d + '\'' + ", args=" + Arrays.toString((Object[])this.e) + ", siblings=" + this.a + ", style=" + this.b() + '}';
    }

    public String i() {
        return this.d;
    }

    public Object[] j() {
        return this.e;
    }

    @Override
    public /* synthetic */ eu f() {
        return this.h();
    }
}
