package com.whatsapp.gdrive;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class a4 implements OnGlobalLayoutListener {
    final GoogleDriveActivity a;

    a4(GoogleDriveActivity googleDriveActivity) {
        this.a = googleDriveActivity;
    }

    public void onGlobalLayout() {
        GoogleDriveActivity.i(this.a);
    }
}
