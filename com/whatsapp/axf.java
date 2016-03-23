package com.whatsapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class axf extends AnimatorListenerAdapter {
    final ama a;
    final boolean b;
    final View c;

    public void onAnimationStart(Animator animator) {
        this.c.setAlpha(1.0f);
    }

    axf(ama com_whatsapp_ama, View view, boolean z) {
        this.a = com_whatsapp_ama;
        this.c = view;
        this.b = z;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.b) {
            this.c.setAlpha(0.0f);
        }
    }
}
