package com.whatsapp.util;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class b4 implements AnimatorUpdateListener {
    final FloatingChildLayout a;

    b4(FloatingChildLayout floatingChildLayout) {
        this.a = floatingChildLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setBackgroundColorAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
