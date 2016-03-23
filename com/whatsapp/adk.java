package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.bq;

class adk implements OnClickListener {
    final boolean a;
    final SettingsChatHistory b;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.removeDialog(5);
        this.b.a(2131231710, 2131231813);
        bq.a(new ea(this));
    }

    adk(SettingsChatHistory settingsChatHistory, boolean z) {
        this.b = settingsChatHistory;
        this.a = z;
    }
}
