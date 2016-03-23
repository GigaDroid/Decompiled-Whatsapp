package com.whatsapp.gdrive;

import android.view.View.OnClickListener;

class f9 implements Runnable {
    final OnClickListener a;
    final int b;
    final String c;
    final bf d;

    public void run() {
        if (this.b >= 0) {
            SettingsGoogleDrive.p(this.d.c).setProgress(this.b);
        }
        SettingsGoogleDrive.u(this.d.c).setText(this.c);
        SettingsGoogleDrive.d(this.d.c).setOnClickListener(this.a);
        if (this.a != null) {
            SettingsGoogleDrive.d(this.d.c).setVisibility(0);
            if (!GoogleDriveService.c) {
                return;
            }
        }
        SettingsGoogleDrive.d(this.d.c).setVisibility(8);
    }

    f9(bf bfVar, int i, String str, OnClickListener onClickListener) {
        this.d = bfVar;
        this.b = i;
        this.c = str;
        this.a = onClickListener;
    }
}
