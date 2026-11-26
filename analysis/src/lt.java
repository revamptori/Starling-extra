/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 *  java.io.BufferedReader
 *  java.io.BufferedWriter
 *  java.io.File
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.io.Reader
 *  java.io.Writer
 *  java.lang.Exception
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.ParameterizedType
 *  java.lang.reflect.Type
 *  java.nio.charset.Charset
 *  java.text.ParseException
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.UUID
 *  org.apache.commons.io.IOUtils
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.IOUtils;

public class lt {
    public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    private final Map<String, a> c = Maps.newHashMap();
    private final Map<UUID, a> d = Maps.newHashMap();
    private final LinkedList<GameProfile> e = Lists.newLinkedList();
    private final MinecraftServer f;
    protected final Gson b;
    private final File g;
    private static final ParameterizedType h = new ParameterizedType(){

        public Type[] getActualTypeArguments() {
            return new Type[]{a.class};
        }

        public Type getRawType() {
            return List.class;
        }

        public Type getOwnerType() {
            return null;
        }
    };

    public lt(MinecraftServer minecraftServer, File file) {
        this.f = minecraftServer;
        this.g = file;
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeHierarchyAdapter(a.class, (Object)new b());
        this.b = gsonBuilder.create();
        this.b();
    }

    private static GameProfile a(MinecraftServer minecraftServer, String string) {
        final GameProfile[] gameProfileArray = new GameProfile[1];
        ProfileLookupCallback \u26032 = new ProfileLookupCallback(){

            public void onProfileLookupSucceeded(GameProfile gameProfile) {
                gameProfileArray[0] = gameProfile;
            }

            public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
                gameProfileArray[0] = null;
            }
        };
        minecraftServer.aE().findProfilesByNames(new String[]{string}, Agent.MINECRAFT, \u26032);
        if (!minecraftServer.af() && gameProfileArray[0] == null) {
            UUID uUID = wn.a(new GameProfile(null, string));
            GameProfile \u26033 = new GameProfile(uUID, string);
            \u26032.onProfileLookupSucceeded(\u26033);
        }
        return gameProfileArray[0];
    }

    public void a(GameProfile gameProfile) {
        this.a(gameProfile, null);
    }

    private void a(GameProfile gameProfile, Date \u260322) {
        Date \u260322;
        UUID uUID = gameProfile.getId();
        if (\u260322 == null) {
            Object object = Calendar.getInstance();
            object.setTime(new Date());
            object.add(2, 1);
            \u260322 = object.getTime();
        }
        object = gameProfile.getName().toLowerCase(Locale.ROOT);
        a a2 = new a(gameProfile, \u260322);
        if (this.d.containsKey((Object)uUID)) {
            \u2603 = (a)this.d.get((Object)uUID);
            this.c.remove((Object)\u2603.a().getName().toLowerCase(Locale.ROOT));
            this.e.remove((Object)gameProfile);
        }
        this.c.put((Object)gameProfile.getName().toLowerCase(Locale.ROOT), (Object)a2);
        this.d.put((Object)uUID, (Object)a2);
        this.e.addFirst((Object)gameProfile);
        this.c();
    }

    public GameProfile a(String string) {
        string2 = string.toLowerCase(Locale.ROOT);
        a a2 = (a)this.c.get((Object)string2);
        if (a2 != null && new Date().getTime() >= a2.c.getTime()) {
            this.d.remove((Object)a2.a().getId());
            this.c.remove((Object)a2.a().getName().toLowerCase(Locale.ROOT));
            this.e.remove((Object)a2.a());
            a2 = null;
        }
        if (a2 != null) {
            GameProfile gameProfile = a2.a();
            this.e.remove((Object)gameProfile);
            this.e.addFirst((Object)gameProfile);
        } else {
            String string2;
            GameProfile \u26032 = lt.a(this.f, string2);
            if (\u26032 != null) {
                this.a(\u26032);
                a2 = (a)this.c.get((Object)string2);
            }
        }
        this.c();
        return a2 == null ? null : a2.a();
    }

    public String[] a() {
        ArrayList arrayList = Lists.newArrayList((Iterable)this.c.keySet());
        return (String[])arrayList.toArray((Object[])new String[arrayList.size()]);
    }

    public GameProfile a(UUID uUID) {
        a a2 = (a)this.d.get((Object)uUID);
        return a2 == null ? null : a2.a();
    }

    private a b(UUID uUID) {
        a a2 = (a)this.d.get((Object)uUID);
        if (a2 != null) {
            GameProfile gameProfile = a2.a();
            this.e.remove((Object)gameProfile);
            this.e.addFirst((Object)gameProfile);
        }
        return a2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public void b() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = Files.newReader((File)this.g, (Charset)Charsets.UTF_8);
            List list = (List)this.b.fromJson((Reader)bufferedReader, (Type)h);
            this.c.clear();
            this.d.clear();
            this.e.clear();
            for (a a2 : Lists.reverse((List)list)) {
                if (a2 == null) continue;
                this.a(a2.a(), a2.b());
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            IOUtils.closeQuietly((Reader)bufferedReader);
        }
        catch (JsonParseException jsonParseException) {
            IOUtils.closeQuietly((Reader)bufferedReader);
            {
                catch (Throwable throwable) {
                    IOUtils.closeQuietly(bufferedReader);
                    throw throwable;
                }
            }
        }
        IOUtils.closeQuietly((Reader)bufferedReader);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public void c() {
        String string = this.b.toJson(this.a(1000));
        BufferedWriter \u26032 = null;
        try {
            \u26032 = Files.newWriter((File)this.g, (Charset)Charsets.UTF_8);
            \u26032.write(string);
        }
        catch (FileNotFoundException \u26033) {
            IOUtils.closeQuietly((Writer)\u26032);
            return;
        }
        catch (IOException \u26034) {
            IOUtils.closeQuietly((Writer)\u26032);
            return;
            {
                catch (Throwable throwable) {
                    IOUtils.closeQuietly(\u26032);
                    throw throwable;
                }
            }
        }
        IOUtils.closeQuietly((Writer)\u26032);
    }

    private List<a> a(int n2) {
        ArrayList arrayList = Lists.newArrayList();
        \u2603 = Lists.newArrayList((Iterator)Iterators.limit((Iterator)this.e.iterator(), (int)n2));
        for (GameProfile gameProfile : \u2603) {
            a a2 = this.b(gameProfile.getId());
            if (a2 == null) continue;
            arrayList.add((Object)a2);
        }
        return arrayList;
    }

    class a {
        private final GameProfile b;
        private final Date c;

        private a(GameProfile gameProfile, Date date) {
            this.b = gameProfile;
            this.c = date;
        }

        public GameProfile a() {
            return this.b;
        }

        public Date b() {
            return this.c;
        }
    }

    class b
    implements JsonDeserializer<a>,
    JsonSerializer<a> {
        private b() {
        }

        public JsonElement a(a a2, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("name", a2.a().getName());
            UUID \u26032 = a2.a().getId();
            jsonObject.addProperty("uuid", \u26032 == null ? "" : \u26032.toString());
            jsonObject.addProperty("expiresOn", a.format(a2.b()));
            return jsonObject;
        }

        public a a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            if (jsonElement.isJsonObject()) {
                JsonObject jsonObject = jsonElement.getAsJsonObject();
                JsonElement \u26032 = jsonObject.get("name");
                JsonElement \u26033 = jsonObject.get("uuid");
                JsonElement \u26034 = jsonObject.get("expiresOn");
                if (\u26032 == null || \u26033 == null) {
                    return null;
                }
                String \u26035 = \u26033.getAsString();
                String \u26036 = \u26032.getAsString();
                Date \u26037 = null;
                if (\u26034 != null) {
                    try {
                        \u26037 = a.parse(\u26034.getAsString());
                    }
                    catch (ParseException parseException) {
                        \u26037 = null;
                    }
                }
                if (\u26036 == null || \u26035 == null) {
                    return null;
                }
                try {
                    UUID uUID = UUID.fromString((String)\u26035);
                }
                catch (Throwable throwable) {
                    return null;
                }
                a a2 = new a(new GameProfile(uUID, \u26036), \u26037);
                return a2;
            }
            return null;
        }

        public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
            return this.a((a)object, type, jsonSerializationContext);
        }

        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return this.a(jsonElement, type, jsonDeserializationContext);
        }
    }
}
