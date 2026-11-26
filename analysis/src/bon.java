/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.List
 */
import java.util.Collections;
import java.util.List;

public class bon
implements bnw {
    private final boolean a;
    private final boolean b;
    private final List<Integer> c;

    public bon(boolean bl, boolean bl2, List<Integer> list) {
        this.a = bl;
        this.b = bl2;
        this.c = list;
    }

    public boolean a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public List<Integer> c() {
        return Collections.unmodifiableList(this.c);
    }
}
