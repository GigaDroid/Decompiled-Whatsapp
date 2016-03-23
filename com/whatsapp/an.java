package com.whatsapp;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class an implements OnTouchListener {
    final Conversation a;

    an(Conversation conversation) {
        this.a = conversation;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        Conversation.aw(this.a);
        return Conversation.t(this.a).a(Conversation.M(this.a), motionEvent);
    }
}
