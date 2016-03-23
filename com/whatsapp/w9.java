package com.whatsapp;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class w9 implements OnScrollListener {
    final ViewGroup a;
    final Drawable b;
    final int c;
    final boolean d;
    final MessageDetailsActivity e;

    w9(MessageDetailsActivity messageDetailsActivity, Drawable drawable, boolean z, ViewGroup viewGroup, int i) {
        this.e = messageDetailsActivity;
        this.b = drawable;
        this.d = z;
        this.a = viewGroup;
        this.c = i;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        boolean z = DialogToastActivity.f;
        if (MessageDetailsActivity.d(this.e).getFirstVisiblePosition() > 0) {
            this.b.setAlpha(255);
            if (VERSION.SDK_INT >= 11 && !this.d) {
                this.a.setTranslationY(0.0f);
                if (!z) {
                    return;
                }
            }
            return;
        }
        View childAt = MessageDetailsActivity.d(this.e).getChildAt(0);
        if (childAt == null) {
            this.b.setAlpha(0);
            if (VERSION.SDK_INT >= 11 && !this.d) {
                this.a.setTranslationY(0.0f);
                if (!z) {
                    return;
                }
            }
            return;
        }
        int top = childAt.getTop();
        this.b.setAlpha(Math.min(255, ((-top) * 255) / Math.min(this.c, childAt.getHeight())));
        if (VERSION.SDK_INT >= 11 && !this.d) {
            this.a.setTranslationY((float) ((-top) / 2));
        }
    }
}
