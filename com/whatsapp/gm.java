package com.whatsapp;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

class gm implements Runnable {
    final wl a;

    public void run() {
        VideoPreviewActivity.o(this.a.a).setVisibility(8);
        Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(600);
        VideoPreviewActivity.o(this.a.a).startAnimation(alphaAnimation);
    }

    gm(wl wlVar) {
        this.a = wlVar;
    }
}
