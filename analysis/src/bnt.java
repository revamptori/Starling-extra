/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 *  java.util.IllegalFormatException
 *  java.util.List
 *  java.util.Map
 *  java.util.regex.Pattern
 *  org.apache.commons.io.Charsets
 *  org.apache.commons.io.IOUtils
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class bnt {
    private static final Splitter b = Splitter.on((char)'=').limit(2);
    private static final Pattern c = Pattern.compile((String)"%(\\d+\\$)?[\\d\\.]*[df]");
    Map<String, String> a = Maps.newHashMap();
    private boolean d;

    public synchronized void a(bni bni2, List<String> list) {
        this.a.clear();
        for (String string : list) {
            \u2603 = String.format((String)"lang/%s.lang", (Object[])new Object[]{string});
            for (String string2 : bni2.a()) {
                try {
                    this.a(bni2.b(new jy(string2, \u2603)));
                }
                catch (IOException iOException) {}
            }
        }
        this.b();
    }

    public boolean a() {
        return this.d;
    }

    private void b() {
        this.d = false;
        int n = 0;
        \u2603 = 0;
        for (String string : this.a.values()) {
            int n2 = string.length();
            \u2603 += n2;
            for (\u2603 = 0; \u2603 < n2; ++\u2603) {
                if (string.charAt(\u2603) < '\u0100') continue;
                ++n;
            }
        }
        float \u26032 = (float)n / (float)\u2603;
        this.d = (double)\u26032 > 0.1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(List<bnh> list) throws IOException {
        for (bnh bnh2 : list) {
            InputStream inputStream = bnh2.b();
            try {
                this.a(inputStream);
            }
            finally {
                IOUtils.closeQuietly((InputStream)inputStream);
            }
        }
    }

    private void a(InputStream inputStream) throws IOException {
        for (String string : IOUtils.readLines((InputStream)inputStream, (Charset)Charsets.UTF_8)) {
            if (string.isEmpty() || string.charAt(0) == '#' || (\u2603 = (String[])Iterables.toArray((Iterable)b.split((CharSequence)string), String.class)) == null || \u2603.length != 2) continue;
            \u2603 = \u2603[0];
            \u2603 = c.matcher((CharSequence)\u2603[1]).replaceAll("%$1s");
            this.a.put((Object)\u2603, (Object)\u2603);
        }
    }

    private String b(String string) {
        \u2603 = (String)this.a.get((Object)string);
        return \u2603 == null ? string : \u2603;
    }

    public String a(String string, Object[] objectArray) {
        String string2 = this.b(string);
        try {
            return String.format((String)string2, (Object[])objectArray);
        }
        catch (IllegalFormatException \u26032) {
            return "Format error: " + string2;
        }
    }
}
