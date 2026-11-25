/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.ListIterator
 *  tv.twitch.ErrorCode
 *  tv.twitch.chat.ChatBadgeData
 *  tv.twitch.chat.ChatChannelInfo
 *  tv.twitch.chat.ChatEvent
 *  tv.twitch.chat.ChatRawMessage
 *  tv.twitch.chat.ChatTokenizedMessage
 *  tv.twitch.chat.ChatUserInfo
 *  tv.twitch.chat.IChatChannelListener
 */
import com.google.common.collect.Lists;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import tv.twitch.ErrorCode;
import tv.twitch.chat.ChatBadgeData;
import tv.twitch.chat.ChatChannelInfo;
import tv.twitch.chat.ChatEvent;
import tv.twitch.chat.ChatRawMessage;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.IChatChannelListener;

public class bqk.b
implements IChatChannelListener {
    protected String a = null;
    protected boolean b = false;
    protected bqk.a c = bqk.a.a;
    protected List<ChatUserInfo> d = Lists.newArrayList();
    protected LinkedList<ChatRawMessage> e = new LinkedList();
    protected LinkedList<ChatTokenizedMessage> f = new LinkedList();
    protected ChatBadgeData g = null;

    public bqk.b(String string) {
        this.a = string;
    }

    public bqk.a a() {
        return this.c;
    }

    public boolean a(boolean bl) {
        this.b = bl;
        ErrorCode errorCode = ErrorCode.TTV_EC_SUCCESS;
        errorCode = bl ? bqk.this.f.connectAnonymous(this.a, (IChatChannelListener)this) : bqk.this.f.connect(this.a, bqk.this.b, bqk.this.h.data, (IChatChannelListener)this);
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            bqk.this.n(String.format((String)"Error connecting: %s", (Object[])new Object[]{string}));
            this.d(this.a);
            return false;
        }
        this.a(bqk.a.b);
        this.h();
        return true;
    }

    public boolean g() {
        switch (this.c) {
            case c: 
            case b: {
                ErrorCode errorCode = bqk.this.f.disconnect(this.a);
                if (ErrorCode.failed((ErrorCode)errorCode)) {
                    String string = ErrorCode.getString((ErrorCode)errorCode);
                    bqk.this.n(String.format((String)"Error disconnecting: %s", (Object[])new Object[]{string}));
                    return false;
                }
                this.a(bqk.a.d);
                return true;
            }
        }
        return false;
    }

    protected void a(bqk.a a2) {
        if (a2 == this.c) {
            return;
        }
        this.c = a2;
    }

    public void a(String string2) {
        if (bqk.this.l == bqk.d.a) {
            this.e.clear();
            this.f.clear();
        } else {
            ChatRawMessage chatRawMessage;
            ListIterator listIterator;
            if (this.e.size() > 0) {
                listIterator = this.e.listIterator();
                while (listIterator.hasNext()) {
                    chatRawMessage = (ChatRawMessage)listIterator.next();
                    if (!chatRawMessage.userName.equals((Object)string2)) continue;
                    listIterator.remove();
                }
            }
            if (this.f.size() > 0) {
                listIterator = this.f.listIterator();
                while (listIterator.hasNext()) {
                    chatRawMessage = (ChatTokenizedMessage)listIterator.next();
                    if (!chatRawMessage.displayName.equals((Object)string2)) continue;
                    listIterator.remove();
                }
            }
        }
        try {
            if (bqk.this.a != null) {
                String string2;
                bqk.this.a.a(this.a, string2);
            }
        }
        catch (Exception exception) {
            bqk.this.n(exception.toString());
        }
    }

    public boolean b(String string) {
        if (this.c != bqk.a.c) {
            return false;
        }
        ErrorCode errorCode = bqk.this.f.sendMessage(this.a, string);
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string2 = ErrorCode.getString((ErrorCode)errorCode);
            bqk.this.n(String.format((String)"Error sending chat message: %s", (Object[])new Object[]{string2}));
            return false;
        }
        return true;
    }

    protected void h() {
        ErrorCode errorCode;
        if (bqk.this.l == bqk.d.a) {
            return;
        }
        if (this.g == null && ErrorCode.failed((ErrorCode)(errorCode = bqk.this.f.downloadBadgeData(this.a)))) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            bqk.this.n(String.format((String)"Error trying to download badge data: %s", (Object[])new Object[]{string}));
        }
    }

    protected void i() {
        if (this.g != null) {
            return;
        }
        this.g = new ChatBadgeData();
        ErrorCode errorCode = bqk.this.f.getBadgeData(this.a, this.g);
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            try {
                if (bqk.this.a != null) {
                    bqk.this.a.c(this.a);
                }
            }
            catch (Exception exception) {
                bqk.this.n(exception.toString());
            }
        } else {
            bqk.this.n("Error preparing badge data: " + ErrorCode.getString((ErrorCode)errorCode));
        }
    }

    protected void j() {
        if (this.g == null) {
            return;
        }
        ErrorCode errorCode = bqk.this.f.clearBadgeData(this.a);
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.g = null;
            try {
                if (bqk.this.a != null) {
                    bqk.this.a.d(this.a);
                }
            }
            catch (Exception exception) {
                bqk.this.n(exception.toString());
            }
        } else {
            bqk.this.n("Error releasing badge data: " + ErrorCode.getString((ErrorCode)errorCode));
        }
    }

    protected void c(String string) {
        try {
            if (bqk.this.a != null) {
                bqk.this.a.a(string);
            }
        }
        catch (Exception exception) {
            bqk.this.n(exception.toString());
        }
    }

    protected void d(String string) {
        try {
            if (bqk.this.a != null) {
                bqk.this.a.b(string);
            }
        }
        catch (Exception exception) {
            bqk.this.n(exception.toString());
        }
    }

    private void k() {
        if (this.c != bqk.a.e) {
            this.a(bqk.a.e);
            this.d(this.a);
            this.j();
        }
    }

    public void chatStatusCallback(String string, ErrorCode errorCode) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            return;
        }
        bqk.this.i.remove((Object)string);
        this.k();
    }

    public void chatChannelMembershipCallback(String string, ChatEvent chatEvent, ChatChannelInfo chatChannelInfo) {
        switch (chatEvent) {
            case TTV_CHAT_JOINED_CHANNEL: {
                this.a(bqk.a.c);
                this.c(string);
                break;
            }
            case TTV_CHAT_LEFT_CHANNEL: {
                this.k();
                break;
            }
        }
    }

    public void chatChannelUserChangeCallback(String string, ChatUserInfo[] chatUserInfoArray4, ChatUserInfo[] chatUserInfoArray2, ChatUserInfo[] chatUserInfoArray3) {
        int n;
        for (n = 0; n < chatUserInfoArray2.length; ++n) {
            \u2603 = this.d.indexOf((Object)chatUserInfoArray2[n]);
            if (\u2603 < 0) continue;
            this.d.remove(\u2603);
        }
        for (n = 0; n < chatUserInfoArray3.length; ++n) {
            \u2603 = this.d.indexOf((Object)chatUserInfoArray3[n]);
            if (\u2603 >= 0) {
                this.d.remove(\u2603);
            }
            this.d.add((Object)chatUserInfoArray3[n]);
        }
        for (n = 0; n < chatUserInfoArray4.length; ++n) {
            this.d.add((Object)chatUserInfoArray4[n]);
        }
        try {
            if (bqk.this.a != null) {
                ChatUserInfo[] chatUserInfoArray4;
                bqk.this.a.a(this.a, chatUserInfoArray4, chatUserInfoArray2, chatUserInfoArray3);
            }
        }
        catch (Exception exception) {
            bqk.this.n(exception.toString());
        }
    }

    public void chatChannelRawMessageCallback(String string, ChatRawMessage[] chatRawMessageArray2) {
        for (int i = 0; i < chatRawMessageArray2.length; ++i) {
            this.e.addLast((Object)chatRawMessageArray2[i]);
        }
        try {
            if (bqk.this.a != null) {
                ChatRawMessage[] chatRawMessageArray2;
                bqk.this.a.a(this.a, chatRawMessageArray2);
            }
        }
        catch (Exception exception) {
            bqk.this.n(exception.toString());
        }
        while (this.e.size() > bqk.this.j) {
            this.e.removeFirst();
        }
    }

    public void chatChannelTokenizedMessageCallback(String string, ChatTokenizedMessage[] chatTokenizedMessageArray2) {
        for (int i = 0; i < chatTokenizedMessageArray2.length; ++i) {
            this.f.addLast((Object)chatTokenizedMessageArray2[i]);
        }
        try {
            if (bqk.this.a != null) {
                ChatTokenizedMessage[] chatTokenizedMessageArray2;
                bqk.this.a.a(this.a, chatTokenizedMessageArray2);
            }
        }
        catch (Exception exception) {
            bqk.this.n(exception.toString());
        }
        while (this.f.size() > bqk.this.j) {
            this.f.removeFirst();
        }
    }

    public void chatClearCallback(String string, String string2) {
        this.a(string2);
    }

    public void chatBadgeDataDownloadCallback(String string, ErrorCode errorCode) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.i();
        }
    }
}
