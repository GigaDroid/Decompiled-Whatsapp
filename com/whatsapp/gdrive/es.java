package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.bq;

class es implements OnClickListener {
    final SettingsGoogleDrive a;

    public void onClick(View view) {
        bq.a(new cs(this));
    }

    es(SettingsGoogleDrive settingsGoogleDrive) {
        this.a = settingsGoogleDrive;
    }
}
