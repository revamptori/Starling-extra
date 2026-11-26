/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.List;

public class bae
implements bag {
    private final List<bah> a = Lists.newArrayList();

    public bae() {
        this.a.add((Object)new bak());
        this.a.add((Object)new bal());
    }

    @Override
    public List<bah> a() {
        return this.a;
    }

    @Override
    public eu b() {
        return new fa("Press a key to select a command, and again to use it.");
    }
}
