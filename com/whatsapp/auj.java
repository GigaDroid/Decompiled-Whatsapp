package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class auj implements AnimationListener {
    final a48 a;

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationEnd(Animation animation) {
        IdentityVerificationActivity.b(this.a.a.a).b().setOneShotPreviewCallback(IdentityVerificationActivity.d(this.a.a.a));
    }

    auj(a48 com_whatsapp_a48) {
        this.a = com_whatsapp_a48;
    }

    public void onAnimationStart(Animation animation) {
    }
}
