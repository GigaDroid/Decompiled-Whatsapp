package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;

class ad implements OnClickListener {
    final bf a;

    ad(bf bfVar) {
        this.a = bfVar;
    }

    public void onClick(View view) {
        SettingsGoogleDrive.k(this.a.c).ad().h();
        GoogleDriveService.I();
    }
}
