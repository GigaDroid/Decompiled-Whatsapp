package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.bq;

class aq implements OnClickListener {
    final SettingsGoogleDrive a;

    public void onClick(View view) {
        bq.a(new bo(this));
    }

    aq(SettingsGoogleDrive settingsGoogleDrive) {
        this.a = settingsGoogleDrive;
    }
}
