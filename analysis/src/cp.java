/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class cp<K, V>
extends dd<K, V> {
    private final V a;

    public cp(V v) {
        this.a = v;
    }

    @Override
    public V a(K k) {
        Object v = super.a(k);
        return v == null ? this.a : v;
    }
}
