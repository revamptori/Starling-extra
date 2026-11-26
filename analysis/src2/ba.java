/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
import net.minecraft.server.MinecraftServer;

public class ba
extends i {
    @Override
    public String c() {
        return "save-on";
    }

    @Override
    public String c(m m2) {
        return "commands.save-on.usage";
    }

    @Override
    public void a(m m22, String[] stringArray) throws bz {
        m m22;
        MinecraftServer minecraftServer = MinecraftServer.N();
        boolean \u26032 = false;
        for (int j = 0; j < minecraftServer.d.length; ++j) {
            if (minecraftServer.d[j] == null) continue;
            le le2 = minecraftServer.d[j];
            if (!le2.c) continue;
            le2.c = false;
            \u26032 = true;
        }
        if (!\u26032) {
            throw new bz("commands.save-on.alreadyOn", new Object[0]);
        }
        ba.a(m22, (k)this, "commands.save.enabled", new Object[0]);
    }
}
