package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

class a9t implements Runnable {
    final Conversation a;

    public void run() {
        int width = Conversation.ao(this.a).getWidth();
        Animation translateAnimation = new TranslateAnimation(0, 0.0f, 0, App.a1() ? (float) (-width) : (float) width, 0, 0.0f, 0, 0.0f);
        translateAnimation.setFillAfter(true);
        translateAnimation.setDuration(800);
        Conversation.ao(this.a).startAnimation(translateAnimation);
        Conversation.ao(this.a).setVisibility(8);
        translateAnimation = new TranslateAnimation(0, App.a1() ? (float) width : (float) (-width), 0, 0.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setFillAfter(true);
        translateAnimation.setDuration(800);
        Conversation.at(this.a).startAnimation(translateAnimation);
    }

    a9t(Conversation conversation, an1 com_whatsapp_an1) {
        this(conversation);
    }

    private a9t(Conversation conversation) {
        this.a = conversation;
    }
}
