/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.DataInput
 *  java.io.DataOutput
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class dq
extends eb {
    dq() {
    }

    @Override
    void a(DataInput dataInput, int n, dw dw2) throws IOException {
        dw2.a(64L);
    }

    @Override
    void a(DataOutput dataOutput) throws IOException {
    }

    @Override
    public byte a() {
        return 0;
    }

    @Override
    public String toString() {
        return "END";
    }

    @Override
    public eb b() {
        return new dq();
    }
}
