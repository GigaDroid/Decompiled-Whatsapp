package com.whatsapp.camera;

import android.view.View;
import android.view.View.OnClickListener;

class ao implements OnClickListener {
    final CameraActivity a;

    ao(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public void onClick(View view) {
        CameraActivity.j(this.a).a();
    }
}
