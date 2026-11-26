/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.net.Authenticator
 *  java.net.PasswordAuthentication
 */
package net.minecraft.client.main;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

static final class Main.1
extends Authenticator {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    Main.1(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.a, this.b.toCharArray());
    }
}
