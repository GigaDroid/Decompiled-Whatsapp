package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class aem implements OnClickListener {
    final Main a;

    aem(Main main) {
        this.a = main;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(3);
        this.a.finish();
    }
}
