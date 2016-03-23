package com.whatsapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class as1 extends AnimatorListenerAdapter {
    final Runnable a;
    final MediaView b;

    public void onAnimationEnd(Animator animator) {
        this.a.run();
    }

    as1(MediaView mediaView, Runnable runnable) {
        this.b = mediaView;
        this.a = runnable;
    }
}
