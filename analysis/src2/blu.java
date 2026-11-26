/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class blu {
    private static final Logger a = LogManager.getLogger();
    private static blu b;

    public static void a() {
        b = new blu();
    }

    public static blu b() {
        return b;
    }

    private blu() {
    }

    public void a(blq blq2) {
        blq2.f().b(blq2);
        blq2.e().b(blq2);
        bqs.e(blq2.h());
    }

    public int c() throws kc {
        int n = bqs.d();
        if (n <= 0) {
            throw new kc("Could not create shader program (returned program ID " + n + ")");
        }
        return n;
    }

    public void b(blq blq2) throws IOException {
        blq2.f().a(blq2);
        blq2.e().a(blq2);
        bqs.f(blq2.h());
        int n = bqs.a(blq2.h(), bqs.m);
        if (n == 0) {
            a.warn("Error encountered when linking program containing VS " + blq2.e().a() + " and FS " + blq2.f().a() + ". Log output:");
            a.warn(bqs.e(blq2.h(), 32768));
        }
    }
}
