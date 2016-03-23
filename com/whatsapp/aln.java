package com.whatsapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class aln extends AnimatorListenerAdapter {
    final CircularRevealView a;

    aln(CircularRevealView circularRevealView) {
        this.a = circularRevealView;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.setVisibility(4);
    }
}
