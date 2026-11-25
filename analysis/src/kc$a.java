/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  org.apache.commons.lang3.StringUtils
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public static class kc.a {
    private String a = null;
    private final List<String> b = Lists.newArrayList();

    private kc.a() {
    }

    private void a(String string) {
        this.b.add(0, (Object)string);
    }

    public String b() {
        return StringUtils.join(this.b, (String)"->");
    }

    public String toString() {
        if (this.a != null) {
            if (!this.b.isEmpty()) {
                return this.a + " " + this.b();
            }
            return this.a;
        }
        if (!this.b.isEmpty()) {
            return "(Unknown file) " + this.b();
        }
        return "(Unknown file)";
    }

    static /* synthetic */ void a(kc.a a2, String string) {
        a2.a(string);
    }

    static /* synthetic */ String b(kc.a a2, String string) {
        a2.a = string;
        return a2.a;
    }
}
