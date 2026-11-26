/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Queues
 *  com.google.common.collect.Sets
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.io.StringReader
 *  java.lang.Exception
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bot {
    private static final Set<jy> b = Sets.newHashSet((Object[])new jy[]{new jy("blocks/water_flow"), new jy("blocks/water_still"), new jy("blocks/lava_flow"), new jy("blocks/lava_still"), new jy("blocks/destroy_stage_0"), new jy("blocks/destroy_stage_1"), new jy("blocks/destroy_stage_2"), new jy("blocks/destroy_stage_3"), new jy("blocks/destroy_stage_4"), new jy("blocks/destroy_stage_5"), new jy("blocks/destroy_stage_6"), new jy("blocks/destroy_stage_7"), new jy("blocks/destroy_stage_8"), new jy("blocks/destroy_stage_9"), new jy("items/empty_armor_slot_helmet"), new jy("items/empty_armor_slot_chestplate"), new jy("items/empty_armor_slot_leggings"), new jy("items/empty_armor_slot_boots")});
    private static final Logger c = LogManager.getLogger();
    protected static final bov a = new bov("builtin/missing", "missing");
    private static final Map<String, String> d = Maps.newHashMap();
    private static final Joiner e;
    private final bni f;
    private final Map<jy, bmi> g = Maps.newHashMap();
    private final Map<jy, bgl> h = Maps.newLinkedHashMap();
    private final Map<bov, bgm.d> i = Maps.newLinkedHashMap();
    private final bmh j;
    private final bgc k;
    private final bgo l = new bgo();
    private final bgp m = new bgp();
    private dd<bov, boq> n = new dd();
    private static final bgl o;
    private static final bgl p;
    private static final bgl q;
    private static final bgl r;
    private Map<String, jy> s = Maps.newLinkedHashMap();
    private final Map<jy, bgm> t = Maps.newHashMap();
    private Map<zw, List<String>> u = Maps.newIdentityHashMap();

    public bot(bni bni2, bmh bmh2, bgc bgc2) {
        this.f = bni2;
        this.j = bmh2;
        this.k = bgc2;
    }

    public db<bov, boq> a() {
        this.b();
        this.h();
        this.j();
        this.l();
        this.f();
        return this.n;
    }

    private void b() {
        this.a((Collection<bov>)this.k.a().a().values());
        this.i.put((Object)a, (Object)new bgm.d(a.c(), (List<bgm.c>)Lists.newArrayList((Object[])new bgm.c[]{new bgm.c(new jy(a.a()), bor.a, false, 1)})));
        jy jy2 = new jy("item_frame");
        bgm \u26032 = this.a(jy2);
        this.a(\u26032, new bov(jy2, "normal"));
        this.a(\u26032, new bov(jy2, "map"));
        this.c();
        this.d();
    }

    private void a(Collection<bov> collection) {
        for (bov bov2 : collection) {
            try {
                bgm bgm2 = this.a(bov2);
                try {
                    this.a(bgm2, bov2);
                }
                catch (Exception \u26032) {
                    c.warn("Unable to load variant: " + bov2.c() + " from " + bov2);
                }
            }
            catch (Exception exception) {
                c.warn("Unable to load definition " + bov2, (Throwable)exception);
            }
        }
    }

    private void a(bgm bgm2, bov bov2) {
        this.i.put((Object)bov2, (Object)bgm2.b(bov2.c()));
    }

    private bgm a(jy jy2) {
        \u2603 = this.b(jy2);
        bgm bgm2 = (bgm)this.t.get((Object)\u2603);
        if (bgm2 == null) {
            ArrayList arrayList = Lists.newArrayList();
            try {
                for (bnh bnh2 : this.f.b(\u2603)) {
                    InputStream inputStream = null;
                    try {
                        inputStream = bnh2.b();
                        bgm bgm3 = bgm.a((Reader)new InputStreamReader(inputStream, Charsets.UTF_8));
                        arrayList.add((Object)bgm3);
                    }
                    catch (Exception exception) {
                        throw new RuntimeException("Encountered an exception when loading model definition of '" + jy2 + "' from: '" + bnh2.a() + "' in resourcepack: '" + bnh2.d() + "'", (Throwable)exception);
                    }
                    finally {
                        IOUtils.closeQuietly((InputStream)inputStream);
                    }
                }
            }
            catch (IOException iOException) {
                throw new RuntimeException("Encountered an exception when loading model definition of model " + \u2603.toString(), (Throwable)iOException);
            }
            bgm2 = new bgm((List<bgm>)arrayList);
            this.t.put((Object)\u2603, (Object)bgm2);
        }
        return bgm2;
    }

    private jy b(jy jy2) {
        return new jy(jy2.b(), "blockstates/" + jy2.a() + ".json");
    }

    private void c() {
        for (bov bov2 : this.i.keySet()) {
            for (bgm.c c2 : ((bgm.d)this.i.get((Object)bov2)).b()) {
                jy jy2 = c2.a();
                if (this.h.get((Object)jy2) != null) continue;
                try {
                    bgl bgl2 = this.c(jy2);
                    this.h.put((Object)jy2, (Object)bgl2);
                }
                catch (Exception exception) {
                    c.warn("Unable to load block model: '" + jy2 + "' for variant: '" + bov2 + "'", (Throwable)exception);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private bgl c(jy jy2) throws IOException {
        InputStreamReader \u26033;
        String string = jy2.a();
        if ("builtin/generated".equals((Object)string)) {
            return o;
        }
        if ("builtin/compass".equals((Object)string)) {
            return p;
        }
        if ("builtin/clock".equals((Object)string)) {
            return q;
        }
        if ("builtin/entity".equals((Object)string)) {
            return r;
        }
        if (string.startsWith("builtin/")) {
            Object object = string.substring("builtin/".length());
            String \u26032 = (String)d.get(object);
            if (\u26032 == null) {
                throw new FileNotFoundException(jy2.toString());
            }
            \u26033 = new StringReader(\u26032);
        } else {
            object = this.f.a(this.d(jy2));
            \u26033 = new InputStreamReader(object.b(), Charsets.UTF_8);
        }
        try {
            object = bgl.a((Reader)\u26033);
            ((bgl)object).b = jy2.toString();
            Object object = object;
            return object;
        }
        finally {
            \u26033.close();
        }
    }

    private jy d(jy jy2) {
        return new jy(jy2.b(), "models/" + jy2.a() + ".json");
    }

    private void d() {
        this.e();
        for (zw zw2 : zw.e) {
            List<String> list = this.a(zw2);
            for (String string : list) {
                jy jy2 = this.a(string);
                this.s.put((Object)string, (Object)jy2);
                if (this.h.get((Object)jy2) != null) continue;
                try {
                    bgl bgl2 = this.c(jy2);
                    this.h.put((Object)jy2, (Object)bgl2);
                }
                catch (Exception exception) {
                    c.warn("Unable to load item model: '" + jy2 + "' for item: '" + zw.e.c(zw2) + "'", (Throwable)exception);
                }
            }
        }
    }

    private void e() {
        this.u.put((Object)zw.a(afi.b), (Object)Lists.newArrayList((Object[])new String[]{"stone", "granite", "granite_smooth", "diorite", "diorite_smooth", "andesite", "andesite_smooth"}));
        this.u.put((Object)zw.a(afi.d), (Object)Lists.newArrayList((Object[])new String[]{"dirt", "coarse_dirt", "podzol"}));
        this.u.put((Object)zw.a(afi.f), (Object)Lists.newArrayList((Object[])new String[]{"oak_planks", "spruce_planks", "birch_planks", "jungle_planks", "acacia_planks", "dark_oak_planks"}));
        this.u.put((Object)zw.a(afi.g), (Object)Lists.newArrayList((Object[])new String[]{"oak_sapling", "spruce_sapling", "birch_sapling", "jungle_sapling", "acacia_sapling", "dark_oak_sapling"}));
        this.u.put((Object)zw.a(afi.m), (Object)Lists.newArrayList((Object[])new String[]{"sand", "red_sand"}));
        this.u.put((Object)zw.a(afi.r), (Object)Lists.newArrayList((Object[])new String[]{"oak_log", "spruce_log", "birch_log", "jungle_log"}));
        this.u.put((Object)zw.a(afi.t), (Object)Lists.newArrayList((Object[])new String[]{"oak_leaves", "spruce_leaves", "birch_leaves", "jungle_leaves"}));
        this.u.put((Object)zw.a(afi.v), (Object)Lists.newArrayList((Object[])new String[]{"sponge", "sponge_wet"}));
        this.u.put((Object)zw.a(afi.A), (Object)Lists.newArrayList((Object[])new String[]{"sandstone", "chiseled_sandstone", "smooth_sandstone"}));
        this.u.put((Object)zw.a(afi.cM), (Object)Lists.newArrayList((Object[])new String[]{"red_sandstone", "chiseled_red_sandstone", "smooth_red_sandstone"}));
        this.u.put((Object)zw.a(afi.H), (Object)Lists.newArrayList((Object[])new String[]{"dead_bush", "tall_grass", "fern"}));
        this.u.put((Object)zw.a(afi.I), (Object)Lists.newArrayList((Object[])new String[]{"dead_bush"}));
        this.u.put((Object)zw.a(afi.L), (Object)Lists.newArrayList((Object[])new String[]{"black_wool", "red_wool", "green_wool", "brown_wool", "blue_wool", "purple_wool", "cyan_wool", "silver_wool", "gray_wool", "pink_wool", "lime_wool", "yellow_wool", "light_blue_wool", "magenta_wool", "orange_wool", "white_wool"}));
        this.u.put((Object)zw.a(afi.N), (Object)Lists.newArrayList((Object[])new String[]{"dandelion"}));
        this.u.put((Object)zw.a(afi.O), (Object)Lists.newArrayList((Object[])new String[]{"poppy", "blue_orchid", "allium", "houstonia", "red_tulip", "orange_tulip", "white_tulip", "pink_tulip", "oxeye_daisy"}));
        this.u.put((Object)zw.a(afi.U), (Object)Lists.newArrayList((Object[])new String[]{"stone_slab", "sandstone_slab", "cobblestone_slab", "brick_slab", "stone_brick_slab", "nether_brick_slab", "quartz_slab"}));
        this.u.put((Object)zw.a(afi.cP), (Object)Lists.newArrayList((Object[])new String[]{"red_sandstone_slab"}));
        this.u.put((Object)zw.a(afi.cG), (Object)Lists.newArrayList((Object[])new String[]{"black_stained_glass", "red_stained_glass", "green_stained_glass", "brown_stained_glass", "blue_stained_glass", "purple_stained_glass", "cyan_stained_glass", "silver_stained_glass", "gray_stained_glass", "pink_stained_glass", "lime_stained_glass", "yellow_stained_glass", "light_blue_stained_glass", "magenta_stained_glass", "orange_stained_glass", "white_stained_glass"}));
        this.u.put((Object)zw.a(afi.be), (Object)Lists.newArrayList((Object[])new String[]{"stone_monster_egg", "cobblestone_monster_egg", "stone_brick_monster_egg", "mossy_brick_monster_egg", "cracked_brick_monster_egg", "chiseled_brick_monster_egg"}));
        this.u.put((Object)zw.a(afi.bf), (Object)Lists.newArrayList((Object[])new String[]{"stonebrick", "mossy_stonebrick", "cracked_stonebrick", "chiseled_stonebrick"}));
        this.u.put((Object)zw.a(afi.bM), (Object)Lists.newArrayList((Object[])new String[]{"oak_slab", "spruce_slab", "birch_slab", "jungle_slab", "acacia_slab", "dark_oak_slab"}));
        this.u.put((Object)zw.a(afi.bZ), (Object)Lists.newArrayList((Object[])new String[]{"cobblestone_wall", "mossy_cobblestone_wall"}));
        this.u.put((Object)zw.a(afi.cf), (Object)Lists.newArrayList((Object[])new String[]{"anvil_intact", "anvil_slightly_damaged", "anvil_very_damaged"}));
        this.u.put((Object)zw.a(afi.cq), (Object)Lists.newArrayList((Object[])new String[]{"quartz_block", "chiseled_quartz_block", "quartz_column"}));
        this.u.put((Object)zw.a(afi.cu), (Object)Lists.newArrayList((Object[])new String[]{"black_stained_hardened_clay", "red_stained_hardened_clay", "green_stained_hardened_clay", "brown_stained_hardened_clay", "blue_stained_hardened_clay", "purple_stained_hardened_clay", "cyan_stained_hardened_clay", "silver_stained_hardened_clay", "gray_stained_hardened_clay", "pink_stained_hardened_clay", "lime_stained_hardened_clay", "yellow_stained_hardened_clay", "light_blue_stained_hardened_clay", "magenta_stained_hardened_clay", "orange_stained_hardened_clay", "white_stained_hardened_clay"}));
        this.u.put((Object)zw.a(afi.cH), (Object)Lists.newArrayList((Object[])new String[]{"black_stained_glass_pane", "red_stained_glass_pane", "green_stained_glass_pane", "brown_stained_glass_pane", "blue_stained_glass_pane", "purple_stained_glass_pane", "cyan_stained_glass_pane", "silver_stained_glass_pane", "gray_stained_glass_pane", "pink_stained_glass_pane", "lime_stained_glass_pane", "yellow_stained_glass_pane", "light_blue_stained_glass_pane", "magenta_stained_glass_pane", "orange_stained_glass_pane", "white_stained_glass_pane"}));
        this.u.put((Object)zw.a(afi.u), (Object)Lists.newArrayList((Object[])new String[]{"acacia_leaves", "dark_oak_leaves"}));
        this.u.put((Object)zw.a(afi.s), (Object)Lists.newArrayList((Object[])new String[]{"acacia_log", "dark_oak_log"}));
        this.u.put((Object)zw.a(afi.cI), (Object)Lists.newArrayList((Object[])new String[]{"prismarine", "prismarine_bricks", "dark_prismarine"}));
        this.u.put((Object)zw.a(afi.cy), (Object)Lists.newArrayList((Object[])new String[]{"black_carpet", "red_carpet", "green_carpet", "brown_carpet", "blue_carpet", "purple_carpet", "cyan_carpet", "silver_carpet", "gray_carpet", "pink_carpet", "lime_carpet", "yellow_carpet", "light_blue_carpet", "magenta_carpet", "orange_carpet", "white_carpet"}));
        this.u.put((Object)zw.a(afi.cF), (Object)Lists.newArrayList((Object[])new String[]{"sunflower", "syringa", "double_grass", "double_fern", "double_rose", "paeonia"}));
        this.u.put((Object)zy.f, (Object)Lists.newArrayList((Object[])new String[]{"bow", "bow_pulling_0", "bow_pulling_1", "bow_pulling_2"}));
        this.u.put((Object)zy.h, (Object)Lists.newArrayList((Object[])new String[]{"coal", "charcoal"}));
        this.u.put((Object)zy.aR, (Object)Lists.newArrayList((Object[])new String[]{"fishing_rod", "fishing_rod_cast"}));
        this.u.put((Object)zy.aU, (Object)Lists.newArrayList((Object[])new String[]{"cod", "salmon", "clownfish", "pufferfish"}));
        this.u.put((Object)zy.aV, (Object)Lists.newArrayList((Object[])new String[]{"cooked_cod", "cooked_salmon"}));
        this.u.put((Object)zy.aW, (Object)Lists.newArrayList((Object[])new String[]{"dye_black", "dye_red", "dye_green", "dye_brown", "dye_blue", "dye_purple", "dye_cyan", "dye_silver", "dye_gray", "dye_pink", "dye_lime", "dye_yellow", "dye_light_blue", "dye_magenta", "dye_orange", "dye_white"}));
        this.u.put((Object)zy.bz, (Object)Lists.newArrayList((Object[])new String[]{"bottle_drinkable", "bottle_splash"}));
        this.u.put((Object)zy.bX, (Object)Lists.newArrayList((Object[])new String[]{"skull_skeleton", "skull_wither", "skull_zombie", "skull_char", "skull_creeper"}));
        this.u.put((Object)zw.a(afi.bo), (Object)Lists.newArrayList((Object[])new String[]{"oak_fence_gate"}));
        this.u.put((Object)zw.a(afi.aO), (Object)Lists.newArrayList((Object[])new String[]{"oak_fence"}));
        this.u.put((Object)zy.aq, (Object)Lists.newArrayList((Object[])new String[]{"oak_door"}));
    }

    private List<String> a(zw zw2) {
        List list = (List)this.u.get((Object)zw2);
        if (list == null) {
            list = Collections.singletonList((Object)zw.e.c(zw2).toString());
        }
        return list;
    }

    private jy a(String string) {
        jy jy2 = new jy(string);
        return new jy(jy2.b(), "item/" + jy2.a());
    }

    private void f() {
        Object object;
        for (bov bov22 : this.i.keySet()) {
            bov bov22;
            object = new box.a();
            int \u26032 = 0;
            for (bgm.c c2 : ((bgm.d)this.i.get((Object)bov22)).b()) {
                bgl bgl2 = (bgl)this.h.get((Object)c2.a());
                if (bgl2 == null || !bgl2.d()) {
                    c.warn("Missing model for: " + bov22);
                    continue;
                }
                ++\u26032;
                ((box.a)object).a(this.a(bgl2, c2.b(), c2.c()), c2.d());
            }
            if (\u26032 == 0) {
                c.warn("No weighted models for: " + bov22);
                continue;
            }
            if (\u26032 == 1) {
                this.n.a(bov22, ((box.a)object).b());
                continue;
            }
            this.n.a(bov22, ((box.a)object).a());
        }
        for (bov bov22 : this.s.entrySet()) {
            object = (jy)bov22.getValue();
            bov \u26033 = new bov((String)bov22.getKey(), "inventory");
            bgl \u26034 = (bgl)this.h.get(object);
            if (\u26034 == null || !\u26034.d()) {
                c.warn("Missing model for: " + object);
                continue;
            }
            if (this.c(\u26034)) {
                this.n.a(\u26033, new bos(\u26034.g()));
                continue;
            }
            this.n.a(\u26033, this.a(\u26034, bor.a, false));
        }
    }

    private Set<jy> g() {
        HashSet hashSet = Sets.newHashSet();
        ArrayList \u26032 = Lists.newArrayList((Iterable)this.i.keySet());
        Collections.sort((List)\u26032, (Comparator)new Comparator<bov>(){

            public int a(bov bov2, bov bov3) {
                return bov2.toString().compareTo(bov3.toString());
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((bov)object, (bov)object2);
            }
        });
        for (bov bov2 : \u26032) {
            bgm.d d2 = (bgm.d)this.i.get((Object)bov2);
            for (bgm.c c2 : d2.b()) {
                bgl bgl2 = (bgl)this.h.get((Object)c2.a());
                if (bgl2 == null) {
                    c.warn("Missing model for: " + bov2);
                    continue;
                }
                hashSet.addAll(this.a(bgl2));
            }
        }
        hashSet.addAll(b);
        return hashSet;
    }

    private boq a(bgl bgl2, bor bor2, boolean bl) {
        bmi bmi2 = (bmi)this.g.get((Object)new jy(bgl2.c("particle")));
        bow.a \u26032 = new bow.a(bgl2).a(bmi2);
        for (bgh bgh2 : bgl2.a()) {
            for (cq cq2 : bgh2.c.keySet()) {
                bgi bgi2 = (bgi)bgh2.c.get((Object)cq2);
                bmi \u26033 = (bmi)this.g.get((Object)new jy(bgl2.c(bgi2.d)));
                if (bgi2.b == null) {
                    \u26032.a(this.a(bgh2, bgi2, \u26033, cq2, bor2, bl));
                    continue;
                }
                \u26032.a(bor2.a(bgi2.b), this.a(bgh2, bgi2, \u26033, cq2, bor2, bl));
            }
        }
        return \u26032.b();
    }

    private bgg a(bgh bgh2, bgi bgi2, bmi bmi2, cq cq2, bor bor2, boolean bl) {
        return this.l.a(bgh2.a, bgh2.b, bgi2, bmi2, cq2, bor2, bgh2.d, bl, bgh2.e);
    }

    private void h() {
        this.i();
        for (bgl bgl2 : this.h.values()) {
            bgl2.a(this.h);
        }
        bgl.b(this.h);
    }

    private void i() {
        jy jy2;
        ArrayDeque arrayDeque = Queues.newArrayDeque();
        HashSet \u26032 = Sets.newHashSet();
        for (Object object : this.h.keySet()) {
            \u26032.add(object);
            jy2 = ((bgl)this.h.get(object)).e();
            if (jy2 == null) continue;
            arrayDeque.add((Object)jy2);
        }
        while (!arrayDeque.isEmpty()) {
            Object object = (jy)arrayDeque.pop();
            try {
                if (this.h.get(object) != null) continue;
                object = this.c((jy)object);
                this.h.put(object, object);
                jy2 = ((bgl)object).e();
                if (jy2 != null && !\u26032.contains((Object)jy2)) {
                    arrayDeque.add((Object)jy2);
                }
            }
            catch (Exception exception) {
                c.warn("In parent chain: " + e.join(this.e((jy)object)) + "; unable to load model: '" + object + "'", (Throwable)exception);
            }
            \u26032.add(object);
        }
    }

    private List<jy> e(jy jy2) {
        ArrayList arrayList = Lists.newArrayList((Object[])new jy[]{jy2});
        jy \u26032 = jy2;
        while ((\u26032 = this.f(\u26032)) != null) {
            arrayList.add(0, (Object)\u26032);
        }
        return arrayList;
    }

    private jy f(jy jy2) {
        for (Map.Entry entry : this.h.entrySet()) {
            bgl bgl2 = (bgl)entry.getValue();
            if (bgl2 == null || !jy2.equals(bgl2.e())) continue;
            return (jy)entry.getKey();
        }
        return null;
    }

    private Set<jy> a(bgl bgl2) {
        HashSet hashSet = Sets.newHashSet();
        for (bgh bgh2 : bgl2.a()) {
            for (bgi bgi2 : bgh2.c.values()) {
                jy jy2 = new jy(bgl2.c(bgi2.d));
                hashSet.add((Object)jy2);
            }
        }
        hashSet.add((Object)new jy(bgl2.c("particle")));
        return hashSet;
    }

    private void j() {
        final Set<jy> set = this.g();
        set.addAll(this.k());
        set.remove((Object)bmh.f);
        bmb \u26032 = new bmb(){

            @Override
            public void a(bmh bmh2) {
                for (jy jy2 : set) {
                    bmi bmi2 = bmh2.a(jy2);
                    bot.this.g.put((Object)jy2, (Object)bmi2);
                }
            }
        };
        this.j.a(this.f, \u26032);
        this.g.put((Object)new jy("missingno"), (Object)this.j.f());
    }

    private Set<jy> k() {
        HashSet hashSet = Sets.newHashSet();
        for (jy jy2 : this.s.values()) {
            bgl bgl2 = (bgl)this.h.get((Object)jy2);
            if (bgl2 == null) continue;
            hashSet.add((Object)new jy(bgl2.c("particle")));
            if (this.b(bgl2)) {
                for (Object object : bgp.a) {
                    jy jy3 = new jy(bgl2.c((String)object));
                    if (bgl2.f() == p && !bmh.f.equals(jy3)) {
                        bmi.b(jy3.toString());
                    } else if (bgl2.f() == q && !bmh.f.equals(jy3)) {
                        bmi.a(jy3.toString());
                    }
                    hashSet.add((Object)jy3);
                }
                continue;
            }
            if (this.c(bgl2)) continue;
            for (Object object : bgl2.a()) {
                for (bgi bgi2 : ((bgh)object).c.values()) {
                    jy jy4 = new jy(bgl2.c(bgi2.d));
                    hashSet.add((Object)jy4);
                }
            }
        }
        return hashSet;
    }

    private boolean b(bgl bgl2) {
        if (bgl2 == null) {
            return false;
        }
        \u2603 = bgl2.f();
        return \u2603 == o || \u2603 == p || \u2603 == q;
    }

    private boolean c(bgl bgl2) {
        if (bgl2 == null) {
            return false;
        }
        \u2603 = bgl2.f();
        return \u2603 == r;
    }

    private void l() {
        for (Object object : this.s.values()) {
            bgl bgl2 = (bgl)this.h.get(object);
            if (this.b(bgl2)) {
                \u2603 = this.d(bgl2);
                if (\u2603 != null) {
                    \u2603.b = ((jy)object).toString();
                }
                this.h.put(object, (Object)\u2603);
                continue;
            }
            if (!this.c(bgl2)) continue;
            this.h.put(object, (Object)bgl2);
        }
        for (Object object : this.g.values()) {
            if (((bmi)object).m()) continue;
            ((bmi)object).l();
        }
    }

    private bgl d(bgl bgl2) {
        return this.m.a(this.j, bgl2);
    }

    static {
        d.put((Object)"missing", (Object)"{ \"textures\": {   \"particle\": \"missingno\",   \"missingno\": \"missingno\"}, \"elements\": [ {     \"from\": [ 0, 0, 0 ],     \"to\": [ 16, 16, 16 ],     \"faces\": {         \"down\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"down\", \"texture\": \"#missingno\" },         \"up\":    { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"up\", \"texture\": \"#missingno\" },         \"north\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"north\", \"texture\": \"#missingno\" },         \"south\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"south\", \"texture\": \"#missingno\" },         \"west\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"west\", \"texture\": \"#missingno\" },         \"east\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"east\", \"texture\": \"#missingno\" }    }}]}");
        e = Joiner.on((String)" -> ");
        o = bgl.a("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
        p = bgl.a("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
        q = bgl.a("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
        r = bgl.a("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
        bot.o.b = "generation marker";
        bot.p.b = "compass generation marker";
        bot.q.b = "class generation marker";
        bot.r.b = "block entity marker";
    }
}
