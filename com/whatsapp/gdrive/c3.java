package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;

class c3 implements OnClickListener {
    final SettingsGoogleDrive a;

    c3(SettingsGoogleDrive settingsGoogleDrive) {
        this.a = settingsGoogleDrive;
    }

    public void onClick(View view) {
        this.a.a();
    }
}
