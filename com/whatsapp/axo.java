package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class axo implements AnimationListener {
    final st a;

    public void onAnimationEnd(Animation animation) {
        if (!this.a.a.c.g()) {
            this.a.a.e.setVisibility(0);
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }

    axo(st stVar) {
        this.a = stVar;
    }
}
