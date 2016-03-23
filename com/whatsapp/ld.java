package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ld implements OnClickListener {
    final SettingsNetworkUsage a;

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            amd.a();
            SettingsNetworkUsage.b(this.a);
        }
    }

    ld(SettingsNetworkUsage settingsNetworkUsage) {
        this.a = settingsNetworkUsage;
    }
}
