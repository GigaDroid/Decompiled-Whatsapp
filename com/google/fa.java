package com.google;

public final class fa extends fI {
    private final float d;

    fa(float f, float f2, float f3) {
        super(f, f2);
        this.d = f3;
    }

    fa b(float f, float f2, float f3) {
        return new fa((a() + f2) / 2.0f, (b() + f) / 2.0f, (this.d + f3) / 2.0f);
    }

    boolean a(float f, float f2, float f3) {
        if (Math.abs(f2 - b()) > f || Math.abs(f3 - a()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.d);
        if (abs <= 1.0f || abs <= this.d) {
            return true;
        }
        return false;
    }
}
