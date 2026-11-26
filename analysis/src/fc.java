/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
public class fc
extends IllegalArgumentException {
    public fc(fb fb2, String string) {
        super(String.format((String)"Error parsing: %s: %s", (Object[])new Object[]{fb2, string}));
    }

    public fc(fb fb2, int n) {
        super(String.format((String)"Invalid index %d requested for %s", (Object[])new Object[]{n, fb2}));
    }

    public fc(fb fb2, Throwable throwable) {
        super(String.format((String)"Error while parsing: %s", (Object[])new Object[]{fb2}), throwable);
    }
}
