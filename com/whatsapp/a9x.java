package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class a9x implements AnimationListener {
    final RegisterPhone a;

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationEnd(Animation animation) {
        if (!RegisterPhone.c(this.a)) {
            this.a.G.setVisibility(8);
        }
    }

    a9x(RegisterPhone registerPhone) {
        this.a = registerPhone;
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
