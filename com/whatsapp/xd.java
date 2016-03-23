package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class xd implements OnClickListener {
    final ViewSharedContactActivity a;

    xd(ViewSharedContactActivity viewSharedContactActivity) {
        this.a = viewSharedContactActivity;
    }

    public void onClick(View view) {
        ViewSharedContactActivity.h(this.a);
    }
}
