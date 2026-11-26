/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.BitSet
 *  java.util.EnumSet
 *  java.util.LinkedList
 *  java.util.Set
 */
import com.google.common.collect.Lists;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.Set;

public class bhw {
    private static final int a = (int)Math.pow((double)16.0, (double)0.0);
    private static final int b = (int)Math.pow((double)16.0, (double)1.0);
    private static final int c = (int)Math.pow((double)16.0, (double)2.0);
    private final BitSet d = new BitSet(4096);
    private static final int[] e = new int[1352];
    private int f = 4096;

    public void a(cj cj2) {
        this.d.set(bhw.c(cj2), true);
        --this.f;
    }

    private static int c(cj cj2) {
        return bhw.a(cj2.n() & 0xF, cj2.o() & 0xF, cj2.p() & 0xF);
    }

    private static int a(int n, int n2, int n3) {
        return n << 0 | n2 << 8 | n3 << 4;
    }

    public bhx a() {
        bhx bhx2 = new bhx();
        if (4096 - this.f < 256) {
            bhx2.a(true);
        } else if (this.f == 0) {
            bhx2.a(false);
        } else {
            for (int n : e) {
                if (this.d.get(n)) continue;
                bhx2.a(this.a(n));
            }
        }
        return bhx2;
    }

    public Set<cq> b(cj cj2) {
        return this.a(bhw.c(cj2));
    }

    private Set<cq> a(int n) {
        EnumSet enumSet = EnumSet.noneOf(cq.class);
        LinkedList \u26032 = Lists.newLinkedList();
        \u26032.add((Object)nl.a(n));
        this.d.set(n, true);
        while (!\u26032.isEmpty()) {
            int n2 = (Integer)\u26032.poll();
            this.a(n2, (Set<cq>)enumSet);
            for (cq cq2 : cq.values()) {
                int n3 = this.a(n2, cq2);
                if (n3 < 0 || this.d.get(n3)) continue;
                this.d.set(n3, true);
                \u26032.add((Object)nl.a(n3));
            }
        }
        return enumSet;
    }

    private void a(int n, Set<cq> set) {
        int n2 = n >> 0 & 0xF;
        if (n2 == 0) {
            set.add((Object)cq.e);
        } else if (n2 == 15) {
            set.add((Object)cq.f);
        }
        \u2603 = n >> 8 & 0xF;
        if (\u2603 == 0) {
            set.add((Object)cq.a);
        } else if (\u2603 == 15) {
            set.add((Object)cq.b);
        }
        \u2603 = n >> 4 & 0xF;
        if (\u2603 == 0) {
            set.add((Object)cq.c);
        } else if (\u2603 == 15) {
            set.add((Object)cq.d);
        }
    }

    private int a(int n, cq cq2) {
        switch (cq2) {
            case a: {
                if ((n >> 8 & 0xF) == 0) {
                    return -1;
                }
                return n - c;
            }
            case b: {
                if ((n >> 8 & 0xF) == 15) {
                    return -1;
                }
                return n + c;
            }
            case c: {
                if ((n >> 4 & 0xF) == 0) {
                    return -1;
                }
                return n - b;
            }
            case d: {
                if ((n >> 4 & 0xF) == 15) {
                    return -1;
                }
                return n + b;
            }
            case e: {
                if ((n >> 0 & 0xF) == 0) {
                    return -1;
                }
                return n - a;
            }
            case f: {
                if ((n >> 0 & 0xF) == 15) {
                    return -1;
                }
                return n + a;
            }
        }
        return -1;
    }

    static {
        boolean bl = false;
        int \u26032 = 15;
        int \u26033 = 0;
        for (int i = 0; i < 16; ++i) {
            for (\u2603 = 0; \u2603 < 16; ++\u2603) {
                for (\u2603 = 0; \u2603 < 16; ++\u2603) {
                    if (i != 0 && i != 15 && \u2603 != 0 && \u2603 != 15 && \u2603 != 0 && \u2603 != 15) continue;
                    bhw.e[\u26033++] = bhw.a(i, \u2603, \u2603);
                }
            }
        }
    }
}
