/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.mojang.authlib.properties.PropertyMap
 *  com.mojang.authlib.properties.PropertyMap$Serializer
 *  java.io.File
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.net.Authenticator
 *  java.net.InetSocketAddress
 *  java.net.PasswordAuthentication
 *  java.net.Proxy
 *  java.net.Proxy$Type
 *  java.net.SocketAddress
 *  java.util.List
 *  joptsimple.ArgumentAcceptingOptionSpec
 *  joptsimple.NonOptionArgumentSpec
 *  joptsimple.OptionParser
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpec
 */
package net.minecraft.client.main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.properties.PropertyMap;
import java.io.File;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.NonOptionArgumentSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;

public class Main {
    public static void main(String[] stringArray) {
        System.setProperty((String)"java.net.preferIPv4Stack", (String)"true");
        OptionParser optionParser = new OptionParser();
        optionParser.allowsUnrecognizedOptions();
        optionParser.accepts("demo");
        optionParser.accepts("fullscreen");
        optionParser.accepts("checkGlErrors");
        ArgumentAcceptingOptionSpec \u26032 = optionParser.accepts("server").withRequiredArg();
        ArgumentAcceptingOptionSpec \u26033 = optionParser.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo((Object)25565, (Object[])new Integer[0]);
        ArgumentAcceptingOptionSpec \u26034 = optionParser.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo((Object)new File("."), (Object[])new File[0]);
        ArgumentAcceptingOptionSpec \u26035 = optionParser.accepts("assetsDir").withRequiredArg().ofType(File.class);
        ArgumentAcceptingOptionSpec \u26036 = optionParser.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
        ArgumentAcceptingOptionSpec \u26037 = optionParser.accepts("proxyHost").withRequiredArg();
        ArgumentAcceptingOptionSpec \u26038 = optionParser.accepts("proxyPort").withRequiredArg().defaultsTo((Object)"8080", (Object[])new String[0]).ofType(Integer.class);
        ArgumentAcceptingOptionSpec \u26039 = optionParser.accepts("proxyUser").withRequiredArg();
        ArgumentAcceptingOptionSpec \u260310 = optionParser.accepts("proxyPass").withRequiredArg();
        ArgumentAcceptingOptionSpec \u260311 = optionParser.accepts("username").withRequiredArg().defaultsTo((Object)("Player" + ave.J() % 1000L), (Object[])new String[0]);
        ArgumentAcceptingOptionSpec \u260312 = optionParser.accepts("uuid").withRequiredArg();
        ArgumentAcceptingOptionSpec \u260313 = optionParser.accepts("accessToken").withRequiredArg().required();
        ArgumentAcceptingOptionSpec \u260314 = optionParser.accepts("version").withRequiredArg().required();
        ArgumentAcceptingOptionSpec \u260315 = optionParser.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo((Object)854, (Object[])new Integer[0]);
        ArgumentAcceptingOptionSpec \u260316 = optionParser.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo((Object)480, (Object[])new Integer[0]);
        ArgumentAcceptingOptionSpec \u260317 = optionParser.accepts("userProperties").withRequiredArg().defaultsTo((Object)"{}", (Object[])new String[0]);
        ArgumentAcceptingOptionSpec \u260318 = optionParser.accepts("profileProperties").withRequiredArg().defaultsTo((Object)"{}", (Object[])new String[0]);
        ArgumentAcceptingOptionSpec \u260319 = optionParser.accepts("assetIndex").withRequiredArg();
        ArgumentAcceptingOptionSpec \u260320 = optionParser.accepts("userType").withRequiredArg().defaultsTo((Object)"legacy", (Object[])new String[0]);
        NonOptionArgumentSpec \u260321 = optionParser.nonOptions();
        OptionSet \u260322 = optionParser.parse(stringArray);
        List \u260323 = \u260322.valuesOf((OptionSpec)\u260321);
        if (!\u260323.isEmpty()) {
            System.out.println("Completely ignored arguments: " + \u260323);
        }
        String \u260324 = (String)\u260322.valueOf((OptionSpec)\u26037);
        Proxy \u260325 = Proxy.NO_PROXY;
        if (\u260324 != null) {
            try {
                \u260325 = new Proxy(Proxy.Type.SOCKS, (SocketAddress)new InetSocketAddress(\u260324, ((Integer)\u260322.valueOf((OptionSpec)\u26038)).intValue()));
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        final String \u260326 = (String)\u260322.valueOf((OptionSpec)\u26039);
        final String \u260327 = (String)\u260322.valueOf((OptionSpec)\u260310);
        if (!\u260325.equals((Object)Proxy.NO_PROXY) && Main.a(\u260326) && Main.a(\u260327)) {
            Authenticator.setDefault((Authenticator)new Authenticator(){

                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(\u260326, \u260327.toCharArray());
                }
            });
        }
        int \u260328 = (Integer)\u260322.valueOf((OptionSpec)\u260315);
        int \u260329 = (Integer)\u260322.valueOf((OptionSpec)\u260316);
        boolean \u260330 = \u260322.has("fullscreen");
        boolean \u260331 = \u260322.has("checkGlErrors");
        boolean \u260332 = \u260322.has("demo");
        String \u260333 = (String)\u260322.valueOf((OptionSpec)\u260314);
        Gson \u260334 = new GsonBuilder().registerTypeAdapter(PropertyMap.class, (Object)new PropertyMap.Serializer()).create();
        PropertyMap \u260335 = (PropertyMap)\u260334.fromJson((String)\u260322.valueOf((OptionSpec)\u260317), PropertyMap.class);
        PropertyMap \u260336 = (PropertyMap)\u260334.fromJson((String)\u260322.valueOf((OptionSpec)\u260318), PropertyMap.class);
        File \u260337 = (File)\u260322.valueOf((OptionSpec)\u26034);
        File \u260338 = \u260322.has((OptionSpec)\u26035) ? (File)\u260322.valueOf((OptionSpec)\u26035) : new File(\u260337, "assets/");
        File \u260339 = \u260322.has((OptionSpec)\u26036) ? (File)\u260322.valueOf((OptionSpec)\u26036) : new File(\u260337, "resourcepacks/");
        String \u260340 = \u260322.has((OptionSpec)\u260312) ? (String)\u260312.value(\u260322) : (String)\u260311.value(\u260322);
        String \u260341 = \u260322.has((OptionSpec)\u260319) ? (String)\u260319.value(\u260322) : null;
        String \u260342 = (String)\u260322.valueOf((OptionSpec)\u26032);
        Integer \u260343 = (Integer)\u260322.valueOf((OptionSpec)\u26033);
        avm \u260344 = new avm((String)\u260311.value(\u260322), \u260340, (String)\u260313.value(\u260322), (String)\u260320.value(\u260322));
        bao \u260345 = new bao(new bao.e(\u260344, \u260335, \u260336, \u260325), new bao.a(\u260328, \u260329, \u260330, \u260331), new bao.b(\u260337, \u260339, \u260338, \u260341), new bao.c(\u260332, \u260333), new bao.d(\u260342, \u260343));
        Runtime.getRuntime().addShutdownHook(new Thread("Client Shutdown Thread"){

            public void run() {
                ave.H();
            }
        });
        Thread.currentThread().setName("Client thread");
        new ave(\u260345).a();
    }

    private static boolean a(String string) {
        return string != null && !string.isEmpty();
    }
}
