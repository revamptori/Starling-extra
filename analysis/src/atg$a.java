/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.Collection
 */
import java.util.Collection;

public class atg.a {
    public final wn a;
    private boolean d = true;
    private int e = 0;
    private int f = 0;
    private int g = 127;
    private int h = 127;
    private int i;
    public int b;

    public atg.a(wn wn2) {
        this.a = wn2;
    }

    public ff a(zx zx2) {
        if (this.d) {
            this.d = false;
            return new gu(zx2.i(), atg.this.e, (Collection<atf>)atg.this.h.values(), atg.this.f, this.e, this.f, this.g + 1 - this.e, this.h + 1 - this.f);
        }
        if (this.i++ % 5 == 0) {
            return new gu(zx2.i(), atg.this.e, (Collection<atf>)atg.this.h.values(), atg.this.f, 0, 0, 0, 0);
        }
        return null;
    }

    public void a(int n, int n2) {
        if (this.d) {
            this.e = Math.min((int)this.e, (int)n);
            this.f = Math.min((int)this.f, (int)n2);
            this.g = Math.max((int)this.g, (int)n);
            this.h = Math.max((int)this.h, (int)n2);
        } else {
            this.d = true;
            this.e = n;
            this.f = n2;
            this.g = n;
            this.h = n2;
        }
    }
}
