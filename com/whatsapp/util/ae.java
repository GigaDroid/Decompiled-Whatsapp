package com.whatsapp.util;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

class ae implements Runnable {
    final FloatingChildLayout a;

    ae(FloatingChildLayout floatingChildLayout) {
        this.a = floatingChildLayout;
    }

    public void run() {
        if (FloatingChildLayout.c()) {
            FloatingChildLayout.d(this.a).setDuration((long) FloatingChildLayout.c(this.a)).start();
            if (Log.h == 0) {
                return;
            }
        }
        Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration((long) FloatingChildLayout.c(this.a));
        alphaAnimation.setFillAfter(true);
        this.a.setBackgroundColor(2130706432);
        this.a.startAnimation(alphaAnimation);
    }
}
