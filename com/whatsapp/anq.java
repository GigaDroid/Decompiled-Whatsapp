package com.whatsapp;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

class anq implements Runnable {
    final VoipActivity a;

    public void run() {
        TextView textView = (TextView) this.a.findViewById(2131755975);
        Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(400);
        textView.setAnimation(alphaAnimation);
        textView.setVisibility(4);
    }

    anq(VoipActivity voipActivity) {
        this.a = voipActivity;
    }
}
