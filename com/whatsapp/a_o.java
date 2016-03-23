package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class a_o implements OnClickListener {
    final Conversations a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(11);
    }

    a_o(Conversations conversations) {
        this.a = conversations;
    }
}
