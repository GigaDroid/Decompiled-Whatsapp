package com.whatsapp.gdrive;

class f3 implements Runnable {
    final GoogleDriveActivity a;
    final String b;

    f3(GoogleDriveActivity googleDriveActivity, String str) {
        this.a = googleDriveActivity;
        this.b = str;
    }

    public void run() {
        GoogleDriveActivity.a(this.a, this.b, 4);
    }
}
