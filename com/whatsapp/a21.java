package com.whatsapp;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.whatsapp.util.undobar.UndoBarController;

class a21 implements OnScrollListener {
    final ConversationsFragment a;

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    a21(ConversationsFragment conversationsFragment) {
        this.a = conversationsFragment;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i != 0) {
            UndoBarController.c(this.a.getActivity());
        }
    }
}
