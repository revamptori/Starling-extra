/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
class bpz.2
implements bqb<bpw> {
    final jy a;
    final /* synthetic */ String b;
    final /* synthetic */ bph.a c;

    bpz.2(String string, bph.a a2) {
        this.b = string;
        this.c = a2;
        this.a = new jy(this.b, this.c.a());
    }

    @Override
    public int a() {
        bpy bpy2 = (bpy)bpz.this.e.a(this.a);
        return bpy2 == null ? 0 : bpy2.a();
    }

    public bpw b() {
        bpy bpy2 = (bpy)bpz.this.e.a(this.a);
        return bpy2 == null ? a : bpy2.b();
    }

    @Override
    public /* synthetic */ Object g() {
        return this.b();
    }
}
