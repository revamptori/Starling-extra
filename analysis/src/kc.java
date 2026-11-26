/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  org.apache.commons.lang3.StringUtils
 */
import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class kc
extends IOException {
    private final List<a> a = Lists.newArrayList();
    private final String b;

    public kc(String string) {
        this.a.add((Object)new a());
        this.b = string;
    }

    public kc(String string, Throwable throwable) {
        super(throwable);
        this.a.add((Object)new a());
        this.b = string;
    }

    public void a(String string) {
        ((a)this.a.get(0)).a(string);
    }

    public void b(String string) {
        ((a)this.a.get(0)).a = string;
        this.a.add(0, (Object)new a());
    }

    public String getMessage() {
        return "Invalid " + ((a)this.a.get(this.a.size() - 1)).toString() + ": " + this.b;
    }

    public static kc a(Exception exception) {
        if (exception instanceof kc) {
            return (kc)exception;
        }
        String string = exception.getMessage();
        if (exception instanceof FileNotFoundException) {
            string = "File not found";
        }
        return new kc(string, (Throwable)exception);
    }

    public static class a {
        private String a = null;
        private final List<String> b = Lists.newArrayList();

        private a() {
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
    }
}
