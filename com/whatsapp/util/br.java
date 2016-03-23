package com.whatsapp.util;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class br implements AnimatorUpdateListener {
    final FloatingChildLayout a;

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setBackgroundColorAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    br(FloatingChildLayout floatingChildLayout) {
        this.a = floatingChildLayout;
    }
}
