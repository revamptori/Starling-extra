/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class ue
extends pk {
    public final ud a;
    public final String b;

    public ue(ud ud2, String string, float f, float f2) {
        super(ud2.a());
        this.a(f, f2);
        this.a = ud2;
        this.b = string;
    }

    @Override
    protected void h() {
    }

    @Override
    protected void a(dn dn2) {
    }

    @Override
    protected void b(dn dn2) {
    }

    @Override
    public boolean ad() {
        return true;
    }

    @Override
    public boolean a(ow ow2, float f) {
        if (this.b(ow2)) {
            return false;
        }
        return this.a.a(this, ow2, f);
    }

    @Override
    public boolean k(pk pk2) {
        return this == pk2 || this.a == pk2;
    }
}
