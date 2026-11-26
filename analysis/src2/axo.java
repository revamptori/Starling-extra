/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
public class axo
extends axu {
    @Override
    public void b() {
        this.n.clear();
        this.n.add((Object)new awe(0, this.l / 2 - 155, this.m / 4 + 120 + 12, bnq.a("gui.toTitle", new Object[0])));
        this.n.add((Object)new awe(1, this.l / 2 - 155 + 160, this.m / 4 + 120 + 12, bnq.a("menu.quit", new Object[0])));
    }

    @Override
    protected void a(avs avs2) {
        if (avs2.k == 0) {
            this.j.a(new aya());
        } else if (avs2.k == 1) {
            this.j.m();
        }
    }

    @Override
    protected void a(char c2, int n) {
    }

    @Override
    public void a(int n, int n2, float f) {
        this.c();
        this.a(this.q, "Out of memory!", this.l / 2, this.m / 4 - 60 + 20, 0xFFFFFF);
        this.c(this.q, "Minecraft has run out of memory.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 0, 0xA0A0A0);
        this.c(this.q, "This could be caused by a bug in the game or by the", this.l / 2 - 140, this.m / 4 - 60 + 60 + 18, 0xA0A0A0);
        this.c(this.q, "Java Virtual Machine not being allocated enough", this.l / 2 - 140, this.m / 4 - 60 + 60 + 27, 0xA0A0A0);
        this.c(this.q, "memory.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 36, 0xA0A0A0);
        this.c(this.q, "To prevent level corruption, the current game has quit.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 54, 0xA0A0A0);
        this.c(this.q, "We've tried to free up enough memory to let you go back to", this.l / 2 - 140, this.m / 4 - 60 + 60 + 63, 0xA0A0A0);
        this.c(this.q, "the main menu and back to playing, but this may not have worked.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 72, 0xA0A0A0);
        this.c(this.q, "Please restart the game if you see this message again.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 81, 0xA0A0A0);
        super.a(n, n2, f);
    }
}
