package com.whatsapp;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;

class j5 implements AnimationListener {
    final View a;
    final View b;
    final a9z c;
    final View d;
    final View e;

    public void onAnimationEnd(Animation animation) {
        this.d.setVisibility(8);
        if (this.c.g()) {
            this.b.setVisibility(8);
            return;
        }
        Animation animationSet = new AnimationSet(true);
        Animation translateAnimation = new TranslateAnimation(1, -0.3f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(160);
        Animation rotateAnimation = new RotateAnimation(-60.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(160);
        rotateAnimation.setFillAfter(true);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(translateAnimation);
        this.a.startAnimation(animationSet);
        this.b.postDelayed(new st(this), 500);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    j5(a9z com_whatsapp_a9z, View view, View view2, View view3, View view4) {
        this.c = com_whatsapp_a9z;
        this.d = view;
        this.b = view2;
        this.a = view3;
        this.e = view4;
    }

    public void onAnimationStart(Animation animation) {
    }
}
