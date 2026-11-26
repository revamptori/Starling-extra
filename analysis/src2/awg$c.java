/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public static class awg.c
extends awg.f {
    private final Predicate<String> a;

    public awg.c(int n, String string, boolean bl, Predicate<String> predicate) {
        super(n, string, bl);
        this.a = (Predicate)Objects.firstNonNull(predicate, (Object)Predicates.alwaysTrue());
    }

    public Predicate<String> a() {
        return this.a;
    }
}
