/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class p
extends i {
    @Override
    public String c() {
        return "achievement";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(m m2) {
        return "commands.achievement.usage";
    }

    @Override
    public void a(m m22, String[] stringArray) throws bz {
        if (stringArray.length < 2) {
            throw new cf("commands.achievement.usage", new Object[0]);
        }
        final mw mw2 = na.a(stringArray[1]);
        if (mw2 == null && !stringArray[1].equals((Object)"*")) {
            throw new bz("commands.achievement.unknownAchievement", stringArray[1]);
        }
        final lf \u26032 = stringArray.length >= 3 ? p.a(m22, stringArray[2]) : p.b(m22);
        boolean \u26033 = stringArray[0].equalsIgnoreCase("give");
        boolean \u26034 = stringArray[0].equalsIgnoreCase("take");
        if (!\u26033 && !\u26034) {
            return;
        }
        if (mw2 == null) {
            m m22;
            if (\u26033) {
                for (mq mq2 : mr.e) {
                    \u26032.b(mq2);
                }
                p.a(m22, (k)this, "commands.achievement.give.success.all", \u26032.e_());
            } else if (\u26034) {
                for (mq mq3 : Lists.reverse(mr.e)) {
                    \u26032.a(mq3);
                }
                p.a(m22, (k)this, "commands.achievement.take.success.all", \u26032.e_());
            }
            return;
        }
        if (mw2 instanceof mq) {
            mq mq4 = (mq)mw2;
            if (\u26033) {
                if (\u26032.A().a(mq4)) {
                    throw new bz("commands.achievement.alreadyHave", \u26032.e_(), mw2.j());
                }
                ArrayList arrayList = Lists.newArrayList();
                while (mq4.c != null && !\u26032.A().a(mq4.c)) {
                    arrayList.add((Object)mq4.c);
                    mq4 = mq4.c;
                }
                for (mq \u26035 : Lists.reverse((List)arrayList)) {
                    \u26032.b(\u26035);
                }
            } else if (\u26034) {
                if (!\u26032.A().a(mq4)) {
                    throw new bz("commands.achievement.dontHave", \u26032.e_(), mw2.j());
                }
                \u2603 = Lists.newArrayList((Iterator)Iterators.filter((Iterator)mr.e.iterator(), (Predicate)new Predicate<mq>(){

                    public boolean a(mq mq2) {
                        return \u26032.A().a(mq2) && mq2 != mw2;
                    }

                    public /* synthetic */ boolean apply(Object object) {
                        return this.a((mq)object);
                    }
                }));
                \u2603 = Lists.newArrayList((Iterable)\u2603);
                Iterator iterator = \u2603.iterator();
                while (iterator.hasNext()) {
                    mq mq5 = mq6 = (mq)iterator.next();
                    boolean \u26036 = false;
                    while (mq5 != null) {
                        if (mq5 == mw2) {
                            \u26036 = true;
                        }
                        mq5 = mq5.c;
                    }
                    if (\u26036) continue;
                    mq5 = mq6;
                    while (mq5 != null) {
                        \u2603.remove((Object)mq6);
                        mq5 = mq5.c;
                    }
                }
                for (mq mq6 : \u2603) {
                    \u26032.a(mq6);
                }
            }
        }
        if (\u26033) {
            \u26032.b(mw2);
            p.a(m22, (k)this, "commands.achievement.give.success.one", \u26032.e_(), mw2.j());
        } else if (\u26034) {
            \u26032.a(mw2);
            p.a(m22, (k)this, "commands.achievement.take.success.one", mw2.j(), \u26032.e_());
        }
    }

    @Override
    public List<String> a(m m2, String[] stringArray2, cj cj2) {
        String[] stringArray2;
        if (stringArray2.length == 1) {
            return p.a(stringArray2, "give", "take");
        }
        if (stringArray2.length == 2) {
            ArrayList arrayList = Lists.newArrayList();
            for (mw mw2 : na.b) {
                arrayList.add((Object)mw2.e);
            }
            return p.a(stringArray2, arrayList);
        }
        if (stringArray2.length == 3) {
            return p.a(stringArray2, MinecraftServer.N().K());
        }
        return null;
    }

    @Override
    public boolean b(String[] stringArray, int n2) {
        return n2 == 2;
    }
}
