package com.whatsapp;

import android.transition.Transition;
import android.view.View;
import android.view.animation.AnimationUtils;

class auo extends any {
    final ProfileInfoActivity a;
    final View b;

    public void onTransitionEnd(Transition transition) {
        super.onTransitionEnd(transition);
        this.b.startAnimation(AnimationUtils.loadAnimation(this.a, 17432576));
        this.b.setVisibility(0);
    }

    auo(ProfileInfoActivity profileInfoActivity, View view) {
        this.a = profileInfoActivity;
        this.b = view;
    }
}
