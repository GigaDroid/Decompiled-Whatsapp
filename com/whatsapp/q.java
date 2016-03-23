package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class q implements OnClickListener {
    final Activity a;
    final String b;

    q(Activity activity, String str) {
        this.a = activity;
        this.b = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        aup.a(this.a, false, this.b);
    }
}
