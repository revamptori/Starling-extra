/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Random
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.realms;

import java.util.Random;
import org.apache.commons.lang3.StringUtils;

public class RealmsMth {
    public static float sin(float f) {
        return ns.a(f);
    }

    public static double nextDouble(Random random, double d, double d2) {
        return ns.a(random, d, d2);
    }

    public static int ceil(float f) {
        return ns.f(f);
    }

    public static int floor(double d) {
        return ns.c(d);
    }

    public static int intFloorDiv(int n, int n2) {
        return ns.a(n, n2);
    }

    public static float abs(float f) {
        return ns.e(f);
    }

    public static int clamp(int n, int n2, int n3) {
        return ns.a(n, n2, n3);
    }

    public static double clampedLerp(double d, double d2, double d3) {
        return ns.b(d, d2, d3);
    }

    public static int ceil(double d) {
        return ns.f(d);
    }

    public static boolean isEmpty(String string) {
        return StringUtils.isEmpty((CharSequence)string);
    }

    public static long lfloor(double d) {
        return ns.d(d);
    }

    public static float sqrt(double d) {
        return ns.a(d);
    }

    public static double clamp(double d, double d2, double d3) {
        return ns.a(d, d2, d3);
    }

    public static int getInt(String string, int n) {
        return ns.a(string, n);
    }

    public static double getDouble(String string, double d) {
        return ns.a(string, d);
    }

    public static int log2(int n) {
        return ns.c(n);
    }

    public static int absFloor(double d) {
        return ns.e(d);
    }

    public static int smallestEncompassingPowerOfTwo(int n) {
        return ns.b(n);
    }

    public static float sqrt(float f) {
        return ns.c(f);
    }

    public static float cos(float f) {
        return ns.b(f);
    }

    public static int getInt(String string, int n, int n2) {
        return ns.a(string, n, n2);
    }

    public static int fastFloor(double d) {
        return ns.b(d);
    }

    public static double absMax(double d, double d2) {
        return ns.a(d, d2);
    }

    public static float nextFloat(Random random, float f, float f2) {
        return ns.a(random, f, f2);
    }

    public static double wrapDegrees(double d) {
        return ns.g(d);
    }

    public static float wrapDegrees(float f) {
        return ns.g(f);
    }

    public static float clamp(float f, float f2, float f3) {
        return ns.a(f, f2, f3);
    }

    public static double getDouble(String string, double d, double d2) {
        return ns.a(string, d, d2);
    }

    public static int roundUp(int n, int n2) {
        return ns.c(n, n2);
    }

    public static double average(long[] lArray) {
        return ns.a(lArray);
    }

    public static int floor(float f) {
        return ns.d(f);
    }

    public static int abs(int n) {
        return ns.a(n);
    }

    public static int nextInt(Random random, int n, int n2) {
        return ns.a(random, n, n2);
    }
}
