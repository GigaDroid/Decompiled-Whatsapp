package com.whatsapp.gdrive;

final class bg implements Runnable {
    bg() {
    }

    public void run() {
        GoogleDriveService.at();
        GoogleDriveService.w();
    }
}
