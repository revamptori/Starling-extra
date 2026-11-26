/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  tv.twitch.AuthToken
 *  tv.twitch.ErrorCode
 *  tv.twitch.broadcast.ArchivingState
 *  tv.twitch.broadcast.ChannelInfo
 *  tv.twitch.broadcast.FrameBuffer
 *  tv.twitch.broadcast.GameInfo
 *  tv.twitch.broadcast.GameInfoList
 *  tv.twitch.broadcast.IStreamCallbacks
 *  tv.twitch.broadcast.IngestList
 *  tv.twitch.broadcast.StreamInfo
 *  tv.twitch.broadcast.UserInfo
 */
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.GameInfo;
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.UserInfo;

class bqj.1
implements IStreamCallbacks {
    bqj.1() {
    }

    public void requestAuthTokenCallback(ErrorCode errorCode2, AuthToken authToken) {
        if (ErrorCode.succeeded((ErrorCode)errorCode2)) {
            bqj.this.u = authToken;
            bqj.this.a(bqj.a.d);
        } else {
            bqj.this.u.data = "";
            bqj.this.a(bqj.a.b);
            String string = ErrorCode.getString((ErrorCode)errorCode2);
            bqj.this.d(String.format((String)"RequestAuthTokenDoneCallback got failure: %s", (Object[])new Object[]{string}));
        }
        try {
            if (bqj.this.c != null) {
                ErrorCode errorCode2;
                bqj.this.c.a(errorCode2, authToken);
            }
        }
        catch (Exception exception) {
            bqj.this.d(exception.toString());
        }
    }

    public void loginCallback(ErrorCode errorCode2, ChannelInfo channelInfo) {
        if (ErrorCode.succeeded((ErrorCode)errorCode2)) {
            bqj.this.v = channelInfo;
            bqj.this.a(bqj.a.f);
            bqj.this.m = true;
        } else {
            bqj.this.a(bqj.a.b);
            bqj.this.m = false;
            String string = ErrorCode.getString((ErrorCode)errorCode2);
            bqj.this.d(String.format((String)"LoginCallback got failure: %s", (Object[])new Object[]{string}));
        }
        try {
            if (bqj.this.c != null) {
                ErrorCode errorCode2;
                bqj.this.c.a(errorCode2);
            }
        }
        catch (Exception exception) {
            bqj.this.d(exception.toString());
        }
    }

    public void getIngestServersCallback(ErrorCode errorCode2, IngestList ingestList) {
        if (ErrorCode.succeeded((ErrorCode)errorCode2)) {
            bqj.this.s = ingestList;
            bqj.this.t = bqj.this.s.getDefaultServer();
            bqj.this.a(bqj.a.h);
            try {
                if (bqj.this.c != null) {
                    bqj.this.c.a(ingestList);
                }
            }
            catch (Exception exception) {
                bqj.this.d(exception.toString());
            }
        } else {
            ErrorCode errorCode2;
            String \u26032 = ErrorCode.getString((ErrorCode)errorCode2);
            bqj.this.d(String.format((String)"IngestListCallback got failure: %s", (Object[])new Object[]{\u26032}));
            bqj.this.a(bqj.a.e);
        }
    }

    public void getUserInfoCallback(ErrorCode errorCode, UserInfo userInfo) {
        bqj.this.w = userInfo;
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            bqj.this.d(String.format((String)"UserInfoDoneCallback got failure: %s", (Object[])new Object[]{string}));
        }
    }

    public void getStreamInfoCallback(ErrorCode errorCode2, StreamInfo streamInfo) {
        if (ErrorCode.succeeded((ErrorCode)errorCode2)) {
            bqj.this.x = streamInfo;
            try {
                if (bqj.this.c != null) {
                    bqj.this.c.a(streamInfo);
                }
            }
            catch (Exception exception) {
                bqj.this.d(exception.toString());
            }
        } else {
            ErrorCode errorCode2;
            String \u26032 = ErrorCode.getString((ErrorCode)errorCode2);
            bqj.this.e(String.format((String)"StreamInfoDoneCallback got failure: %s", (Object[])new Object[]{\u26032}));
        }
    }

    public void getArchivingStateCallback(ErrorCode errorCode, ArchivingState archivingState) {
        bqj.this.y = archivingState;
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            // empty if block
        }
    }

    public void runCommercialCallback(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            bqj.this.e(String.format((String)"RunCommercialCallback got failure: %s", (Object[])new Object[]{string}));
        }
    }

    public void setStreamInfoCallback(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            bqj.this.e(String.format((String)"SetStreamInfoCallback got failure: %s", (Object[])new Object[]{string}));
        }
    }

    public void getGameNameListCallback(ErrorCode errorCode2, GameInfoList gameInfoList) {
        if (ErrorCode.failed((ErrorCode)errorCode2)) {
            String string = ErrorCode.getString((ErrorCode)errorCode2);
            bqj.this.d(String.format((String)"GameNameListCallback got failure: %s", (Object[])new Object[]{string}));
        }
        try {
            if (bqj.this.c != null) {
                ErrorCode errorCode2;
                bqj.this.c.a(errorCode2, gameInfoList == null ? new GameInfo[]{} : gameInfoList.list);
            }
        }
        catch (Exception exception) {
            bqj.this.d(exception.toString());
        }
    }

    public void bufferUnlockCallback(long l) {
        FrameBuffer frameBuffer = FrameBuffer.lookupBuffer((long)l);
        bqj.this.k.add((Object)frameBuffer);
    }

    public void startCallback(ErrorCode errorCode2) {
        if (ErrorCode.succeeded((ErrorCode)errorCode2)) {
            try {
                if (bqj.this.c != null) {
                    bqj.this.c.b();
                }
            }
            catch (Exception exception) {
                bqj.this.d(exception.toString());
            }
            bqj.this.a(bqj.a.k);
        } else {
            bqj.this.q = null;
            bqj.this.r = null;
            bqj.this.a(bqj.a.i);
            try {
                if (bqj.this.c != null) {
                    ErrorCode errorCode2;
                    bqj.this.c.c(errorCode2);
                }
            }
            catch (Exception exception) {
                bqj.this.d(exception.toString());
            }
            String string = ErrorCode.getString((ErrorCode)errorCode2);
            bqj.this.d(String.format((String)"startCallback got failure: %s", (Object[])new Object[]{string}));
        }
    }

    public void stopCallback(ErrorCode errorCode2) {
        if (ErrorCode.succeeded((ErrorCode)errorCode2)) {
            bqj.this.q = null;
            bqj.this.r = null;
            bqj.this.P();
            try {
                if (bqj.this.c != null) {
                    bqj.this.c.c();
                }
            }
            catch (Exception exception) {
                bqj.this.d(exception.toString());
            }
            if (bqj.this.m) {
                bqj.this.a(bqj.a.i);
            } else {
                bqj.this.a(bqj.a.b);
            }
        } else {
            ErrorCode errorCode2;
            bqj.this.a(bqj.a.i);
            String \u26032 = ErrorCode.getString((ErrorCode)errorCode2);
            bqj.this.d(String.format((String)"stopCallback got failure: %s", (Object[])new Object[]{\u26032}));
        }
    }

    public void sendActionMetaDataCallback(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            bqj.this.d(String.format((String)"sendActionMetaDataCallback got failure: %s", (Object[])new Object[]{string}));
        }
    }

    public void sendStartSpanMetaDataCallback(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            bqj.this.d(String.format((String)"sendStartSpanMetaDataCallback got failure: %s", (Object[])new Object[]{string}));
        }
    }

    public void sendEndSpanMetaDataCallback(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            bqj.this.d(String.format((String)"sendEndSpanMetaDataCallback got failure: %s", (Object[])new Object[]{string}));
        }
    }
}
