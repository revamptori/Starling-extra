/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
import java.util.List;

public class aur
implements auu {
    private final String j;

    public aur(String string, a a2) {
        this.j = string + a2.e();
        auu.a.put((Object)this.j, (Object)this);
    }

    @Override
    public String a() {
        return this.j;
    }

    @Override
    public int a(List<wn> list) {
        return 0;
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public auu.a c() {
        return auu.a.a;
    }
}
