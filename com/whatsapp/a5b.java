package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class a5b implements OnClickListener {
    final Conversation a;

    a5b(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(View view) {
        this.a.bc.onWindowFocusChanged(false);
        Conversation.Y(this.a);
        Conversation.W(this.a).setVisibility(8);
        Conversation.D(this.a).setVisibility(8);
    }
}
