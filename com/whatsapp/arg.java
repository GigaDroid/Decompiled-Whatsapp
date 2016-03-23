package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class arg implements OnGlobalLayoutListener {
    final wj a;

    public void onGlobalLayout() {
        ConversationsFragment.l(this.a.a.a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.a.a.a.c(this.a.a.b);
    }

    arg(wj wjVar) {
        this.a = wjVar;
    }
}
