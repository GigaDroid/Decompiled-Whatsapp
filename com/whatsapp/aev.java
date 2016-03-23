package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class aev implements OnClickListener {
    final ListChatInfo a;

    aev(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(6);
        ListChatInfo.a(this.a, ListChatInfo.g(this.a));
    }
}
