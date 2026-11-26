/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Collections2
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.Collection;

public class aml
extends amm<cq> {
    protected aml(String string, Collection<cq> collection) {
        super(string, cq.class, collection);
    }

    public static aml a(String string) {
        return aml.a(string, (Predicate<cq>)Predicates.alwaysTrue());
    }

    public static aml a(String string, Predicate<cq> predicate) {
        return aml.a(string, (Collection<cq>)Collections2.filter((Collection)Lists.newArrayList((Object[])cq.values()), predicate));
    }

    public static aml a(String string, Collection<cq> collection) {
        return new aml(string, collection);
    }
}
