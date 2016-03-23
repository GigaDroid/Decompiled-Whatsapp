package com.whatsapp.gdrive;

class eb implements Runnable {
    final GoogleDriveActivity a;

    eb(GoogleDriveActivity googleDriveActivity) {
        this.a = googleDriveActivity;
    }

    public void run() {
        if (GoogleDriveActivity.b(this.a) == null) {
            GoogleDriveActivity.a(this.a, (GoogleDriveRestoreAnimationView) this.a.findViewById(2131755224));
        }
        this.a.findViewById(2131755214).setVisibility(8);
        this.a.findViewById(2131755217).setVisibility(8);
        GoogleDriveActivity.b(this.a).setVisibility(0);
        GoogleDriveActivity.c(this.a).setVisibility(0);
        GoogleDriveActivity.s(this.a).setVisibility(0);
        GoogleDriveActivity.b(this.a).d();
        GoogleDriveActivity.s(this.a).setText(2131230780);
    }
}
