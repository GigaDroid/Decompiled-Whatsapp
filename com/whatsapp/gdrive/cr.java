package com.whatsapp.gdrive;

class cr implements Runnable {
    final a0 a;

    cr(a0 a0Var) {
        this.a = a0Var;
    }

    public void run() {
        SettingsGoogleDrive.a(this.a.a, GoogleDriveService.g());
    }
}
