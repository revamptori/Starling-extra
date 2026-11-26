/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  java.util.Map$Entry
 */
import com.google.common.base.Predicate;
import java.util.Map;
import net.minecraft.server.MinecraftServer;

static final class o.9
implements Predicate<pk> {
    final /* synthetic */ Map a;

    o.9(Map map) {
        this.a = map;
    }

    public boolean a(pk pk2) {
        auo auo2 = MinecraftServer.N().a(0).Z();
        for (Map.Entry entry : this.a.entrySet()) {
            String string = (String)entry.getKey();
            boolean \u26032 = false;
            if (string.endsWith("_min") && string.length() > 4) {
                \u26032 = true;
                string = string.substring(0, string.length() - 4);
            }
            if ((\u2603 = auo2.b(string)) == null) {
                return false;
            }
            String string2 = \u2603 = pk2 instanceof lf ? pk2.e_() : pk2.aK().toString();
            if (!auo2.b(\u2603, \u2603)) {
                return false;
            }
            aum \u26033 = auo2.c(\u2603, \u2603);
            int \u26034 = \u26033.c();
            if (\u26034 < (Integer)entry.getValue() && \u26032) {
                return false;
            }
            if (\u26034 <= (Integer)entry.getValue() || \u26032) continue;
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean apply(Object object) {
        return this.a((pk)object);
    }
}
