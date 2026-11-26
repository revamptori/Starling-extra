/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
public class fh {
    public static <T extends ep> void a(final ff<T> ff2, final T t, od od2) throws ki {
        if (!od2.aJ()) {
            od2.a(new Runnable(){

                public void run() {
                    ff2.a(t);
                }
            });
            throw ki.a;
        }
    }
}
