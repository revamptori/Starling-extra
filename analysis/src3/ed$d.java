/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Iterables
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.regex.Pattern
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import java.util.regex.Pattern;

static class ed.d
extends ed.a {
    private static final Pattern c = Pattern.compile((String)"[-+]?[0-9]*\\.?[0-9]+[d|D]");
    private static final Pattern d = Pattern.compile((String)"[-+]?[0-9]*\\.?[0-9]+[f|F]");
    private static final Pattern e = Pattern.compile((String)"[-+]?[0-9]+[b|B]");
    private static final Pattern f = Pattern.compile((String)"[-+]?[0-9]+[l|L]");
    private static final Pattern g = Pattern.compile((String)"[-+]?[0-9]+[s|S]");
    private static final Pattern h = Pattern.compile((String)"[-+]?[0-9]+");
    private static final Pattern i = Pattern.compile((String)"[-+]?[0-9]*\\.?[0-9]+");
    private static final Splitter j = Splitter.on((char)',').omitEmptyStrings();
    protected String b;

    public ed.d(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    @Override
    public eb a() throws ec {
        try {
            if (c.matcher((CharSequence)this.b).matches()) {
                return new dp(Double.parseDouble((String)this.b.substring(0, this.b.length() - 1)));
            }
            if (d.matcher((CharSequence)this.b).matches()) {
                return new dr(Float.parseFloat((String)this.b.substring(0, this.b.length() - 1)));
            }
            if (e.matcher((CharSequence)this.b).matches()) {
                return new dm(Byte.parseByte((String)this.b.substring(0, this.b.length() - 1)));
            }
            if (f.matcher((CharSequence)this.b).matches()) {
                return new dv(Long.parseLong((String)this.b.substring(0, this.b.length() - 1)));
            }
            if (g.matcher((CharSequence)this.b).matches()) {
                return new dz(Short.parseShort((String)this.b.substring(0, this.b.length() - 1)));
            }
            if (h.matcher((CharSequence)this.b).matches()) {
                return new dt(Integer.parseInt((String)this.b));
            }
            if (i.matcher((CharSequence)this.b).matches()) {
                return new dp(Double.parseDouble((String)this.b));
            }
            if (this.b.equalsIgnoreCase("true") || this.b.equalsIgnoreCase("false")) {
                return new dm(Boolean.parseBoolean((String)this.b) ? (byte)1 : 0);
            }
        }
        catch (NumberFormatException numberFormatException) {
            this.b = this.b.replaceAll("\\\\\"", "\"");
            return new ea(this.b);
        }
        if (this.b.startsWith("[") && this.b.endsWith("]")) {
            String string = this.b.substring(1, this.b.length() - 1);
            String[] \u26032 = (String[])Iterables.toArray((Iterable)j.split((CharSequence)string), String.class);
            try {
                int[] nArray = new int[\u26032.length];
                for (int i = 0; i < \u26032.length; ++i) {
                    nArray[i] = Integer.parseInt((String)\u26032[i].trim());
                }
                return new ds(nArray);
            }
            catch (NumberFormatException numberFormatException) {
                return new ea(this.b);
            }
        }
        if (this.b.startsWith("\"") && this.b.endsWith("\"")) {
            this.b = this.b.substring(1, this.b.length() - 1);
        }
        this.b = this.b.replaceAll("\\\\\"", "\"");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.b.length(); ++i) {
            if (i < this.b.length() - 1 && this.b.charAt(i) == '\\' && this.b.charAt(i + 1) == '\\') {
                stringBuilder.append('\\');
                ++i;
                continue;
            }
            stringBuilder.append(this.b.charAt(i));
        }
        return new ea(stringBuilder.toString());
    }
}
