package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class a2v implements OnGlobalLayoutListener {
    final ChatInfoLayout a;

    public void onGlobalLayout() {
        ChatInfoLayout.e(this.a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        ChatInfoLayout.b(this.a);
    }

    a2v(ChatInfoLayout chatInfoLayout) {
        this.a = chatInfoLayout;
    }
}
