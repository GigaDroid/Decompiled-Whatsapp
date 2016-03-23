package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;

class a_ implements OnClickListener {
    final SettingsGoogleDrive a;

    a_(SettingsGoogleDrive settingsGoogleDrive) {
        this.a = settingsGoogleDrive;
    }

    public void onClick(View view) {
        this.a.a();
    }
}
