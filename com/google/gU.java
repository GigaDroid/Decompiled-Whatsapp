package com.google;

public final class gU {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;

    private gU(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.i = f;
        this.b = f4;
        this.f = f7;
        this.g = f2;
        this.d = f5;
        this.e = f8;
        this.c = f3;
        this.h = f6;
        this.a = f9;
    }

    public static gU a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return b(f, f2, f3, f4, f5, f6, f7, f8).a();
    }

    public void a(float[] fArr) {
        boolean z = d_.a;
        int length = fArr.length;
        float f = this.i;
        float f2 = this.b;
        float f3 = this.f;
        float f4 = this.g;
        float f5 = this.d;
        float f6 = this.e;
        float f7 = this.c;
        float f8 = this.h;
        float f9 = this.a;
        int i = 0;
        while (i < length) {
            float f10 = fArr[i];
            float f11 = fArr[i + 1];
            float f12 = ((f3 * f10) + (f6 * f11)) + f9;
            fArr[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr[i + 1] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
            i += 2;
            if (z) {
                return;
            }
        }
    }

    public static gU a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return b(f9, f10, f11, f12, f13, f14, f15, f16).a(a(f, f2, f3, f4, f5, f6, f7, f8));
    }

    gU a() {
        boolean z = d_.a;
        gU gUVar = new gU((this.d * this.a) - (this.e * this.h), (this.e * this.c) - (this.g * this.a), (this.g * this.h) - (this.d * this.c), (this.f * this.h) - (this.b * this.a), (this.i * this.a) - (this.f * this.c), (this.b * this.c) - (this.i * this.h), (this.b * this.e) - (this.f * this.d), (this.f * this.g) - (this.i * this.e), (this.i * this.d) - (this.b * this.g));
        if (aK.a) {
            d_.a = !z;
        }
        return gUVar;
    }

    public static gU b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new gU(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f10 * f11) - (f9 * f13)) / f15;
        return new gU((f3 - f) + (f16 * f3), (f7 - f) + (f17 * f7), f, (f16 * f4) + (f4 - f2), (f17 * f8) + (f8 - f2), f2, f16, f17, 1.0f);
    }

    gU a(gU gUVar) {
        boolean z = d_.a;
        gU gUVar2 = new gU(((this.i * gUVar.i) + (this.g * gUVar.b)) + (this.c * gUVar.f), ((this.i * gUVar.g) + (this.g * gUVar.d)) + (this.c * gUVar.e), ((this.i * gUVar.c) + (this.g * gUVar.h)) + (this.c * gUVar.a), ((this.b * gUVar.i) + (this.d * gUVar.b)) + (this.h * gUVar.f), ((this.b * gUVar.g) + (this.d * gUVar.d)) + (this.h * gUVar.e), ((this.b * gUVar.c) + (this.d * gUVar.h)) + (this.h * gUVar.a), ((this.f * gUVar.i) + (this.e * gUVar.b)) + (this.a * gUVar.f), ((this.f * gUVar.g) + (this.e * gUVar.d)) + (this.a * gUVar.e), ((this.f * gUVar.c) + (this.e * gUVar.h)) + (this.a * gUVar.a));
        if (z) {
            aK.a = !aK.a;
        }
        return gUVar2;
    }
}
