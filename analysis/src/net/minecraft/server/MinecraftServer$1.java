/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package net.minecraft.server;

import net.minecraft.server.MinecraftServer;

class MinecraftServer.1
implements nu {
    private long b = MinecraftServer.az();

    MinecraftServer.1() {
    }

    @Override
    public void a(String string) {
    }

    @Override
    public void b(String string) {
    }

    @Override
    public void a(int n2) {
        if (MinecraftServer.az() - this.b >= 1000L) {
            this.b = MinecraftServer.az();
            k.info("Converting... " + n2 + "%");
        }
    }

    @Override
    public void a() {
    }

    @Override
    public void c(String string) {
    }
}
