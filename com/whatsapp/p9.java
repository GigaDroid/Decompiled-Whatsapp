package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class p9 implements AnimationListener {
    final HomeActivity a;

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationRepeat(Animation animation) {
    }

    p9(HomeActivity homeActivity) {
        this.a = homeActivity;
    }

    public void onAnimationEnd(Animation animation) {
        HomeActivity.a(this.a).setIconified(true);
        HomeActivity.k(this.a).setVisibility(4);
    }
}
