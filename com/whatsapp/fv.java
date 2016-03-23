package com.whatsapp;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

class fv implements Runnable {
    final int a;
    final ChatInfoLayout b;

    fv(ChatInfoLayout chatInfoLayout, int i) {
        this.b = chatInfoLayout;
        this.a = i;
    }

    public void run() {
        View childAt = ChatInfoLayout.e(this.b).getChildAt(0);
        if (childAt != null && ChatInfoLayout.e(this.b).getFirstVisiblePosition() == 0) {
            if (childAt.getTop() != this.a) {
                ChatInfoLayout.e(this.b).setSelectionFromTop(0, this.a);
                ChatInfoLayout.e(this.b).post(this);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            ((AppCompatActivity) this.b.getContext()).supportStartPostponedEnterTransition();
            ChatInfoLayout.e(this.b).setOnScrollListener(new iu(this));
        }
    }
}
