package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class a_0 implements OnGlobalLayoutListener {
    final ListChatInfo a;

    public void onGlobalLayout() {
        ListChatInfo.j(this.a);
    }

    a_0(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }
}
