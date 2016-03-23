package com.whatsapp;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

class r4 implements Runnable {
    final a9z a;

    public void run() {
        a9z.g(this.a).setVisibility(8);
        Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(320);
        a9z.g(this.a).startAnimation(alphaAnimation);
    }

    r4(a9z com_whatsapp_a9z) {
        this.a = com_whatsapp_a9z;
    }
}
