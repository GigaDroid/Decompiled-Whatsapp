package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class op implements OnClickListener {
    final ListChatInfo a;

    op(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(6);
    }
}
