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

static class ed.c
extends ed.a {
    protected List<ed.a> b = Lists.newArrayList();

    public ed.c(String string) {
        this.a = string;
    }

    @Override
    public eb a() throws ec {
        du du2 = new du();
        for (ed.a a2 : this.b) {
            du2.a(a2.a());
        }
        return du2;
    }
}
