package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class atq implements OnClickListener {
    final ViewSharedContactActivity a;

    public void onClick(View view) {
        ViewSharedContactActivity.a(this.a, view);
    }

    atq(ViewSharedContactActivity viewSharedContactActivity) {
        this.a = viewSharedContactActivity;
    }
}
