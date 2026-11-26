/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.google.gson.JsonSyntaxException
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.List
 *  java.util.Map
 *  org.apache.commons.io.IOUtils
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.vector.Matrix4f
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;

public class blr {
    private bfw a;
    private bni b;
    private String c;
    private final List<bls> d = Lists.newArrayList();
    private final Map<String, bfw> e = Maps.newHashMap();
    private final List<bfw> f = Lists.newArrayList();
    private Matrix4f g;
    private int h;
    private int i;
    private float j;
    private float k;

    public blr(bmj bmj2, bni bni2, bfw bfw2, jy jy2) throws IOException, JsonSyntaxException {
        this.b = bni2;
        this.a = bfw2;
        this.j = 0.0f;
        this.k = 0.0f;
        this.h = bfw2.c;
        this.i = bfw2.d;
        this.c = jy2.toString();
        this.c();
        this.a(bmj2, jy2);
    }

    public void a(bmj bmj2, jy jy2) throws IOException, JsonSyntaxException {
        InputStream \u26032;
        block11: {
            JsonParser jsonParser = new JsonParser();
            \u26032 = null;
            try {
                int \u26034;
                JsonArray jsonArray;
                bnh bnh2 = this.b.a(jy2);
                \u26032 = bnh2.b();
                JsonObject \u26033 = jsonParser.parse(IOUtils.toString((InputStream)\u26032, (Charset)Charsets.UTF_8)).getAsJsonObject();
                if (ni.d(\u26033, "targets")) {
                    jsonArray = \u26033.getAsJsonArray("targets");
                    \u26034 = 0;
                    for (JsonElement jsonElement : jsonArray) {
                        try {
                            this.a(jsonElement);
                        }
                        catch (Exception exception) {
                            kc kc2 = kc.a(exception);
                            kc2.a("targets[" + \u26034 + "]");
                            throw kc2;
                        }
                        ++\u26034;
                    }
                }
                if (!ni.d(\u26033, "passes")) break block11;
                jsonArray = \u26033.getAsJsonArray("passes");
                \u26034 = 0;
                for (JsonElement jsonElement : jsonArray) {
                    try {
                        this.a(bmj2, jsonElement);
                    }
                    catch (Exception exception) {
                        kc kc3 = kc.a(exception);
                        kc3.a("passes[" + \u26034 + "]");
                        throw kc3;
                    }
                    ++\u26034;
                }
            }
            catch (Exception exception) {
                try {
                    kc kc4 = kc.a(exception);
                    kc4.b(jy2.a());
                    throw kc4;
                }
                catch (Throwable throwable) {
                    IOUtils.closeQuietly(\u26032);
                    throw throwable;
                }
            }
        }
        IOUtils.closeQuietly((InputStream)\u26032);
    }

    private void a(JsonElement jsonElement) throws kc {
        if (ni.a(jsonElement)) {
            this.a(jsonElement.getAsString(), this.h, this.i);
        } else {
            JsonObject jsonObject = ni.l(jsonElement, "target");
            String \u26032 = ni.h(jsonObject, "name");
            int \u26033 = ni.a(jsonObject, "width", this.h);
            int \u26034 = ni.a(jsonObject, "height", this.i);
            if (this.e.containsKey((Object)\u26032)) {
                throw new kc(\u26032 + " is already defined");
            }
            this.a(\u26032, \u26033, \u26034);
        }
    }

    private void a(bmj bmj2, JsonElement jsonElement) throws IOException {
        JsonArray jsonArray;
        Object \u260310;
        JsonObject jsonObject = ni.l(jsonElement, "pass");
        String \u26032 = ni.h(jsonObject, "name");
        String \u26033 = ni.h(jsonObject, "intarget");
        String \u26034 = ni.h(jsonObject, "outtarget");
        bfw \u26035 = this.b(\u26033);
        bfw \u26036 = this.b(\u26034);
        if (\u26035 == null) {
            throw new kc("Input target '" + \u26033 + "' does not exist");
        }
        if (\u26036 == null) {
            throw new kc("Output target '" + \u26034 + "' does not exist");
        }
        bls \u26037 = this.a(\u26032, \u26035, \u26036);
        JsonArray \u26038 = ni.a(jsonObject, "auxtargets", null);
        if (\u26038 != null) {
            int n = 0;
            for (JsonElement jsonElement2 : \u26038) {
                block15: {
                    Object \u26039;
                    try {
                        JsonObject jsonObject2 = ni.l(jsonElement2, "auxtarget");
                        \u26039 = ni.h(jsonObject2, "name");
                        \u260310 = ni.h(jsonObject2, "id");
                        bfw \u260311 = this.b((String)\u260310);
                        if (\u260311 == null) {
                            jy jy2 = new jy("textures/effect/" + (String)\u260310 + ".png");
                            try {
                                this.b.a(jy2);
                            }
                            catch (FileNotFoundException \u260312) {
                                throw new kc("Render target or texture '" + (String)\u260310 + "' does not exist");
                            }
                            bmj2.a(jy2);
                            bmk \u260313 = bmj2.b(jy2);
                            int \u260314 = ni.m(jsonObject2, "width");
                            int \u260315 = ni.m(jsonObject2, "height");
                            boolean \u260316 = ni.i(jsonObject2, "bilinear");
                            if (\u260316) {
                                GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
                                GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
                            } else {
                                GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
                                GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
                            }
                            \u26037.a((String)\u26039, \u260313.b(), \u260314, \u260315);
                            break block15;
                        }
                        \u26037.a((String)\u26039, \u260311, \u260311.a, \u260311.b);
                    }
                    catch (Exception exception) {
                        \u26039 = kc.a(exception);
                        \u26039.a("auxtargets[" + n + "]");
                        throw \u26039;
                    }
                }
                ++n;
            }
        }
        if ((jsonArray = ni.a(jsonObject, "uniforms", null)) != null) {
            int n = 0;
            for (JsonObject jsonObject2 : jsonArray) {
                try {
                    this.b((JsonElement)jsonObject2);
                }
                catch (Exception exception) {
                    \u260310 = kc.a(exception);
                    ((kc)((Object)\u260310)).a("uniforms[" + n + "]");
                    throw \u260310;
                }
                ++n;
            }
        }
    }

