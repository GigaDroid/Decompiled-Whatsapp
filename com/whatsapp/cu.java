package com.whatsapp;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

class cu implements Runnable {
    final IdentityVerificationActivity a;

    cu(IdentityVerificationActivity identityVerificationActivity) {
        this.a = identityVerificationActivity;
    }

    public void run() {
        ImageView imageView = (ImageView) this.a.findViewById(2131755707);
        imageView.setVisibility(8);
        Animation animationSet = new AnimationSet(true);
        Animation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setInterpolator(new AccelerateInterpolator());
        animationSet.setDuration((long) this.a.getResources().getInteger(17694721));
        imageView.startAnimation(animationSet);
    }
}
