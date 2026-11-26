/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Map
 */
import com.google.common.collect.Maps;
import java.util.Map;

public class bqa
extends dd<jy, bpy> {
    private Map<jy, bpy> a;

    @Override
    protected Map<jy, bpy> b() {
        this.a = Maps.newHashMap();
        return this.a;
    }

    @Override
    public void a(bpy bpy2) {
        this.a(bpy2.c(), bpy2);
    }

    public void a() {
        this.a.clear();
    }
}
