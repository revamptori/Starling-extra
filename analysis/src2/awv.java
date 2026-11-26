/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class awv
extends axu {
    private static final Logger f = LogManager.getLogger();
    private String g = "";
    private int h = -1;
    private boolean i;
    private boolean r;
    private int s;
    private List<String> t = Lists.newArrayList();
    protected avw a;
    private String u = "";

    public awv() {
    }

    public awv(String string) {
        this.u = string;
    }

    @Override
    public void b() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.h = this.j.q.d().c().size();
        this.a = new avw(0, this.q, 4, this.m - 12, this.l - 4, 12);
        this.a.f(100);
        this.a.a(false);
        this.a.b(true);
        this.a.a(this.u);
        this.a.d(false);
    }

    @Override
    public void m() {
        Keyboard.enableRepeatEvents((boolean)false);
        this.j.q.d().d();
    }

    @Override
    public void e() {
        this.a.a();
    }

    @Override
    protected void a(char c2, int n2) {
        int n2;
        this.r = false;
        if (n2 == 15) {
            this.a();
        } else {
            this.i = false;
        }
        if (n2 == 1) {
            this.j.a((axu)null);
        } else if (n2 == 28 || n2 == 156) {
            String string = this.a.b().trim();
            if (string.length() > 0) {
                this.f(string);
            }
            this.j.a((axu)null);
        } else if (n2 == 200) {
            this.b(-1);
        } else if (n2 == 208) {
            this.b(1);
        } else if (n2 == 201) {
            this.j.q.d().b(this.j.q.d().i() - 1);
        } else if (n2 == 209) {
            this.j.q.d().b(-this.j.q.d().i() + 1);
        } else {
            this.a.a(c2, n2);
        }
    }

    @Override
    public void k() {
        super.k();
        int n = Mouse.getEventDWheel();
        if (n != 0) {
            if (n > 1) {
                n = 1;
            }
            if (n < -1) {
                n = -1;
            }
            if (!awv.r()) {
                n *= 7;
            }
            this.j.q.d().b(n);
        }
    }

    @Override
    protected void a(int n, int n2, int n3) {
        if (n3 == 0 && this.a(\u2603 = this.j.q.d().a(Mouse.getX(), Mouse.getY()))) {
            return;
        }
        this.a.a(n, n2, n3);
        super.a(n, n2, n3);
    }

    @Override
    protected void a(String string, boolean bl) {
        if (bl) {
            this.a.a(string);
        } else {
            this.a.b(string);
        }
    }

    public void a() {
        if (this.i) {
            this.a.b(this.a.a(-1, this.a.i(), false) - this.a.i());
            if (this.s >= this.t.size()) {
                this.s = 0;
            }
        } else {
            int n = this.a.a(-1, this.a.i(), false);
            this.t.clear();
            this.s = 0;
            String \u26032 = this.a.b().substring(n).toLowerCase();
            String \u26033 = this.a.b().substring(0, this.a.i());
            this.a(\u26033, \u26032);
            if (this.t.isEmpty()) {
                return;
            }
            this.i = true;
            this.a.b(n - this.a.i());
        }
        if (this.t.size() > 1) {
            StringBuilder \u26034 = new StringBuilder();
            for (String \u26033 : this.t) {
                if (\u26034.length() > 0) {
                    \u26034.append(", ");
                }
                \u26034.append(\u26033);
            }
            this.j.q.d().a(new fa(\u26034.toString()), 1);
        }
        this.a.b((String)this.t.get(this.s++));
    }

    private void a(String string, String string2) {
        if (string.length() < 1) {
            return;
        }
        cj cj2 = null;
        if (this.j.s != null && this.j.s.a == auh.a.b) {
            cj2 = this.j.s.a();
        }
        this.j.h.a.a(new id(string, cj2));
        this.r = true;
    }

    public void b(int n) {
        \u2603 = this.h + n;
        \u2603 = this.j.q.d().c().size();
        if ((\u2603 = ns.a(\u2603, 0, \u2603)) == this.h) {
            return;
        }
        if (\u2603 == \u2603) {
            this.h = \u2603;
            this.a.a(this.g);
            return;
        }
        if (this.h == \u2603) {
            this.g = this.a.b();
        }
        this.a.a((String)this.j.q.d().c().get(\u2603));
        this.h = \u2603;
    }

    @Override
    public void a(int n, int n2, float f) {
        awv.a(2, this.m - 14, this.l - 2, this.m - 2, Integer.MIN_VALUE);
        this.a.g();
        eu eu2 = this.j.q.d().a(Mouse.getX(), Mouse.getY());
        if (eu2 != null && eu2.b().i() != null) {
            this.a(eu2, n, n2);
        }
        super.a(n, n2, f);
    }

    public void a(String[] stringArray) {
        if (this.r) {
            this.i = false;
            this.t.clear();
            for (String string : stringArray) {
                if (string.length() <= 0) continue;
                this.t.add((Object)string);
            }
            String string = this.a.b().substring(this.a.a(-1, this.a.i(), false));
            String \u26032 = StringUtils.getCommonPrefix((String[])stringArray);
            if (\u26032.length() > 0 && !string.equalsIgnoreCase(\u26032)) {
                this.a.b(this.a.a(-1, this.a.i(), false) - this.a.i());
                this.a.b(\u26032);
            } else if (this.t.size() > 0) {
                this.i = true;
                this.a();
            }
        }
    }

    @Override
    public boolean d() {
        return false;
    }
}
