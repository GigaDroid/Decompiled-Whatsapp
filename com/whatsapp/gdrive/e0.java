package com.whatsapp.gdrive;

class e0 implements Runnable {
    final GoogleDriveService a;

    e0(GoogleDriveService googleDriveService) {
        this.a = googleDriveService;
    }

    public void run() {
        GoogleDriveService.am();
        GoogleDriveService.P();
        GoogleDriveService.at();
        GoogleDriveService.f(this.a).g();
        GoogleDriveService.b(0);
    }
}
