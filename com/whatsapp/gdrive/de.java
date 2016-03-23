package com.whatsapp.gdrive;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.bq;

class de implements OnClickListener {
    final String a;
    final GoogleDriveActivity b;

    de(GoogleDriveActivity googleDriveActivity, String str) {
        this.b = googleDriveActivity;
        this.a = str;
    }

    public void onClick(View view) {
        bq.a(new ef(this));
    }
}
