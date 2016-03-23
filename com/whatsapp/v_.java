package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class v_ implements OnClickListener {
    final Conversations a;

    public void onClick(DialogInterface dialogInterface, int i) {
        Conversations.b(this.a);
    }

    v_(Conversations conversations) {
        this.a = conversations;
    }
}
