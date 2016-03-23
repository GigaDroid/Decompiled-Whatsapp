package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.bq;

class ja implements OnClickListener {
    final SettingsChatHistory a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(2131231710, 2131231813);
        bq.a(new aru(this));
    }

    ja(SettingsChatHistory settingsChatHistory) {
        this.a = settingsChatHistory;
    }
}
