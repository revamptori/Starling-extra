/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Set
 *  tv.twitch.chat.ChatUserInfo
 *  tv.twitch.chat.ChatUserMode
 *  tv.twitch.chat.ChatUserSubscription
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.ChatUserMode;
import tv.twitch.chat.ChatUserSubscription;

public class bab
extends axu {
    private static final a a = a.c;
    private static final a f = a.m;
    private static final a g = a.f;
    private final ChatUserInfo h;
    private final eu i;
    private final List<eu> r = Lists.newArrayList();
    private final bqm s;
    private int t;

    public bab(bqm bqm2, ChatUserInfo chatUserInfo) {
        this.s = bqm2;
        this.h = chatUserInfo;
        this.i = new fa(chatUserInfo.displayName);
        this.r.addAll(bab.a((Set<ChatUserMode>)chatUserInfo.modes, (Set<ChatUserSubscription>)chatUserInfo.subscriptions, bqm2));
    }

    public static List<eu> a(Set<ChatUserMode> set, Set<ChatUserSubscription> set2, bqm bqm2) {
        fa \u26034;
        eu eu2;
        String string = bqm2 == null ? null : bqm2.z();
        boolean \u26032 = bqm2 != null && bqm2.y();
        ArrayList \u26033 = Lists.newArrayList();
        for (ChatUserMode chatUserMode : set) {
            eu2 = bab.a(chatUserMode, string, \u26032);
            if (eu2 == null) continue;
            \u26034 = new fa("- ");
            \u26034.a(eu2);
            \u26033.add((Object)\u26034);
        }
        for (ChatUserMode chatUserMode : set2) {
            eu2 = bab.a((ChatUserSubscription)chatUserMode, string, \u26032);
            if (eu2 == null) continue;
            \u26034 = new fa("- ");
            \u26034.a(eu2);
            \u26033.add((Object)\u26034);
        }
        return \u26033;
    }

    public static eu a(ChatUserSubscription chatUserSubscription, String string, boolean bl) {
        fb fb2 = null;
        if (chatUserSubscription == ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER) {
            fb2 = string == null ? new fb("stream.user.subscription.subscriber", new Object[0]) : (bl ? new fb("stream.user.subscription.subscriber.self", new Object[0]) : new fb("stream.user.subscription.subscriber.other", string));
            fb2.b().a(a);
        } else if (chatUserSubscription == ChatUserSubscription.TTV_CHAT_USERSUB_TURBO) {
            fb2 = new fb("stream.user.subscription.turbo", new Object[0]);
            fb2.b().a(g);
        }
        return fb2;
    }

    public static eu a(ChatUserMode chatUserMode, String string, boolean bl) {
        fb fb2 = null;
        if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR) {
            fb2 = new fb("stream.user.mode.administrator", new Object[0]);
            fb2.b().a(g);
        } else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_BANNED) {
            fb2 = string == null ? new fb("stream.user.mode.banned", new Object[0]) : (bl ? new fb("stream.user.mode.banned.self", new Object[0]) : new fb("stream.user.mode.banned.other", string));
            fb2.b().a(f);
        } else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_BROADCASTER) {
            fb2 = string == null ? new fb("stream.user.mode.broadcaster", new Object[0]) : (bl ? new fb("stream.user.mode.broadcaster.self", new Object[0]) : new fb("stream.user.mode.broadcaster.other", new Object[0]));
            fb2.b().a(a);
        } else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_MODERATOR) {
            fb2 = string == null ? new fb("stream.user.mode.moderator", new Object[0]) : (bl ? new fb("stream.user.mode.moderator.self", new Object[0]) : new fb("stream.user.mode.moderator.other", string));
            fb2.b().a(a);
        } else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_STAFF) {
            fb2 = new fb("stream.user.mode.staff", new Object[0]);
            fb2.b().a(g);
        }
        return fb2;
    }

    @Override
    public void b() {
        int n;
        int n2 = this.l / 3;
        \u2603 = n2 - 130;
        this.n.add((Object)new avs(1, n2 * 0 + \u2603 / 2, this.m - 70, 130, 20, bnq.a("stream.userinfo.timeout", new Object[0])));
        this.n.add((Object)new avs(0, n2 * 1 + \u2603 / 2, this.m - 70, 130, 20, bnq.a("stream.userinfo.ban", new Object[0])));
        this.n.add((Object)new avs(2, n2 * 2 + \u2603 / 2, this.m - 70, 130, 20, bnq.a("stream.userinfo.mod", new Object[0])));
        this.n.add((Object)new avs(5, n2 * 0 + \u2603 / 2, this.m - 45, 130, 20, bnq.a("gui.cancel", new Object[0])));
        this.n.add((Object)new avs(3, n2 * 1 + \u2603 / 2, this.m - 45, 130, 20, bnq.a("stream.userinfo.unban", new Object[0])));
        this.n.add((Object)new avs(4, n2 * 2 + \u2603 / 2, this.m - 45, 130, 20, bnq.a("stream.userinfo.unmod", new Object[0])));
        n = 0;
        for (eu eu2 : this.r) {
            n = Math.max((int)n, (int)this.q.a(eu2.d()));
        }
        this.t = this.l / 2 - n / 2;
    }

    @Override
    protected void a(avs avs2) {
        if (!avs2.l) {
            return;
        }
        if (avs2.k == 0) {
            this.s.f("/ban " + this.h.displayName);
        } else if (avs2.k == 3) {
            this.s.f("/unban " + this.h.displayName);
        } else if (avs2.k == 2) {
            this.s.f("/mod " + this.h.displayName);
        } else if (avs2.k == 4) {
            this.s.f("/unmod " + this.h.displayName);
        } else if (avs2.k == 1) {
            this.s.f("/timeout " + this.h.displayName);
        }
        this.j.a((axu)null);
    }

    @Override
    public void a(int n3, int n2, float f) {
        int n3;
        this.c();
        this.a(this.q, this.i.c(), this.l / 2, 70, 0xFFFFFF);
        int n4 = 80;
        for (eu eu2 : this.r) {
            this.c(this.q, eu2.d(), this.t, n4, 0xFFFFFF);
            n4 += this.q.a;
        }
        super.a(n3, n2, f);
    }
}
