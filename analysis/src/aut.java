/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 */
import java.util.List;

public class aut
extends aus {
    public aut(String string) {
        super(string);
    }

    @Override
    public int a(List<wn> list2) {
        List<wn> list2;
        float f = 0.0f;
        for (wn wn2 : list2) {
            f += wn2.bn() + wn2.bN();
        }
        if (list2.size() > 0) {
            f /= (float)list2.size();
        }
        return ns.f(f);
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public auu.a c() {
        return auu.a.b;
    }
}
