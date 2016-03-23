package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;

class af implements OnClickListener {
    final GoogleDriveActivity a;

    af(GoogleDriveActivity googleDriveActivity) {
        this.a = googleDriveActivity;
    }

    public void onClick(View view) {
        GoogleDriveActivity.k(this.a).d(10);
        GoogleDriveActivity.v(this.a);
    }
}
