package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class nx implements OnClickListener {
    final Conversation a;

    public void onClick(View view) {
        this.a.onBackPressed();
    }

    nx(Conversation conversation) {
        this.a = conversation;
    }
}
