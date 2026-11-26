/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import net.minecraft.server.MinecraftServer;

public class ax
extends i {
    private static final Map<String, Integer> a;

    @Override
    public String c() {
        return "replaceitem";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(m m2) {
        return "commands.replaceitem.usage";
    }

    @Override
    public void a(m m2, String[] stringArray2) throws bz {
        zw zw2;
        int \u26032;
        String[] stringArray2;
        boolean bl;
        if (stringArray2.length < 1) {
            throw new cf("commands.replaceitem.usage", new Object[0]);
        }
        if (stringArray2[0].equals((Object)"entity")) {
            bl = false;
        } else if (stringArray2[0].equals((Object)"block")) {
            bl = true;
        } else {
            throw new cf("commands.replaceitem.usage", new Object[0]);
        }
        if (bl) {
            if (stringArray2.length < 6) {
                throw new cf("commands.replaceitem.block.usage", new Object[0]);
            }
            \u26032 = 4;
        } else {
            if (stringArray2.length < 4) {
                throw new cf("commands.replaceitem.entity.usage", new Object[0]);
            }
            \u26032 = 2;
        }
        int n2 = this.e(stringArray2[\u26032++]);
        try {
            zw2 = ax.f(m2, stringArray2[\u26032]);
        }
        catch (cb cb2) {
            if (afh.b(stringArray2[\u26032]) == afi.a) {
                zw2 = null;
            }
            throw cb2;
        }
        int \u26033 = stringArray2.length > ++\u26032 ? ax.a(stringArray2[\u26032++], 1, 64) : 1;
        int \u26034 = stringArray2.length > \u26032 ? ax.a(stringArray2[\u26032++]) : 0;
        zx \u26035 = new zx(zw2, \u26033, \u26034);
        if (stringArray2.length > \u26032) {
            Object object = ax.a(m2, stringArray2, \u26032).c();
            try {
                \u26035.d(ed.a((String)object));
            }
            catch (ec \u26036) {
                throw new bz("commands.replaceitem.tagError", \u26036.getMessage());
            }
        }
        if (\u26035.b() == null) {
            \u26035 = null;
        }
        if (bl) {
            m2.a(n.a.d, 0);
            object = ax.a(m2, stringArray2, 1, false);
            adm \u26037 = m2.e();
            akw \u26038 = \u26037.s((cj)object);
            if (\u26038 == null || !(\u26038 instanceof og)) {
                throw new bz("commands.replaceitem.noContainer", ((df)object).n(), ((df)object).o(), ((df)object).p());
            }
            og \u26039 = (og)((Object)\u26038);
            if (n2 >= 0 && n2 < \u26039.o_()) {
                \u26039.a(n2, \u26035);
            }
        } else {
            object = ax.b(m2, stringArray2[1]);
            m2.a(n.a.d, 0);
            if (object instanceof wn) {
                ((wn)object).bj.b();
            }
            if (!((pk)object).d(n2, \u26035)) {
                throw new bz("commands.replaceitem.failed", n2, \u26033, \u26035 == null ? "Air" : \u26035.C());
            }
            if (object instanceof wn) {
                ((wn)object).bj.b();
            }
        }
        m2.a(n.a.d, \u26033);
        ax.a(m2, (k)this, "commands.replaceitem.success", n2, \u26033, \u26035 == null ? "Air" : \u26035.C());
    }

    private int e(String string) throws bz {
        if (!a.containsKey((Object)string)) {
            throw new bz("commands.generic.parameter.invalid", string);
        }
        return (Integer)a.get((Object)string);
    }

    @Override
    public List<String> a(m m2, String[] stringArray, cj cj2) {
        if (stringArray.length == 1) {
            return ax.a(stringArray, "entity", "block");
        }
        if (stringArray.length == 2 && stringArray[0].equals((Object)"entity")) {
            return ax.a(stringArray, this.d());
        }
        if (stringArray.length >= 2 && stringArray.length <= 4 && stringArray[0].equals((Object)"block")) {
            return ax.a(stringArray, 1, cj2);
        }
        if (stringArray.length == 3 && stringArray[0].equals((Object)"entity") || stringArray.length == 5 && stringArray[0].equals((Object)"block")) {
            return ax.a(stringArray, a.keySet());
        }
        if (stringArray.length == 4 && stringArray[0].equals((Object)"entity") || stringArray.length == 6 && stringArray[0].equals((Object)"block")) {
            return ax.a(stringArray, zw.e.c());
        }
        return null;
    }

    protected String[] d() {
        return MinecraftServer.N().K();
    }

    @Override
    public boolean b(String[] stringArray, int n2) {
        return stringArray.length > 0 && stringArray[0].equals((Object)"entity") && n2 == 1;
    }

    static {
        int n2;
        a = Maps.newHashMap();
        for (n2 = 0; n2 < 54; ++n2) {
            a.put((Object)("slot.container." + n2), (Object)n2);
        }
        for (n2 = 0; n2 < 9; ++n2) {
            a.put((Object)("slot.hotbar." + n2), (Object)n2);
        }
        for (n2 = 0; n2 < 27; ++n2) {
            a.put((Object)("slot.inventory." + n2), (Object)(9 + n2));
        }
        for (n2 = 0; n2 < 27; ++n2) {
            a.put((Object)("slot.enderchest." + n2), (Object)(200 + n2));
        }
        for (n2 = 0; n2 < 8; ++n2) {
            a.put((Object)("slot.villager." + n2), (Object)(300 + n2));
        }
        for (n2 = 0; n2 < 15; ++n2) {
            a.put((Object)("slot.horse." + n2), (Object)(500 + n2));
        }
        a.put((Object)"slot.weapon", (Object)99);
        a.put((Object)"slot.armor.head", (Object)103);
        a.put((Object)"slot.armor.chest", (Object)102);
        a.put((Object)"slot.armor.legs", (Object)101);
        a.put((Object)"slot.armor.feet", (Object)100);
        a.put((Object)"slot.horse.saddle", (Object)400);
        a.put((Object)"slot.horse.armor", (Object)401);
        a.put((Object)"slot.horse.chest", (Object)499);
    }
}
