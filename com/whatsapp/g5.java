package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class g5 implements OnClickListener {
    final EULA a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.showDialog(5);
    }

    g5(EULA eula) {
        this.a = eula;
    }
}
