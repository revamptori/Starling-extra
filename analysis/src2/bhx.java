/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.BitSet
 *  java.util.Set
 */
import java.util.BitSet;
import java.util.Set;

public class bhx {
    private static final int a = cq.values().length;
    private final BitSet b = new BitSet(a * a);

    public void a(Set<cq> set) {
        for (cq cq2 : set) {
            for (cq cq3 : set) {
                this.a(cq2, cq3, true);
            }
        }
    }

    public void a(cq cq2, cq cq3, boolean bl) {
        this.b.set(cq2.ordinal() + cq3.ordinal() * a, bl);
        this.b.set(cq3.ordinal() + cq2.ordinal() * a, bl);
    }

    public void a(boolean bl) {
        this.b.set(0, this.b.size(), bl);
    }

    public boolean a(cq cq2, cq cq3) {
        return this.b.get(cq2.ordinal() + cq3.ordinal() * a);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(' ');
        for (cq cq2 : cq.values()) {
            stringBuilder.append(' ').append(cq2.toString().toUpperCase().charAt(0));
        }
        stringBuilder.append('\n');
        for (cq cq2 : cq.values()) {
            stringBuilder.append(cq2.toString().toUpperCase().charAt(0));
            for (cq cq3 : cq.values()) {
                if (cq2 == cq3) {
                    stringBuilder.append("  ");
                    continue;
                }
                boolean bl = this.a(cq2, cq3);
                stringBuilder.append(' ').append(bl ? (char)'Y' : 'n');
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}
