package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class a27 implements OnClickListener {
    final EULA a;

    a27(EULA eula) {
        this.a = eula;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(8);
        EULA.a(this.a, jf.AGREE_NONE);
    }
}
