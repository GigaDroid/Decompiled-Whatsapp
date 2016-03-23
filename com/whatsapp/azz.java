package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class azz implements OnClickListener {
    final Main a;

    azz(Main main) {
        this.a = main;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(2);
        this.a.finish();
    }
}
