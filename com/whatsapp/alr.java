package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.HorizontalScrollView;

class alr implements OnGlobalLayoutListener {
    final HorizontalScrollView a;
    final ChatInfoActivity b;

    public void onGlobalLayout() {
        this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.a.fullScroll(66);
    }

    alr(ChatInfoActivity chatInfoActivity, HorizontalScrollView horizontalScrollView) {
        this.b = chatInfoActivity;
        this.a = horizontalScrollView;
    }
}
