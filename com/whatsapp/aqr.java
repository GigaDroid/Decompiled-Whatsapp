package com.whatsapp;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

class aqr implements OnKeyListener {
    final Conversation a;

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (!Conversation.G || keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 1) {
            return false;
        }
        Conversation.G(this.a);
        return true;
    }

    aqr(Conversation conversation) {
        this.a = conversation;
    }
}
