package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class z7 implements OnClickListener {
    final EULA a;

    z7(EULA eula) {
        this.a = eula;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(1);
    }
}
