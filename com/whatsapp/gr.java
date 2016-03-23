package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class gr implements OnClickListener {
    final SettingsHelp a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(123);
    }

    gr(SettingsHelp settingsHelp) {
        this.a = settingsHelp;
    }
}
