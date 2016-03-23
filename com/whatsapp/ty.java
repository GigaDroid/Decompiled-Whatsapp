package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class ty implements OnGlobalLayoutListener {
    final int a;
    final ArchivedConversationsFragment b;

    public void onGlobalLayout() {
        this.b.getListView().getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.b.c(this.a);
    }

    ty(ArchivedConversationsFragment archivedConversationsFragment, int i) {
        this.b = archivedConversationsFragment;
        this.a = i;
    }
}
