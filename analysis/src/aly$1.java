/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map$Entry
 */
import com.google.common.base.Function;
import java.util.Map;

static final class aly.1
implements Function<Map.Entry<amo, Comparable>, String> {
    aly.1() {
    }

    public String a(Map.Entry<amo, Comparable> entry) {
        if (entry == null) {
            return "<NULL>";
        }
        amo amo2 = (amo)entry.getKey();
        return amo2.a() + "=" + amo2.a((Comparable)entry.getValue());
    }

    public /* synthetic */ Object apply(Object object) {
        return this.a((Map.Entry<amo, Comparable>)((Map.Entry)object));
    }
}
