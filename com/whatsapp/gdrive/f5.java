package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.bq;

class f5 implements OnClickListener {
    final SettingsGoogleDrive a;

    f5(SettingsGoogleDrive settingsGoogleDrive) {
        this.a = settingsGoogleDrive;
    }

    public void onClick(View view) {
        String g = GoogleDriveService.g();
        if (g == null) {
            this.a.a();
            if (!GoogleDriveService.c) {
                return;
            }
        }
        bq.a(new c9(this, g));
    }
}
