/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.IdentityHashMap
 *  java.util.Map
 *  java.util.Set
 */
import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class bgv {
    private Map<afh, bgy> a = Maps.newIdentityHashMap();
    private Set<afh> b = Sets.newIdentityHashSet();

    public void a(afh afh2, bgy bgy2) {
        this.a.put((Object)afh2, (Object)bgy2);
    }

    public void a(afh ... afhArray) {
        Collections.addAll(this.b, (Object[])afhArray);
    }

    public Map<alz, bov> a() {
        IdentityHashMap identityHashMap = Maps.newIdentityHashMap();
        for (afh afh2 : afh.c) {
            if (this.b.contains((Object)afh2)) continue;
            identityHashMap.putAll(((bgy)Objects.firstNonNull((Object)this.a.get((Object)afh2), (Object)new bgw())).a(afh2));
        }
        return identityHashMap;
    }
}
