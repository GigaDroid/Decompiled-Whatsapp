package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class qn implements OnGlobalLayoutListener {
    final ChatInfoLayout a;

    public void onGlobalLayout() {
        ChatInfoLayout.e(this.a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (!ChatInfoLayout.a(this.a)) {
            int measuredWidth = ((int) (((float) this.a.getMeasuredWidth()) * 0.5625f)) - this.a.getMeasuredWidth();
            ChatInfoLayout.e(this.a).setSelectionFromTop(0, measuredWidth);
            this.a.setScrollPos(measuredWidth);
        }
    }

    qn(ChatInfoLayout chatInfoLayout) {
        this.a = chatInfoLayout;
    }
}
