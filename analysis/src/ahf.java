/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class ahf
extends agr {
    @Override
    public zw a(alz alz2, Random random, int n) {
        if (n > 3) {
            n = 3;
        }
        if (random.nextInt(10 - n * 3) == 0) {
            return zy.ak;
        }
        return zw.a(this);
    }

    @Override
    public arn g(alz alz2) {
        return arn.m;
    }
}
