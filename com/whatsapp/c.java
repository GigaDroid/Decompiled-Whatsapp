package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class c implements OnCancelListener {
    final EULA a;

    public void onCancel(DialogInterface dialogInterface) {
        this.a.removeDialog(5);
        this.a.showDialog(6);
    }

    c(EULA eula) {
        this.a = eula;
    }
}
