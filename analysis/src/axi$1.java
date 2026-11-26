/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.net.IDN
 */
import com.google.common.base.Predicate;
import java.net.IDN;

class axi.1
implements Predicate<String> {
    axi.1() {
    }

    public boolean a(String string) {
        if (string.length() == 0) {
            return true;
        }
        String[] stringArray = string.split(":");
        if (stringArray.length == 0) {
            return true;
        }
        try {
            String string2 = IDN.toASCII((String)stringArray[0]);
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((String)object);
    }
}
