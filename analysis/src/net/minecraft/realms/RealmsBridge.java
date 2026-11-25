/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.realms;

import java.lang.reflect.Constructor;
import net.minecraft.realms.RealmsScreen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RealmsBridge
extends RealmsScreen {
    private static final Logger LOGGER = LogManager.getLogger();
    private axu previousScreen;

    public void switchToRealms(axu axu2) {
        this.previousScreen = axu2;
        try {
            Class clazz = Class.forName((String)"com.mojang.realmsclient.RealmsMainScreen");
            Constructor \u26032 = clazz.getDeclaredConstructor(new Class[]{RealmsScreen.class});
            \u26032.setAccessible(true);
            Object \u26033 = \u26032.newInstance(new Object[]{this});
            ave.A().a(((RealmsScreen)\u26033).getProxy());
        }
        catch (Exception exception) {
            LOGGER.error("Realms module missing", (Throwable)exception);
        }
    }

    public awr getNotificationScreen(axu axu2) {
        try {
            this.previousScreen = axu2;
            Class clazz = Class.forName((String)"com.mojang.realmsclient.gui.screens.RealmsNotificationsScreen");
            Constructor \u26032 = clazz.getDeclaredConstructor(new Class[]{RealmsScreen.class});
            \u26032.setAccessible(true);
            Object \u26033 = \u26032.newInstance(new Object[]{this});
            return ((RealmsScreen)\u26033).getProxy();
        }
        catch (Exception exception) {
            LOGGER.error("Realms module missing", (Throwable)exception);
            return null;
        }
    }

    @Override
    public void init() {
        ave.A().a(this.previousScreen);
    }
}
