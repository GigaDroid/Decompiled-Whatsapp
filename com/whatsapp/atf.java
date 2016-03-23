package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

class atf implements OnClickListener {
    final ViewSharedContactActivity a;
    final LinearLayout b;

    atf(ViewSharedContactActivity viewSharedContactActivity, LinearLayout linearLayout) {
        this.a = viewSharedContactActivity;
        this.b = linearLayout;
    }

    public void onClick(View view) {
        ViewSharedContactActivity.a(this.a, this.b);
    }
}
