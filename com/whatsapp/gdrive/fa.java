package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.bq;

class fa implements OnClickListener {
    final String a;
    final GoogleDriveActivity b;

    public void onClick(View view) {
        bq.a(new d(this));
    }

    fa(GoogleDriveActivity googleDriveActivity, String str) {
        this.b = googleDriveActivity;
        this.a = str;
    }
}
