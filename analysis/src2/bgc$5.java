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
 *  java.util.Map
 */
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.Map;

class bgc.5
extends bgu {
    bgc.5() {
    }

    @Override
    protected bov a(alz alz2) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap(alz2.b());
        String \u26032 = agf.a.a((agf.a)((Comparable)linkedHashMap.remove(agf.a)));
        if (agf.a.c != alz2.b(agf.a)) {
            linkedHashMap.remove((Object)agf.b);
        }
        return new bov(\u26032, this.a((Map<amo, Comparable>)linkedHashMap));
    }
}
