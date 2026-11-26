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

public class aae
extends yo {
    protected final afh b;
    protected final Function<zx, String> c;

    public aae(afh afh2, afh afh3, Function<zx, String> function) {
        super(afh2);
        this.b = afh3;
        this.c = function;
        this.d(0);
        this.a(true);
    }

    public aae(afh afh2, afh afh3, final String[] stringArray) {
        this(afh2, afh3, new Function<zx, String>(){

            public String a(zx zx2) {
                int n = zx2.i();
                if (n < 0 || n >= stringArray.length) {
                    n = 0;
                }
                return stringArray[n];
            }

            public /* synthetic */ Object apply(Object object) {
                return this.a((zx)object);
            }
        });
    }

    @Override
    public int a(int n) {
        return n;
    }

    @Override
    public String e_(zx zx2) {
        return super.a() + "." + (String)this.c.apply((Object)zx2);
    }
}
