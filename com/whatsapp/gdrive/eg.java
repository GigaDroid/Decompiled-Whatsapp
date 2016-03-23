package com.whatsapp.gdrive;

class eg implements Runnable {
    final GoogleDriveActivity a;

    eg(GoogleDriveActivity googleDriveActivity) {
        this.a = googleDriveActivity;
    }

    public void run() {
        GoogleDriveActivity.p(this.a).block();
        if (GoogleDriveActivity.k(this.a).o() == 11 || GoogleDriveActivity.k(this.a).o() == 12) {
            GoogleDriveActivity.k(this.a).d(10);
            GoogleDriveActivity.v(this.a);
        }
    }
}
