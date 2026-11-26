/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  java.io.BufferedReader
 *  java.io.File
 *  java.io.FileNotFoundException
 *  java.io.Reader
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 *  java.util.Map
 *  java.util.Map$Entry
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bmy {
    private static final Logger a = LogManager.getLogger();
    private final Map<String, File> b = Maps.newHashMap();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public bmy(File file, String string) {
        if (string == null) {
            return;
        }
        File file2 = new File(file, "objects");
        \u2603 = new File(file, "indexes/" + string + ".json");
        BufferedReader \u26032 = null;
        try {
            \u26032 = Files.newReader((File)\u2603, (Charset)Charsets.UTF_8);
            JsonObject jsonObject = new JsonParser().parse((Reader)\u26032).getAsJsonObject();
            \u2603 = ni.a(jsonObject, "objects", null);
            if (\u2603 != null) {
                for (Map.Entry entry : \u2603.entrySet()) {
                    JsonObject jsonObject2 = (JsonObject)entry.getValue();
                    String \u26033 = (String)entry.getKey();
                    String[] \u26034 = \u26033.split("/", 2);
                    String \u26035 = \u26034.length == 1 ? \u26034[0] : \u26034[0] + ":" + \u26034[1];
                    String \u26036 = ni.h(jsonObject2, "hash");
                    File \u26037 = new File(file2, \u26036.substring(0, 2) + "/" + \u26036);
                    this.b.put((Object)\u26035, (Object)\u26037);
                }
            }
        }
        catch (JsonParseException jsonParseException) {
            a.error("Unable to parse resource index file: " + \u2603);
        }
        catch (FileNotFoundException fileNotFoundException) {
            a.error("Can't find the resource index file: " + \u2603);
        }
        finally {
            IOUtils.closeQuietly((Reader)\u26032);
        }
    }

    public Map<String, File> a() {
        return this.b;
    }
}
