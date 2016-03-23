package com.whatsapp.gdrive;

class bo implements Runnable {
    final aq a;

    bo(aq aqVar) {
        this.a = aqVar;
    }

    public void run() {
        SettingsGoogleDrive.k(this.a.a).d(10);
        GoogleDriveService.w();
    }
}
