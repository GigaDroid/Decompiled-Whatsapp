package com.whatsapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class wd extends AnimatorListenerAdapter {
    final MediaView a;

    public void onAnimationEnd(Animator animator) {
        MediaView.a(this.a, false);
        MediaView.b(this.a, true);
    }

    wd(MediaView mediaView) {
        this.a = mediaView;
    }
}
