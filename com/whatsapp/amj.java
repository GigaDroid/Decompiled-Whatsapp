package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class amj implements AnimationListener {
    final ConversationsFragment a;
    final int b;

    public void onAnimationEnd(Animation animation) {
        ConversationsFragment.l(this.a).post(new wj(this));
    }

    public void onAnimationRepeat(Animation animation) {
    }

    amj(ConversationsFragment conversationsFragment, int i) {
        this.a = conversationsFragment;
        this.b = i;
    }

    public void onAnimationStart(Animation animation) {
    }
}
