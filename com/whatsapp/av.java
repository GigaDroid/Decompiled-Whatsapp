package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;

class av implements OnClickListener {
    final SettingsChatHistory a;
    final CheckBox b;

    av(SettingsChatHistory settingsChatHistory, CheckBox checkBox) {
        this.a = settingsChatHistory;
        this.b = checkBox;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(3);
        SettingsChatHistory.a(this.a, this.b.isChecked());
    }
}
