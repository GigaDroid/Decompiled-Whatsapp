package com.whatsapp.gdrive;

class cs implements Runnable {
    final es a;

    public void run() {
        SettingsGoogleDrive.k(this.a.a).d(10);
        GoogleDriveService.w();
    }

    cs(es esVar) {
        this.a = esVar;
    }
}
