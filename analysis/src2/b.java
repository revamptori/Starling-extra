/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.io.File
 *  java.io.FileWriter
 *  java.io.PrintWriter
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.Runtime
 *  java.lang.StackOverflowError
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.management.ManagementFactory
 *  java.lang.management.RuntimeMXBean
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.List
 *  java.util.concurrent.Callable
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class b {
    private static final Logger a = LogManager.getLogger();
    private final String b;
    private final Throwable c;
    private final c d = new c(this, "System Details");
    private final List<c> e = Lists.newArrayList();
    private File f;
    private boolean g = true;
    private StackTraceElement[] h = new StackTraceElement[0];

    public b(String string, Throwable throwable) {
        this.b = string;
        this.c = throwable;
        this.h();
    }

    private void h() {
        this.d.a("Minecraft Version", new Callable<String>(){

            public String a() {
                return "1.8.9";
            }

            public /* synthetic */ Object call() throws Exception {
                return this.a();
            }
        });
        this.d.a("Operating System", new Callable<String>(){

            public String a() {
                return System.getProperty((String)"os.name") + " (" + System.getProperty((String)"os.arch") + ") version " + System.getProperty((String)"os.version");
            }

            public /* synthetic */ Object call() throws Exception {
                return this.a();
            }
        });
        this.d.a("Java Version", new Callable<String>(){

            public String a() {
                return System.getProperty((String)"java.version") + ", " + System.getProperty((String)"java.vendor");
            }

            public /* synthetic */ Object call() throws Exception {
                return this.a();
            }
        });
        this.d.a("Java VM Version", new Callable<String>(){

            public String a() {
                return System.getProperty((String)"java.vm.name") + " (" + System.getProperty((String)"java.vm.info") + "), " + System.getProperty((String)"java.vm.vendor");
            }

            public /* synthetic */ Object call() throws Exception {
                return this.a();
            }
        });
        this.d.a("Memory", new Callable<String>(){

            public String a() {
                Runtime runtime = Runtime.getRuntime();
                long \u26032 = runtime.maxMemory();
                long \u26033 = runtime.totalMemory();
                long \u26034 = runtime.freeMemory();
                long \u26035 = \u26032 / 1024L / 1024L;
                long \u26036 = \u26033 / 1024L / 1024L;
                long \u26037 = \u26034 / 1024L / 1024L;
                return \u26034 + " bytes (" + \u26037 + " MB) / " + \u26033 + " bytes (" + \u26036 + " MB) up to " + \u26032 + " bytes (" + \u26035 + " MB)";
            }

            public /* synthetic */ Object call() throws Exception {
                return this.a();
            }
        });
        this.d.a("JVM Flags", new Callable<String>(){

            public String a() {
                RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
                List \u26032 = runtimeMXBean.getInputArguments();
                int \u26033 = 0;
                StringBuilder \u26034 = new StringBuilder();
                for (String string : \u26032) {
                    if (!string.startsWith("-X")) continue;
                    if (\u26033++ > 0) {
                        \u26034.append(" ");
                    }
                    \u26034.append(string);
                }
                return String.format((String)"%d total; %s", (Object[])new Object[]{\u26033, \u26034.toString()});
            }

            public /* synthetic */ Object call() throws Exception {
                return this.a();
            }
        });
        this.d.a("IntCache", new Callable<String>(){

            public String a() throws Exception {
                return asc.b();
            }

            public /* synthetic */ Object call() throws Exception {
                return this.a();
            }
        });
    }

    public String a() {
        return this.b;
    }

    public Throwable b() {
        return this.c;
    }

    public void a(StringBuilder stringBuilder2) {
        StringBuilder stringBuilder2;
        if ((this.h == null || this.h.length <= 0) && this.e.size() > 0) {
            this.h = (StackTraceElement[])ArrayUtils.subarray((Object[])((c)this.e.get(0)).a(), (int)0, (int)1);
        }
        if (this.h != null && this.h.length > 0) {
            stringBuilder2.append("-- Head --\n");
            stringBuilder2.append("Stacktrace:\n");
            for (StackTraceElement stackTraceElement : this.h) {
                stringBuilder2.append("\t").append("at ").append(stackTraceElement.toString());
                stringBuilder2.append("\n");
            }
            stringBuilder2.append("\n");
        }
        for (c c2 : this.e) {
            c2.a(stringBuilder2);
            stringBuilder2.append("\n\n");
        }
        this.d.a(stringBuilder2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String d() {
        StringWriter stringWriter = null;
        PrintWriter \u26032 = null;
        Throwable \u26033 = this.c;
        if (\u26033.getMessage() == null) {
            if (\u26033 instanceof NullPointerException) {
                \u26033 = new NullPointerException(this.b);
            } else if (\u26033 instanceof StackOverflowError) {
                \u26033 = new StackOverflowError(this.b);
            } else if (\u26033 instanceof OutOfMemoryError) {
                \u26033 = new OutOfMemoryError(this.b);
            }
            \u26033.setStackTrace(this.c.getStackTrace());
        }
        String \u26034 = \u26033.toString();
        try {
            stringWriter = new StringWriter();
            \u26032 = new PrintWriter((Writer)stringWriter);
            \u26033.printStackTrace(\u26032);
            \u26034 = stringWriter.toString();
        }
        catch (Throwable throwable) {
            IOUtils.closeQuietly((Writer)stringWriter);
            IOUtils.closeQuietly(\u26032);
            throw throwable;
        }
        IOUtils.closeQuietly((Writer)stringWriter);
        IOUtils.closeQuietly((Writer)\u26032);
        return \u26034;
    }

    public String e() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---- Minecraft Crash Report ----\n");
        stringBuilder.append("// ");
        stringBuilder.append(b.i());
        stringBuilder.append("\n\n");
        stringBuilder.append("Time: ");
        stringBuilder.append(new SimpleDateFormat().format(new Date()));
        stringBuilder.append("\n");
        stringBuilder.append("Description: ");
        stringBuilder.append(this.b);
        stringBuilder.append("\n\n");
        stringBuilder.append(this.d());
        stringBuilder.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
        for (int i = 0; i < 87; ++i) {
            stringBuilder.append("-");
        }
        stringBuilder.append("\n\n");
        this.a(stringBuilder);
        return stringBuilder.toString();
    }

    public File f() {
        return this.f;
    }

    public boolean a(File file) {
        if (this.f != null) {
            return false;
        }
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(this.e());
            fileWriter.close();
            this.f = file;
            return true;
        }
        catch (Throwable throwable) {
            a.error("Could not save crash report to " + file, throwable);
            return false;
        }
    }

    public c g() {
        return this.d;
    }

    public c a(String string) {
        return this.a(string, 1);
    }

    public c a(String string, int n) {
        c c2 = new c(this, string);
        if (this.g) {
            int n2 = c2.a(n);
            StackTraceElement[] \u26032 = this.c.getStackTrace();
            StackTraceElement \u26033 = null;
            StackTraceElement \u26034 = null;
            \u2603 = \u26032.length - n2;
            if (\u2603 < 0) {
                System.out.println("Negative index in crash report handler (" + \u26032.length + "/" + n2 + ")");
            }
            if (\u26032 != null && 0 <= \u2603 && \u2603 < \u26032.length) {
                \u26033 = \u26032[\u2603];
                if (\u26032.length + 1 - n2 < \u26032.length) {
                    \u26034 = \u26032[\u26032.length + 1 - n2];
                }
            }
            this.g = c2.a(\u26033, \u26034);
            if (n2 > 0 && !this.e.isEmpty()) {
                c c3 = (c)this.e.get(this.e.size() - 1);
                c3.b(n2);
            } else if (\u26032 != null && \u26032.length >= n2 && 0 <= \u2603 && \u2603 < \u26032.length) {
                this.h = new StackTraceElement[\u2603];
                System.arraycopy((Object)\u26032, (int)0, (Object)this.h, (int)0, (int)this.h.length);
            } else {
                this.g = false;
            }
        }
        this.e.add((Object)c2);
        return c2;
    }

    private static String i() {
        String[] stringArray = new String[]{"Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!", "But it works on my machine."};
        try {
            return stringArray[(int)(System.nanoTime() % (long)stringArray.length)];
        }
        catch (Throwable \u26032) {
            return "Witty comment unavailable :(";
        }
    }

    public static b a(Throwable throwable, String string) {
        b b2 = throwable instanceof e ? ((e)((Object)throwable)).a() : new b(string, throwable);
        return b2;
    }
}
