package com.whatsapp;

import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

class k_ implements OnGlobalLayoutListener {
    final n7 a;

    public void onGlobalLayout() {
        this.a.c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        Drawable background = this.a.c.getBackground();
        if (background instanceof x1) {
            this.a.c.setBackgroundDrawable(((x1) background).getWrappedDrawable());
        }
        Animation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(0);
        translateAnimation.setFillBefore(true);
        translateAnimation.setFillAfter(true);
        Conversation.ac(this.a.a).startAnimation(translateAnimation);
        if (this.a.b) {
            this.a.a.bc.startAnimation(translateAnimation);
        }
        Conversation.d(this.a.a, 0);
    }

    k_(n7 n7Var) {
        this.a = n7Var;
    }
}
