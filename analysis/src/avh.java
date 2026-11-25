/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.Gson
 *  java.io.BufferedReader
 *  java.io.File
 *  java.io.FileReader
 *  java.io.FileWriter
 *  java.io.PrintWriter
 *  java.io.Reader
 *  java.io.Writer
 *  java.lang.Character
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.ParameterizedType
 *  java.lang.reflect.Type
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class avh {
    private static final Logger aP = LogManager.getLogger();
    private static final Gson aQ = new Gson();
    private static final ParameterizedType aR = new ParameterizedType(){

        public Type[] getActualTypeArguments() {
            return new Type[]{String.class};
        }

        public Type getRawType() {
            return List.class;
        }

        public Type getOwnerType() {
            return null;
        }
    };
    private static final String[] aS = new String[]{"options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large"};
    private static final String[] aT = new String[]{"options.particles.all", "options.particles.decreased", "options.particles.minimal"};
    private static final String[] aU = new String[]{"options.ao.off", "options.ao.min", "options.ao.max"};
    private static final String[] aV = new String[]{"options.stream.compression.low", "options.stream.compression.medium", "options.stream.compression.high"};
    private static final String[] aW = new String[]{"options.stream.chat.enabled.streaming", "options.stream.chat.enabled.always", "options.stream.chat.enabled.never"};
    private static final String[] aX = new String[]{"options.stream.chat.userFilter.all", "options.stream.chat.userFilter.subs", "options.stream.chat.userFilter.mods"};
    private static final String[] aY = new String[]{"options.stream.mic_toggle.mute", "options.stream.mic_toggle.talk"};
    private static final String[] aZ = new String[]{"options.off", "options.graphics.fast", "options.graphics.fancy"};
    public float a = 0.5f;
    public boolean b;
    public int c = -1;
    public boolean d = true;
    public boolean e;
    public boolean f = true;
    public int g = 120;
    public int h = 2;
    public boolean i = true;
    public int j = 2;
    public List<String> k = Lists.newArrayList();
    public List<String> l = Lists.newArrayList();
    public wn.b m = wn.b.a;
    public boolean n = true;
    public boolean o = true;
    public boolean p = true;
    public float q = 1.0f;
    public boolean r = true;
    public boolean s;
    public boolean t = true;
    public boolean u = false;
    public boolean v = true;
    public boolean w = false;
    public boolean x;
    public boolean y;
    public boolean z = true;
    private final Set<wo> ba = Sets.newHashSet((Object[])wo.values());
    public boolean A;
    public int B;
    public int C;
    public boolean D = true;
    public float E = 1.0f;
    public float F = 1.0f;
    public float G = 0.44366196f;
    public float H = 1.0f;
    public boolean I = true;
    public int J = 4;
    private Map<bpg, Float> bb = Maps.newEnumMap(bpg.class);
    public float K = 0.5f;
    public float L = 1.0f;
    public float M = 1.0f;
    public float N = 0.5412844f;
    public float O = 0.31690142f;
    public int P = 1;
    public boolean Q = true;
    public String R = "";
    public int S = 0;
    public int T = 0;
    public int U = 0;
    public boolean V = true;
    public boolean W = true;
    public boolean X = true;
    public avb Y = new avb("key.forward", 17, "key.categories.movement");
    public avb Z = new avb("key.left", 30, "key.categories.movement");
    public avb aa = new avb("key.back", 31, "key.categories.movement");
    public avb ab = new avb("key.right", 32, "key.categories.movement");
    public avb ac = new avb("key.jump", 57, "key.categories.movement");
    public avb ad = new avb("key.sneak", 42, "key.categories.movement");
    public avb ae = new avb("key.sprint", 29, "key.categories.movement");
    public avb af = new avb("key.inventory", 18, "key.categories.inventory");
    public avb ag = new avb("key.use", -99, "key.categories.gameplay");
    public avb ah = new avb("key.drop", 16, "key.categories.gameplay");
    public avb ai = new avb("key.attack", -100, "key.categories.gameplay");
    public avb aj = new avb("key.pickItem", -98, "key.categories.gameplay");
    public avb ak = new avb("key.chat", 20, "key.categories.multiplayer");
    public avb al = new avb("key.playerlist", 15, "key.categories.multiplayer");
    public avb am = new avb("key.command", 53, "key.categories.multiplayer");
    public avb an = new avb("key.screenshot", 60, "key.categories.misc");
    public avb ao = new avb("key.togglePerspective", 63, "key.categories.misc");
    public avb ap = new avb("key.smoothCamera", 0, "key.categories.misc");
    public avb aq = new avb("key.fullscreen", 87, "key.categories.misc");
    public avb ar = new avb("key.spectatorOutlines", 0, "key.categories.misc");
    public avb as = new avb("key.streamStartStop", 64, "key.categories.stream");
    public avb at = new avb("key.streamPauseUnpause", 65, "key.categories.stream");
    public avb au = new avb("key.streamCommercial", 0, "key.categories.stream");
    public avb av = new avb("key.streamToggleMic", 0, "key.categories.stream");
    public avb[] aw = new avb[]{new avb("key.hotbar.1", 2, "key.categories.inventory"), new avb("key.hotbar.2", 3, "key.categories.inventory"), new avb("key.hotbar.3", 4, "key.categories.inventory"), new avb("key.hotbar.4", 5, "key.categories.inventory"), new avb("key.hotbar.5", 6, "key.categories.inventory"), new avb("key.hotbar.6", 7, "key.categories.inventory"), new avb("key.hotbar.7", 8, "key.categories.inventory"), new avb("key.hotbar.8", 9, "key.categories.inventory"), new avb("key.hotbar.9", 10, "key.categories.inventory")};
    public avb[] ax = (avb[])ArrayUtils.addAll((Object[])new avb[]{this.ai, this.ag, this.Y, this.Z, this.aa, this.ab, this.ac, this.ad, this.ae, this.ah, this.af, this.ak, this.al, this.aj, this.am, this.an, this.ao, this.ap, this.as, this.at, this.au, this.av, this.aq, this.ar}, (Object[])this.aw);
    protected ave ay;
    private File bc;
    public oj az = oj.c;
    public boolean aA;
    public int aB;
    public boolean aC;
    public boolean aD;
    public boolean aE;
    public String aF = "";
    public boolean aG;
    public boolean aH;
    public float aI = 70.0f;
    public float aJ;
    public float aK;
    public int aL;
    public int aM;
    public String aN = "en_US";
    public boolean aO = false;

    public avh(ave ave2, File file) {
        this.ay = ave2;
        this.bc = new File(file, "options.txt");
        if (ave2.U() && Runtime.getRuntime().maxMemory() >= 1000000000L) {
            avh$a.f.a(32.0f);
        } else {
            avh$a.f.a(16.0f);
        }
        this.c = ave2.U() ? 12 : 8;
        this.a();
    }

    public avh() {
    }

    public static String c(int n) {
        if (n < 0) {
            return bnq.a("key.mouseButton", n + 101);
        }
        if (n < 256) {
            return Keyboard.getKeyName((int)n);
        }
        return String.format((String)"%c", (Object[])new Object[]{Character.valueOf((char)((char)(n - 256)))}).toUpperCase();
    }

    public static boolean a(avb avb2) {
        if (avb2.i() == 0) {
            return false;
        }
        if (avb2.i() < 0) {
            return Mouse.isButtonDown((int)(avb2.i() + 100));
        }
        return Keyboard.isKeyDown((int)avb2.i());
    }

    public void a(avb avb2, int n) {
        avb2.b(n);
        this.b();
    }

    public void a(a a22, float f) {
        a a22;
        if (a22 == avh$a.b) {
            this.a = f;
        }
        if (a22 == avh$a.c) {
            this.aI = f;
        }
        if (a22 == avh$a.d) {
            this.aJ = f;
        }
        if (a22 == avh$a.i) {
            this.g = (int)f;
        }
        if (a22 == avh$a.s) {
            this.q = f;
            this.ay.q.d().b();
        }
        if (a22 == avh$a.B) {
            this.H = f;
            this.ay.q.d().b();
        }
        if (a22 == avh$a.C) {
            this.G = f;
            this.ay.q.d().b();
        }
        if (a22 == avh$a.A) {
            this.F = f;
            this.ay.q.d().b();
        }
        if (a22 == avh$a.z) {
            this.E = f;
            this.ay.q.d().b();
        }
        if (a22 == avh$a.D) {
            int n = this.J;
            this.J = (int)f;
            if ((float)n != f) {
                this.ay.T().a(this.J);
                this.ay.P().a(bmh.g);
                this.ay.T().a(false, this.J > 0);
                this.ay.B();
            }
        }
        if (a22 == avh$a.P) {
            this.v = !this.v;
            this.ay.g.a();
        }
        if (a22 == avh$a.f) {
            this.c = (int)f;
            this.ay.g.m();
        }
        if (a22 == avh$a.F) {
            this.K = f;
        }
        if (a22 == avh$a.G) {
            this.L = f;
            this.ay.Y().p();
        }
        if (a22 == avh$a.H) {
            this.M = f;
            this.ay.Y().p();
        }
        if (a22 == avh$a.I) {
            this.N = f;
        }
        if (a22 == avh$a.J) {
            this.O = f;
        }
    }

    public void a(a a2, int n) {
        if (a2 == avh$a.a) {
            boolean bl = this.b = !this.b;
        }
        if (a2 == avh$a.n) {
            this.aL = this.aL + n & 3;
        }
        if (a2 == avh$a.o) {
            this.aM = (this.aM + n) % 3;
        }
        if (a2 == avh$a.g) {
            boolean bl = this.d = !this.d;
        }
        if (a2 == avh$a.k) {
            this.h = (this.h + n) % 3;
        }
        if (a2 == avh$a.E) {
            this.aO = !this.aO;
            this.ay.k.a(this.ay.S().a() || this.aO);
        }
        if (a2 == avh$a.j) {
            boolean bl = this.f = !this.f;
        }
        if (a2 == avh$a.h) {
            this.e = !this.e;
            this.ay.e();
        }
        if (a2 == avh$a.l) {
            this.i = !this.i;
            this.ay.g.a();
        }
        if (a2 == avh$a.m) {
            this.j = (this.j + n) % 3;
            this.ay.g.a();
        }
        if (a2 == avh$a.p) {
            this.m = wn.b.a((this.m.a() + n) % 3);
        }
        if (a2 == avh$a.K) {
            this.P = (this.P + n) % 3;
        }
        if (a2 == avh$a.L) {
            boolean bl = this.Q = !this.Q;
        }
        if (a2 == avh$a.M) {
            this.S = (this.S + n) % 3;
        }
        if (a2 == avh$a.N) {
            this.T = (this.T + n) % 3;
        }
        if (a2 == avh$a.O) {
            this.U = (this.U + n) % 2;
        }
        if (a2 == avh$a.q) {
            boolean bl = this.n = !this.n;
        }
        if (a2 == avh$a.r) {
            boolean bl = this.o = !this.o;
        }
        if (a2 == avh$a.t) {
            boolean bl = this.p = !this.p;
        }
        if (a2 == avh$a.u) {
            boolean bl = this.r = !this.r;
        }
        if (a2 == avh$a.y) {
            boolean bl = this.A = !this.A;
        }
        if (a2 == avh$a.v) {
            boolean bl = this.s = !this.s;
            if (this.ay.K() != this.s) {
                this.ay.q();
            }
        }
        if (a2 == avh$a.w) {
            this.t = !this.t;
            Display.setVSyncEnabled((boolean)this.t);
        }
        if (a2 == avh$a.x) {
            this.u = !this.u;
            this.ay.g.a();
        }
        if (a2 == avh$a.P) {
            this.v = !this.v;
            this.ay.g.a();
        }
        if (a2 == avh$a.Q) {
            boolean bl = this.w = !this.w;
        }
        if (a2 == avh$a.R) {
            boolean bl = this.W = !this.W;
        }
        if (a2 == avh$a.S) {
            this.X = !this.X;
        }
        this.b();
    }

    public float a(a a2) {
        if (a2 == avh$a.c) {
            return this.aI;
        }
        if (a2 == avh$a.d) {
            return this.aJ;
        }
        if (a2 == avh$a.e) {
            return this.aK;
        }
        if (a2 == avh$a.b) {
            return this.a;
        }
        if (a2 == avh$a.s) {
            return this.q;
        }
        if (a2 == avh$a.B) {
            return this.H;
        }
        if (a2 == avh$a.C) {
            return this.G;
        }
        if (a2 == avh$a.z) {
            return this.E;
        }
        if (a2 == avh$a.A) {
            return this.F;
        }
        if (a2 == avh$a.i) {
            return this.g;
        }
        if (a2 == avh$a.D) {
            return this.J;
        }
        if (a2 == avh$a.f) {
            return this.c;
        }
        if (a2 == avh$a.F) {
            return this.K;
        }
        if (a2 == avh$a.G) {
            return this.L;
        }
        if (a2 == avh$a.H) {
            return this.M;
        }
        if (a2 == avh$a.I) {
            return this.N;
        }
        if (a2 == avh$a.J) {
            return this.O;
        }
        return 0.0f;
    }

    public boolean b(a a2) {
        switch (a2) {
            case a: {
                return this.b;
            }
            case g: {
                return this.d;
            }
            case h: {
                return this.e;
            }
            case j: {
                return this.f;
            }
            case q: {
                return this.n;
            }
            case r: {
                return this.o;
            }
            case t: {
                return this.p;
            }
            case u: {
                return this.r;
            }
            case v: {
                return this.s;
            }
            case w: {
                return this.t;
            }
            case x: {
                return this.u;
            }
            case y: {
                return this.A;
            }
            case L: {
                return this.Q;
            }
            case E: {
                return this.aO;
            }
            case P: {
                return this.v;
            }
            case Q: {
                return this.w;
            }
            case R: {
                return this.W;
            }
            case S: {
                return this.X;
            }
        }
        return false;
    }

    private static String a(String[] stringArray, int n) {
        if (n < 0 || n >= stringArray.length) {
            n = 0;
        }
        return bnq.a(stringArray[n], new Object[0]);
    }

    public String c(a a22) {
        a a22;
        String string = bnq.a(a22.d(), new Object[0]) + ": ";
        if (a22.a()) {
            float f = this.a(a22);
            \u2603 = a22.c(f);
            if (a22 == avh$a.b) {
                if (\u2603 == 0.0f) {
                    return string + bnq.a("options.sensitivity.min", new Object[0]);
                }
                if (\u2603 == 1.0f) {
                    return string + bnq.a("options.sensitivity.max", new Object[0]);
                }
                return string + (int)(\u2603 * 200.0f) + "%";
            }
            if (a22 == avh$a.c) {
                if (f == 70.0f) {
                    return string + bnq.a("options.fov.min", new Object[0]);
                }
                if (f == 110.0f) {
                    return string + bnq.a("options.fov.max", new Object[0]);
                }
                return string + (int)f;
            }
            if (a22 == avh$a.i) {
                if (f == a22.Y) {
                    return string + bnq.a("options.framerateLimit.max", new Object[0]);
                }
                return string + (int)f + " fps";
            }
            if (a22 == avh$a.k) {
                if (f == a22.X) {
                    return string + bnq.a("options.cloudHeight.min", new Object[0]);
                }
                return string + ((int)f + 128);
            }
            if (a22 == avh$a.d) {
                if (\u2603 == 0.0f) {
                    return string + bnq.a("options.gamma.min", new Object[0]);
                }
                if (\u2603 == 1.0f) {
                    return string + bnq.a("options.gamma.max", new Object[0]);
                }
                return string + "+" + (int)(\u2603 * 100.0f) + "%";
            }
            if (a22 == avh$a.e) {
                return string + (int)(\u2603 * 400.0f) + "%";
            }
            if (a22 == avh$a.s) {
                return string + (int)(\u2603 * 90.0f + 10.0f) + "%";
            }
            if (a22 == avh$a.C) {
                return string + avt.b(\u2603) + "px";
            }
            if (a22 == avh$a.B) {
                return string + avt.b(\u2603) + "px";
            }
            if (a22 == avh$a.A) {
                return string + avt.a(\u2603) + "px";
            }
            if (a22 == avh$a.f) {
                return string + (int)f + " chunks";
            }
            if (a22 == avh$a.D) {
                if (f == 0.0f) {
                    return string + bnq.a("options.off", new Object[0]);
                }
                return string + (int)f;
            }
            if (a22 == avh$a.J) {
                return string + bqn.a(\u2603) + " fps";
            }
            if (a22 == avh$a.I) {
                return string + bqn.b(\u2603) + " Kbps";
            }
            if (a22 == avh$a.F) {
                return string + String.format((String)"%.3f bpp", (Object[])new Object[]{Float.valueOf((float)bqn.c(\u2603))});
            }
            if (\u2603 == 0.0f) {
                return string + bnq.a("options.off", new Object[0]);
            }
            return string + (int)(\u2603 * 100.0f) + "%";
        }
        if (a22.b()) {
            boolean bl = this.b(a22);
            if (bl) {
                return string + bnq.a("options.on", new Object[0]);
            }
            return string + bnq.a("options.off", new Object[0]);
        }
        if (a22 == avh$a.n) {
            return string + avh.a(aS, this.aL);
        }
        if (a22 == avh$a.p) {
            return string + bnq.a(this.m.b(), new Object[0]);
        }
        if (a22 == avh$a.o) {
            return string + avh.a(aT, this.aM);
        }
        if (a22 == avh$a.m) {
            return string + avh.a(aU, this.j);
        }
        if (a22 == avh$a.K) {
            return string + avh.a(aV, this.P);
        }
        if (a22 == avh$a.M) {
            return string + avh.a(aW, this.S);
        }
        if (a22 == avh$a.N) {
            return string + avh.a(aX, this.T);
        }
        if (a22 == avh$a.O) {
            return string + avh.a(aY, this.U);
        }
        if (a22 == avh$a.k) {
            return string + avh.a(aZ, this.h);
        }
        if (a22 == avh$a.l) {
            if (this.i) {
                return string + bnq.a("options.graphics.fancy", new Object[0]);
            }
            String string2 = "options.graphics.fast";
            return string + bnq.a("options.graphics.fast", new Object[0]);
        }
        return string;
    }

    public void a() {
        try {
            if (!this.bc.exists()) {
                return;
            }
            BufferedReader bufferedReader = new BufferedReader((Reader)new FileReader(this.bc));
            String \u26032 = "";
            this.bb.clear();
            while ((\u26032 = bufferedReader.readLine()) != null) {
                try {
                    String[] stringArray = \u26032.split(":");
                    if (stringArray[0].equals((Object)"mouseSensitivity")) {
                        this.a = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"fov")) {
                        this.aI = this.a(stringArray[1]) * 40.0f + 70.0f;
                    }
                    if (stringArray[0].equals((Object)"gamma")) {
                        this.aJ = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"saturation")) {
                        this.aK = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"invertYMouse")) {
                        this.b = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"renderDistance")) {
                        this.c = Integer.parseInt((String)stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"guiScale")) {
                        this.aL = Integer.parseInt((String)stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"particles")) {
                        this.aM = Integer.parseInt((String)stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"bobView")) {
                        this.d = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"anaglyph3d")) {
                        this.e = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"maxFps")) {
                        this.g = Integer.parseInt((String)stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"fboEnable")) {
                        this.f = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"difficulty")) {
                        this.az = oj.a(Integer.parseInt((String)stringArray[1]));
                    }
                    if (stringArray[0].equals((Object)"fancyGraphics")) {
                        this.i = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"ao")) {
                        this.j = stringArray[1].equals((Object)"true") ? 2 : (stringArray[1].equals((Object)"false") ? 0 : Integer.parseInt((String)stringArray[1]));
                    }
                    if (stringArray[0].equals((Object)"renderClouds")) {
                        if (stringArray[1].equals((Object)"true")) {
                            this.h = 2;
                        } else if (stringArray[1].equals((Object)"false")) {
                            this.h = 0;
                        } else if (stringArray[1].equals((Object)"fast")) {
                            this.h = 1;
                        }
                    }
                    if (stringArray[0].equals((Object)"resourcePacks")) {
                        this.k = (List)aQ.fromJson(\u26032.substring(\u26032.indexOf(58) + 1), (Type)aR);
                        if (this.k == null) {
                            this.k = Lists.newArrayList();
                        }
                    }
                    if (stringArray[0].equals((Object)"incompatibleResourcePacks")) {
                        this.l = (List)aQ.fromJson(\u26032.substring(\u26032.indexOf(58) + 1), (Type)aR);
                        if (this.l == null) {
                            this.l = Lists.newArrayList();
                        }
                    }
                    if (stringArray[0].equals((Object)"lastServer") && stringArray.length >= 2) {
                        this.aF = \u26032.substring(\u26032.indexOf(58) + 1);
                    }
                    if (stringArray[0].equals((Object)"lang") && stringArray.length >= 2) {
                        this.aN = stringArray[1];
                    }
                    if (stringArray[0].equals((Object)"chatVisibility")) {
                        this.m = wn.b.a(Integer.parseInt((String)stringArray[1]));
                    }
                    if (stringArray[0].equals((Object)"chatColors")) {
                        this.n = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"chatLinks")) {
                        this.o = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"chatLinksPrompt")) {
                        this.p = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"chatOpacity")) {
                        this.q = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"snooperEnabled")) {
                        this.r = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"fullscreen")) {
                        this.s = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"enableVsync")) {
                        this.t = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"useVbo")) {
                        this.u = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"hideServerAddress")) {
                        this.x = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"advancedItemTooltips")) {
                        this.y = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"pauseOnLostFocus")) {
                        this.z = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"touchscreen")) {
                        this.A = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"overrideHeight")) {
                        this.C = Integer.parseInt((String)stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"overrideWidth")) {
                        this.B = Integer.parseInt((String)stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"heldItemTooltips")) {
                        this.D = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"chatHeightFocused")) {
                        this.H = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"chatHeightUnfocused")) {
                        this.G = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"chatScale")) {
                        this.E = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"chatWidth")) {
                        this.F = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"showInventoryAchievementHint")) {
                        this.I = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"mipmapLevels")) {
                        this.J = Integer.parseInt((String)stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"streamBytesPerPixel")) {
                        this.K = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"streamMicVolume")) {
                        this.L = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"streamSystemVolume")) {
                        this.M = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"streamKbps")) {
                        this.N = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"streamFps")) {
                        this.O = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"streamCompression")) {
                        this.P = Integer.parseInt((String)stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"streamSendMetadata")) {
                        this.Q = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"streamPreferredServer") && stringArray.length >= 2) {
                        this.R = \u26032.substring(\u26032.indexOf(58) + 1);
                    }
                    if (stringArray[0].equals((Object)"streamChatEnabled")) {
                        this.S = Integer.parseInt((String)stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"streamChatUserFilter")) {
                        this.T = Integer.parseInt((String)stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"streamMicToggleBehavior")) {
                        this.U = Integer.parseInt((String)stringArray[1]);
                    }
                    if (stringArray[0].equals((Object)"forceUnicodeFont")) {
                        this.aO = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"allowBlockAlternatives")) {
                        this.v = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"reducedDebugInfo")) {
                        this.w = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"useNativeTransport")) {
                        this.V = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"entityShadows")) {
                        this.W = stringArray[1].equals((Object)"true");
                    }
                    if (stringArray[0].equals((Object)"realmsNotifications")) {
                        this.X = stringArray[1].equals((Object)"true");
                    }
                    for (avb avb2 : this.ax) {
                        if (!stringArray[0].equals((Object)("key_" + avb2.g()))) continue;
                        avb2.b(Integer.parseInt((String)stringArray[1]));
                    }
                    for (bpg bpg2 : bpg.values()) {
                        if (!stringArray[0].equals((Object)("soundCategory_" + bpg2.a()))) continue;
                        this.bb.put((Object)bpg2, (Object)Float.valueOf((float)this.a(stringArray[1])));
                    }
                    for (wo wo2 : wo.values()) {
                        if (!stringArray[0].equals((Object)("modelPart_" + wo2.c()))) continue;
                        this.a(wo2, stringArray[1].equals((Object)"true"));
                    }
                }
                catch (Exception exception) {
                    aP.warn("Skipping bad option: " + \u26032);
                }
            }
            avb.b();
            bufferedReader.close();
        }
        catch (Exception exception) {
            aP.error("Failed to load options", (Throwable)exception);
        }
    }

    private float a(String string) {
        if (string.equals((Object)"true")) {
            return 1.0f;
        }
        if (string.equals((Object)"false")) {
            return 0.0f;
        }
        return Float.parseFloat((String)string);
    }

    public void b() {
        try {
            PrintWriter printWriter = new PrintWriter((Writer)new FileWriter(this.bc));
            printWriter.println("invertYMouse:" + this.b);
            printWriter.println("mouseSensitivity:" + this.a);
            printWriter.println("fov:" + (this.aI - 70.0f) / 40.0f);
            printWriter.println("gamma:" + this.aJ);
            printWriter.println("saturation:" + this.aK);
            printWriter.println("renderDistance:" + this.c);
            printWriter.println("guiScale:" + this.aL);
            printWriter.println("particles:" + this.aM);
            printWriter.println("bobView:" + this.d);
            printWriter.println("anaglyph3d:" + this.e);
            printWriter.println("maxFps:" + this.g);
            printWriter.println("fboEnable:" + this.f);
            printWriter.println("difficulty:" + this.az.a());
            printWriter.println("fancyGraphics:" + this.i);
            printWriter.println("ao:" + this.j);
            switch (this.h) {
                case 2: {
                    printWriter.println("renderClouds:true");
                    break;
                }
                case 1: {
                    printWriter.println("renderClouds:fast");
                    break;
                }
                case 0: {
                    printWriter.println("renderClouds:false");
                }
            }
            printWriter.println("resourcePacks:" + aQ.toJson(this.k));
            printWriter.println("incompatibleResourcePacks:" + aQ.toJson(this.l));
            printWriter.println("lastServer:" + this.aF);
            printWriter.println("lang:" + this.aN);
            printWriter.println("chatVisibility:" + this.m.a());
            printWriter.println("chatColors:" + this.n);
            printWriter.println("chatLinks:" + this.o);
            printWriter.println("chatLinksPrompt:" + this.p);
            printWriter.println("chatOpacity:" + this.q);
            printWriter.println("snooperEnabled:" + this.r);
            printWriter.println("fullscreen:" + this.s);
            printWriter.println("enableVsync:" + this.t);
            printWriter.println("useVbo:" + this.u);
            printWriter.println("hideServerAddress:" + this.x);
            printWriter.println("advancedItemTooltips:" + this.y);
            printWriter.println("pauseOnLostFocus:" + this.z);
            printWriter.println("touchscreen:" + this.A);
            printWriter.println("overrideWidth:" + this.B);
            printWriter.println("overrideHeight:" + this.C);
            printWriter.println("heldItemTooltips:" + this.D);
            printWriter.println("chatHeightFocused:" + this.H);
            printWriter.println("chatHeightUnfocused:" + this.G);
            printWriter.println("chatScale:" + this.E);
            printWriter.println("chatWidth:" + this.F);
            printWriter.println("showInventoryAchievementHint:" + this.I);
            printWriter.println("mipmapLevels:" + this.J);
            printWriter.println("streamBytesPerPixel:" + this.K);
            printWriter.println("streamMicVolume:" + this.L);
            printWriter.println("streamSystemVolume:" + this.M);
            printWriter.println("streamKbps:" + this.N);
            printWriter.println("streamFps:" + this.O);
            printWriter.println("streamCompression:" + this.P);
            printWriter.println("streamSendMetadata:" + this.Q);
            printWriter.println("streamPreferredServer:" + this.R);
            printWriter.println("streamChatEnabled:" + this.S);
            printWriter.println("streamChatUserFilter:" + this.T);
            printWriter.println("streamMicToggleBehavior:" + this.U);
            printWriter.println("forceUnicodeFont:" + this.aO);
            printWriter.println("allowBlockAlternatives:" + this.v);
            printWriter.println("reducedDebugInfo:" + this.w);
            printWriter.println("useNativeTransport:" + this.V);
            printWriter.println("entityShadows:" + this.W);
            printWriter.println("realmsNotifications:" + this.X);
            for (avb avb2 : this.ax) {
                printWriter.println("key_" + avb2.g() + ":" + avb2.i());
            }
            for (bpg bpg2 : bpg.values()) {
                printWriter.println("soundCategory_" + bpg2.a() + ":" + this.a(bpg2));
            }
            for (wo wo2 : wo.values()) {
                printWriter.println("modelPart_" + wo2.c() + ":" + this.ba.contains((Object)wo2));
            }
            printWriter.close();
        }
        catch (Exception exception) {
            aP.error("Failed to save options", (Throwable)exception);
        }
        this.c();
    }

    public float a(bpg bpg2) {
        if (this.bb.containsKey((Object)bpg2)) {
            return ((Float)this.bb.get((Object)bpg2)).floatValue();
        }
        return 1.0f;
    }

    public void a(bpg bpg2, float f) {
        this.ay.W().a(bpg2, f);
        this.bb.put((Object)bpg2, (Object)Float.valueOf((float)f));
    }

    public void c() {
        if (this.ay.h != null) {
            int n = 0;
            for (wo wo2 : this.ba) {
                n |= wo2.a();
            }
            this.ay.h.a.a(new ih(this.aN, this.c, this.m, this.n, n));
        }
    }

    public Set<wo> d() {
        return ImmutableSet.copyOf(this.ba);
    }

    public void a(wo wo2, boolean bl) {
        if (bl) {
            this.ba.add((Object)wo2);
        } else {
            this.ba.remove((Object)wo2);
        }
        this.c();
    }

    public void a(wo wo2) {
        if (!this.d().contains((Object)wo2)) {
            this.ba.add((Object)wo2);
        } else {
            this.ba.remove((Object)wo2);
        }
        this.c();
    }

    public int e() {
        if (this.c >= 4) {
            return this.h;
        }
        return 0;
    }

    public boolean f() {
        return this.V;
    }

    public static enum a {
        a("options.invertMouse", false, true),
        b("options.sensitivity", true, false),
        c("options.fov", true, false, 30.0f, 110.0f, 1.0f),
        d("options.gamma", true, false),
        e("options.saturation", true, false),
        f("options.renderDistance", true, false, 2.0f, 16.0f, 1.0f),
        g("options.viewBobbing", false, true),
        h("options.anaglyph", false, true),
        i("options.framerateLimit", true, false, 10.0f, 260.0f, 10.0f),
        j("options.fboEnable", false, true),
        k("options.renderClouds", false, false),
        l("options.graphics", false, false),
        m("options.ao", false, false),
        n("options.guiScale", false, false),
        o("options.particles", false, false),
        p("options.chat.visibility", false, false),
        q("options.chat.color", false, true),
        r("options.chat.links", false, true),
        s("options.chat.opacity", true, false),
        t("options.chat.links.prompt", false, true),
        u("options.snooper", false, true),
        v("options.fullscreen", false, true),
        w("options.vsync", false, true),
        x("options.vbo", false, true),
        y("options.touchscreen", false, true),
        z("options.chat.scale", true, false),
        A("options.chat.width", true, false),
        B("options.chat.height.focused", true, false),
        C("options.chat.height.unfocused", true, false),
        D("options.mipmapLevels", true, false, 0.0f, 4.0f, 1.0f),
        E("options.forceUnicodeFont", false, true),
        F("options.stream.bytesPerPixel", true, false),
        G("options.stream.micVolumne", true, false),
        H("options.stream.systemVolume", true, false),
        I("options.stream.kbps", true, false),
        J("options.stream.fps", true, false),
        K("options.stream.compression", false, false),
        L("options.stream.sendMetadata", false, true),
        M("options.stream.chat.enabled", false, false),
        N("options.stream.chat.userFilter", false, false),
        O("options.stream.micToggleBehavior", false, false),
        P("options.blockAlternatives", false, true),
        Q("options.reducedDebugInfo", false, true),
        R("options.entityShadows", false, true),
        S("options.realmsNotifications", false, true);

        private final boolean T;
        private final boolean U;
        private final String V;
        private final float W;
        private float X;
        private float Y;

        public static a a(int n) {
            for (a a2 : avh$a.values()) {
                if (a2.c() != n) continue;
                return a2;
            }
            return null;
        }

        private a(String string2, boolean bl, boolean bl2) {
            this(string2, bl, bl2, 0.0f, 1.0f, 0.0f);
        }

        private a(String string2, boolean bl, boolean bl2, float f, float f2, float f3) {
            this.V = string2;
            this.T = bl;
            this.U = bl2;
            this.X = f;
            this.Y = f2;
            this.W = f3;
        }

        public boolean a() {
            return this.T;
        }

        public boolean b() {
            return this.U;
        }

        public int c() {
            return this.ordinal();
        }

        public String d() {
            return this.V;
        }

        public float f() {
            return this.Y;
        }

        public void a(float f) {
            this.Y = f;
        }

        public float c(float f) {
            return ns.a((this.e(f) - this.X) / (this.Y - this.X), 0.0f, 1.0f);
        }

        public float d(float f) {
            return this.e(this.X + (this.Y - this.X) * ns.a(f, 0.0f, 1.0f));
        }

        public float e(float f) {
            f = this.f(f);
            return ns.a(f, this.X, this.Y);
        }

        protected float f(float f) {
            if (this.W > 0.0f) {
                f = this.W * (float)Math.round((float)(f / this.W));
            }
            return f;
        }
    }
}
