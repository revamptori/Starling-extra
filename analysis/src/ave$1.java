/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
class ave.1
implements ms {
    ave.1() {
    }

    @Override
    public String a(String string) {
        try {
            return String.format((String)string, (Object[])new Object[]{avh.c(ave.this.t.af.i())});
        }
        catch (Exception exception) {
            return "Error: " + exception.getLocalizedMessage();
        }
    }
}
