package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class ha implements AnimationListener {
    final oc a;

    public void onAnimationStart(Animation animation) {
    }

    ha(oc ocVar) {
        this.a = ocVar;
    }

    public void onAnimationEnd(Animation animation) {
        this.a.a.post(new atn(this));
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
