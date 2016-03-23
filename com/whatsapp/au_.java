package com.whatsapp;

import com.whatsapp.gdrive.GoogleDriveService;

class au_ implements Runnable {
    final App a;

    au_(App app) {
        this.a = app;
    }

    public void run() {
        if (GoogleDriveService.X()) {
            GoogleDriveService.w();
        }
    }
}
