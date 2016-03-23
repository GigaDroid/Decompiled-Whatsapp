package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import com.whatsapp.util.bu;

class c5 implements OnClickListener {
    final ViewSharedContactActivity a;

    c5(ViewSharedContactActivity viewSharedContactActivity) {
        this.a = viewSharedContactActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (!(ViewSharedContactActivity.a(this.a) || ViewSharedContactActivity.f(this.a) == null)) {
            Bitmap g = ViewSharedContactActivity.f(this.a).g();
            if (g != null) {
                ViewSharedContactActivity.a(this.a, g);
            }
        }
        bu.a(ViewSharedContactActivity.c(this.a), ViewSharedContactActivity.g(this.a), this.a, 1);
    }
}
