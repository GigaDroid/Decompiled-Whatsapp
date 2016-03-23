package com.whatsapp;

import android.view.animation.Interpolator;

class iy implements Interpolator {
    final a9z a;

    public float getInterpolation(float f) {
        if (((double) f) > 0.5d) {
            return Math.min(f, a9z.l(this.a));
        }
        return 0.0f;
    }

    iy(a9z com_whatsapp_a9z) {
        this.a = com_whatsapp_a9z;
    }
}
