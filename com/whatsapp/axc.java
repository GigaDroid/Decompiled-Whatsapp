package com.whatsapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class axc extends AnimatorListenerAdapter {
    final HomeActivity a;

    axc(HomeActivity homeActivity) {
        this.a = homeActivity;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        HomeActivity.a(this.a).setIconified(true);
        HomeActivity.k(this.a).setVisibility(4);
    }
}
