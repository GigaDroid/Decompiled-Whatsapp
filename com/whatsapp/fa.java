package com.whatsapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class fa extends AnimatorListenerAdapter {
    final ama a;
    final View b;
    final boolean c;

    public void onAnimationStart(Animator animator) {
        this.b.setAlpha(1.0f);
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.c) {
            this.b.setAlpha(0.0f);
        }
    }

    fa(ama com_whatsapp_ama, View view, boolean z) {
        this.a = com_whatsapp_ama;
        this.b = view;
        this.c = z;
    }
}