    private void b(JsonElement jsonElement) throws kc {
        JsonObject jsonObject = ni.l(jsonElement, "uniform");
        String \u26032 = ni.h(jsonObject, "name");
        blv \u26033 = ((bls)this.d.get(this.d.size() - 1)).c().a(\u26032);
        if (\u26033 == null) {
            throw new kc("Uniform '" + \u26032 + "' does not exist");
        }
        float[] \u26034 = new float[4];
        int \u26035 = 0;
        JsonArray \u26036 = ni.t(jsonObject, "values");
        for (JsonElement jsonElement2 : \u26036) {
            try {
                \u26034[\u26035] = ni.d(jsonElement2, "value");
            }
            catch (Exception exception) {
                kc kc2 = kc.a(exception);
                kc2.a("values[" + \u26035 + "]");
                throw kc2;
            }
            ++\u26035;
        }
        switch (\u26035) {
            case 0: {
                break;
            }
            case 1: {
                \u26033.a(\u26034[0]);
                break;
            }
            case 2: {
                \u26033.a(\u26034[0], \u26034[1]);
                break;
            }
            case 3: {
                \u26033.a(\u26034[0], \u26034[1], \u26034[2]);
                break;
            }
            case 4: {
                \u26033.a(\u26034[0], \u26034[1], \u26034[2], \u26034[3]);
            }
        }
    }

    public bfw a(String string) {
        return (bfw)this.e.get((Object)string);
    }

    public void a(String string, int n, int n2) {
        bfw bfw2 = new bfw(n, n2, true);
        bfw2.a(0.0f, 0.0f, 0.0f, 0.0f);
        this.e.put((Object)string, (Object)bfw2);
        if (n == this.h && n2 == this.i) {
            this.f.add((Object)bfw2);
        }
    }

    public void a() {
        for (Object object : this.e.values()) {
            ((bfw)object).a();
        }
        for (Object object : this.d) {
            ((bls)object).b();
        }
        this.d.clear();
    }

    public bls a(String string, bfw bfw2, bfw bfw3) throws IOException {
        bls bls2 = new bls(this.b, string, bfw2, bfw3);
        this.d.add(this.d.size(), (Object)bls2);
        return bls2;
    }

    private void c() {
        this.g = new Matrix4f();
        this.g.setIdentity();
        this.g.m00 = 2.0f / (float)this.a.a;
        this.g.m11 = 2.0f / (float)(-this.a.b);
        this.g.m22 = -0.0020001999f;
        this.g.m33 = 1.0f;
        this.g.m03 = -1.0f;
        this.g.m13 = 1.0f;
        this.g.m23 = -1.0001999f;
    }

    public void a(int n, int n2) {
        this.h = this.a.a;
        this.i = this.a.b;
        this.c();
        for (Object object : this.d) {
            ((bls)object).a(this.g);
        }
        for (Object object : this.f) {
            ((bfw)object).a(n, n2);
        }
    }

    public void a(float f) {
        if (f < this.k) {
            this.j += 1.0f - this.k;
            this.j += f;
        } else {
            this.j += f - this.k;
        }
        this.k = f;
        while (this.j > 20.0f) {
            this.j -= 20.0f;
        }
        for (bls bls2 : this.d) {
            bls2.a(this.j / 20.0f);
        }
    }

    public final String b() {
        return this.c;
    }

    private bfw b(String string) {
        if (string == null) {
            return null;
        }
        if (string.equals((Object)"minecraft:main")) {
            return this.a;
        }
        return (bfw)this.e.get((Object)string);
    }
}
