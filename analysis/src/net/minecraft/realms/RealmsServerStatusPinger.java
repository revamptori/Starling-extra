/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.InetAddress
 *  java.net.UnknownHostException
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.realms;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.realms.Realms;
import net.minecraft.realms.RealmsServerAddress;
import net.minecraft.realms.RealmsServerPing;
import net.minecraft.realms.RealmsSharedConstants;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RealmsServerStatusPinger {
    private static final Logger LOGGER = LogManager.getLogger();
    private final List<ek> connections = Collections.synchronizedList((List)Lists.newArrayList());

    public void pingServer(final String string, final RealmsServerPing realmsServerPing) throws UnknownHostException {
        if (string == null || string.startsWith("0.0.0.0") || string.isEmpty()) {
            return;
        }
        RealmsServerAddress realmsServerAddress = RealmsServerAddress.parseString(string);
        final ek \u26032 = ek.a(InetAddress.getByName((String)realmsServerAddress.getHost()), realmsServerAddress.getPort(), false);
        this.connections.add((Object)\u26032);
        \u26032.a(new jp(){
            private boolean e = false;

            @Override
            public void a(jr jr2) {
                js js2 = jr2.a();
                if (js2.b() != null) {
                    realmsServerPing.nrOfPlayers = String.valueOf((int)js2.b().b());
                    if (ArrayUtils.isNotEmpty((Object[])js2.b().c())) {
                        StringBuilder stringBuilder = new StringBuilder();
                        for (GameProfile gameProfile : js2.b().c()) {
                            if (stringBuilder.length() > 0) {
                                stringBuilder.append("\n");
                            }
                            stringBuilder.append(gameProfile.getName());
                        }
                        if (js2.b().c().length < js2.b().b()) {
                            if (stringBuilder.length() > 0) {
                                stringBuilder.append("\n");
                            }
                            stringBuilder.append("... and ").append(js2.b().b() - js2.b().c().length).append(" more ...");
                        }
                        realmsServerPing.playerList = stringBuilder.toString();
                    }
                } else {
                    realmsServerPing.playerList = "";
                }
                \u26032.a(new ju(Realms.currentTimeMillis()));
                this.e = true;
            }

            @Override
            public void a(jq jq2) {
                \u26032.a(new fa("Finished"));
            }

            @Override
            public void a(eu eu2) {
                if (!this.e) {
                    LOGGER.error("Can't ping " + string + ": " + eu2.c());
                }
            }
        });
        try {
            \u26032.a(new jc(RealmsSharedConstants.NETWORK_PROTOCOL_VERSION, realmsServerAddress.getHost(), realmsServerAddress.getPort(), el.c));
            \u26032.a(new jv());
        }
        catch (Throwable \u26033) {
            LOGGER.error((Object)\u26033);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void tick() {
        List<ek> list = this.connections;
        synchronized (list) {
            Iterator iterator = this.connections.iterator();
            while (iterator.hasNext()) {
                ek ek2 = (ek)((Object)iterator.next());
                if (ek2.g()) {
                    ek2.a();
                    continue;
                }
                iterator.remove();
                ek2.l();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void removeAll() {
        List<ek> list = this.connections;
        synchronized (list) {
            Iterator iterator = this.connections.iterator();
            while (iterator.hasNext()) {
                ek ek2 = (ek)((Object)iterator.next());
                if (!ek2.g()) continue;
                iterator.remove();
                ek2.a(new fa("Cancelled"));
            }
        }
    }
}
