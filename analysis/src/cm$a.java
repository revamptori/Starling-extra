/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  java.lang.Object
 *  java.util.Arrays
 *  java.util.List
 */
import com.google.common.base.Function;
import java.util.Arrays;
import java.util.List;

static class cm.a<T>
implements Function<Object[], List<T>> {
    private cm.a() {
    }

    public List<T> a(Object[] objectArray) {
        return Arrays.asList((Object[])objectArray);
    }

    public /* synthetic */ Object apply(Object object) {
        return this.a((Object[])object);
    }
}
