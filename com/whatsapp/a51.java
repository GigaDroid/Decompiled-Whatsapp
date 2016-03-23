package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class a51 implements OnClickListener {
    final SettingsChatHistory a;

    a51(SettingsChatHistory settingsChatHistory) {
        this.a = settingsChatHistory;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(3);
    }
}
