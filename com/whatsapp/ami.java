package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ami implements OnClickListener {
    final SettingsHelp a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(arj.Theme_checkboxStyle);
    }

    ami(SettingsHelp settingsHelp) {
        this.a = settingsHelp;
    }
}
