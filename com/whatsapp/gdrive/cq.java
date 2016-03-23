package com.whatsapp.gdrive;

class cq implements Runnable {
    final SettingsGoogleDrive a;
    final int b;

    public void run() {
        GoogleDriveService.a(this.b);
    }

    cq(SettingsGoogleDrive settingsGoogleDrive, int i) {
        this.a = settingsGoogleDrive;
        this.b = i;
    }
}
