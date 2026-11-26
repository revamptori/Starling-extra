/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Map
 *  java.util.Map$Entry
 */
import java.util.Map;

public class aqf
extends aqq {
    private double d = 0.004;

    public aqf() {
    }

    @Override
    public String a() {
        return "Mineshaft";
    }

    public aqf(Map<String, String> map) {
        for (Map.Entry entry : map.entrySet()) {
            if (!((String)entry.getKey()).equals((Object)"chance")) continue;
            this.d = ns.a((String)entry.getValue(), this.d);
        }
    }

    @Override
    protected boolean a(int n, int n2) {
        return this.b.nextDouble() < this.d && this.b.nextInt(80) < Math.max((int)Math.abs((int)n), (int)Math.abs((int)n2));
    }

    @Override
    protected aqu b(int n, int n2) {
        return new aqh(this.c, this.b, n, n2);
    }
}
