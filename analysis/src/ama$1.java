/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.common.base.Function;

static final class ama.1
implements Function<amo, String> {
    ama.1() {
    }

    public String a(amo amo2) {
        return amo2 == null ? "<NULL>" : amo2.a();
    }

    public /* synthetic */ Object apply(Object object) {
        return this.a((amo)object);
    }
}
