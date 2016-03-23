package com.whatsapp.camera;

import android.view.View;
import android.view.View.OnClickListener;

class ak implements OnClickListener {
    final CameraActivity a;

    public void onClick(View view) {
        CameraActivity.a(this.a, CameraActivity.j(this.a).g());
    }

    ak(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }
}
