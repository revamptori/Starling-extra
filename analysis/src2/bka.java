/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class bka<T extends wc>
extends bjo<T> {
    private static final jy a = new jy("textures/entity/spider/spider.png");

    public bka(biu biu2) {
        super(biu2, new bce(), 1.0f);
        this.a(new blf(this));
    }

    @Override
    protected float b(T t) {
        return 180.0f;
    }

    @Override
    protected jy a(T t) {
        return a;
    }
}
