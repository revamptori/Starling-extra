/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  org.apache.commons.lang3.Validate
 */
import org.apache.commons.lang3.Validate;

public class co<K, V>
extends cx<K, V> {
    private final K d;
    private V e;

    public co(K k) {
        this.d = k;
    }

    @Override
    public void a(int n, K k, V v) {
        if (this.d.equals(k)) {
            this.e = v;
        }
        super.a(n, k, v);
    }

    public void a() {
        Validate.notNull(this.d);
    }

    @Override
    public V a(K k) {
        Object v = super.a(k);
        return v == null ? this.e : v;
    }

    @Override
    public V a(int n) {
        Object v = super.a(n);
        return v == null ? this.e : v;
    }
}
