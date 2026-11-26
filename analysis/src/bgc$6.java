/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.LinkedHashMap
 */
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;

class bgc.6
extends bgu {
    bgc.6() {
    }

    @Override
    protected bov a(alz alz2) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap(alz2.b());
        String \u26032 = akb.N.a((akb.a)((Comparable)linkedHashMap.remove(akb.N)));
        linkedHashMap.remove((Object)akb.b);
        String \u26033 = alz2.b(akb.b) != false ? "all" : "normal";
        return new bov(\u26032 + "_double_slab", \u26033);
    }
}
