/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.realms.RealmsButton;
import net.minecraft.realms.RealmsScreen;

public class awr
extends axu {
    private RealmsScreen a;

    public awr(RealmsScreen realmsScreen) {
        this.a = realmsScreen;
        this.n = Collections.synchronizedList((List)Lists.newArrayList());
    }

    public RealmsScreen a() {
        return this.a;
    }

    @Override
    public void b() {
        this.a.init();
        super.b();
    }

    public void a(String string, int n, int n2, int n3) {
        super.a(this.q, string, n, n2, n3);
    }

    public void a(String string, int n, int n2, int n3, boolean bl) {
        if (bl) {
            super.c(this.q, string, n, n2, n3);
        } else {
            this.q.a(string, n, n2, n3);
        }
    }

    @Override
    public void b(int n, int n2, int n3, int n4, int n5, int n6) {
        this.a.blit(n, n2, n3, n4, n5, n6);
        super.b(n, n2, n3, n4, n5, n6);
    }

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, int n6) {
        super.a(n, n2, n3, n4, n5, n6);
    }

    @Override
    public void c() {
        super.c();
    }

    @Override
    public boolean d() {
        return super.d();
    }

    @Override
    public void b_(int n) {
        super.b_(n);
    }

    @Override
    public void a(int n, int n2, float f) {
        this.a.render(n, n2, f);
    }

    @Override
    public void a(zx zx2, int n, int n2) {
        super.a(zx2, n, n2);
    }

    @Override
    public void a(String string, int n, int n2) {
        super.a(string, n, n2);
    }

    @Override
    public void a(List<String> list, int n, int n2) {
        super.a(list, n, n2);
    }

    @Override
    public void e() {
        this.a.tick();
        super.e();
    }

    public int h() {
        return this.q.a;
    }

    public int c(String string) {
        return this.q.a(string);
    }

    public void b(String string, int n, int n2, int n3) {
        this.q.a(string, (float)n, (float)n2, n3);
    }

    public List<String> a(String string, int n) {
        return this.q.c(string, n);
    }

    @Override
    public final void a(avs avs2) {
        this.a.buttonClicked(((awp)avs2).f());
    }

    public void i() {
        this.n.clear();
    }

    public void a(RealmsButton realmsButton) {
        this.n.add((Object)realmsButton.getProxy());
    }

    public List<RealmsButton> j() {
        ArrayList arrayList = Lists.newArrayListWithExpectedSize((int)this.n.size());
        for (avs avs2 : this.n) {
            arrayList.add((Object)((awp)avs2).f());
        }
        return arrayList;
    }

    public void b(RealmsButton realmsButton) {
        this.n.remove((Object)realmsButton.getProxy());
    }

    @Override
    public void a(int n, int n2, int n3) {
        this.a.mouseClicked(n, n2, n3);
        super.a(n, n2, n3);
    }

    @Override
    public void k() {
        this.a.mouseEvent();
        super.k();
    }

    @Override
    public void l() {
        this.a.keyboardEvent();
        super.l();
    }

    @Override
    public void b(int n, int n2, int n3) {
        this.a.mouseReleased(n, n2, n3);
    }

    @Override
    public void a(int n, int n2, int n3, long l) {
        this.a.mouseDragged(n, n2, n3, l);
    }

    @Override
    public void a(char c, int n) {
        this.a.keyPressed(c, n);
    }

    @Override
    public void a(boolean bl, int n) {
        this.a.confirmResult(bl, n);
    }

    @Override
    public void m() {
        this.a.removed();
        super.m();
    }
}
