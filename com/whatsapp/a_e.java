package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class a_e implements OnClickListener {
    final Conversation a;

    a_e(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(View view) {
        this.a.showDialog(11);
    }
}
