/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Collection
 *  java.util.List
 *  java.util.Random
 */
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Random;

class bal.a
implements bah {
    private final aul b;
    private final jy c;
    private final List<bdc> d;

    public bal.a(aul aul2) {
        this.b = aul2;
        this.d = Lists.newArrayList();
        for (String string : aul2.d()) {
            bdc bdc2 = ave.A().u().a(string);
            if (bdc2 == null) continue;
            this.d.add((Object)bdc2);
        }
        if (!this.d.isEmpty()) {
            Object object = ((bdc)this.d.get(new Random().nextInt(this.d.size()))).a().getName();
            this.c = bet.c((String)object);
            bet.a(this.c, (String)object);
        } else {
            this.c = bmz.a();
        }
    }

    @Override
    public void a(baf baf2) {
        baf2.a(new bak((Collection<bdc>)this.d));
    }

    @Override
    public eu A_() {
        return new fa(this.b.c());
    }

    @Override
    public void a(float f22, int n2) {
        float f22;
        int n3;
        n3 = -1;
        String string = avn.b(this.b.e());
        if (string.length() >= 2) {
            n3 = ave.A().k.b(string.charAt(1));
        }
        if (n3 >= 0) {
            float f3 = (float)(n3 >> 16 & 0xFF) / 255.0f;
            \u2603 = (float)(n3 >> 8 & 0xFF) / 255.0f;
            \u2603 = (float)(n3 & 0xFF) / 255.0f;
            avp.a(1, 1, 15, 15, ns.b(f3 * f22, \u2603 * f22, \u2603 * f22) | n2 << 24);
        }
        ave.A().P().a(this.c);
        bfl.c(f22, f22, f22, (float)n2 / 255.0f);
        avp.a(2, 2, 8.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
        avp.a(2, 2, 40.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
    }

    @Override
    public boolean B_() {
        return !this.d.isEmpty();
    }
}
