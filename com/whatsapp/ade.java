package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ade implements OnClickListener {
    final Conversation a;

    public void onClick(View view) {
        Conversation.k(this.a).dismiss();
        if (App.v(this.a)) {
            Conversation.E(this.a);
        } else {
            RequestPermissionActivity.b(this.a, 2131231617, 2131231616);
        }
    }

    ade(Conversation conversation) {
        this.a = conversation;
    }
}
