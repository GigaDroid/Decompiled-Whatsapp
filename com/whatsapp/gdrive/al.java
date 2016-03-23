package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;

class al implements OnClickListener {
    final GoogleDriveActivity a;

    public void onClick(View view) {
        GoogleDriveActivity.c(this.a, 27);
        GoogleDriveActivity.a(this.a);
        GoogleDriveActivity.a(this.a, true);
    }

    al(GoogleDriveActivity googleDriveActivity) {
        this.a = googleDriveActivity;
    }
}
