package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.fieldstats.k;
import com.whatsapp.nf;

class f_ implements OnClickListener {
    final SettingsGoogleDrive a;

    public void onClick(View view) {
        nf.a(k.BACKUP_CONVERSATIONS);
        SettingsGoogleDrive.j(this.a);
    }

    f_(SettingsGoogleDrive settingsGoogleDrive) {
        this.a = settingsGoogleDrive;
    }
}
