/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class bpe
extends bpb {
    private final wn k;
    private final va l;

    public bpe(wn wn2, va va2) {
        super(new jy("minecraft:minecart.inside"));
        this.k = wn2;
        this.l = va2;
        this.i = bpj.a.a;
        this.g = true;
        this.h = 0;
    }

    @Override
    public void c() {
        if (this.l.I || !this.k.au() || this.k.m != this.l) {
            this.j = true;
            return;
        }
        float f = ns.a(this.l.v * this.l.v + this.l.x * this.l.x);
        this.b = (double)f >= 0.01 ? 0.0f + ns.a(f, 0.0f, 1.0f) * 0.75f : 0.0f;
    }
}
