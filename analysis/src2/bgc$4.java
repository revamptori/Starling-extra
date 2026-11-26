/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.LinkedHashMap
 *  java.util.Map
 */
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.Map;

class bgc.4
extends bgu {
    bgc.4() {
    }

    @Override
    protected bov a(alz alz2) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap(alz2.b());
        if (alz2.b(ajx.b) != cq.b) {
            linkedHashMap.remove((Object)ajx.a);
        }
        return new bov((jy)afh.c.c(alz2.c()), this.a((Map<amo, Comparable>)linkedHashMap));
    }
}
