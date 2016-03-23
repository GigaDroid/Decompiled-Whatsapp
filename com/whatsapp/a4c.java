package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class a4c implements AnimationListener {
    final Runnable a;
    final IdentityVerificationActivity b;

    public void onAnimationEnd(Animation animation) {
        IdentityVerificationActivity.b(this.b).setVisibility(8);
        if (this.a != null) {
            this.a.run();
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    a4c(IdentityVerificationActivity identityVerificationActivity, Runnable runnable) {
        this.b = identityVerificationActivity;
        this.a = runnable;
    }

    public void onAnimationStart(Animation animation) {
    }
}
