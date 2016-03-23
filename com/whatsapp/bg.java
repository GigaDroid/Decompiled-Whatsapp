package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class bg implements OnClickListener {
    final Activity a;
    final int b;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(this.b);
    }

    bg(Activity activity, int i) {
        this.a = activity;
        this.b = i;
    }
}
