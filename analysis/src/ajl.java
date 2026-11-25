/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Random
 */
import java.util.Random;

public class ajl
extends afc {
    protected ajl() {
        super(arm.d);
        float f = 0.25f;
        \u2603 = 1.0f;
        this.a(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, \u2603, 0.5f + f);
    }

    @Override
    public aug a(adm adm2, cj cj2, alz alz2) {
        return null;
    }

    @Override
    public aug b(adm adm2, cj cj2) {
        this.a((adq)adm2, cj2);
        return super.b(adm2, cj2);
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean b(adq adq2, cj cj2) {
        return true;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public akw a(adm adm2, int n2) {
        return new aln();
    }

    @Override
    public zw a(alz alz2, Random random, int n2) {
        return zy.ap;
    }

    @Override
    public zw c(adm adm2, cj cj2) {
        return zy.ap;
    }

    @Override
    public boolean a(adm adm2, cj cj2, alz alz2, wn wn2, cq cq2, float f, float f2, float f3) {
        if (adm2.D) {
            return true;
        }
        akw akw2 = adm2.s(cj2);
        if (akw2 instanceof aln) {
            return ((aln)akw2).b(wn2);
        }
        return false;
    }

    @Override
    public boolean d(adm adm2, cj cj2) {
        return !this.e(adm2, cj2) && super.d(adm2, cj2);
    }
}
