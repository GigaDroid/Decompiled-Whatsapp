package com.whatsapp.gdrive;

class e_ implements Runnable {
    final a7 a;

    public void run() {
        SettingsGoogleDrive.k(this.a.b).d(10);
        GoogleDriveService.w();
    }

    e_(a7 a7Var) {
        this.a = a7Var;
    }
}
