package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class lz implements OnClickListener {
    final l5 a;
    final SettingsChatHistory b;

    lz(SettingsChatHistory settingsChatHistory, l5 l5Var) {
        this.b = settingsChatHistory;
        this.a = l5Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.removeDialog(19);
        Conversation.a(this.b, this.b, this.a, true);
    }
}
