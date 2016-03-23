package com.whatsapp;

import android.view.animation.Interpolator;

final class f6 implements Interpolator {
    f6() {
    }

    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
    }
}
