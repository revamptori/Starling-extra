/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
import java.util.concurrent.Callable;

class bec.4
implements Callable<String> {
    final /* synthetic */ int a;

    bec.4(int n) {
        this.a = n;
    }

    public String a() throws Exception {
        if (this.a == 0) {
            return "MISC_TEXTURE";
        }
        if (this.a == 1) {
            return "TERRAIN_TEXTURE";
        }
        if (this.a == 3) {
            return "ENTITY_PARTICLE_TEXTURE";
        }
        return "Unknown - " + this.a;
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
