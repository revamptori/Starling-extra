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

class MinecraftServer.4
implements Callable<String> {
    MinecraftServer.4() {
    }

    public String a() {
        return MinecraftServer.this.v.o() + " / " + MinecraftServer.this.v.p() + "; " + MinecraftServer.this.v.v();
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
