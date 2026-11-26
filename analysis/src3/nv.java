/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public class nv {
    private float a;
    private float b;
    private float c;

    public float a(float f, float f2) {
        this.a += f;
        f = (this.a - this.b) * f2;
        this.c += (f - this.c) * 0.5f;
        if (f > 0.0f && f > this.c || f < 0.0f && f < this.c) {
            f = this.c;
        }
        this.b += f;
        return f;
    }

    public void a() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }
}
