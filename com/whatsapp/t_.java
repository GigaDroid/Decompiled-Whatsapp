package com.whatsapp;

import com.whatsapp.gdrive.GoogleDriveService;

class t_ implements Runnable {
    final String a;
    final ExternalMediaManager b;

    t_(ExternalMediaManager externalMediaManager, String str) {
        this.b = externalMediaManager;
        this.a = str;
    }

    public void run() {
        GoogleDriveService.e(this.a);
    }
}
