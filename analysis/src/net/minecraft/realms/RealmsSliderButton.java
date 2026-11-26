/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package net.minecraft.realms;

import net.minecraft.realms.RealmsButton;

public class RealmsSliderButton
extends RealmsButton {
    public float value = 1.0f;
    public boolean sliding;
    private final float minValue;
    private final float maxValue;
    private int steps;

    public RealmsSliderButton(int n, int n2, int n3, int n4, int n5, int n6) {
        this(n, n2, n3, n4, n6, 0, 1.0f, n5);
    }

    public RealmsSliderButton(int n, int n2, int n3, int n4, int n5, int n6, float f, float f2) {
        super(n, n2, n3, n4, 20, "");
        this.minValue = f;
        this.maxValue = f2;
        this.value = this.toPct(n6);
        this.getProxy().j = this.getMessage();
    }

    public String getMessage() {
        return "";
    }

    public float toPct(float f) {
        return ns.a((this.clamp(f) - this.minValue) / (this.maxValue - this.minValue), 0.0f, 1.0f);
    }

    public float toValue(float f) {
        return this.clamp(this.minValue + (this.maxValue - this.minValue) * ns.a(f, 0.0f, 1.0f));
    }

    public float clamp(float f) {
        f = this.clampSteps(f);
        return ns.a(f, this.minValue, this.maxValue);
    }

    protected float clampSteps(float f) {
        if (this.steps > 0) {
            f = this.steps * Math.round((float)(f / (float)this.steps));
        }
        return f;
    }

    @Override
    public int getYImage(boolean bl) {
        return 0;
    }

    @Override
    public void renderBg(int n2, int n3) {
        if (!this.getProxy().m) {
            return;
        }
        if (this.sliding) {
            this.value = (float)(n2 - (this.getProxy().h + 4)) / (float)(this.getProxy().b() - 8);
            this.value = ns.a(this.value, 0.0f, 1.0f);
            float f2 = this.toValue(this.value);
            this.clicked(f2);
            this.value = this.toPct(f2);
            this.getProxy().j = this.getMessage();
        }
        ave.A().P().a(WIDGETS_LOCATION);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.blit(this.getProxy().h + (int)(this.value * (float)(this.getProxy().b() - 8)), this.getProxy().i, 0, 66, 4, 20);
        this.blit(this.getProxy().h + (int)(this.value * (float)(this.getProxy().b() - 8)) + 4, this.getProxy().i, 196, 66, 4, 20);
    }

    @Override
    public void clicked(int n2, int n3) {
        this.value = (float)(n2 - (this.getProxy().h + 4)) / (float)(this.getProxy().b() - 8);
        this.value = ns.a(this.value, 0.0f, 1.0f);
        this.clicked(this.toValue(this.value));
        this.getProxy().j = this.getMessage();
        this.sliding = true;
    }

    public void clicked(float f2) {
    }

    @Override
    public void released(int n2, int n3) {
        this.sliding = false;
    }
}
