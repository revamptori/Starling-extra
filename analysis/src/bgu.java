/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 *  java.util.Map$Entry
 */
import com.google.common.collect.Maps;
import java.util.Map;

public abstract class bgu
implements bgy {
    protected Map<alz, bov> b = Maps.newLinkedHashMap();

    public String a(Map<amo, Comparable> map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(",");
            }
            amo amo2 = (amo)entry.getKey();
            Comparable \u26032 = (Comparable)entry.getValue();
            stringBuilder.append(amo2.a());
            stringBuilder.append("=");
            stringBuilder.append(amo2.a(\u26032));
        }
        if (stringBuilder.length() == 0) {
            stringBuilder.append("normal");
        }
        return stringBuilder.toString();
    }

    @Override
    public Map<alz, bov> a(afh afh2) {
        for (alz alz2 : afh2.P().a()) {
            this.b.put((Object)alz2, (Object)this.a(alz2));
        }
        return this.b;
    }

    protected abstract bov a(alz var1);
}
