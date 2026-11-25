/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Array
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.StringUtils
 */
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class ame {
    private static final Joiner a = Joiner.on((String)",");
    private final List<String[]> b = Lists.newArrayList();
    private final Map<Character, Predicate<amc>> c = Maps.newHashMap();
    private int d;
    private int e;

    private ame() {
        this.c.put((Object)Character.valueOf((char)' '), (Object)Predicates.alwaysTrue());
    }

    public ame a(String ... stringArray2) {
        String[] stringArray2;
        if (ArrayUtils.isEmpty((Object[])stringArray2) || StringUtils.isEmpty((CharSequence)stringArray2[0])) {
            throw new IllegalArgumentException("Empty pattern for aisle");
        }
        if (this.b.isEmpty()) {
            this.d = stringArray2.length;
            this.e = stringArray2[0].length();
        }
        if (stringArray2.length != this.d) {
            throw new IllegalArgumentException("Expected aisle with height of " + this.d + ", but was given one with a height of " + stringArray2.length + ")");
        }
        for (String string : stringArray2) {
            if (string.length() != this.e) {
                throw new IllegalArgumentException("Not all rows in the given aisle are the correct width (expected " + this.e + ", found one with " + string.length() + ")");
            }
            for (char c : string.toCharArray()) {
                if (this.c.containsKey((Object)Character.valueOf((char)c))) continue;
                this.c.put((Object)Character.valueOf((char)c), null);
            }
        }
        this.b.add((Object)stringArray2);
        return this;
    }

    public static ame a() {
        return new ame();
    }

    public ame a(char c, Predicate<amc> predicate) {
        this.c.put((Object)Character.valueOf((char)c), predicate);
        return this;
    }

    public amd b() {
        return new amd(this.c());
    }

    private Predicate<amc>[][][] c() {
        this.d();
        Predicate[][][] predicateArray = (Predicate[][][])Array.newInstance(Predicate.class, (int[])new int[]{this.b.size(), this.d, this.e});
        for (int i = 0; i < this.b.size(); ++i) {
            for (\u2603 = 0; \u2603 < this.d; ++\u2603) {
                for (\u2603 = 0; \u2603 < this.e; ++\u2603) {
                    predicateArray[i][\u2603][\u2603] = (Predicate)this.c.get((Object)Character.valueOf((char)((String[])this.b.get(i))[\u2603].charAt(\u2603)));
                }
            }
        }
        return predicateArray;
    }

    private void d() {
        ArrayList arrayList = Lists.newArrayList();
        for (Map.Entry entry : this.c.entrySet()) {
            if (entry.getValue() != null) continue;
            arrayList.add(entry.getKey());
        }
        if (!arrayList.isEmpty()) {
            throw new IllegalStateException("Predicates for character(s) " + a.join((Iterable)arrayList) + " are missing");
        }
    }
}
