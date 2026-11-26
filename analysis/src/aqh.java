/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 *  java.util.Random
 */
import java.util.List;
import java.util.Random;

public class aqh
extends aqu {
    public aqh() {
    }

    public aqh(adm adm2, Random random, int n, int n2) {
        super(n, n2);
        aqg.c c2 = new aqg.c(0, random, (n << 4) + 2, (n2 << 4) + 2);
        this.a.add((Object)c2);
        c2.a(c2, (List<aqt>)this.a, random);
        this.c();
        this.a(adm2, random, 10);
    }
}
