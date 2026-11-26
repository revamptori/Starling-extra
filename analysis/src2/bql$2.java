/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  tv.twitch.broadcast.IStatCallbacks
 *  tv.twitch.broadcast.RTMPState
 *  tv.twitch.broadcast.StatType
 */
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.RTMPState;
import tv.twitch.broadcast.StatType;

class bql.2
implements IStatCallbacks {
    bql.2() {
    }

    public void statCallback(StatType statType, long l) {
        switch (statType) {
            case TTV_ST_RTMPSTATE: {
                bql.this.h = RTMPState.lookupValue((int)((int)l));
                break;
            }
            case TTV_ST_RTMPDATASENT: {
                bql.this.g = l;
            }
        }
    }
}
