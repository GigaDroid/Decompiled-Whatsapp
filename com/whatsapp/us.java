package com.whatsapp;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Adapter;

class us implements OnGlobalLayoutListener {
    final Adapter a;
    final View b;
    final ChatInfoLayout c;
    final View d;
    final View e;

    public void onGlobalLayout() {
        if (!ChatInfoLayout.e(this.c).isLayoutRequested()) {
            if (this.c.getHeight() >= this.c.getWidth()) {
                int max = Math.max(this.c.getMeasuredHeight() - ((((this.b.getMeasuredHeight() - this.c.getMeasuredWidth()) + (this.a.getCount() * this.c.getResources().getDimensionPixelSize(2131427547))) + this.e.getMeasuredHeight()) + ((int) (((float) ChatInfoLayout.d(this.c).getMeasuredWidth()) * 0.5625f))), 0) + this.c.getResources().getDimensionPixelSize(2131427425);
                if (this.d.getPaddingBottom() != max) {
                    this.d.setPadding(0, 0, 0, max);
                }
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            if (this.d.getPaddingBottom() != 0) {
                this.d.setPadding(0, 0, 0, 0);
            }
        }
    }

    us(ChatInfoLayout chatInfoLayout, View view, Adapter adapter, View view2, View view3) {
        this.c = chatInfoLayout;
        this.b = view;
        this.a = adapter;
        this.e = view2;
        this.d = view3;
    }
}
