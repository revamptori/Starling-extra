/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class bbi
extends bbz {
    private final bct b = new bct(this, 32, 0);

    public bbi() {
        super(0, 0, 64, 64);
        this.b.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.25f);
        this.b.a(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(pk pk2, float f, float f2, float f3, float f4, float f5, float f6) {
        super.a(pk2, f, f2, f3, f4, f5, f6);
        this.b.a(f6);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, pk pk2) {
        super.a(f, f2, f3, f4, f5, f6, pk2);
        this.b.g = this.a.g;
        this.b.f = this.a.f;
    }
}
