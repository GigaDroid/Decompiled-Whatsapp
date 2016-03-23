package com.whatsapp.gdrive;

class ac implements Runnable {
    final SettingsGoogleDrive a;

    public void run() {
        GoogleDriveService.w();
    }

    ac(SettingsGoogleDrive settingsGoogleDrive) {
        this.a = settingsGoogleDrive;
    }
}
