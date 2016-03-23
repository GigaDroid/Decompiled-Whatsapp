package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class a5g implements AnimationListener {
    final ConversationRow a;

    public void onAnimationStart(Animation animation) {
    }

    a5g(ConversationRow conversationRow) {
        this.a = conversationRow;
    }

    public void onAnimationEnd(Animation animation) {
        ConversationRow.a(this.a).setVisibility(4);
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
