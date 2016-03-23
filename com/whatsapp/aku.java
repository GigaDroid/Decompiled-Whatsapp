package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class aku implements OnClickListener {
    final ListChatInfo a;

    public void onClick(View view) {
        ListChatInfo.i(this.a);
    }

    aku(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }
}
