package com.whatsapp.gdrive;

import android.view.View;
import android.widget.TextView;

class aj implements Runnable {
    final String a;
    final GoogleDriveActivity b;

    aj(GoogleDriveActivity googleDriveActivity, String str) {
        this.b = googleDriveActivity;
        this.a = str;
    }

    public void run() {
        TextView textView = (TextView) this.b.findViewById(2131755221);
        View findViewById = this.b.findViewById(2131755222);
        if (!fn.a(this.b)) {
            textView.setText(this.a);
            findViewById.setVisibility(8);
        }
    }
}
