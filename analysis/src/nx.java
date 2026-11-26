/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.regex.Pattern
 *  org.apache.commons.lang3.StringUtils
 */
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class nx {
    private static final Pattern a = Pattern.compile((String)"(?i)\\u00A7[0-9A-FK-OR]");

    public static String a(int n) {
        \u2603 = n / 20;
        \u2603 = \u2603 / 60;
        if ((\u2603 %= 60) < 10) {
            return \u2603 + ":0" + \u2603;
        }
        return \u2603 + ":" + \u2603;
    }

    public static String a(String string) {
        return a.matcher((CharSequence)string).replaceAll("");
    }

    public static boolean b(String string) {
        return StringUtils.isEmpty((CharSequence)string);
    }
}
