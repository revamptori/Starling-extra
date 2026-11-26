/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Collections
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class bgx
extends bgu {
    private final amo<?> a;
    private final String c;
    private final List<amo<?>> d;

    private bgx(amo<?> amo2, String string, List<amo<?>> list) {
        this.a = amo2;
        this.c = string;
        this.d = list;
    }

    @Override
    protected bov a(alz alz2) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap(alz2.b());
        String \u26032 = this.a == null ? ((jy)afh.c.c(alz2.c())).toString() : this.a.a((Comparable)linkedHashMap.remove(this.a));
        if (this.c != null) {
            \u26032 = \u26032 + this.c;
        }
        for (amo amo2 : this.d) {
            linkedHashMap.remove((Object)amo2);
        }
        return new bov(\u26032, this.a((Map<amo, Comparable>)linkedHashMap));
    }

    public static class a {
        private amo<?> a;
        private String b;
        private final List<amo<?>> c = Lists.newArrayList();

        public a a(amo<?> amo2) {
            this.a = amo2;
            return this;
        }

        public a a(String string) {
            this.b = string;
            return this;
        }

        public a a(amo<?> ... amoArray) {
            Collections.addAll(this.c, (Object[])amoArray);
            return this;
        }

        public bgx a() {
            return new bgx(this.a, this.b, this.c);
        }
    }
}
