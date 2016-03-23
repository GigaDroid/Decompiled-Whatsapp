package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class _c implements OnClickListener {
    final Conversation a;

    public void onClick(View view) {
        this.a.bc.onWindowFocusChanged(false);
        this.a.bc.post(new jy(this));
        Conversation.W(this.a).setVisibility(8);
        Conversation.D(this.a).setVisibility(8);
    }

    _c(Conversation conversation) {
        this.a = conversation;
    }
}
