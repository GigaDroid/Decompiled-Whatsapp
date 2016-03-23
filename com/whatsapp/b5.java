package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.HorizontalScrollView;

class b5 implements OnGlobalLayoutListener {
    final HorizontalScrollView a;
    final GroupChatInfo b;

    b5(GroupChatInfo groupChatInfo, HorizontalScrollView horizontalScrollView) {
        this.b = groupChatInfo;
        this.a = horizontalScrollView;
    }

    public void onGlobalLayout() {
        this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.a.fullScroll(66);
    }
}
