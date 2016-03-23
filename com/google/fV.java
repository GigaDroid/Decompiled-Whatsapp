package com.google;

public final class fV extends fI {
    private final int d;
    private final float e;

    private fV(float f, float f2, float f3, int i) {
        super(f, f2);
        this.e = f3;
        this.d = i;
    }

    public float c() {
        return this.e;
    }

    fV(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    boolean b(float f, float f2, float f3) {
        if (Math.abs(f2 - b()) > f || Math.abs(f3 - a()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.e);
        if (abs <= 1.0f || abs <= this.e) {
            return true;
        }
        return false;
    }

    fV a(float f, float f2, float f3) {
        int i = this.d + 1;
        return new fV(((((float) this.d) * a()) + f2) / ((float) i), ((((float) this.d) * b()) + f) / ((float) i), ((((float) this.d) * this.e) + f3) / ((float) i), i);
    }

    int a() {
        return this.d;
    }
}
