package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class azi implements OnClickListener {
    final SettingsNotifications a;

    public void onClick(DialogInterface dialogInterface, int i) {
        a3b.a(this.a.getBaseContext()).f();
        this.a.getPreferenceScreen().removeAll();
        SettingsNotifications.a(this.a);
    }

    azi(SettingsNotifications settingsNotifications) {
        this.a = settingsNotifications;
    }
}
