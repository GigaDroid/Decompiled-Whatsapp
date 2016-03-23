package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

class h0 implements OnClickListener {
    final LinearLayout a;
    final ViewSharedContactActivity b;

    public void onClick(View view) {
        ViewSharedContactActivity.a(this.b, this.a);
    }

    h0(ViewSharedContactActivity viewSharedContactActivity, LinearLayout linearLayout) {
        this.b = viewSharedContactActivity;
        this.a = linearLayout;
    }
}
