/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.StackTraceElement
 *  java.lang.Throwable
 */
public final class ki
extends RuntimeException {
    public static final ki a = new ki();

    private ki() {
        this.setStackTrace(new StackTraceElement[0]);
    }

    public synchronized Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
