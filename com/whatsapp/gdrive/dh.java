package com.whatsapp.gdrive;

class dh implements Runnable {
    final SettingsGoogleDrive a;

    dh(SettingsGoogleDrive settingsGoogleDrive) {
        this.a = settingsGoogleDrive;
    }

    public void run() {
        boolean z = GoogleDriveService.c;
        SettingsGoogleDrive.o(this.a).block();
        if (SettingsGoogleDrive.k(this.a).o() == 11 || SettingsGoogleDrive.k(this.a).o() == 12) {
            SettingsGoogleDrive.k(this.a).d(10);
            if (GoogleDriveService.v()) {
                GoogleDriveService.w();
                if (!z) {
                    return;
                }
            }
            SettingsGoogleDrive.b(this.a, true);
            if (!z) {
                return;
            }
        }
        GoogleDriveService.w();
    }
}
