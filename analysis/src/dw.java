/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 */
public class dw {
    public static final dw a = new dw(0L){

        @Override
        public void a(long l) {
        }
    };
    private final long b;
    private long c;

    public dw(long l) {
        this.b = l;
    }

    public void a(long l) {
        this.c += l / 8L;
        if (this.c > this.b) {
            throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.c + "bytes where max allowed: " + this.b);
        }
    }
}
