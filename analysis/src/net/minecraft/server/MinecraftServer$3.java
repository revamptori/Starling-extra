/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
package net.minecraft.server;

import java.util.concurrent.Callable;

class MinecraftServer.3
implements Callable<String> {
    MinecraftServer.3() {
    }

    public String a() throws Exception {
        return MinecraftServer.this.c.a ? MinecraftServer.this.c.c() : "N/A (disabled)";
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
