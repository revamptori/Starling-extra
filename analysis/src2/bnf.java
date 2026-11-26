/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.io.IOException;

public class bnf
implements bnj {
    private static final jy a = new jy("textures/colormap/grass.png");

    @Override
    public void a(bni bni2) {
        try {
            adl.a(bml.a(bni2, a));
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}
