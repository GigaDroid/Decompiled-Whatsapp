package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class aiz implements OnClickListener {
    final Conversation a;

    aiz(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        aup.a(this.a, true, this.a.aI.p);
    }
}
