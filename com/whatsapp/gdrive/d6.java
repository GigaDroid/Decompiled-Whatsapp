package com.whatsapp.gdrive;

class d6 implements Runnable {
    final SettingsGoogleDrive a;

    d6(SettingsGoogleDrive settingsGoogleDrive) {
        this.a = settingsGoogleDrive;
    }

    public void run() {
        SettingsGoogleDrive.r(this.a);
        if (GoogleDriveService.Y() != 0) {
            SettingsGoogleDrive.g(this.a);
        }
    }
}
