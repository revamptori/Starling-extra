/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
public class ev {
    public static eu a(m m2, eu eu22, pk pk2) throws bz {
        eu eu22;
        Object \u26034;
        eu \u26033 = null;
        if (eu22 instanceof ex) {
            \u26034 = (ex)eu22;
            String \u26032 = ((ex)\u26034).g();
            if (o.b(\u26032)) {
                object = o.b(m2, \u26032, pk.class);
                if (object.size() == 1) {
                    \u26032 = ((pk)object.get(0)).e_();
                } else {
                    throw new ca();
                }
            }
            \u26033 = pk2 != null && \u26032.equals((Object)"*") ? new ex(pk2.e_(), ((ex)\u26034).h()) : new ex(\u26032, ((ex)\u26034).h());
            ((ex)\u26033).b(((ex)\u26034).e());
        } else if (eu22 instanceof ey) {
            \u26034 = ((ey)eu22).g();
            \u26033 = o.b(m2, (String)\u26034);
            if (\u26033 == null) {
                \u26033 = new fa("");
            }
        } else if (eu22 instanceof fa) {
            \u26033 = new fa(((fa)eu22).g());
        } else if (eu22 instanceof fb) {
            \u26034 = ((fb)eu22).j();
            for (int i = 0; i < ((Object[])\u26034).length; ++i) {
                Object object = \u26034[i];
                if (!(object instanceof eu)) continue;
                \u26034[i] = ev.a(m2, (eu)object, pk2);
            }
            \u26033 = new fb(((fb)eu22).i(), (Object[])\u26034);
        } else {
            return eu22;
        }
        \u26034 = eu22.b();
        if (\u26034 != null) {
            \u26033.a(((ez)\u26034).m());
        }
        for (Object object : eu22.a()) {
            \u26033.a(ev.a(m2, object, pk2));
        }
        return \u26033;
    }
}
