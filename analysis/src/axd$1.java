/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.primitives.Floats
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.common.base.Predicate;
import com.google.common.primitives.Floats;

class axd.1
implements Predicate<String> {
    axd.1() {
    }

    public boolean a(String string) {
        Float f = Floats.tryParse((String)string);
        return string.length() == 0 || f != null && Floats.isFinite((float)f.floatValue()) && f.floatValue() >= 0.0f;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((String)object);
    }
}
