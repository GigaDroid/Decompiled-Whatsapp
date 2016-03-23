package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

class wy implements Runnable {
    final Conversation a;

    public void run() {
        if (Conversation.W(this.a) != null) {
            Conversation.W(this.a).setVisibility(8);
        }
        if (Conversation.D(this.a) != null) {
            Conversation.D(this.a).setVisibility(8);
        }
        if (Conversation.az(this.a) != null && Conversation.az(this.a).getVisibility() != 8) {
            Conversation.az(this.a).setVisibility(8);
            Animation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
            translateAnimation.setDuration(200);
            Conversation.az(this.a).startAnimation(translateAnimation);
        }
    }

    wy(Conversation conversation) {
        this.a = conversation;
    }
}
