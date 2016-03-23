package com.whatsapp;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

class oc implements OnGlobalLayoutListener {
    final ImageView a;
    final Conversation b;
    final View c;

    public void onGlobalLayout() {
        this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        int intrinsicWidth = this.a.getDrawable().getIntrinsicWidth();
        int intrinsicHeight = this.a.getDrawable().getIntrinsicHeight();
        int[] iArr = new int[2];
        this.c.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        this.b.bc.getLocationOnScreen(iArr2);
        int i = iArr[0] - iArr2[0];
        int i2 = iArr[1] - iArr2[1];
        int width = i - ((intrinsicWidth - this.c.getWidth()) / 2);
        i2 -= (intrinsicHeight - this.c.getHeight()) / 2;
        this.a.setVisibility(0);
        Animation animationSet = new AnimationSet(true);
        Animation translateAnimation = new TranslateAnimation((float) width, (float) width, (float) i2, ((float) i2) - (((float) intrinsicHeight) * 2.0f));
        float intrinsicWidth2 = (((float) ((ImageView) this.c).getDrawable().getIntrinsicWidth()) * 1.0f) / ((float) intrinsicWidth);
        Animation scaleAnimation = new ScaleAnimation(intrinsicWidth2, 1.0f, intrinsicWidth2, 1.0f, 1, 0.5f, 1, 0.5f);
        animationSet.addAnimation(new AlphaAnimation(0.5f, 0.0f));
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setDuration(2000);
        animationSet.setInterpolator(new DecelerateInterpolator(2.0f));
        animationSet.setAnimationListener(new ha(this));
        this.a.startAnimation(animationSet);
    }

    oc(Conversation conversation, ImageView imageView, View view) {
        this.b = conversation;
        this.a = imageView;
        this.c = view;
    }
}
