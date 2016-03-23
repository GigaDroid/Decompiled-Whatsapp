package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ti implements OnClickListener {
    final EULA a;

    ti(EULA eula) {
        this.a = eula;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(9);
    }
}
