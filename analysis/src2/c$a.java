/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
static class c.a {
    private final String a;
    private final String b;

    public c.a(String string, Object object2) {
        this.a = string;
        if (object2 == null) {
            this.b = "~~NULL~~";
        } else if (object2 instanceof Throwable) {
            Throwable throwable = (Throwable)object2;
            this.b = "~~ERROR~~ " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage();
        } else {
            Object object2;
            this.b = object2.toString();
        }
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}
