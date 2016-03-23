package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class aqv implements OnClickListener {
    final SettingsAccount a;

    public void onClick(DialogInterface dialogInterface, int i) {
        SettingsAccount.a(this.a);
    }

    aqv(SettingsAccount settingsAccount) {
        this.a = settingsAccount;
    }
}
