/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Floats
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.Comparator
 */
import com.google.common.primitives.Floats;
import java.util.Comparator;

class bfd.1
implements Comparator<Integer> {
    final /* synthetic */ float[] a;

    bfd.1(float[] fArray) {
        this.a = fArray;
    }

    public int a(Integer n, Integer n2) {
        return Floats.compare((float)this.a[n2], (float)this.a[n]);
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Integer)object, (Integer)object2);
    }
}
