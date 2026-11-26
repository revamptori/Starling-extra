/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.List;

static class ed.b
extends ed.a {
    protected List<ed.a> b = Lists.newArrayList();

    public ed.b(String string) {
        this.a = string;
    }

    @Override
    public eb a() throws ec {
        dn dn2 = new dn();
        for (ed.a a2 : this.b) {
            dn2.a(a2.a, a2.a());
        }
        return dn2;
    }
}
