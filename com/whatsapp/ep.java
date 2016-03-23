package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ep implements OnClickListener {
    final Main a;

    ep(Main main) {
        this.a = main;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        OverlayAlert.a(this.a);
        this.a.removeDialog(1);
        this.a.finish();
    }
}
