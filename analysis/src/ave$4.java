/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.Callable
 */
import java.util.concurrent.Callable;

class ave.4
implements Callable<String> {
    ave.4() {
    }

    public String a() throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : ave.this.t.k) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(string);
            if (!ave.this.t.l.contains((Object)string)) continue;
            stringBuilder.append(" (incompatible)");
        }
        return stringBuilder.toString();
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
