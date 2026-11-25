/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 *  tv.twitch.AuthToken
 *  tv.twitch.ErrorCode
 *  tv.twitch.broadcast.ArchivingState
 *  tv.twitch.broadcast.ChannelInfo
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
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.UserInfo;

class bql.1
implements IStreamCallbacks {
    bql.1() {
    }

    public void requestAuthTokenCallback(ErrorCode errorCode, AuthToken authToken) {
    }

    public void loginCallback(ErrorCode errorCode, ChannelInfo channelInfo) {
    }

    public void getIngestServersCallback(ErrorCode errorCode, IngestList ingestList) {
    }

    public void getUserInfoCallback(ErrorCode errorCode, UserInfo userInfo) {
    }

    public void getStreamInfoCallback(ErrorCode errorCode, StreamInfo streamInfo) {
    }

    public void getArchivingStateCallback(ErrorCode errorCode, ArchivingState archivingState) {
    }

    public void runCommercialCallback(ErrorCode errorCode) {
    }

    public void setStreamInfoCallback(ErrorCode errorCode) {
    }

    public void getGameNameListCallback(ErrorCode errorCode, GameInfoList gameInfoList) {
    }

    public void bufferUnlockCallback(long l) {
    }

    public void startCallback(ErrorCode errorCode) {
        bql.this.y = false;
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            bql.this.x = true;
            bql.this.k = System.currentTimeMillis();
            bql.this.a(bql.b.c);
        } else {
            bql.this.m = false;
            bql.this.a(bql.b.e);
        }
    }

    public void stopCallback(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            System.out.println("IngestTester.stopCallback failed to stop - " + bql.this.p.serverName + ": " + errorCode.toString());
        }
        bql.this.z = false;
        bql.this.x = false;
        bql.this.a(bql.b.e);
        bql.this.p = null;
        if (bql.this.q) {
            bql.this.a(bql.b.g);
        }
    }

    public void sendActionMetaDataCallback(ErrorCode errorCode) {
    }

    public void sendStartSpanMetaDataCallback(ErrorCode errorCode) {
    }

    public void sendEndSpanMetaDataCallback(ErrorCode errorCode) {
    }
}
