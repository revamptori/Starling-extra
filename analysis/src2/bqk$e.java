/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  tv.twitch.ErrorCode
 *  tv.twitch.chat.ChatRawMessage
 *  tv.twitch.chat.ChatTokenizedMessage
 *  tv.twitch.chat.ChatUserInfo
 */
import tv.twitch.ErrorCode;
import tv.twitch.chat.ChatRawMessage;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.chat.ChatUserInfo;

public static interface bqk.e {
    public void d(ErrorCode var1);

    public void e(ErrorCode var1);

    public void d();

    public void e();

    public void a(bqk.c var1);

    public void a(String var1, ChatTokenizedMessage[] var2);

    public void a(String var1, ChatRawMessage[] var2);

    public void a(String var1, ChatUserInfo[] var2, ChatUserInfo[] var3, ChatUserInfo[] var4);

    public void a(String var1);

    public void b(String var1);

    public void a(String var1, String var2);

    public void c(String var1);

    public void d(String var1);
}
