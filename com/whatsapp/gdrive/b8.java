package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.bq;

class b8 implements OnClickListener {
    final SettingsGoogleDrive a;
    final String b;

    public void onClick(View view) {
        bq.a(new dp(this));
    }

    b8(SettingsGoogleDrive settingsGoogleDrive, String str) {
        this.a = settingsGoogleDrive;
        this.b = str;
    }
}
