/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.Callable
 */
import java.util.concurrent.Callable;

class bmi.1
implements Callable<String> {
    final /* synthetic */ int[][] a;

    bmi.1(int[][] nArray) {
        this.a = nArray;
    }

    public String a() throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        for (int[] nArray : this.a) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append((Object)(nArray == null ? "null" : Integer.valueOf((int)nArray.length)));
        }
        return stringBuilder.toString();
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
