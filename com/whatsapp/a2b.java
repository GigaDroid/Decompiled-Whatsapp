package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class a2b implements OnClickListener {
    final EULA a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(2);
    }

    a2b(EULA eula) {
        this.a = eula;
    }
}
