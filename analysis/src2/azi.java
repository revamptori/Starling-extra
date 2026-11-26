/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
public class azi
implements awd.a {
    private final ave a = ave.A();

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        String string;
        int n8 = n3 + n5 / 2 - this.a.k.a / 2;
        this.a.k.a(bnq.a("lanServer.scanning", new Object[0]), this.a.m.l / 2 - this.a.k.a(bnq.a("lanServer.scanning", new Object[0])) / 2, n8, 0xFFFFFF);
        switch ((int)(ave.J() / 300L % 4L)) {
            default: {
                string = "O o o";
                break;
            }
            case 1: 
            case 3: {
                string = "o O o";
                break;
            }
            case 2: {
                string = "o o O";
            }
        }
        this.a.k.a(string, this.a.m.l / 2 - this.a.k.a(string) / 2, n8 + this.a.k.a, 0x808080);
    }

    @Override
    public void a(int n, int n2, int n3) {
    }

    @Override
    public boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
        return false;
    }

    @Override
    public void b(int n, int n2, int n3, int n4, int n5, int n6) {
    }
}
