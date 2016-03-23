package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.bq;

class a0 implements OnClickListener {
    final SettingsGoogleDrive a;

    public void onClick(View view) {
        bq.a(new cr(this));
    }

    a0(SettingsGoogleDrive settingsGoogleDrive) {
        this.a = settingsGoogleDrive;
    }
}
