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
 *  java.lang.System
 *  java.util.Arrays
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;

public class ds
extends eb {
    private int[] b;

    ds() {
    }

    public ds(int[] nArray) {
        this.b = nArray;
    }

    @Override
    void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.b.length);
        for (int i = 0; i < this.b.length; ++i) {
            dataOutput.writeInt(this.b[i]);
        }
    }

    @Override
    void a(DataInput dataInput, int n, dw dw2) throws IOException {
        dw2.a(192L);
        int n2 = dataInput.readInt();
        dw2.a(32 * n2);
        this.b = new int[n2];
        for (\u2603 = 0; \u2603 < n2; ++\u2603) {
            this.b[\u2603] = dataInput.readInt();
        }
    }

    @Override
    public byte a() {
        return 11;
    }

    @Override
    public String toString() {
        String string = "[";
        for (int n : this.b) {
            string = string + n + ",";
        }
        return string + "]";
    }

    @Override
    public eb b() {
        int[] nArray = new int[this.b.length];
        System.arraycopy((Object)this.b, (int)0, (Object)nArray, (int)0, (int)this.b.length);
        return new ds(nArray);
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            return Arrays.equals((int[])this.b, (int[])((ds)object).b);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode((int[])this.b);
    }

    public int[] c() {
        return this.b;
    }
}
