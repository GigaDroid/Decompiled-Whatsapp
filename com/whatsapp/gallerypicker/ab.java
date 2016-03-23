package com.whatsapp.gallerypicker;

import android.view.animation.Interpolator;

class ab implements Interpolator {
    final bq a;

    public float getInterpolation(float f) {
        return f > 0.0f ? 1.0f : 0.0f;
    }

    ab(bq bqVar) {
        this.a = bqVar;
    }
}
