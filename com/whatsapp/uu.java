package com.whatsapp;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

class uu implements OnGlobalLayoutListener {
    final boolean a;
    final Conversation b;

    uu(Conversation conversation, boolean z) {
        this.b = conversation;
        this.a = z;
    }

    public void onGlobalLayout() {
        Conversation.w(this.b).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        int height = Conversation.w(this.b).getHeight();
        Animation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) height, 0.0f);
        translateAnimation.setDuration(250);
        if (this.a) {
            this.b.bc.startAnimation(translateAnimation);
        }
        Conversation.ac(this.b).startAnimation(translateAnimation);
        View findViewById = this.b.findViewById(2131755505);
        Drawable background = findViewById.getBackground();
        if (!(background instanceof x1)) {
            findViewById.setBackgroundDrawable(new x1(background));
        }
        ((x1) findViewById.getBackground()).a(0, height, 0, 0);
        translateAnimation = new oz(this, height, findViewById);
        translateAnimation.setStartTime(-1);
        translateAnimation.setDuration(250);
        translateAnimation.setAnimationListener(new ck(this));
        findViewById.startAnimation(translateAnimation);
    }
}
