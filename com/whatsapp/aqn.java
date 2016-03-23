package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class aqn implements OnClickListener {
    final ViewSharedContactActivity a;

    public void onClick(View view) {
        this.a.finish();
    }

    aqn(ViewSharedContactActivity viewSharedContactActivity) {
        this.a = viewSharedContactActivity;
    }
}
