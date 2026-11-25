/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 */
import java.awt.image.BufferedImage;
import java.io.IOException;

public class blz
extends bly {
    private final int[] f;
    private final int g;
    private final int h;

    public blz(BufferedImage bufferedImage) {
        this(bufferedImage.getWidth(), bufferedImage.getHeight());
        bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), this.f, 0, bufferedImage.getWidth());
        this.d();
    }

    public blz(int n, int n2) {
        this.g = n;
        this.h = n2;
        this.f = new int[n * n2];
        bml.a(this.b(), n, n2);
    }

    @Override
    public void a(bni bni2) throws IOException {
    }

    public void d() {
        bml.a(this.b(), this.f, this.g, this.h);
    }

    public int[] e() {
        return this.f;
    }
}
