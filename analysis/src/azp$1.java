/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
import java.util.List;

class azp.1
implements awx {
    azp.1() {
    }

    @Override
    public void a(boolean bl, int n) {
        List<azp> list = azp.this.b.b(azp.this);
        azp.this.a.a(azp.this.b);
        if (bl) {
            list.remove((Object)azp.this);
            azp.this.b.f().add(0, (Object)azp.this);
        }
    }
}
