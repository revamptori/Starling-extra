/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Map
 */
import com.google.common.collect.Maps;
import java.util.Map;

public class bez
extends oq
implements oo {
    private String a;
    private Map<Integer, Integer> b = Maps.newHashMap();

    public bez(String string, eu eu2, int n) {
        super(eu2, n);
        this.a = string;
    }

    @Override
    public int a_(int n) {
        if (this.b.containsKey((Object)n)) {
            return (Integer)this.b.get((Object)n);
        }
        return 0;
    }

    @Override
    public void b(int n, int n2) {
        this.b.put((Object)n, (Object)n2);
    }

    @Override
    public int g() {
        return this.b.size();
    }

    @Override
    public boolean r_() {
        return false;
    }

    @Override
    public void a(on on2) {
    }

    @Override
    public on i() {
        return on.a;
    }

    @Override
    public String k() {
        return this.a;
    }

    @Override
    public xi a(wm wm2, wn wn2) {
        throw new UnsupportedOperationException();
    }
}
