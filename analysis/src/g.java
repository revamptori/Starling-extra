/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.FutureTask
 *  org.apache.logging.log4j.Logger
 */
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.apache.logging.log4j.Logger;

public class g {
    public static a a() {
        String string = System.getProperty((String)"os.name").toLowerCase();
        if (string.contains((CharSequence)"win")) {
            return a.c;
        }
        if (string.contains((CharSequence)"mac")) {
            return a.d;
        }
        if (string.contains((CharSequence)"solaris")) {
            return a.b;
        }
        if (string.contains((CharSequence)"sunos")) {
            return a.b;
        }
        if (string.contains((CharSequence)"linux")) {
            return a.a;
        }
        if (string.contains((CharSequence)"unix")) {
            return a.a;
        }
        return a.e;
    }

    public static <V> V a(FutureTask<V> futureTask, Logger logger) {
        try {
            futureTask.run();
            return (V)futureTask.get();
        }
        catch (ExecutionException executionException) {
            logger.fatal("Error executing task", (Throwable)executionException);
        }
        catch (InterruptedException interruptedException) {
            logger.fatal("Error executing task", (Throwable)interruptedException);
        }
        return null;
    }

    public static enum a {
        a,
        b,
        c,
        d,
        e;

    }
}
