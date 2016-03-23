package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class aw9 implements OnClickListener {
    final Conversation a;

    public void onClick(View view) {
        this.a.showDialog(16);
    }

    aw9(Conversation conversation) {
        this.a = conversation;
    }
}
