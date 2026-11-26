/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;

public static class bgx.a {
    private amo<?> a;
    private String b;
    private final List<amo<?>> c = Lists.newArrayList();

    public bgx.a a(amo<?> amo2) {
        this.a = amo2;
        return this;
    }

    public bgx.a a(String string) {
        this.b = string;
        return this;
    }

    public bgx.a a(amo<?> ... amoArray) {
        Collections.addAll(this.c, (Object[])amoArray);
        return this;
    }

    public bgx a() {
        return new bgx(this.a, this.b, this.c, null);
    }
}
