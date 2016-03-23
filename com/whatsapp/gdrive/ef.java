package com.whatsapp.gdrive;

class ef implements Runnable {
    final de a;

    ef(de deVar) {
        this.a = deVar;
    }

    public void run() {
        if (GoogleDriveActivity.a(this.a.b, this.a.a, 1)) {
            GoogleDriveActivity.v(this.a.b);
        }
    }
}
