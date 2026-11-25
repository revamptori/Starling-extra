/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.Callable
 */
import java.util.concurrent.Callable;

class ato.7
implements Callable<String> {
    ato.7() {
    }

    public String a() throws Exception {
        String string = "Unknown?";
        try {
            switch (ato.this.o) {
                case 19133: {
                    string = "Anvil";
                    break;
                }
                case 19132: {
                    string = "McRegion";
                }
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return String.format((String)"0x%05X - %s", (Object[])new Object[]{ato.this.o, string});
    }

    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}
