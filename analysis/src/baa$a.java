/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
public static enum baa.a {
    a(new fb("stream.unavailable.no_fbo", new Object[0])),
    b(new fb("stream.unavailable.library_arch_mismatch", new Object[0])),
    c(new fb("stream.unavailable.library_failure", new Object[0]), new fb("stream.unavailable.report_to_mojang", new Object[0])),
    d(new fb("stream.unavailable.not_supported.windows", new Object[0])),
    e(new fb("stream.unavailable.not_supported.mac", new Object[0]), new fb("stream.unavailable.not_supported.mac.okay", new Object[0])),
    f(new fb("stream.unavailable.not_supported.other", new Object[0])),
    g(new fb("stream.unavailable.account_not_migrated", new Object[0]), new fb("stream.unavailable.account_not_migrated.okay", new Object[0])),
    h(new fb("stream.unavailable.account_not_bound", new Object[0]), new fb("stream.unavailable.account_not_bound.okay", new Object[0])),
    i(new fb("stream.unavailable.failed_auth", new Object[0]), new fb("stream.unavailable.failed_auth.okay", new Object[0])),
    j(new fb("stream.unavailable.failed_auth_error", new Object[0])),
    k(new fb("stream.unavailable.initialization_failure", new Object[0]), new fb("stream.unavailable.report_to_mojang", new Object[0])),
    l(new fb("stream.unavailable.unknown", new Object[0]), new fb("stream.unavailable.report_to_mojang", new Object[0]));

    private final eu m;
    private final eu n;

    private baa.a(eu eu2) {
        this(eu2, null);
    }

    private baa.a(eu eu2, eu eu3) {
        this.m = eu2;
        this.n = eu3;
    }

    public eu a() {
        return this.m;
    }

    public eu b() {
        return this.n;
    }
}
