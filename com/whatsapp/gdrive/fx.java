package com.whatsapp.gdrive;

class fx implements Runnable {
    final GoogleDriveService a;

    public void run() {
        GoogleDriveService.am();
        GoogleDriveService.P();
        GoogleDriveService.at();
        GoogleDriveService.f(this.a).a();
    }

    fx(GoogleDriveService googleDriveService) {
        this.a = googleDriveService;
    }
}
