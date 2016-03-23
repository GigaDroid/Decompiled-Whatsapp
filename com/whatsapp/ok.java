package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ok implements OnClickListener {
    final ListChatInfo a;

    ok(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }

    public void onClick(View view) {
        this.a.showDialog(2);
    }
}
