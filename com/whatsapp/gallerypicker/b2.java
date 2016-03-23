package com.whatsapp.gallerypicker;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

class b2 implements Runnable {
    final ImagePreview a;

    b2(ImagePreview imagePreview) {
        this.a = imagePreview;
    }

    public void run() {
        ImagePreview.l(this.a).setBackgroundColor(1962934272);
        if (!ImagePreview.d(this.a)) {
            ImagePreview.x(this.a).setTextColor(-1291845633);
            ImagePreview.q(this.a).setAlpha(178);
        }
        Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300);
        ImagePreview.l(this.a).startAnimation(alphaAnimation);
    }
}
