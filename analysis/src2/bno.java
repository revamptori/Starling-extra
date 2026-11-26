/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  java.io.BufferedReader
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Map
 *  org.apache.commons.io.IOUtils
 */
import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;
import org.apache.commons.io.IOUtils;

public class bno
implements bnh {
    private final Map<String, bnw> a = Maps.newHashMap();
    private final String b;
    private final jy c;
    private final InputStream d;
    private final InputStream e;
    private final bny f;
    private boolean g;
    private JsonObject h;

    public bno(String string, jy jy2, InputStream inputStream, InputStream inputStream2, bny bny2) {
        this.b = string;
        this.c = jy2;
        this.d = inputStream;
        this.e = inputStream2;
        this.f = bny2;
    }

    @Override
    public jy a() {
        return this.c;
    }

    @Override
    public InputStream b() {
        return this.d;
    }

    @Override
    public boolean c() {
        return this.e != null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public <T extends bnw> T a(String string) {
        bnw bnw2;
        if (!this.c()) {
            return null;
        }
        if (this.h == null && !this.g) {
            this.g = true;
            bnw2 = null;
            try {
                bnw2 = new BufferedReader((Reader)new InputStreamReader(this.e));
                this.h = new JsonParser().parse((Reader)bnw2).getAsJsonObject();
            }
            finally {
                IOUtils.closeQuietly((Reader)bnw2);
            }
        }
        if ((bnw2 = (bnw)this.a.get((Object)string)) == null) {
            bnw2 = this.f.a(string, this.h);
        }
        return (T)bnw2;
    }

    @Override
    public String d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof bno)) {
            return false;
        }
        bno bno2 = (bno)object;
        if (this.c != null ? !this.c.equals(bno2.c) : bno2.c != null) {
            return false;
        }
        return !(this.b != null ? !this.b.equals((Object)bno2.b) : bno2.b != null);
    }

    public int hashCode() {
        int n = this.b != null ? this.b.hashCode() : 0;
        n = 31 * n + (this.c != null ? this.c.hashCode() : 0);
        return n;
    }
}
