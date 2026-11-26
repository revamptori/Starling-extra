/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
import com.google.common.base.Function;

public class zc
extends aae {
    public zc(afh afh2, afh afh3, Function<zx, String> function) {
        super(afh2, afh3, function);
    }

    @Override
    public int a(zx zx2, int n) {
        agi.b b2 = agi.b.a(zx2.i());
        if (b2 == agi.b.c || b2 == agi.b.d) {
            return adl.a(0.5, 1.0);
        }
        return super.a(zx2, n);
    }
}
