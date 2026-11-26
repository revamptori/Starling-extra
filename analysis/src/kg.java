/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.OutputStream
 *  java.io.PrintStream
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.Thread
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.OutputStream;
import java.io.PrintStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class kg
extends PrintStream {
    private static final Logger a = LogManager.getLogger();
    private final String b;

    public kg(String string, OutputStream outputStream) {
        super(outputStream);
        this.b = string;
    }

    public void println(String string) {
        this.a(string);
    }

    public void println(Object object) {
        this.a(String.valueOf((Object)object));
    }

    private void a(String string) {
        StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
        StackTraceElement \u26032 = stackTraceElementArray[Math.min((int)3, (int)stackTraceElementArray.length)];
        a.info("[{}]@.({}:{}): {}", new Object[]{this.b, \u26032.getFileName(), \u26032.getLineNumber(), string});
    }
}
