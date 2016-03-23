package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Process;

final class d9 implements OnCancelListener {
    final Activity a;

    public void onCancel(DialogInterface dialogInterface) {
        this.a.finish();
        Process.killProcess(Process.myPid());
    }

    d9(Activity activity) {
        this.a = activity;
    }
}
