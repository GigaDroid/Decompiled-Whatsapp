package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class a5z implements AnimationListener {
    final HomeActivity a;

    public void onAnimationStart(Animation animation) {
    }

    a5z(HomeActivity homeActivity) {
        this.a = homeActivity;
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationEnd(Animation animation) {
        HomeActivity.a(this.a).setIconified(false);
    }
}
