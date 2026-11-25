/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.reflect.Type
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public static class ant.b
implements JsonDeserializer<ant.a>,
JsonSerializer<ant.a> {
    public ant.a a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        ant.a \u26032 = new ant.a();
        try {
            \u26032.b = ni.a(jsonObject, "coordinateScale", \u26032.b);
            \u26032.c = ni.a(jsonObject, "heightScale", \u26032.c);
            \u26032.e = ni.a(jsonObject, "lowerLimitScale", \u26032.e);
            \u26032.d = ni.a(jsonObject, "upperLimitScale", \u26032.d);
            \u26032.f = ni.a(jsonObject, "depthNoiseScaleX", \u26032.f);
            \u26032.g = ni.a(jsonObject, "depthNoiseScaleZ", \u26032.g);
            \u26032.h = ni.a(jsonObject, "depthNoiseScaleExponent", \u26032.h);
            \u26032.i = ni.a(jsonObject, "mainNoiseScaleX", \u26032.i);
            \u26032.j = ni.a(jsonObject, "mainNoiseScaleY", \u26032.j);
            \u26032.k = ni.a(jsonObject, "mainNoiseScaleZ", \u26032.k);
            \u26032.l = ni.a(jsonObject, "baseSize", \u26032.l);
            \u26032.m = ni.a(jsonObject, "stretchY", \u26032.m);
            \u26032.n = ni.a(jsonObject, "biomeDepthWeight", \u26032.n);
            \u26032.o = ni.a(jsonObject, "biomeDepthOffset", \u26032.o);
            \u26032.p = ni.a(jsonObject, "biomeScaleWeight", \u26032.p);
            \u26032.q = ni.a(jsonObject, "biomeScaleOffset", \u26032.q);
            \u26032.r = ni.a(jsonObject, "seaLevel", \u26032.r);
            \u26032.s = ni.a(jsonObject, "useCaves", \u26032.s);
            \u26032.t = ni.a(jsonObject, "useDungeons", \u26032.t);
            \u26032.u = ni.a(jsonObject, "dungeonChance", \u26032.u);
            \u26032.v = ni.a(jsonObject, "useStrongholds", \u26032.v);
            \u26032.w = ni.a(jsonObject, "useVillages", \u26032.w);
            \u26032.x = ni.a(jsonObject, "useMineShafts", \u26032.x);
            \u26032.y = ni.a(jsonObject, "useTemples", \u26032.y);
            \u26032.z = ni.a(jsonObject, "useMonuments", \u26032.z);
            \u26032.A = ni.a(jsonObject, "useRavines", \u26032.A);
            \u26032.B = ni.a(jsonObject, "useWaterLakes", \u26032.B);
            \u26032.C = ni.a(jsonObject, "waterLakeChance", \u26032.C);
            \u26032.D = ni.a(jsonObject, "useLavaLakes", \u26032.D);
            \u26032.E = ni.a(jsonObject, "lavaLakeChance", \u26032.E);
            \u26032.F = ni.a(jsonObject, "useLavaOceans", \u26032.F);
            \u26032.G = ni.a(jsonObject, "fixedBiome", \u26032.G);
            if (\u26032.G >= 38 || \u26032.G < -1) {
                \u26032.G = -1;
            } else if (\u26032.G >= ady.x.az) {
                \u26032.G += 2;
            }
            \u26032.H = ni.a(jsonObject, "biomeSize", \u26032.H);
            \u26032.I = ni.a(jsonObject, "riverSize", \u26032.I);
            \u26032.J = ni.a(jsonObject, "dirtSize", \u26032.J);
            \u26032.K = ni.a(jsonObject, "dirtCount", \u26032.K);
            \u26032.L = ni.a(jsonObject, "dirtMinHeight", \u26032.L);
            \u26032.M = ni.a(jsonObject, "dirtMaxHeight", \u26032.M);
            \u26032.N = ni.a(jsonObject, "gravelSize", \u26032.N);
            \u26032.O = ni.a(jsonObject, "gravelCount", \u26032.O);
            \u26032.P = ni.a(jsonObject, "gravelMinHeight", \u26032.P);
            \u26032.Q = ni.a(jsonObject, "gravelMaxHeight", \u26032.Q);
            \u26032.R = ni.a(jsonObject, "graniteSize", \u26032.R);
            \u26032.S = ni.a(jsonObject, "graniteCount", \u26032.S);
            \u26032.T = ni.a(jsonObject, "graniteMinHeight", \u26032.T);
            \u26032.U = ni.a(jsonObject, "graniteMaxHeight", \u26032.U);
            \u26032.V = ni.a(jsonObject, "dioriteSize", \u26032.V);
            \u26032.W = ni.a(jsonObject, "dioriteCount", \u26032.W);
            \u26032.X = ni.a(jsonObject, "dioriteMinHeight", \u26032.X);
            \u26032.Y = ni.a(jsonObject, "dioriteMaxHeight", \u26032.Y);
            \u26032.Z = ni.a(jsonObject, "andesiteSize", \u26032.Z);
            \u26032.aa = ni.a(jsonObject, "andesiteCount", \u26032.aa);
            \u26032.ab = ni.a(jsonObject, "andesiteMinHeight", \u26032.ab);
            \u26032.ac = ni.a(jsonObject, "andesiteMaxHeight", \u26032.ac);
            \u26032.ad = ni.a(jsonObject, "coalSize", \u26032.ad);
            \u26032.ae = ni.a(jsonObject, "coalCount", \u26032.ae);
            \u26032.af = ni.a(jsonObject, "coalMinHeight", \u26032.af);
            \u26032.ag = ni.a(jsonObject, "coalMaxHeight", \u26032.ag);
            \u26032.ah = ni.a(jsonObject, "ironSize", \u26032.ah);
            \u26032.ai = ni.a(jsonObject, "ironCount", \u26032.ai);
            \u26032.aj = ni.a(jsonObject, "ironMinHeight", \u26032.aj);
            \u26032.ak = ni.a(jsonObject, "ironMaxHeight", \u26032.ak);
            \u26032.al = ni.a(jsonObject, "goldSize", \u26032.al);
            \u26032.am = ni.a(jsonObject, "goldCount", \u26032.am);
            \u26032.an = ni.a(jsonObject, "goldMinHeight", \u26032.an);
            \u26032.ao = ni.a(jsonObject, "goldMaxHeight", \u26032.ao);
            \u26032.ap = ni.a(jsonObject, "redstoneSize", \u26032.ap);
            \u26032.aq = ni.a(jsonObject, "redstoneCount", \u26032.aq);
            \u26032.ar = ni.a(jsonObject, "redstoneMinHeight", \u26032.ar);
            \u26032.as = ni.a(jsonObject, "redstoneMaxHeight", \u26032.as);
            \u26032.at = ni.a(jsonObject, "diamondSize", \u26032.at);
            \u26032.au = ni.a(jsonObject, "diamondCount", \u26032.au);
            \u26032.av = ni.a(jsonObject, "diamondMinHeight", \u26032.av);
            \u26032.aw = ni.a(jsonObject, "diamondMaxHeight", \u26032.aw);
            \u26032.ax = ni.a(jsonObject, "lapisSize", \u26032.ax);
            \u26032.ay = ni.a(jsonObject, "lapisCount", \u26032.ay);
            \u26032.az = ni.a(jsonObject, "lapisCenterHeight", \u26032.az);
            \u26032.aA = ni.a(jsonObject, "lapisSpread", \u26032.aA);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return \u26032;
    }

    public JsonElement a(ant.a a2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("coordinateScale", (Number)Float.valueOf((float)a2.b));
        jsonObject.addProperty("heightScale", (Number)Float.valueOf((float)a2.c));
        jsonObject.addProperty("lowerLimitScale", (Number)Float.valueOf((float)a2.e));
        jsonObject.addProperty("upperLimitScale", (Number)Float.valueOf((float)a2.d));
        jsonObject.addProperty("depthNoiseScaleX", (Number)Float.valueOf((float)a2.f));
        jsonObject.addProperty("depthNoiseScaleZ", (Number)Float.valueOf((float)a2.g));
        jsonObject.addProperty("depthNoiseScaleExponent", (Number)Float.valueOf((float)a2.h));
        jsonObject.addProperty("mainNoiseScaleX", (Number)Float.valueOf((float)a2.i));
        jsonObject.addProperty("mainNoiseScaleY", (Number)Float.valueOf((float)a2.j));
        jsonObject.addProperty("mainNoiseScaleZ", (Number)Float.valueOf((float)a2.k));
        jsonObject.addProperty("baseSize", (Number)Float.valueOf((float)a2.l));
        jsonObject.addProperty("stretchY", (Number)Float.valueOf((float)a2.m));
        jsonObject.addProperty("biomeDepthWeight", (Number)Float.valueOf((float)a2.n));
        jsonObject.addProperty("biomeDepthOffset", (Number)Float.valueOf((float)a2.o));
        jsonObject.addProperty("biomeScaleWeight", (Number)Float.valueOf((float)a2.p));
        jsonObject.addProperty("biomeScaleOffset", (Number)Float.valueOf((float)a2.q));
        jsonObject.addProperty("seaLevel", (Number)Integer.valueOf((int)a2.r));
        jsonObject.addProperty("useCaves", Boolean.valueOf((boolean)a2.s));
        jsonObject.addProperty("useDungeons", Boolean.valueOf((boolean)a2.t));
        jsonObject.addProperty("dungeonChance", (Number)Integer.valueOf((int)a2.u));
        jsonObject.addProperty("useStrongholds", Boolean.valueOf((boolean)a2.v));
        jsonObject.addProperty("useVillages", Boolean.valueOf((boolean)a2.w));
        jsonObject.addProperty("useMineShafts", Boolean.valueOf((boolean)a2.x));
        jsonObject.addProperty("useTemples", Boolean.valueOf((boolean)a2.y));
        jsonObject.addProperty("useMonuments", Boolean.valueOf((boolean)a2.z));
        jsonObject.addProperty("useRavines", Boolean.valueOf((boolean)a2.A));
        jsonObject.addProperty("useWaterLakes", Boolean.valueOf((boolean)a2.B));
        jsonObject.addProperty("waterLakeChance", (Number)Integer.valueOf((int)a2.C));
        jsonObject.addProperty("useLavaLakes", Boolean.valueOf((boolean)a2.D));
        jsonObject.addProperty("lavaLakeChance", (Number)Integer.valueOf((int)a2.E));
        jsonObject.addProperty("useLavaOceans", Boolean.valueOf((boolean)a2.F));
        jsonObject.addProperty("fixedBiome", (Number)Integer.valueOf((int)a2.G));
        jsonObject.addProperty("biomeSize", (Number)Integer.valueOf((int)a2.H));
        jsonObject.addProperty("riverSize", (Number)Integer.valueOf((int)a2.I));
        jsonObject.addProperty("dirtSize", (Number)Integer.valueOf((int)a2.J));
        jsonObject.addProperty("dirtCount", (Number)Integer.valueOf((int)a2.K));
        jsonObject.addProperty("dirtMinHeight", (Number)Integer.valueOf((int)a2.L));
        jsonObject.addProperty("dirtMaxHeight", (Number)Integer.valueOf((int)a2.M));
        jsonObject.addProperty("gravelSize", (Number)Integer.valueOf((int)a2.N));
        jsonObject.addProperty("gravelCount", (Number)Integer.valueOf((int)a2.O));
        jsonObject.addProperty("gravelMinHeight", (Number)Integer.valueOf((int)a2.P));
        jsonObject.addProperty("gravelMaxHeight", (Number)Integer.valueOf((int)a2.Q));
        jsonObject.addProperty("graniteSize", (Number)Integer.valueOf((int)a2.R));
        jsonObject.addProperty("graniteCount", (Number)Integer.valueOf((int)a2.S));
        jsonObject.addProperty("graniteMinHeight", (Number)Integer.valueOf((int)a2.T));
        jsonObject.addProperty("graniteMaxHeight", (Number)Integer.valueOf((int)a2.U));
        jsonObject.addProperty("dioriteSize", (Number)Integer.valueOf((int)a2.V));
        jsonObject.addProperty("dioriteCount", (Number)Integer.valueOf((int)a2.W));
        jsonObject.addProperty("dioriteMinHeight", (Number)Integer.valueOf((int)a2.X));
        jsonObject.addProperty("dioriteMaxHeight", (Number)Integer.valueOf((int)a2.Y));
        jsonObject.addProperty("andesiteSize", (Number)Integer.valueOf((int)a2.Z));
        jsonObject.addProperty("andesiteCount", (Number)Integer.valueOf((int)a2.aa));
        jsonObject.addProperty("andesiteMinHeight", (Number)Integer.valueOf((int)a2.ab));
        jsonObject.addProperty("andesiteMaxHeight", (Number)Integer.valueOf((int)a2.ac));
        jsonObject.addProperty("coalSize", (Number)Integer.valueOf((int)a2.ad));
        jsonObject.addProperty("coalCount", (Number)Integer.valueOf((int)a2.ae));
        jsonObject.addProperty("coalMinHeight", (Number)Integer.valueOf((int)a2.af));
        jsonObject.addProperty("coalMaxHeight", (Number)Integer.valueOf((int)a2.ag));
        jsonObject.addProperty("ironSize", (Number)Integer.valueOf((int)a2.ah));
        jsonObject.addProperty("ironCount", (Number)Integer.valueOf((int)a2.ai));
        jsonObject.addProperty("ironMinHeight", (Number)Integer.valueOf((int)a2.aj));
        jsonObject.addProperty("ironMaxHeight", (Number)Integer.valueOf((int)a2.ak));
        jsonObject.addProperty("goldSize", (Number)Integer.valueOf((int)a2.al));
        jsonObject.addProperty("goldCount", (Number)Integer.valueOf((int)a2.am));
        jsonObject.addProperty("goldMinHeight", (Number)Integer.valueOf((int)a2.an));
        jsonObject.addProperty("goldMaxHeight", (Number)Integer.valueOf((int)a2.ao));
        jsonObject.addProperty("redstoneSize", (Number)Integer.valueOf((int)a2.ap));
        jsonObject.addProperty("redstoneCount", (Number)Integer.valueOf((int)a2.aq));
        jsonObject.addProperty("redstoneMinHeight", (Number)Integer.valueOf((int)a2.ar));
        jsonObject.addProperty("redstoneMaxHeight", (Number)Integer.valueOf((int)a2.as));
        jsonObject.addProperty("diamondSize", (Number)Integer.valueOf((int)a2.at));
        jsonObject.addProperty("diamondCount", (Number)Integer.valueOf((int)a2.au));
        jsonObject.addProperty("diamondMinHeight", (Number)Integer.valueOf((int)a2.av));
        jsonObject.addProperty("diamondMaxHeight", (Number)Integer.valueOf((int)a2.aw));
        jsonObject.addProperty("lapisSize", (Number)Integer.valueOf((int)a2.ax));
        jsonObject.addProperty("lapisCount", (Number)Integer.valueOf((int)a2.ay));
        jsonObject.addProperty("lapisCenterHeight", (Number)Integer.valueOf((int)a2.az));
        jsonObject.addProperty("lapisSpread", (Number)Integer.valueOf((int)a2.aA));
        return jsonObject;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((ant.a)object, type, jsonSerializationContext);
    }
}
