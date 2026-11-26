/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
public class f {
    public static final char[] a = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':'};

    public static boolean a(char c) {
        return c != '\u00a7' && c >= ' ' && c != '\u007f';
    }

    public static String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (!f.a(c)) continue;
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
