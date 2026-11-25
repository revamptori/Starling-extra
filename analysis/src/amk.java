/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Collection
 */
import com.google.common.collect.ImmutableSet;
import java.util.Collection;

public class amk
extends amj<Boolean> {
    private final ImmutableSet<Boolean> a = ImmutableSet.of((Object)true, (Object)false);

    protected amk(String string) {
        super(string, Boolean.class);
    }

    @Override
    public Collection<Boolean> c() {
        return this.a;
    }

    public static amk a(String string) {
        return new amk(string);
    }

    @Override
    public String a(Boolean bl) {
        return bl.toString();
    }
}
