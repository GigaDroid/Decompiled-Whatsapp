package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

class st implements Runnable {
    final j5 a;

    public void run() {
        this.a.b.setVisibility(8);
        if (!this.a.c.g()) {
            Animation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            translateAnimation.setAnimationListener(new axo(this));
            translateAnimation.setDuration(213);
            this.a.b.startAnimation(translateAnimation);
        }
    }

    st(j5 j5Var) {
        this.a = j5Var;
    }
}
