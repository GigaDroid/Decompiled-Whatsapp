package com.whatsapp;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

class a48 implements Runnable {
    final k0 a;

    a48(k0 k0Var) {
        this.a = k0Var;
    }

    public void run() {
        if (IdentityVerificationActivity.i(this.a.a)) {
            Animation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            translateAnimation.setInterpolator(new AccelerateInterpolator());
            translateAnimation.setDuration((long) this.a.a.getResources().getInteger(17694721));
            this.a.a.findViewById(2131755562).startAnimation(translateAnimation);
            this.a.a.findViewById(2131755711).setVisibility(8);
            this.a.a.findViewById(2131755707).setVisibility(8);
            translateAnimation.setAnimationListener(new auj(this));
            this.a.a.findViewById(2131755562).setVisibility(8);
            translateAnimation = new AlphaAnimation(0.0f, 1.0f);
            translateAnimation.setDuration((long) this.a.a.getResources().getInteger(17694720));
            this.a.a.findViewById(2131755710).startAnimation(translateAnimation);
            this.a.a.findViewById(2131755710).setVisibility(0);
        }
    }
}
