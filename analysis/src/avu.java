/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class avu {
    public static String a(String string, boolean bl) {
        if (bl || ave.A().t.n) {
            return string;
        }
        return a.a(string);
    }

    public static List<eu> a(eu eu2, int n, avn avn2, boolean bl, boolean bl2) {
        int n2 = 0;
        fa \u26032 = new fa("");
        ArrayList \u26033 = Lists.newArrayList();
        ArrayList \u26034 = Lists.newArrayList((Iterable)eu2);
        for (\u2603 = 0; \u2603 < \u26034.size(); ++\u2603) {
            String \u26037;
            eu eu3 = (eu)\u26034.get(\u2603);
            String \u26035 = eu3.e();
            boolean \u26036 = false;
            if (\u26035.contains((CharSequence)"\n")) {
                int n3 = \u26035.indexOf(10);
                \u26037 = \u26035.substring(n3 + 1);
                \u26035 = \u26035.substring(0, n3 + 1);
                fa \u26038 = new fa(\u26037);
                \u26038.a(eu3.b().m());
                \u26034.add(\u2603 + 1, (Object)\u26038);
                \u26036 = true;
            }
            \u26037 = (\u2603 = avu.a(eu3.b().k() + \u26035, bl2)).endsWith("\n") ? \u2603.substring(0, \u2603.length() - 1) : \u2603;
            n5 = avn2.a(\u26037);
            fa \u260310 = new fa(\u26037);
            \u260310.a(eu3.b().m());
            if (n2 + n5 > n) {
                String string = avn2.a(\u2603, n - n2, false);
                String string2 = string3 = string.length() < \u2603.length() ? \u2603.substring(string.length()) : null;
                if (string3 != null && string3.length() > 0) {
                    String string3;
                    int n4 = string.lastIndexOf(" ");
                    if (n4 >= 0 && avn2.a(\u2603.substring(0, n4)) > 0) {
                        string = \u2603.substring(0, n4);
                        if (bl) {
                            ++n4;
                        }
                        string3 = \u2603.substring(n4);
                    } else if (n2 > 0 && !\u2603.contains((CharSequence)" ")) {
                        string = "";
                        string3 = \u2603;
                    }
                    fa \u26039 = new fa(string3);
                    \u26039.a(eu3.b().m());
                    \u26034.add(\u2603 + 1, (Object)\u26039);
                }
                \u2603 = string;
                int n5 = avn2.a(\u2603);
                \u260310 = new fa(\u2603);
                \u260310.a(eu3.b().m());
                \u26036 = true;
            }
            if (n2 + n5 <= n) {
                n2 += n5;
                \u26032.a(\u260310);
            } else {
                \u26036 = true;
            }
            if (!\u26036) continue;
            \u26033.add((Object)\u26032);
            n2 = 0;
            \u26032 = new fa("");
        }
        \u26033.add((Object)\u26032);
        return \u26033;
    }
}
