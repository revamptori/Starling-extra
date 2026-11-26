/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Set
 */
import java.util.Set;

class bot.2
implements bmb {
    final /* synthetic */ Set a;

    bot.2(Set set) {
        this.a = set;
    }

    @Override
    public void a(bmh bmh2) {
        for (jy jy2 : this.a) {
            bmi bmi2 = bmh2.a(jy2);
            bot.this.g.put((Object)jy2, (Object)bmi2);
        }
    }
}
