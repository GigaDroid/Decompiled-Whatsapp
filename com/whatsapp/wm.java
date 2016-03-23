package com.whatsapp;

import android.view.View;
import android.view.View.OnLongClickListener;

class wm implements OnLongClickListener {
    final ConversationRow a;

    public boolean onLongClick(View view) {
        this.a.m();
        return true;
    }

    wm(ConversationRow conversationRow) {
        this.a = conversationRow;
    }
}
