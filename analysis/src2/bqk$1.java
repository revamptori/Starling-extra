/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  tv.twitch.ErrorCode
 *  tv.twitch.chat.IChatAPIListener
 */
import tv.twitch.ErrorCode;
import tv.twitch.chat.IChatAPIListener;

class bqk.1
implements IChatAPIListener {
    bqk.1() {
    }

    public void chatInitializationCallback(ErrorCode errorCode) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            bqk.this.f.setMessageFlushInterval(bqk.this.n);
            bqk.this.f.setUserChangeEventInterval(bqk.this.o);
            bqk.this.r();
            bqk.this.a(bqk.c.c);
        } else {
            bqk.this.a(bqk.c.a);
        }
        try {
            if (bqk.this.a != null) {
                bqk.this.a.d(errorCode);
            }
        }
        catch (Exception exception) {
            bqk.this.n(exception.toString());
        }
    }

    public void chatShutdownCallback(ErrorCode errorCode2) {
        ErrorCode errorCode2;
        if (ErrorCode.succeeded((ErrorCode)errorCode2)) {
            \u2603 = bqk.this.e.shutdown();
            if (ErrorCode.failed((ErrorCode)\u2603)) {
                String string = ErrorCode.getString((ErrorCode)\u2603);
                bqk.this.n(String.format((String)"Error shutting down the Twitch sdk: %s", (Object[])new Object[]{string}));
            }
            bqk.this.a(bqk.c.a);
        } else {
            bqk.this.a(bqk.c.c);
            bqk.this.n(String.format((String)"Error shutting down Twith chat: %s", (Object[])new Object[]{errorCode2}));
        }
        try {
            if (bqk.this.a != null) {
                bqk.this.a.e(errorCode2);
            }
        }
        catch (Exception exception) {
            bqk.this.n(exception.toString());
        }
    }

    public void chatEmoticonDataDownloadCallback(ErrorCode errorCode) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            bqk.this.s();
        }
    }
}
