package com.whatsapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;

class t0 extends AnimatorListenerAdapter {
    final TransitionValues a;
    final alj b;

    public void onAnimationStart(Animator animator) {
        this.a.view.setAlpha(1.0f);
    }

    t0(alj com_whatsapp_alj, TransitionValues transitionValues) {
        this.b = com_whatsapp_alj;
        this.a = transitionValues;
    }
}
