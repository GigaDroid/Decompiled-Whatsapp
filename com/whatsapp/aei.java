package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class aei implements OnClickListener {
    final ListChatInfo a;

    public void onClick(View view) {
        this.a.showDialog(50);
    }

    aei(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }
}
