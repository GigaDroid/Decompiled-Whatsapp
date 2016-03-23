package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Transformation;

class qx extends Animation {
    final CircularRevealView a;
    boolean b;

    qx(CircularRevealView circularRevealView, boolean z) {
        this.a = circularRevealView;
        this.b = z;
    }

    protected void applyTransformation(float f, Transformation transformation) {
        CircularRevealView circularRevealView = this.a;
        if (this.b) {
            f = 1.0f - f;
        }
        CircularRevealView.a(circularRevealView, f);
        this.a.invalidate();
    }
}
