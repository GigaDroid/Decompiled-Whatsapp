package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class v5 implements OnCancelListener {
    final Activity a;

    v5(Activity activity) {
        this.a = activity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.finish();
    }
}
