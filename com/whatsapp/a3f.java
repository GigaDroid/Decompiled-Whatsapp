package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class a3f implements OnCancelListener {
    final Activity a;
    final int b;

    a3f(Activity activity, int i) {
        this.a = activity;
        this.b = i;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.removeDialog(this.b);
    }
}
