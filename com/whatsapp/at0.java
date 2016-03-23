package com.whatsapp;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.bu;

class at0 implements OnClickListener {
    final ViewSharedContactActivity a;

    public void onClick(View view) {
        if (VERSION.SDK_INT < 11) {
            bu.a(ViewSharedContactActivity.c(this.a), ViewSharedContactActivity.g(this.a), ViewSharedContactActivity.d(this.a), ViewSharedContactActivity.e(this.a), this.a);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.a.a();
    }

    at0(ViewSharedContactActivity viewSharedContactActivity) {
        this.a = viewSharedContactActivity;
    }
}
