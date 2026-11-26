/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
class bgc.1
extends bgu {
    bgc.1() {
    }

    @Override
    protected bov a(alz alz2) {
        aiw.a a2 = alz2.b(aiw.a);
        switch (a2) {
            default: {
                return new bov("quartz_block", "normal");
            }
            case b: {
                return new bov("chiseled_quartz_block", "normal");
            }
            case c: {
                return new bov("quartz_column", "axis=y");
            }
            case d: {
                return new bov("quartz_column", "axis=x");
            }
            case e: 
        }
        return new bov("quartz_column", "axis=z");
    }
}
