package com.whatsapp;

import android.support.v7.appcompat.R;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class aim implements OnGlobalLayoutListener {
    final MessageDetailsActivity a;

    public void onGlobalLayout() {
        MessageDetailsActivity.d(this.a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        MessageDetailsActivity.d(this.a).setSelectionFromTop(1, this.a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_default_height_material) * 3);
    }

    aim(MessageDetailsActivity messageDetailsActivity) {
        this.a = messageDetailsActivity;
    }
}
