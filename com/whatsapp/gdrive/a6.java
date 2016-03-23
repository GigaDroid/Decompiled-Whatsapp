package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.RequestPermissionActivity;

class a6 implements OnClickListener {
    final SettingsGoogleDrive a;

    a6(SettingsGoogleDrive settingsGoogleDrive) {
        this.a = settingsGoogleDrive;
    }

    public void onClick(View view) {
        RequestPermissionActivity.a(this.a, 2131231669, 2131231670);
    }
}
